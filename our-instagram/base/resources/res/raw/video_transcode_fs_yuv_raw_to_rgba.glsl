#version 300 es

/*
This shader converts pixels from YUV to RGBA non-linear conserving BT2020 color space.
This is done using a custom texture sampler that retrieves raw YUV pixel values and manually
converting the values. Otherwise, OpenGl will convert automatically whenever we write to a
Frame Buffer configured as RGBA format but will not preserve the right color space.
*/

#extension GL_OES_EGL_image_external : require
#extension GL_EXT_YUV_target : require

precision mediump float; // highp here doesn't seem to matter

uniform __samplerExternal2DY2YEXT sTexture;

in vec2 vTextureCoord;
out vec4 outColor;

const mat4 YUV_TO_RGB_REC2020 = mat4(1.167808, 1.167808, 1.167808, 0, 0, -0.187877, 2.148072, 0, 1.683611, -0.652337, 0, 0, -0.914865, 0.347048, -1.147095, 1);

void main() {
    highp vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;

    // Rec. 2020 YUV to RGB non-linear
    highp vec3 rgb_BT2020 = clamp((YUV_TO_RGB_REC2020 * vec4(vec3(srcYuv), 1.)).rgb, 0., 1.);

    outColor = vec4(rgb_BT2020.rgb, 1.0);
}
