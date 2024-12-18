precision mediump float;

varying vec2 vTextureCoord;
uniform sampler2D sOverlay;

void main() {
    gl_FragColor = texture2D(sOverlay, vTextureCoord);
}
