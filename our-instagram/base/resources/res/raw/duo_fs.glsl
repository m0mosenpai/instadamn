#extension GL_OES_EGL_image_external : require

precision highp float;

varying vec2 vTextureCoord;

uniform float uAmplitude;
uniform float uFrequency;
uniform highp vec2 uRenderSize;
uniform samplerExternalOES sTexture;

void main() {
    highp float ratio = uRenderSize.y / (1.78 * uRenderSize.x); // to keep the same freq in different aspect ratios
    highp float offset = sin(vTextureCoord.y * uFrequency * ratio) * uAmplitude;
    highp vec2 offsetUv = vTextureCoord + vec2(offset, 0.0);
    gl_FragColor = texture2D(sTexture, offsetUv);
}
