#version 300 es
#extension GL_EXT_YUV_target : require
#extension GL_OES_EGL_image_external : require

precision highp float;

uniform __samplerExternal2DY2YEXT sTexture;

in vec2 vTextureCoord;
out vec4 outColor;

// Column-major matrix declarations; pre-multiply by input vectors
const mat4 YUV_TO_RGB_REC2020 = mat4(1.167808, 1.167808, 1.167808, 0, 0, -0.187877, 2.148072, 0, 1.683611, -0.652337, 0, 0, -0.914865, 0.347048, -1.147095, 1);
const mat3 REC2020_BT709 = mat3(1.6605, -0.1246, -0.0182, -0.5876, 1.1329, -0.1006, -0.0728, -0.0083, 1.1187);

// Assume content luminance always equals to PQ_Lw
const float uMaxContentLuminance = 10000.0;
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
const float sRGB_Lw = 80.0;  // Standard sRGB Lw

highp vec3 sRGB_EOTF_Inv(highp vec3 x) {
    highp vec3 A = 12.92 * x;
    highp vec3 B = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;
    return mix(A, B, step(0.0031308, x));
}

highp vec3 sRGB_EOTF(highp vec3 x) {
    highp vec3 A = x / 12.92;
    highp vec3 B = pow((x + 0.055) / 1.055, vec3(2.4));
    return mix(A, B, step(0.04045, x));
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
    // Scale 1000 nits to be 1.0 in PQ
    float scale = PQ_Lw / HLG_Lw;

    // For MCLL > 1000 nits, perform maxRGB EETF to map linear PQ to linear HLG:
    float maxRGB1_enc = max(x.r, max(x.g, x.b));
    float maxRGB2_enc = efficient_EETF(maxRGB1_enc);
    scale = scale * PQ_EOTF_norm(maxRGB2_enc) / PQ_EOTF_norm(maxRGB1_enc);

    return scale * PQ_EOTF_norm(x);
}

// Parameters for tonemap
const float L_HDR = HLG_Lw;
const float rho_HDR = 1.0 + 32.0 * pow(L_HDR / 10000.0, 1.0 / 2.4);
const float L_SDR = sRGB_Lw; // Try 80 or 100 cd/m2
const float rho_SDR = 1.0 + 32.0 * pow(L_SDR / 10000.0, 1.0 / 2.4);

// Convert to perceptually linear space
float BT2446_tone_mapping_step_1(float Y_prime) {
    return log(1.0 + (rho_HDR - 1.0) * Y_prime) / log(rho_HDR);
}

// Apply a knee function in the perceptual domain
float BT2446_tone_mapping_step_2(float Y_prime_p) {
    float A = 1.0770 * Y_prime_p;
    float B = (-1.1510 * Y_prime_p  + 2.7811) * Y_prime_p - 0.6302;
    float C = 0.5 * Y_prime_p + 0.5;
    return mix(A, mix(B,  C, step(0.9909, Y_prime_p)), step(0.7399, Y_prime_p));
}

// Convert back to gamma domain
float BT2446_tone_mapping_step_3(float Y_prime_c) {
    return (pow(rho_SDR, Y_prime_c) - 1.0) / (rho_SDR - 1.0);
}

