#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

#define EXPOSURE_MULT 0.25

varying vec2 v_Uv;
varying vec2 v_PhotoUv;
varying vec2 v_LeakUv;
varying vec4 v_NoiseChannels;
varying float v_NoiseFlicker;

uniform sampler2D u_LUT;
uniform sampler2D u_Texture;
uniform sampler2D u_NoiseTexture;
uniform sampler2D u_LeakTexture;
uniform vec2 u_RenderSize;
uniform float u_Time;
uniform float u_Exposure;
uniform float u_LeakOpacity;

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
  // Sample photo
  vec4 color = texture2D(u_Texture, v_PhotoUv);

  // Apply LUT
  color = mix(color, colorLUT(color, u_LUT), 0.8);

  // Apply Exposure
  color.rgb = exposure(color.rgb, u_Exposure * EXPOSURE_MULT);

  // Blend noise texture
  vec2 res = u_RenderSize / u_RenderSize.y;
  vec2 noiseUv = fract(v_Uv * res * 2.5);
  vec4 noise = texture2D(u_NoiseTexture, noiseUv);
  float noiseVignette = distance(v_Uv, vec2(0.5)) * 2.0;

  color.rgb += dot(noise, v_NoiseChannels) * v_NoiseFlicker * noiseVignette;
  color.rgb = clamp(color.rgb, vec3(0.0), vec3(1.0));

  // Blend light leaks
  // color = mix(color, frame, frame.a);
  vec4 leak = texture2D(u_LeakTexture, v_LeakUv);
  color.rgb += leak.rgb * u_LeakOpacity;
  color.rgb = clamp(color.rgb, vec3(0.0), vec3(1.0));

  // Add rectangle vignette
  const float round = 0.04;
  const float feather = 0.25;
  vec2 size = res * 0.5 - 0.12;// * res;
  float sdf = sdBox(v_Uv * res - vec2(0.5) * res, size - round) - round;
  float vignette = smoothstep(feather, 0.0, sdf);
  color.rgb *= vignette;

  gl_FragColor = color;
  // gl_FragColor.rgb = vec3(dot(noise, v_NoiseChannels) * noiseVignette);
  gl_FragColor.a = 1.0;
}
