#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 vTexCoord;
varying vec2 v_UvR;
varying vec2 v_UvG;
varying vec2 v_UvB;

uniform sampler2D u_SourceTexture;
uniform sampler2D u_BlurTexture;

vec4 textureRGB(sampler2D tex, vec2 uvR, vec2 uvG, vec2 uvB)
{
	vec4 r = texture2D(tex, uvR);
  vec4 g = texture2D(tex, uvG);
  vec4 b = texture2D(tex, uvB);
  return vec4(r.r, g.g, b.b, r.a);
}

void main()
{
  vec4 srce = textureRGB(u_SourceTexture, v_UvR, v_UvG, v_UvB);
  vec4 blur = textureRGB(u_BlurTexture,   v_UvR, v_UvG, v_UvB);
  float mask = blur.a;

  // Need to blend blurred and sharp textures
  // can't use blurred one in non-blurred areas, since it's 25% size
  vec4 color = mix(srce, blur, smoothstep(0.0, 0.2, mask));
  gl_FragColor = color;
  gl_FragColor.a = 1.0;
}
