#version 300 es
#extension GL_EXT_YUV_target : require
#extension GL_OES_EGL_image_external : require

precision highp float;

uniform __samplerExternal2DY2YEXT sTexture;
uniform float uMaxContentLuminance;

in vec2 vTextureCoord;
out vec4 outColor;

// Column-major matrix declarations; pre-multiply by input vectors
const mat4 YUV_TO_RGB_REC2020 = mat4(1.167808, 1.167808, 1.167808, 0, 0, -0.187877, 2.148072, 0, 1.683611, -0.652337, 0, 0, -0.914865, 0.347048, -1.147095, 1);

// Assume content luminance always equals to PQ_Lw
const float PQ_Lw = 10000.0; // Standard PQ Lw

// PQ EOTF constant definitions
const float m1 = 0.1593017578125;
const float m2 = 78.84375;
const float c1 = 0.8359375;
const float c2 = 18.8515625;
const float c3 = 18.6875;

highp vec3 PQ_EOTF_norm(highp vec3 x) {
    highp vec3 x_exp = pow(x, vec3(1.0 / m2));
    highp vec3 num = max(x_exp - c1, 0.0);
    highp vec3 den = c2 - c3 * x_exp;
    return pow(num / den, vec3(1.0 / m1));
}

float PQ_EOTF_norm(float x) {
    float x_exp = pow(x, 1.0 / m2);
    float num = max(x_exp - c1, 0.0);
    float den = c2 - c3 * x_exp;
    return pow(num / den, 1.0 / m1);
}

float PQ_EOTF_inv_norm(float x) {
    float x_exp = pow(x, m1);
    float num = c1 + c2 * x_exp;
    float den = 1.0 + c3 * x_exp;
    return pow(num / den, m2);
}

const highp vec3 Lvec = vec3(0.2627, 0.6780, 0.0593); // HLG R,G,B luminance contributions
const float HLG_Lw = 1000.0; // Standard HLG Lw
const float HLG_gamma = 1.2; // Standard HLG gamma

// define a,b,c constants for HLG OETF and OETF_Inv
const float a = 0.17883277;
const float b = 1.0 - 4.0 * a;
const float c = 0.5 - a * log(4.0 * a);


highp float HLG_OETF_SingleChannel(highp float x) {
    return x <= 1.0 / 12.0 ? sqrt(3.0 * x) : a * log(12.0 * x - b) + c;
}

// Input is normalized linear scene luminance, output is normalized nonlinear encoded luminance
highp vec3 HLG_OETF(highp vec3 linearColor) {
    return vec3(
    HLG_OETF_SingleChannel(linearColor.r),
    HLG_OETF_SingleChannel(linearColor.g),
    HLG_OETF_SingleChannel(linearColor.b)
    );
}

// Input is normalized linear display luminance, output is normalized linear scene luminance
// Taken from BT.2408 Section 5.1.2.4
highp vec3 HLG_OOTF_Inv(highp vec3 x) {
    highp float Y = dot(Lvec, x);
    return pow(Y, (1.0 - HLG_gamma) / HLG_gamma) * x;
}


// Input is normalized linear display luminance, output is normalized nonlinear encoded luminance
highp vec3 HLG_EOTF_Inv(highp vec3 x) {
    return HLG_OETF(HLG_OOTF_Inv(x));
}

// See Annex 5 of ITU BT.2408
float hermite_spline_T(float A, float KS) {
    return (A - KS) / (1.0 - KS);
}

// See Annex 5 of ITU BT.2408
float hermite_spline_P(float B, float KS, float maxLum) {
    float TB = hermite_spline_T(B, KS);
    float TB2 = TB * TB;
    float TB3 = TB2 * TB;
    return (2.0*TB3-3.0*TB2+1.0) * KS + (TB3-2.0*TB2+TB) * (1.0-KS) + (-2.0*TB3+3.0*TB2) * maxLum;
}

// Efficient EETF (tonemap) computation
// Assuming Lb, Lmin = 0.0, we can simplify computation
float efficient_EETF(float maxRGB1_enc){
    float EOTF_Inv_Lw = PQ_EOTF_inv_norm(uMaxContentLuminance / PQ_Lw);
    float EOTF_Inv_Lmax = PQ_EOTF_inv_norm(HLG_Lw / PQ_Lw); // Encoding of Lmax=HLG_Lw
    const float knee_offset = 0.5; // BT.2408 suggests 0.5, but VLC uses 1.0 by default

    // Compute E1
    float E1 = maxRGB1_enc / EOTF_Inv_Lw;

    // Compute minLum, maxLum
    float minLum = 0.0;
    float maxLum = EOTF_Inv_Lmax / EOTF_Inv_Lw;

    // Compute KS, E2, maxRGB2_enc
    float KS = (1.0 + knee_offset) * maxLum - knee_offset;
    float E2 = mix(E1, hermite_spline_P(E1, KS, maxLum), step(KS, E1));
    return E2 * EOTF_Inv_Lw;
}

highp vec3 EOTF_norm(highp vec3 x){
    float scale = PQ_Lw / HLG_Lw;
    if(uMaxContentLuminance > HLG_Lw){
        // For MCLL > 1000 nits, perform maxRGB EETF to map linear PQ to linear HLG:
        float maxRGB1_enc = max(x.r, max(x.g, x.b));
        float maxRGB2_enc = efficient_EETF(maxRGB1_enc);
        scale = scale * PQ_EOTF_norm(maxRGB2_enc) / PQ_EOTF_norm(maxRGB1_enc);
    }
    return scale * PQ_EOTF_norm(x);
}

void main() {
    highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;

    // Rec. 2020 YUV to RGB non-linear
    highp vec3 rgb_BT2020 = clamp((YUV_TO_RGB_REC2020 * vec4(vec3(srcYuv), 1.)).rgb, 0., 1.);

    // Rec. 2020 RGB non-linear to Rec. 2020 RGB display linear
    highp vec3 rgb_BT2020_displayLinear = EOTF_norm(rgb_BT2020);

   // Rec. 2020 RGB display linear to RGB HLG
   highp vec3 rgb_HLG = HLG_EOTF_Inv(rgb_BT2020_displayLinear);

    outColor = vec4(rgb_HLG, 1.0);
}
