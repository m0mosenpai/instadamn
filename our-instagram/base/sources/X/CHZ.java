package X;

import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnSizeChangedModifier;

/* loaded from: classes5.dex */
public abstract class CHZ {
    public static final void A00(boolean z, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(282906954);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1582085380, "com.instagram.creation.genai.themes.ui.AiThemesDynamicBackground (AiThemesDynamicBackground.kt:112)");
            }
            Modifier A0V = AbstractC25228BEl.A0V();
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(-1660835046);
            if (Build.VERSION.SDK_INT >= 33) {
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -1660833680);
                Object obj = C5UI.A00;
                if (A0q == obj) {
                    A0q = new RuntimeShader("\n  uniform float2 iResolution;\n  uniform float iTime;\n  uniform shader composable;\n  \n  // Create a 2x2 rotation matrix for a given angle a (in radians).\n  mat2 RotationMatrix(float a)\n  {\n      float s = sin(a);\n      float c = cos(a);\n      return mat2(c, -s, s, c);\n  }\n  // Generate a pseudo-random hash value from a 2D point p.\n  vec2 hash( vec2 p )\n  {\n      // sine function and a large constant to ensure a wide range.\n      p = vec2( dot(p,vec2(2127.1,81.17)), dot(p,vec2(1269.5,283.37)) );\n    return fract(sin(p)*78642.2211);\n  }\n  // Compute Perlin-like noise at point p.\n  float noise( in vec2 p )\n  {\n      vec2 i = floor( p );\n      vec2 f = fract( p );\n  \n    vec2 u = f*f*(3.0-2.0*f);\n      float n = mix( mix( dot( -1.0+2.0*hash( i + vec2(0.0,0.0) ), f - vec2(0.0,0.0) ),\n                          dot( -1.0+2.0*hash( i + vec2(1.0,0.0) ), f - vec2(1.0,0.0) ), u.x),\n                     mix( dot( -1.0+2.0*hash( i + vec2(0.0,1.0) ), f - vec2(0.0,1.0) ),\n                          dot( -1.0+2.0*hash( i + vec2(1.0,1.0) ), f - vec2(1.0,1.0) ), u.x), u.y);\n    return 0.5 + 0.5*n;\n  }\n  // Generate a comp with sin/cos based \"folds\". i value increases sharpness\n  vec3 glossyFolds(vec2 fragCoord) {\n      float minRes = min(iResolution.x, iResolution.y);\n      vec2 uv = (fragCoord * 2.0 - iResolution.xy) / minRes;\n      float d = -iTime * 0.4;\n      float a = 0.0;\n      for (float i = 0.0; i < 4.0; ++i) {\n          a += cos(i - d - a * uv.y);\n          d += sin(uv.x * i + a);\n      }\n      d += iTime;\n      vec3 col = vec3(cos(uv * noise(vec2(d, a))) * 0.4 + 0.6, cos(a + d) * 0.6 + 0.4);\n      col = cos(col * cos(vec3(d, a, 4.5)) * 0.6 + 0.4);\n      return col;\n  }\n  half4 main(vec2 fragCoord)\n  {\n      // Coordinate Normalization and Aspect Ratio Adjustment\n      vec2 uv = fragCoord/iResolution.xy;\n      float ratio = iResolution.x / iResolution.y;\n      vec2 tuv = uv;\n      tuv -= .5;\n  \n      // PROCESSING STATE CHANGE\n      float processing = smoothstep(0.0, 1.0, iTime * 0.5); //animate the processing value from 0-1 over .5s\n      float rotationCoefficient = processing * 0.08 + (1.0 - processing) * 0.02; //this is 0.02 in idle state, and 0.08 when proccessing\n  \n      // Rotate with noise\n      float degree = noise(vec2(iTime*.1, tuv.x*tuv.y))+iTime*rotationCoefficient;\n      tuv.y *= 1./ratio;\n      tuv *= RotationMatrix(radians((degree-.5)*720.+180.));\n    tuv.y *= ratio;\n  \n      // Defining mix colors\n      vec3 colorBlue = vec3(0, .474, .925);\n      vec3 colorGreen = vec3(.372, .980, .756);\n      vec3 colorPink = vec3(.988, .568, .854);\n      vec3 colorPurple = vec3(0.278, 0, .866);\n  \n      vec3 foldsComp = glossyFolds(fragCoord);\n  \n      //trying different mixes of folds and colors\n      vec3 layer1 = mix(colorPurple, colorGreen, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x));\n      vec3 layer2 = mix(colorPink, colorBlue, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x));\n  \n      vec3 colorComp = mix(layer1, layer2, smoothstep(.5, -.3, tuv.y));\n  \n      // final mix\n      vec3 finalComp = mix(foldsComp,colorComp, smoothstep(-.5, .2, (tuv*RotationMatrix(radians(-5.))).x));\n  \n      return half4(finalComp,1.0);\n  }\n");
                    c5Tl.FBy(A0q);
                }
                RuntimeShader runtimeShader = (RuntimeShader) A0q;
                C117505Tk.A0L(c117505Tk, false);
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1660831769);
                if (A0q2 == obj) {
                    A0q2 = AbstractC25232BEp.A0w(c5Tl, AbstractC25227BEk.A0l());
                }
                InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(c117505Tk, A0q2, false);
                C5UX.A04(c5Tl, C0eB.A00, new PZV(((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00, A0M, null, 17));
                Modifier A0Y = AbstractC25230BEn.A0Y(A0V.Eq3(new OnSizeChangedModifier(new DH8(runtimeShader))), new DHB(runtimeShader, A0M));
                int i3 = 234;
                int i4 = 243;
                int i5 = 254;
                if (z) {
                    i3 = 17;
                    i4 = 41;
                    i5 = 61;
                }
                C6L8.A01(null, c5Tl, A0Y, null, AbstractC27761CMc.A00, 0.0f, 1572864, 58, AbstractC25225BEi.A0B(((i3 & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i5 & 255)), 0L);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1182900927);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DS6(z, i, 1);
        }
    }
}
