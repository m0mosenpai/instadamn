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

// script uniforms
uniform float u_OffsetY;
uniform float u_Time;

// varyings
varying vec2 v_Uv;
varying vec2 v_PhotoUv;
varying vec2 v_LeakUv;

vec2 adjustUv(vec2 uv, vec2 translation, float scale)
{
  uv = (uv - 0.5) * scale + 0.5; // scale from center
  uv += translation;
  return uv;
}

float random(in float x)
{
  return fract(sin(x) * 43758.5453);
}

float poster(float val, float steps)
{
  return floor(val * steps) / steps;
}

float randomScale()
{
  float t = poster(u_Time,  3.0); // posterize time every 10 frames (1/3 second)
  float s = random(t); // randomize scale between 0-1
  return 0.98 + 0.04 * poster(s, 4.0); // posterize scale to 0.98, 0.99, 1.0, 1.01, 1.02
}

void main()
{
	float scale = randomScale();
  vec2 offset = vec2(0.0, -poster(u_OffsetY, 3.0));
  vec2 photoUv = adjustUv(aTextureCoord.xy, offset, scale);

  v_Uv = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
  v_PhotoUv = photoUv;
  v_LeakUv = v_Uv;

  float rnd = random(poster(u_Time, 3.0));
  v_LeakUv.y = rnd > 0.5 ? v_LeakUv.y : 1.0 - v_LeakUv.y;

	// Basic UV and position
	gl_Position = aPosition;
}
