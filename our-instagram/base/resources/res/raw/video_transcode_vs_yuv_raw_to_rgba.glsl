#version 300 es

in vec4 aPosition;
in vec4 aTextureCoord;

uniform mat4 uSTMatrix;
uniform mat4 uSceneMatrix;
uniform mat4 uConstMatrix;
uniform mat4 uContentTransform;

out vec2 vTextureCoord;

void main() {
  gl_Position = uContentTransform * aPosition;
  vTextureCoord = (uSTMatrix * uConstMatrix * uSceneMatrix * aTextureCoord).xy;
}
