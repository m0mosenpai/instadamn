#version 300 es
precision mediump float;
uniform mat4 uSTMatrix;
uniform mat4 uSceneMatrix;
uniform mat4 uConstMatrix;
uniform mat4 uContentTransform;

in vec4 aPosition;
in vec4 aTextureCoord;
out vec2 vTextureCoord;
void main() {
  gl_Position = uContentTransform * aPosition;
  vTextureCoord = (uSTMatrix * uConstMatrix * uSceneMatrix * aTextureCoord).xy;
}
