#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 v_Uv;
varying vec2 v_PhotoUv;

uniform sampler2D u_LUT;
uniform sampler2D u_Texture;
uniform sampler2D u_GlitchTextureA;
uniform sampler2D u_GlitchTextureB;

uniform float u_Time;
uniform float u_Exposure;
uniform float u_GlitchOpacity;
uniform float u_NoiseOpacity;
uniform float u_LutIndex;

#define colorlut_height  (32.0)
#define colorlut_width  (colorlut_height*colorlut_height)
#define colorlut_rows 4
#define colorlut_offset (1.0 / float(colorlut_rows))
#define EXPOSURE_MULT 0.25

// apply a color LUT to the input color
vec4 colorLUT(vec4 color, sampler2D lut, float index) {
    // this should come from a real uniform from the engine
    // hard-coded here for now
    const vec4 uLutSize = vec4(colorlut_width, colorlut_height, 1.0/colorlut_width, 1.0/colorlut_height);

    vec3 scaledColor = color.xyz * (uLutSize.y - 1.0);
    float bFrac = fract(scaledColor.z);
    // offset by 0.5 pixel and fit within range [0.5, width-0.5]
    // to prevent bilinear filtering with adjacent colors
    vec2 texc = (0.5 + scaledColor.xy) * uLutSize.zw;
    // texc = (vec2(0.5, 0.0) + scaledColor.xy) * uLutSize.zw;

    // offset by the blue slice
    texc.x += (scaledColor.z - bFrac) * uLutSize.w;
    texc.y *= colorlut_offset;
    texc.y += colorlut_offset * index;

    // sample the 2 adjacent blue slices
    vec3 b0 = texture2D(lut, texc).xyz;
    vec3 b1 = texture2D(lut, vec2(texc.x + uLutSize.w, texc.y)).xyz;

    // blend between the 2 adjacent blue slices
    color.xyz = mix(b0, b1, bFrac);

    return color;
}

vec3 random3(in vec3 pos)
{
  pos = vec3( dot(pos, vec3(127.1, 311.7, 74.7)),
              dot(pos, vec3(269.5, 183.3, 246.1)),
              dot(pos, vec3(113.5, 271.9, 124.6)));
  return -1. + 2. * fract(sin(pos) * 43758.5453123);
}

vec3 colorLUT(vec3 color, sampler2D lut, float index)
{
  return colorLUT(vec4(color, 1.0), lut, index).rgb;
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

float gain(float x, float k)
{
  float a = 0.5*pow(2.0*((x<0.5)?x:1.0-x), k);
  return (x<0.5)?a:1.0-a;
}

float poster(float val, float steps)
{
  return floor(val * steps) / steps;
}

vec2 getGridOffset(float index)
{
  // return vec2(mod(index, 2.0), floor(index / 2.0));
  return vec2(mod(index, 2.0), floor(mod(index, 4.0) / 2.0));
}

void main()
{
  // Background color
  vec4 color = vec4(vec3(0.05), 1.0);

  // Sample photo
  vec4 photo = texture2D(u_Texture, v_PhotoUv);
  vec2 isPhoto = step(abs(v_PhotoUv - 0.5), vec2(0.5));
  color = mix(color, texture2D(u_Texture, v_PhotoUv), min(isPhoto.x, isPhoto.y));

  // Apply LUT
  color = mix(color, colorLUT(color, u_LUT, u_LutIndex), 0.8);

  // Apply Exposure
  color.rgb = exposure(color.rgb, u_Exposure * EXPOSURE_MULT);

  // TODO: color correction?

  // Apply noise
  color.rgb += random3(vec3(v_Uv, mod(u_Time, 3.71))) * u_NoiseOpacity * 0.45;
  color.rgb = clamp(color.rgb, vec3(0.0), vec3(1.0));

  // Blend glitch texture
  const float glitchSpeed = 8.0;
  float index = mod(floor(u_Time * glitchSpeed), 8.0);
  vec2 glitchOffset = getGridOffset(index);
  vec2 glitchUV = v_Uv * 0.5 + 0.5 * glitchOffset;
  vec4 glitchA = texture2D(u_GlitchTextureA, glitchUV);
  vec4 glitchB = texture2D(u_GlitchTextureB, glitchUV);
  vec4 glitch = index < 4.0 ? glitchA : glitchB;

  color.rgb = mix(color.rgb, glitch.rgb, glitch.a * u_GlitchOpacity);

  gl_FragColor = color;
  gl_FragColor.a = 1.0;
}
