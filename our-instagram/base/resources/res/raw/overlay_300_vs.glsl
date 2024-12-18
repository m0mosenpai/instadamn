#version 300 es

uniform mat4 uSceneMatrix;
uniform mat4 uRotationMatrix;

in vec4 aPosition;
in vec4 aTextureCoord;

out vec2 vTextureCoord;

void main() {
    gl_Position = uRotationMatrix * aPosition;
    vTextureCoord = (uSceneMatrix * aTextureCoord).xy;
}
