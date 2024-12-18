attribute vec4 aPosition;
attribute vec2 aTexCoord;

varying lowp vec2 sourceTextureCoordinate;

void main(void) {
  gl_Position = aPosition;
  sourceTextureCoordinate = aTexCoord;
}
