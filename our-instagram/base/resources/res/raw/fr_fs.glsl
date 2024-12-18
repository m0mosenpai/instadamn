#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

#define EXPOSURE_MULT 0.4

varying vec2 v_Uv;
varying vec2 v_PhotoUv;

uniform sampler2D u_LUT;
uniform sampler2D u_TextureA;
uniform sampler2D u_TextureB;
uniform sampler2D u_Frame;
uniform vec2 u_RenderSize;
uniform float u_Exposure;

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

vec3 exposure(vec3 color, float amount)
{
  return color * pow(2.0, amount);
}

float sdBox(in vec2 uv, in vec2 size)
{
  vec2 d = abs(uv) - size;
  return length(max(d, vec2(0))) + min(max(d.x, d.y), 0.0);
}

void main()
{
  // Cycle uvs vertically
  vec2 photoUv = v_PhotoUv;
  photoUv.y = fract(photoUv.y);

  // Sample frame
  vec4 frame = texture2D(u_Frame, photoUv);

  // Sample the right photo
  vec4 a = texture2D(u_TextureA, photoUv);
  vec4 b = texture2D(u_TextureB, photoUv);
  float aOrB = step(mod(v_PhotoUv.y, 2.0), 1.0);
  vec4 color = mix(b, a, vec4(aOrB));

  // Apply LUT
  color = mix(color, colorLUT(color, u_LUT), 0.8);

  // Blend Film frame
  color = mix(color, frame, frame.a);

  // Apply Exposure
  color.rgb = exposure(color.rgb, u_Exposure * EXPOSURE_MULT);

  // Add rectangle vignette
  const float round = 0.04;
  const float feather = 0.25;
  vec2 res = u_RenderSize / u_RenderSize.y;
  vec2 size = res * 0.5 - 0.12;// * res;
  float sdf = sdBox(v_Uv * res - vec2(0.5) * res, size - round) - round;
  float vignette = smoothstep(feather, 0.0, sdf);
  color.rgb *= vignette;

  gl_FragColor = color;
}