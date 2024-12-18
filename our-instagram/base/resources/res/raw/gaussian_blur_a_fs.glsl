#extension GL_OES_EGL_image_external : require
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif

varying vec2 vTexCoords;

uniform sampler2D u_Texture;
uniform vec2 u_RenderSize;
uniform int u_DirX;
uniform int u_DirY;
uniform float u_BlurAmount;
uniform float u_VignetteAmount;

// Separable gaussian blur
// ------------------------------------------------------------
float sCurve(float x)
{
    x = x * 2.0 - 1.0;
    return -x * abs(x) * 0.5 + x + 0.5;
}

vec4 blurDir(sampler2D source, vec2 duv, vec2 uv, float fradius)
{
    int radius = int(fradius);
    if (fradius >= 1.0)
    {
        vec4 A = vec4(0.0);
        vec4 C = vec4(0.0);
        float divisor = 0.0;
        float weight = 0.0;
        float radiusMultiplier = 1.0 / fradius;
        for (int xi = -radius; xi <= radius; xi++) {
            float x = float(xi);
            A = texture2D(source, uv + x * duv);
            weight = sCurve(1.0 - (abs(x) * radiusMultiplier));
            C.rgb += A.rgb * weight;
            divisor += weight;
        }
        return vec4(C.rgb / divisor, 1.0);
    }
    return texture2D(source, uv);
}

// Main
// ------------------------------------------------------------
float getBlurMask()
{
  const vec2 vignetteRatio = vec2(1.0, 1.0);
  vec2 res = vignetteRatio * u_RenderSize / u_RenderSize.y;
  float d = distance(vTexCoords * res, vec2(0.5) * res);
  return smoothstep(0.25, 0.5, d);
}

void main()
{
  vec2 uv = vTexCoords;
	vec2 dir = vec2(u_DirX, u_DirY);

    float mask = mix(1.0, getBlurMask(), u_VignetteAmount);
    vec4 color = blurDir(u_Texture, dir / u_RenderSize, uv, mask * u_BlurAmount);

    gl_FragColor.rgb = color.rgb;
    gl_FragColor.a = mask; // write mask on alpha channel for next pass
    // gl_FragColor = vec4(vec3(mask), 1.0); // DEBUG: uncomment to see blur mask
}
