#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 vTexCoords;

uniform sampler2D u_SourceTexture;
uniform sampler2D u_BlurTexture;

vec4 textureRGB(sampler2D tex, vec2 uv)
{
	vec4 color = texture2D(tex, uv);
	color.b = texture2D(tex, uv + vec2(0.0037, 0.0)).b;
  return color;
}

void main()
{
	const float scale = 0.985;
	vec2 uv = (vec2(vTexCoords.x, 1.0 - vTexCoords.y) - 0.5) * scale + 0.5;
  vec4 srce = textureRGB(u_SourceTexture, uv);
  vec4 blur = textureRGB(u_BlurTexture, uv);
  float mask = blur.a;

  // Need to blend blurred and sharp textures
  // can't use blurred one in non-blurred areas, since it's 25% size
  vec4 color = mix(srce, blur, smoothstep(0.0, 0.2, mask));
  gl_FragColor = color;
  gl_FragColor.a = 1.0;
}
