#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 v_UvR;
varying vec2 v_UvG;
varying vec2 v_UvB;

uniform sampler2D u_Texture;

vec4 textureRGB(sampler2D tex, vec2 uv)
{
  vec4 color = texture2D(tex, uv);
  color.b = texture2D(tex, uv + vec2(0.0037, 0.0)).b;
  return color;
}

vec4 textureRGB(sampler2D tex, vec2 uvR, vec2 uvG, vec2 uvB)
{
  vec4 r = texture2D(tex, uvR);
  vec4 g = texture2D(tex, uvG);
  vec4 b = texture2D(tex, uvB);
  return vec4(r.r, g.g, b.b, r.a);
}

void main()
{
  vec4 color = vec4(
    texture2D(u_Texture, v_UvR).r,
    texture2D(u_Texture, v_UvG).g,
    texture2D(u_Texture, v_UvB).b,
    1.0);

  gl_FragColor = color;
}
