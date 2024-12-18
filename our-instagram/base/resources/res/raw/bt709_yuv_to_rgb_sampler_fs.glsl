#version 300 es

/*
This shader converts pixels from YUV to RGBA non-linear conserving BT2020 color space.
This is done using a custom texture sampler that retrieves raw YUV pixel values and manually
converting the values. Otherwise, OpenGl will convert automatically whenever we write to a
Frame Buffer configured as RGBA format but will not preserve the right color space.
*/

#extension GL_EXT_YUV_target : require
#extension GL_OES_EGL_image_external : require

yuvCscStandardEXT conv_standard = itu_709;

precision mediump float;

in vec2 vTextureCoord;
out vec4 outColor;
uniform __samplerExternal2DY2YEXT sTexture;

void main() {
  highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;
  highp vec3 rgb_BT709 = yuv_2_rgb(srcYuv, conv_standard);
  outColor = vec4(rgb_BT709, 1.0);
}
