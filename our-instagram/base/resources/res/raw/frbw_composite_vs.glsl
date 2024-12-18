// attributes
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif
attribute vec4 aPosition;
attribute vec4 aTextureCoord;

uniform mat4 uSurfaceTransformMatrix; //Applied to the texture coordinates
uniform mat4 uSceneTransformMatrix; //Applied to the whole scene
uniform mat4 uVideoTransformMatrix; //Applied to the video geometry

varying vec2 vTexCoord;
varying vec2 v_UvR;
varying vec2 v_UvG;
varying vec2 v_UvB;

void main()
{
	// Basic UV and position
	gl_Position = aPosition;

  const float uvScale = 0.985;
  vec2 v_Uv = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
  vTexCoord = (vec2(v_Uv.x, 1.0 - v_Uv.y) - 0.5) * uvScale + 0.5;;
	v_UvR = (vTexCoord.xy - 0.5) / 1.01 + 0.5;
  v_UvG = (vTexCoord.xy - 0.5) / 1.005 + 0.5 - vec2(0.0037, 0.0);
  v_UvB =  vTexCoord.xy - vec2(0.0036, 0.0);
}
