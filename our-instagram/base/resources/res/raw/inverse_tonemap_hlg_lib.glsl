// Library with functions to inverse tonemap colors using HLG transfer function.
// Use as a library together with properly defined shaders. This shader alone will not compile.

// Column-major matrix declarations; pre-multiply by input vectors
const mat3 RECBT709_2020 = mat3(0.6274, 0.0691, 0.0164, 0.3293, 0.9195, 0.0880, 0.0433, 0.0114, 0.8956);
const highp vec3 Lvec = vec3(0.2627, 0.6780, 0.0593);

const float HLG_Lw = 1000.0; // Standard HLG Lw
const float HLG_gamma = 1.2; // Standard HLG gamma

const float sRGB_Lw = 80.0;  // Standard sRGB Lw

// define a,b,c for OETF and OETF_Inv
const float a = 0.17883277;
const float b = 1.0 - 4.0 * a;
const float c = 0.5 - a * log(4.0 * a);

// Input is normalized linear display luminance, output is normalized linear scene luminance
// Taken from BT.2408 Section 5.1.2.4
highp vec3 HLG_OOTF_Inv(highp vec3 x) {
    highp float Y = dot(Lvec, x);
    return pow(Y, (1.0 - HLG_gamma) / HLG_gamma) * x;
}

// Input is normalized linear scene luminance, output is normalized nonlinear encoded luminance
highp vec3 HLG_OETF(highp vec3 x) {
    highp vec3 A = sqrt(3.0*x);
    highp vec3 B = a * log(12.0 * x - b) + c;
    return mix(A, B, step(1.0/12.0, x));
}

// Input is normalized linear display luminance, output is normalized nonlinear encoded luminance
highp vec3 HLG_EOTF_Inv(highp vec3 x) {
    return HLG_OETF(HLG_OOTF_Inv(x));
}

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

// Parameters for tonemap
const float L_HDR = HLG_Lw;
const float rho_HDR = 1.0 + 32.0 * pow(L_HDR / 10000.0, 1.0 / 2.4);
const float L_SDR = sRGB_Lw; // Try 80 or 100 cd/m2
const float rho_SDR = 1.0 + 32.0 * pow(L_SDR / 10000.0, 1.0 / 2.4);

// Implementation of the inverse tonemapping method described in BT.2446 Section 4.2
// the use of 'prime' indicates values computed in the nonlinear space
highp vec3 BT2446_inverse_tone_mapping(highp vec3 rgb_BT2020_prime) {
    // RGB to YCbCr
    float Y_prime = clamp(dot(Lvec, rgb_BT2020_prime), 0.0, 1.0);
    float Cb_prime = (rgb_BT2020_prime.b - Y_prime) / 1.8814;
    float Cr_prime = (rgb_BT2020_prime.r - Y_prime) / 1.4746;

    // Map luma from SDR (expanded to full range) to HDR
    float Y_prime_full = Y_prime * 255.0;
    float A = 1.8712e-5 * pow(Y_prime_full, 2.0) - 2.7334e-3 * Y_prime_full + 1.3141;
    float B = 2.8305e-6 * pow(Y_prime_full, 2.0) - 7.4622e-4 * Y_prime_full + 1.2528;
    float E = mix(A, B, step(70.0, Y_prime_full));
    float Y_prime_hdr = pow(Y_prime_full, E);

    // Map chroma from SDR to HDR
    float Sc = Y_prime == 0.0? 1.0 : 1.075 * Y_prime_hdr / Y_prime;
    float Cb_prime_hdr = Cb_prime * Sc;
    float Cr_prime_hdr = Cr_prime * Sc;

    float R_prime = pow(clamp(Y_prime_hdr + 1.4746 * Cr_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);
    float G_prime = pow(clamp(Y_prime_hdr - 0.16455 * Cb_prime_hdr - 0.57135 * Cr_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);
    float B_prime = pow(clamp(Y_prime_hdr + 1.8814 * Cb_prime_hdr, 0.0, 1000.0) / 1000.0, 2.4);

    return vec3(R_prime, G_prime, B_prime);
}

vec3 inverseTonemapHlg(vec3 inColor) {
    // BT.709 non-linear -> BT.709 display linear
    highp vec3 rgb_BT709 = sRGB_EOTF(inColor);

    // BT.709 display linear -> BT.2020 display linear
    highp vec3 rgb_BT2020_displayLinear = clamp(RECBT709_2020 * rgb_BT709, 0., 1.);

    // BT. 2020 display linear -> BT. 2020 non-linear
    highp vec3 rgb_BT2020_prime = sRGB_EOTF_Inv(rgb_BT2020_displayLinear); // using sRGB transfer fixes noise in shadows/blacks

    // SDR Rec. 2020 RGB non-linear -> HDR Rec. 2020 RGB non-linear (PQ?)
    highp vec3 rgb_BT2020_ITMO = BT2446_inverse_tone_mapping(rgb_BT2020_prime);

    // HDR Rec. 2020 RGB display linear -> Rec. 2020 RGB non-linear HLG
    highp vec3 rgb_BT2020_HLG = HLG_EOTF_Inv(rgb_BT2020_ITMO);

    return rgb_BT2020_HLG;
}
