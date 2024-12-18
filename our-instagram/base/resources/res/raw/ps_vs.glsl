#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif
uniform mat4 uSurfaceTransformMatrix; //Applied to the texture coordinates
uniform mat4 uSceneTransformMatrix; //Applied to the whole scene
uniform mat4 uVideoTransformMatrix; //Applied to the video geometry

attribute vec4 aPosition;
attribute vec4 aTextureCoord;

uniform vec2 u_RenderSize;

// script uniforms
uniform float u_OffsetX;
uniform float u_OffsetY;
uniform float u_Angle;

// varyings
varying vec2 v_Uv;
varying vec2 v_PhotoUv;

mat2 rotate2d(in float radians)
{
  float c = cos(radians);
  float s = sin(radians);
  return mat2(c, -s, s, c);
}

vec2 adjustUv(vec2 uv, vec2 translation, float rotation, float scale, vec2 mid, vec2 size)
{
  vec2 res = size / size.y;
  mat2 rot = rotate2d(rotation);

  uv = (uv - 0.5) * scale + 0.5;
  uv += translation;
	uv -= mid;
  uv *= res;

  uv = rot * uv;
  uv /= res;
  uv += mid;
  return uv;
}

void main()
{
	const vec2 center = vec2(0.54, 0.52);
	const float scale = 0.97;
  vec2 offset = vec2(u_OffsetX, u_OffsetY);
  v_PhotoUv = adjustUv(vec2(aTextureCoord.x, 1.0 - aTextureCoord.y), offset, u_Angle, scale, center, u_RenderSize);

	// Basic UV and position
	gl_Position = aPosition;
  v_Uv = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
}
