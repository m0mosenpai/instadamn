#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 vTexCoords;

uniform sampler2D u_SourceTexture;
uniform sampler2D u_BlurTexture;
uniform sampler2D u_FontTexture;
uniform vec2 u_RenderSize;
uniform float u_Day;
uniform float u_Month;
uniform float u_Year;
uniform float u_DateOffsetX;
uniform float u_DateOffsetY;

// FUNCTIONS FOR FONT DRAWING
#define CHAR_SPRITE_SIZE vec2(160., 96.)
#define CHAR_SPRITE_GRID vec2(5., 2.)
#define MAX_INT_DIGITS 2

#define CHAR_SIZE vec2(32., 48.)
#define CHAR_SPACING vec2(32., 48.)

#define STRWIDTH(c) (c * CHAR_SPACING.x)
#define STRHEIGHT(c) (c * CHAR_SPACING.y)

vec2 printPos = vec2(0);

// Returns the pixel at uv in the given bit-packed sprite.
float sprite(vec2 spr, vec2 size, vec2 uv)
{
  uv = floor(uv);

  // calcurate normalized width and height of the segment of character
  vec2 segment = vec2(CHAR_SIZE / CHAR_SPRITE_SIZE);
  vec2 texImageSegUV = uv / size * segment;
  texImageSegUV += vec2(
    segment.x * float( int( mod(spr.x, CHAR_SPRITE_GRID.x) ) ),
    segment.y * float( int( mod(spr.y, CHAR_SPRITE_GRID.y) ) )
  );

  // Clipping bound to remove garbage outside the sprite's boundaries.
  vec2 a = step(uv, size);
  vec2 b = step(vec2(0), uv);
  vec2 c = a * b;
  float bounds = c.x * c.y;
  float pixels = texture2D(u_FontTexture, vec2(texImageSegUV.x, 1. - texImageSegUV.y)).r;
  pixels = clamp(pixels, 0., 1.);
  return mix( 0.0, pixels, float(bounds));
}

// Prints a character and moves the print position forward by 1 character width.
float char(vec2 ch, vec2 uv)
{
  float px = sprite(ch, CHAR_SIZE, uv - printPos);
  printPos.x += CHAR_SPACING.x;
  return px;
}

//Returns the digit sprite for the given number.
vec2 get_digit(float d)
{
    d = floor(d);
    return vec2(d, step(d, CHAR_SPRITE_GRID - 1.0));
}

float get_decimal_digit(float number, int decimal_index, vec2 uv)
{
  float decimals = pow(10.0, float(decimal_index));
  float digit = mod( number / decimals , 10.0);
  return char(get_digit(digit),uv);
}

float print_two_integer(int number, vec2 uv)
{
  float fnumber = float(number);
  float result = 0.0;
  result += get_decimal_digit(fnumber, 1, uv);
  result += get_decimal_digit(fnumber, 0, uv);
  return result;
}

void main()
{
	vec2 uv = vTexCoords;
  vec4 srce = texture2D(u_SourceTexture, uv);
  vec4 blur = texture2D(u_BlurTexture, uv);
  float mask = blur.a;

  // Blend blurred and sharp textures
  vec4 color = mix(srce, blur, smoothstep(0.0, 0.2, mask));

  // Position text - assume fixed pixel height of so everything scales well
  vec2 canvasSize = 1000.0 * u_RenderSize.yx / u_RenderSize.y;
  vec2 scale = vec2(2.75, 2.5);
  vec2 textUv = vec2(1.0 - uv.y, uv.x) * scale;
  vec2 tuv = textUv * canvasSize;
  printPos = (vec2(0.82, 0.1) + vec2(u_DateOffsetY, u_DateOffsetX)) * canvasSize * scale; // start print pos

  // Draw date
  float text = print_two_integer(int(u_Day), tuv);
  printPos.x += CHAR_SPACING.x;
  text += print_two_integer(int(u_Month), tuv);
  printPos.x += CHAR_SPACING.x;
  text += print_two_integer(int(u_Year), tuv);

  const vec3 textColor = vec3(0.94, 0.65, 0.55);
  color.rgb = mix(color.rgb + textColor * text, textColor, text * 0.5); // mix add and alpha blending

  gl_FragColor = color;
  gl_FragColor.a = 1.0;
}
