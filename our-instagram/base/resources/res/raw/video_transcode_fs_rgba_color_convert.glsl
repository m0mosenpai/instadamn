#version 300 es
#extension GL_OES_EGL_image_external : require
#extension GL_EXT_YUV_target : require

precision mediump float; // highp here doesn't seem to matter

uniform __samplerExternal2DY2YEXT sTexture;

in vec2 vTextureCoord;
out vec4 outColor;

const mat4 YUV_TO_RGB_REC2020 = mat4(1.167808, 1.167808, 1.167808, 0, 0, -0.187877, 2.148072, 0, 1.683611, -0.652337, 0, 0, -0.914865, 0.347048, -1.147095, 1);

highp vec3 PQ_EOTF(highp vec3 x) { // Assuming Lw of 10000
    float m1 = 0.1593017578125;
    float m2 = 78.84375;
    float c1 = 0.8359375;
    float c2 = 18.8515625;
    float c3 = 18.6875;
    highp vec3 x_exp = pow(x, vec3(1.0 / m2));
    highp vec3 num = max(x_exp - c1, 0.0);
    highp vec3 den = c2 - c3 * x_exp;
    highp vec3 Y = pow(num / den, vec3(1.0 / m1));
    return 10000.0 * Y;
}

highp vec3 bt1886_Inv(highp vec3 x) { // Assumming Lb = 0.0
  return pow(0.01 * x, vec3(1.0 / 2.4));
}

highp vec3 rec709_OETF_Inv(highp vec3 x) {
  highp vec3 a = x / 4.5;
  highp vec3 b = pow((x + 0.099) / 1.099, vec3(1.0 / 0.45));
  return mix(a, b, step(0.018, x));
}

highp vec3 PQ_OOTF_Inv(highp vec3 x) { return rec709_OETF_Inv(bt1886_Inv(x)) / 59.5208; }

const int PRI_SRGB = 0; const int PRI_REC709 = PRI_SRGB; const int PRI_REC2020 = 1;

const mat3 REC709_XYZ = mat3(0.4124564,
                                   0.3575761,
                                   0.1804375,
                                   0.2126729,
                                   0.7151522,
                                   0.0721750,
                                   0.0193339,
                                   0.1191920,
                                   0.9503041);
const mat3 XYZ_REC709 = mat3(3.2404542,
                                   -1.5371385,
                                   -0.4985314,
                                   -0.9692660,
                                   1.8760108,
                                   0.0415560,
                                   0.0556434,
                                   -0.2040259,
                                   1.0572252);

const mat3 REC2020_XYZ =
          mat3(0.6370, 0.1446, 0.1689, 0.2627, 0.6780, 0.0593, 0.0, 0.0281, 1.0610);
const mat3 XYZ_REC2020 =
          mat3(1.7167, -0.3557, -0.2534, -0.6667, 1.6165, 0.0158, 0.0176, -0.0428, 0.9421);

mat3 RGBToXYZMatrix(int prim) {
  if (prim == PRI_SRGB)
    return REC709_XYZ;
  if (prim == PRI_REC2020)
    return REC2020_XYZ;
}

mat3 XYZToRGBMatrix(int prim) {
  if (prim == PRI_SRGB)
    return XYZ_REC709;
  if (prim == PRI_REC2020)
    return XYZ_REC2020;
}

highp vec3 sRGB_EOTF_Inv(highp vec3 x) {
  highp vec3 x_norm = x / 100.;
  highp vec3 a = 12.92 * x;
  highp vec3 b = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;
  return mix(a, b, step(0.0031308, x));
}

highp vec3 EOTF_Inv(highp vec3 x) {
  return sRGB_EOTF_Inv(x);
}

void main() {
  highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;

  // Rec. 2020 YUV to RGB non-linear
  highp vec3 rgb_BT2020 = clamp((YUV_TO_RGB_REC2020 * vec4(vec3(srcYuv), 1.)).rgb, 0., 1.);

  // Rec. 2020 RGB non-linear -> scene linear (Lw = 10000.0)
  highp vec3 rgb_BT2020_sceneLinear = PQ_EOTF(rgb_BT2020);

  // Normalized to 100.0 target peak luminance
  highp vec3 rgb_BT2020_displayLinear = rgb_BT2020_sceneLinear / 100.0;

  // Rec. 2020 RGB display linear -> XYZ display linear
  highp vec3 xyz_displayLinear = rgb_BT2020_displayLinear*RGBToXYZMatrix(PRI_REC2020);

  // Reinhard tonemap, applied in XYZ, only to the y (luminance component)
  highp vec3 xyz_tonemap = xyz_displayLinear / (xyz_displayLinear.y + 1.0);

  // XYZ tonemapped -> Rec. 709 RGB display linear
  highp vec3 rgb_BT709_displayLinear = xyz_tonemap*XYZToRGBMatrix(PRI_REC709);

  rgb_BT709_displayLinear = clamp( rgb_BT709_displayLinear, 0., 1.);

  // Rec. 709 RGB display linear -> non-linear (sRGB engamma)
  highp vec3 rgb_BT709_sRGB = EOTF_Inv(rgb_BT709_displayLinear);

  outColor = vec4(rgb_BT709_sRGB, 1.0);
}
