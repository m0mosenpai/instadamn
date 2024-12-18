#version 300 es
#extension GL_EXT_YUV_target : require
#extension GL_OES_EGL_image_external : require

precision mediump float; // highp here doesn't seem to matter

uniform __samplerExternal2DY2YEXT sTexture;

in vec2 vTextureCoord;
out vec4 outColor;

// Column-major matrix declarations; pre-multiply by input vectors
const mat4 YUV_TO_RGB_REC2020 = mat4(1.167808, 1.167808, 1.167808, 0, 0, -0.187877, 2.148072, 0, 1.683611, -0.652337, 0, 0, -0.914865, 0.347048, -1.147095, 1);
const mat3 REC2020_BT709 = mat3(1.6605, -0.1246, -0.0182, -0.5876, 1.1329, -0.1006, -0.0728, -0.0083, 1.1187);
const highp vec3 Lvec = vec3(0.2627, 0.6780, 0.0593);

const float HLG_Lw = 1000.0; // Standard HLG Lw
const float HLG_gamma = 1.2; // Standard HLG gamma

const float sRGB_Lw = 80.0;  // Standard sRGB Lw

// define a,b,c for OETF and OETF_Inv
const float a = 0.17883277;
const float b = 1.0 - 4.0 * a;
const float c = 0.5 - a * log(4.0 * a);

// Input is normalized nonlinear encoded luminance, output is normalized linear scene luminance
highp vec3 HLG_OETF_Inv(highp vec3 x) {
    highp vec3 A = (x * x) / 3.0;
    highp vec3 B = (b + exp((x - c) / a)) / 12.0;
    return mix(A, B, step(0.5, x));
}

// Input is normalized linear scene luminance, output is normalized linear display luminance
highp vec3 HLG_OOTF(highp vec3 x) {
    float Y = dot(Lvec, x);
    return pow(Y, HLG_gamma - 1.0) * x;
}

// Input is normalized nonlinear encoded luminance, output is normalized linear display luminance
highp vec3 HLG_EOTF_norm(highp vec3 x) {
  return HLG_OOTF(HLG_OETF_Inv(x));
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

void main() {
  highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;

  // Rec. 2020 YUV to RGB non-linear
  highp vec3 rgb_BT2020 = clamp((YUV_TO_RGB_REC2020 * vec4(vec3(srcYuv), 1.)).rgb, 0., 1.);

  // Rec. 2020 RGB non-linear to Rec. 2020 RGB display linear
  highp vec3 rgb_BT2020_displayLinear = HLG_EOTF_norm(rgb_BT2020);

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
