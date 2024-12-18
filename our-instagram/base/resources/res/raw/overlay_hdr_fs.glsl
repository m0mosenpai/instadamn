#version 300 es

#extension GL_OES_EGL_image_external : require

precision mediump float; // highp here doesn't seem to matter

uniform samplerExternalOES sOverlay;

in vec2 vTextureCoord;
out vec4 outColor;

vec3 inverseTonemapHlg(vec3 inColor);

void main() {
  highp vec4 srcRgb = texture(sOverlay, vTextureCoord);
  srcRgb.xyz = inverseTonemapHlg(srcRgb.xyz);
  outColor = srcRgb;
}
