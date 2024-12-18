#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif
// attributes
attribute vec4 aPosition;
attribute vec4 aTextureCoord;
uniform mat4 uSurfaceTransformMatrix; //Applied to the texture coordinates
uniform mat4 uSceneTransformMatrix; //Applied to the whole scene
uniform mat4 uVideoTransformMatrix; //Applied to the video geometry

varying vec2 v_UvR;
varying vec2 v_UvG;
varying vec2 v_UvB;

uniform float u_OffsetR;
uniform float u_OffsetB;
uniform float u_ScaleG;
uniform float u_ScaleB;

void main() {
  gl_Position = aPosition;

  const float uvScale = 0.985;
  vec2 v_Uv = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
  vec2 vTexCoord = (vec2(v_Uv.x, 1.0 - v_Uv.y) - 0.5) * uvScale + 0.5;
	v_UvR = vTexCoord - vec2(u_OffsetR, 0.0);
  v_UvG = (vTexCoord - 0.5) / u_ScaleG + 0.5;
	v_UvB = (vTexCoord - 0.5) / u_ScaleB + 0.5 - vec2(u_OffsetB, 0.0);
}
