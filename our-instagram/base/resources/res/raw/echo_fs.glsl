#extension GL_OES_EGL_image_external : require

precision highp float;

varying vec2 vTextureCoord;

uniform float uFirstFrameOpacity;
uniform float uSecondFrameOpacity;
uniform float uThirdFrameOpacity;
uniform sampler2D sFirstFrameTexture;
uniform sampler2D sSecondFrameTexture;
uniform sampler2D sThirdFrameTexture;
uniform samplerExternalOES sTexture;

void main() {
    vec3 color0 = texture2D(sTexture, vTextureCoord).xyz;
    vec3 color1 = texture2D(sFirstFrameTexture, vTextureCoord).xyz;
    vec3 color2 = texture2D(sSecondFrameTexture, vTextureCoord).xyz;
    vec3 color3 = texture2D(sThirdFrameTexture, vTextureCoord).xyz;
    vec3 colorOut = color0;
    colorOut = mix(color0, color1, uFirstFrameOpacity);
    colorOut = mix(colorOut, color2, uSecondFrameOpacity);
    colorOut = mix(colorOut, color3, uThirdFrameOpacity);
    gl_FragColor = vec4(colorOut, 1.0);
}
