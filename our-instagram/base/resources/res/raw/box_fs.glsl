#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 vTexCoords;

uniform sampler2D u_Texture;
uniform vec2 u_TextureSize;

vec4 boxFilter(sampler2D samp, vec2 uv, vec2 duv) {
  vec4 color;
  color  = texture2D(samp, uv + vec2(-duv.x, -duv.y));
  color += texture2D(samp, uv + vec2( duv.x, -duv.y));
  color += texture2D(samp, uv + vec2(-duv.x,  duv.y));
  color += texture2D(samp, uv + vec2( duv.x,  duv.y));
  return 0.25 * color;
}

void main()
{
  gl_FragColor = boxFilter(u_Texture, vTexCoords, 1.0 / u_TextureSize);
}
