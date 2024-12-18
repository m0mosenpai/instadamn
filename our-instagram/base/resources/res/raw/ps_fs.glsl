#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 v_Uv;
varying vec2 v_PhotoUv;

uniform sampler2D u_LUT;
uniform sampler2D u_TextureA;
uniform sampler2D u_TextureB;

#define colorlut_height  (32.0)
#define colorlut_width  (colorlut_height*colorlut_height)

vec4 colorLUT(vec4 color, sampler2D lut)
{
    const vec4 uLutSize = vec4(colorlut_width, colorlut_height, 1.0/colorlut_width, 1.0/colorlut_height);

    vec3 scaledColor = color.xyz * (uLutSize.y - 1.0);
    float bFrac = fract(scaledColor.z);
    vec2 texc = (0.5 + scaledColor.xy) * uLutSize.zw;
    texc.x += (scaledColor.z - bFrac) * uLutSize.w;

    vec3 b0 = texture2D(lut, texc).xyz;
    vec3 b1 = texture2D(lut, vec2(texc.x + uLutSize.w, texc.y)).xyz;
    color.xyz = mix(b0, b1, bFrac);

    return color;
}

vec3 colorLUT(vec3 color, sampler2D lut)
{
  return colorLUT(vec4(color, 1.0), lut).rgb;
}

float rectangleCtr(in vec2 uv, in vec2 size)
{
  vec2 r = uv - 0.5 * size;
  return smoothstep(0.005, 0.0, max(r.x, r.y));
}

float edgeRectCtr(in vec2 uv, in vec2 innerSize, in vec2 outerSize)
{
	return rectangleCtr(uv, outerSize) - rectangleCtr(uv, innerSize);
}

void main()
{
  // Crop uvs vertically
  const float photoHeight = 0.945;
  vec2 photoUv = v_PhotoUv;
  photoUv.y = fract(photoUv.y / photoHeight);
  photoUv.y = (photoUv.y - 0.5) * photoHeight + 0.5;

  // Sample the right photo
  vec4 a = texture2D(u_TextureA, photoUv);
  vec4 b = texture2D(u_TextureB, photoUv);
  float aOrB = step(mod(v_PhotoUv.y / photoHeight, 2.0), 1.0);
  vec4 color = mix(b, a, vec4(aOrB));

  // Apply LUT
  color = mix(color, colorLUT(color, u_LUT), 0.8);

  // Blend gray background
  const vec3 background = vec3(0.3);
  const vec2 borders = vec2(0.08, 0.06);
  vec2 centerUv = abs(photoUv - 0.5);
  float xStep = step(centerUv.x, 0.5 + 0.25 * borders.x);
  float yStep = step(abs(v_PhotoUv.y / photoHeight - 2.0), 2.0);
  color.rgb = mix(background, color.rgb, xStep * yStep);

  // Blend white borders
  float rect = edgeRectCtr(centerUv, vec2(1.0, photoHeight - borders.y), vec2(1.0 + borders.x, photoHeight));
  color.rgb = mix(color.rgb, vec3(1.0), rect * yStep);
  color = clamp(color, 0.0, 1.0);

  // Add vignette
  const vec2 vigRatio = vec2(1.0, 1.4);
  float vignette = smoothstep(1.1, 0.35, distance(v_Uv * vigRatio, vec2(0.5) * vigRatio));
  color.rgb *= vignette;

  gl_FragColor = color;
  // gl_FragColor.rgb = vec3(xStep * yStep);
  // gl_FragColor.rgb = vec3(min(yStep, 1.0 - xStep));
  // gl_FragColor.rgb = vec3(v_PhotoUv / photoHeight, 0.0);
}
