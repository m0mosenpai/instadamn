uniform mat4 uSceneMatrix;
uniform mat4 uRotationMatrix;

attribute vec4 aPosition;
attribute vec4 aTextureCoord;

varying vec2 vTextureCoord;

void main() {
    gl_Position = uRotationMatrix * aPosition;
    vTextureCoord = (uSceneMatrix * aTextureCoord).xy;
}
