precision mediump float;
uniform mat4 uTextureTransformMatrix;
uniform mat4 uCropTransformMatrix;
uniform mat4 uInContentTransformMatrix;
uniform mat4 uContentTransformMatrix;

attribute vec4 aPosition;
attribute vec4 aTextureCoord;

varying vec2 vTextureCoord;

void main() {
    gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;
    vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;
}
