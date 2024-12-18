#version 300 es
precision mediump float;
uniform mat4 uSurfaceTransformMatrix; //Applied to the texture coordinates
uniform mat4 uSceneTransformMatrix; //Applied to the whole scene
uniform mat4 uVideoTransformMatrix; //Applied to the video geometry

in vec4 aPosition;
in vec4 aTextureCoord;

out vec2 vTextureCoord;

void main() {
  gl_Position = aPosition;
  vTextureCoord = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * aTextureCoord).xy;
}