// Implementation of the tonemapping method described in BT.2446 Section 4.1
// the use of 'prime' indicates values computed in the nonlinear space
highp vec3 BT2446_tone_mapping(highp vec3 rgb_BT2020) {
    // Apply a non-linear transfer function to bring it to gamma space
    // We can use standard inverse gamma of 2.4 or nearly-identical piecewise sRGB transfer
    highp vec3 rgb_BT2020_prime = sRGB_EOTF_Inv(rgb_BT2020); // using sRGB transfer fixes noise in shadows/blacks

    // Calculate luma Y'
    float Y_prime = dot(Lvec, rgb_BT2020_prime);

    // Tonemapping steps:
    float Y_prime_p = BT2446_tone_mapping_step_1(Y_prime);
    float Y_prime_c = BT2446_tone_mapping_step_2(Y_prime_p);
    float Y_prime_SDR = BT2446_tone_mapping_step_3(Y_prime_c);

    // Calculate non-linear YCbCr color:
    float f_Y_prime_SDR = Y_prime_SDR / (1.1 * Y_prime);
    float Cb_prime_TMO = f_Y_prime_SDR * (rgb_BT2020_prime.b - Y_prime) / 1.8814;
    float Cr_prime_TMO = f_Y_prime_SDR * (rgb_BT2020_prime.r - Y_prime) / 1.4746;
    // Adjust TMO luma based on Cr
    float Y_prime_TMO = Y_prime_SDR - max(0.1 * Cr_prime_TMO, 0.0);

    // Convert to RGB, refer to BT. 2020 Table 4
    float R_prime_TMO = Cr_prime_TMO * 1.4746 + Y_prime_TMO;
    float B_prime_TMO = Cb_prime_TMO * 1.8814 + Y_prime_TMO;
    float G_prime_TMO = (Y_prime_TMO - Lvec.r * R_prime_TMO - Lvec.b * B_prime_TMO) / Lvec.g;
    highp vec3 rgb_BT2020_prime_TMO = vec3(R_prime_TMO, G_prime_TMO, B_prime_TMO);
    // Convert back to linear RGB
    return sRGB_EOTF(rgb_BT2020_prime_TMO);
}

// Implementation of the inverse tonemapping method described in BT.2446 Section 4.2
// the use of 'prime' indicates values computed in the nonlinear space
highp vec3 BT2446_inverse_tone_mapping(highp vec3 rgb_BT2020_prime) {
    // RGB to YCbCr
    highp float Y_prime = clamp(dot(Lvec, rgb_BT2020_prime), 0.0, 1.0);
    highp float Cb_prime = (rgb_BT2020_prime.b - Y_prime) / 1.8814;
    highp float Cr_prime = (rgb_BT2020_prime.r - Y_prime) / 1.4746;

    // Map luma from SDR (expanded to full range) to HDR
    highp float Y_prime_full = Y_prime * 255.0;
    highp float A = 1.8712e-5 * pow(Y_prime_full, 2.0) - 2.7334e-3 * Y_prime_full + 1.3141;
    highp float B = 2.8305e-6 * pow(Y_prime_full, 2.0) - 7.4622e-4 * Y_prime_full + 1.2528;
    highp float E = mix(A, B, step(70.0, Y_prime_full));
    highp float Y_prime_hdr = pow(Y_prime_full, E);

    // Map chroma from SDR to HDR
    highp float Sc = Y_prime == 0.0? 1.0 : 1.075 * Y_prime_hdr / Y_prime;
    highp float Cb_prime_hdr = Cb_prime * Sc;
    highp float Cr_prime_hdr = Cr_prime * Sc;

    highp float R_prime = pow(clamp(Y_prime_hdr + 1.4746 * Cr_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);
    highp float G_prime = pow(clamp(Y_prime_hdr - 0.16455 * Cb_prime_hdr - 0.57135 * Cr_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);
    highp float B_prime = pow(clamp(Y_prime_hdr + 1.8814 * Cb_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);

    return vec3(R_prime, G_prime, B_prime);
}

void main() {
    highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;

    // Rec. 2020 YUV to RGB non-linear
    highp vec3 rgb_BT2020 = clamp((YUV_TO_RGB_REC2020 * vec4(vec3(srcYuv), 1.)).rgb, 0., 1.);

    // Rec. 2020 RGB non-linear to Rec. 2020 RGB display linear
    highp vec3 rgb_BT2020_displayLinear = EOTF_norm(rgb_BT2020);

    // HLG Rec. 2020 RGB display linear to SDR Rec. 2020 RGB display linear
    highp vec3 rgb_BT2020_displayLinear_TMO = BT2446_tone_mapping(rgb_BT2020_displayLinear);

    // Rec. 2020 RGB display linear -> BT.709 display linear
    highp vec3 rgb_BT709_displayLinear = REC2020_BT709 * rgb_BT2020_displayLinear_TMO;

    // Color gamut compression
    rgb_BT709_displayLinear = clamp(rgb_BT709_displayLinear, 0., 1.);

    // BT.709 display linear -> BT.709 non-linear
    highp vec3 rgb_BT709_sRGB = sRGB_EOTF_Inv(rgb_BT709_displayLinear);

    outColor = vec4(rgb_BT709_sRGB, 1.0);
}
