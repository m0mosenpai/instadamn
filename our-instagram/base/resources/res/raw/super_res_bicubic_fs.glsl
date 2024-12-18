#extension GL_OES_EGL_image_external : require

precision highp float;

uniform sampler2D sTexture;
uniform int uSrcWidth;
uniform int uSrcHeight;
uniform float uSharpness;

varying vec2 vTexCoord;

vec4 toLinear(vec4 rgba) {
    return vec4(pow(clamp(rgba.rgb, 0., 1.), vec3(2.2)), rgba.a);
}
vec4 fromLinear(vec4 rgba) {
    return vec4(pow(clamp(rgba.rgb, 0., 1.), vec3(1. / 2.2)), rgba.a);
}
vec4 fastBicubic(sampler2D sTexture, vec2 texCoord) {
    vec2 srcSize = vec2(float(uSrcWidth), float(uSrcHeight));
    vec2 srcPos = srcSize * texCoord;
    vec2 srcCenter = floor(srcPos - .5) + .5;

    vec2 f = srcPos - srcCenter;
    vec2 f2 = f * f;
    vec2 f3 = f2 * f;

    float c = uSharpness;
    vec2 w0 = -c * f3 + 2.0 * c * f2 - c * f;
    vec2 w1 = (2.0 - c) * f3 - (3.0 - c) * f2 + 1.0;
    vec2 w2 = -(2.0 - c) * f3 + (3.0 - 2.0 * c) * f2 + c * f;
    vec2 w3 = c * f3 - c * f2;

    vec2 topLeftCoords = (srcCenter - 1.) / srcSize;
    vec2 bottomRightCoords = (srcCenter + 2.) / srcSize;

    // sampling center
    vec2 centerWeights = w1 + w2;
    vec2 sampleCenter = (srcCenter + w2 / centerWeights) / srcSize;
    vec4 texelCenter = texture2D(sTexture, sampleCenter);

    // sampling neighbors
    vec4 neighborWeights = centerWeights.yxyx * vec4(w0, w3).xyzw;
    float centerWeightsScalar = centerWeights.x * centerWeights.y;
    float weightSum = neighborWeights.x + neighborWeights.y + neighborWeights.z +
                        neighborWeights.w + centerWeightsScalar;
    neighborWeights /= weightSum;
    centerWeightsScalar /= weightSum;
    vec4 texelTop = texture2D(sTexture, vec2(sampleCenter.x, topLeftCoords.y));
    vec4 texelLeft = texture2D(sTexture, vec2(topLeftCoords.x, sampleCenter.y));
    vec4 texelRight = texture2D(sTexture, vec2(bottomRightCoords.x, sampleCenter.y));
    vec4 texelBottom = texture2D(sTexture, vec2(sampleCenter.x, bottomRightCoords.y));

    vec4 texelOutput = fromLinear(
        toLinear(texelLeft) * neighborWeights.x + toLinear(texelTop) * neighborWeights.y +
        toLinear(texelCenter) * centerWeightsScalar + toLinear(texelRight) * neighborWeights.z +
        toLinear(texelBottom) * neighborWeights.w);

    return texelOutput;
}

void main() {
  gl_FragColor = fastBicubic(sTexture, vTexCoord);
}
