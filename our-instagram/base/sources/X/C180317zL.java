package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180317zL {
    public static final float[] A05;
    public boolean A00;
    public C178847ww A02;
    public final C180337zN A04;
    public final Map A03 = new HashMap();
    public boolean A01 = false;

    static {
        float[] fArr = new float[16];
        A05 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void A00() {
        Map map = this.A03;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C81H) it.next()).A02();
        }
        map.clear();
    }

    public C180317zL(C178847ww c178847ww) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aPosition");
        hashMap.put("aTextureCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aTextureCoord");
        this.A04 = new C180337zN(arrayList, hashMap);
        this.A02 = c178847ww;
        Object obj = c178847ww.A00.get(C178847ww.A06);
        this.A00 = ((Boolean) (obj != null ? obj : false)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public final void A01(C179877yd c179877yd, AnonymousClass810 anonymousClass810, C68685VaL c68685VaL, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float f;
        short s;
        AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err1 Already in error state entering renderAfterBind", new Object[0]);
        if (!z3 && !z4 && !z5) {
            GLES20.glDisable(3042);
        } else {
            GLES20.glBlendFunc(1, 771);
            GLES20.glBlendEquation(32774);
            GLES20.glEnable(3042);
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err4", new Object[0]);
        GLES20.glViewport(0, 0, i3, i4);
        AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err4b glViewport", new Object[0]);
        if (z || z3 || z4) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, z4 ? 0.0f : 1.0f);
            AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err5a glClearColor", new Object[0]);
            GLES20.glClear(16640);
            AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err5b glClear", new Object[0]);
        }
        if (z2) {
            ?? r11 = anonymousClass810.A01 == 36197 ? 1 : 0;
            Map map = this.A03;
            Integer valueOf = Integer.valueOf(r11 + (i * 2) + (i2 * 100));
            C81H c81h = (C81H) map.get(valueOf);
            if (c81h == null) {
                try {
                    if (i != -1) {
                        if (i != 6) {
                            if (i != 7) {
                                if (r11 != 0 && (this.A01 || i2 == 9)) {
                                    c81h = c179877yd.A02(R.raw.passthrough_300_vs, R.raw.bt709_yuv_to_rgb_sampler_fs, true);
                                } else {
                                    c81h = c179877yd.A02(R.raw.passthrough_vs, R.raw.copy_fs, r11);
                                }
                            } else if (r11 != 0) {
                                if (i2 != 3) {
                                    c81h = c179877yd.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.hdr_yuv_to_rgb_sampler_fs, true);
                                } else {
                                    c81h = c179877yd.A02(R.raw.passthrough_300_vs, R.raw.wrapping_tonemap_hlg_fs, true);
                                    c81h.A01().A02("alpha", 1.0f);
                                }
                            } else if (i2 == 3) {
                                c81h = c179877yd.A02(R.raw.passthrough_300_vs, R.raw.bt2020_rgb_to_bt709, false);
                                c81h.A01().A02("alpha", 1.0f);
                            } else {
                                c81h = c179877yd.A02(R.raw.passthrough_vs, R.raw.copy_fs, false);
                            }
                        } else if (i2 == 3) {
                            if (c68685VaL != null) {
                                c81h = c179877yd.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_with_max_cl_uniform_fs, r11);
                            } else {
                                c81h = c179877yd.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_fs, r11);
                            }
                        } else if (i2 == 7) {
                            c81h = c179877yd.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_to_hlg_fs, r11);
                        } else {
                            c81h = c179877yd.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.hdr_yuv_to_rgb_sampler_fs, r11);
                        }
                    } else {
                        c81h = c179877yd.A03("#version 300 es\nprecision mediump float;\nuniform mat4 uTextureTransformMatrix;\nuniform mat4 uCropTransformMatrix;\nuniform mat4 uInContentTransformMatrix;\nuniform mat4 uContentTransformMatrix;\n\nin vec4 aPosition;\nin vec4 aTextureCoord;\n\nout vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;\n  vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;\n}", "#version 300 es\n\n#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform samplerExternalOES sTexture;\n\nin vec2 vTextureCoord;\nout vec4 outColor;\n\n// Column-major matrix declarations; pre-multiply by input vectors\nconst mat3 P3_BT709 = mat3(1.22476, -0.0420633, -0.0196438, -0.224866, 1.04206, -0.00786447, 0, 0, 1.09854);\n\nhighp vec3 sRGB_EOTF_Inv(highp vec3 x) {\n    highp vec3 A = 12.92 * x;\n    highp vec3 B = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;\n    return mix(A, B, step(0.0031308, x));\n}\n\nhighp vec3 sRGB_EOTF(highp vec3 x) {\n    highp vec3 A = x / 12.92;\n    highp vec3 B = pow((x + 0.055) / 1.055, vec3(2.4));\n    return mix(A, B, step(0.04045, x));\n}\n\nvoid main() {\n  highp vec3 srcRGB = texture(sTexture, vTextureCoord).xyz;\n\n  // Display P3 RGB non-linear to Display P3 RGB display linear\n  highp vec3 rgb_P3_displayLinear = sRGB_EOTF(srcRGB);\n\n  // Display P3 RGB display linear -> BT.709 display linear\n  highp vec3 rgb_BT709_displayLinear = P3_BT709 * rgb_P3_displayLinear;\n\n  // Color gamut compression\n  rgb_BT709_displayLinear = clamp(rgb_BT709_displayLinear, 0., 1.);\n\n  // BT.709 display linear -> BT.709 non-linear\n  highp vec3 rgb_BT709_sRGB = sRGB_EOTF_Inv(rgb_BT709_displayLinear);\n\n  outColor = vec4(rgb_BT709_sRGB, 1.0);\n}\n", r11);
                    }
                } catch (Exception unused) {
                    c81h = c179877yd.A02(R.raw.passthrough_vs, R.raw.copy_fs, r11);
                }
                map.put(valueOf, c81h);
            }
            AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame:err6", new Object[0]);
            try {
                AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
                int i5 = anonymousClass812.A01;
                int i6 = anonymousClass812.A00;
                if (this.A00) {
                    String.format("input=%dx%d output=%dx%d", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3), Integer.valueOf(i4));
                }
                C9K4 A01 = c81h.A01();
                A01.A04("uTextureTransformMatrix", fArr);
                A01.A04("uCropTransformMatrix", fArr2);
                A01.A04("uInContentTransformMatrix", fArr3);
                A01.A04("uContentTransformMatrix", fArr4);
                A01.A03("sTexture", anonymousClass810);
                if (GLES20.glGetUniformLocation(A01.A00.A00, "uMaxContentLuminance") != -1) {
                    if (c68685VaL != null) {
                        C22824A4t c22824A4t = c68685VaL.A00;
                        if (c22824A4t != null) {
                            s = c22824A4t.A00;
                        } else {
                            s = 1000;
                        }
                        f = s;
                    } else {
                        f = 1000.0f;
                    }
                    A01.A02("uMaxContentLuminance", f);
                }
                A01.A01(this.A04);
            } catch (C80D e) {
                C80D c80d = new C80D(e.A00, AnonymousClass001.A0R("GlCoreCopyRenderer", e.getMessage()));
                c80d.initCause(e);
                throw c80d;
            }
        }
        AbstractC180237zD.A02("GlCoreCopyRenderer::renderFrame: textureTarget: %s textureHandle: %s", Integer.valueOf(anonymousClass810.A01), Integer.valueOf(anonymousClass810.A00));
    }
}
