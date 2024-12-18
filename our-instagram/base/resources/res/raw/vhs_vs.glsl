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

// script uniforms
uniform float u_OffsetX;
uniform float u_OffsetY;
uniform bool u_Flipped;

// varyings
varying vec2 v_Uv;
varying vec2 v_PhotoUv;


void main()
{
  v_Uv = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
  if (u_Flipped) {
    v_Uv.y = 1.0 - v_Uv.y;
  }
  v_PhotoUv = v_Uv + vec2(u_OffsetX, u_OffsetY);
  gl_Position = aPosition;
}
