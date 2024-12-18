#version 300 es

precision mediump float;

uniform mat4 uTextureTransformMatrix;
uniform mat4 uCropTransformMatrix;
uniform mat4 uInContentTransformMatrix;
uniform mat4 uContentTransformMatrix;

in vec4 aPosition;
in vec4 aTextureCoord;

out vec2 vTextureCoord;

void main() {
    gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;
    vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;
}
