#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

#define EXPOSURE_MULT 0.25

varying vec2 vTextureCoord;

uniform sampler2D u_Texture;
uniform float u_Exposure;

vec3 exposure(vec3 color, float amount)
{
  return color * pow(2.0, amount);
}

void main()
{
  vec4 color = texture2D(u_Texture, vTextureCoord);
  color.rgb = exposure(color.rgb, u_Exposure * EXPOSURE_MULT);
  gl_FragColor = color;
}
