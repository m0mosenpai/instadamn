precision mediump float;
uniform mat4 uSTMatrix; //Applied to the texture coordinates
uniform mat4 uSceneMatrix; //Applied to the whole scene
uniform mat4 uConstMatrix; //Applied to the video geometry
uniform mat4 uContentTransform; //Applied to the vertex coordinates

attribute vec4 aPosition;
attribute vec4 aTextureCoord;

varying vec2 vTextureCoord;

void main() {
  gl_Position = uContentTransform * aPosition;
  vTextureCoord = (uSTMatrix * uConstMatrix * uSceneMatrix * aTextureCoord).xy;
}
