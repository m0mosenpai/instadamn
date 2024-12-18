#version 300 es
#extension GL_EXT_YUV_target : require
#extension GL_OES_EGL_image_external : require
#extension GL_OES_EGL_image_external_essl3 : require

precision mediump float;

in vec2 vTextureCoord;
layout (yuv) out vec4 gl_FragColor;
uniform samplerExternalOES sTexture;

void main()
{
    vec3 rgb = texture(sTexture, vTextureCoord).rgb;
    gl_FragColor = vec4(rgb_2_yuv(rgb, itu_601_full_range), 1.0);
}
