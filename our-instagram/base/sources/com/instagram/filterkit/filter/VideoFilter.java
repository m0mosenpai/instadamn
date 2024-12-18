package com.instagram.filterkit.filter;

import X.AbstractC167007dF;
import X.AbstractC50102Ry;
import X.AbstractC72046XLm;
import X.AbstractC72243XZy;
import X.C0K8;
import X.C14360o3;
import X.C209089Mq;
import X.C72231XZi;
import X.C72232XZj;
import X.C72233XZk;
import X.C72234XZl;
import X.C72236XZn;
import X.C72239XZr;
import X.C72240XZt;
import X.C72783Xn3;
import X.C8M7;
import X.C9N1;
import X.C9N2;
import X.C9N3;
import X.InterfaceC1122755a;
import X.InterfaceC197718oi;
import X.XO3;
import X.XO8;
import X.XOB;
import X.XOM;
import X.XOQ;
import X.XOR;
import X.XZs;
import X.YPq;
import X.YRL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.video.GlProgramCompiler;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes12.dex */
public class VideoFilter extends BaseFilter {
    public static final C9N2 A0W = C9N1.A00();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public InterfaceC1122755a A06;
    public XOQ A07;
    public XO3 A08;
    public XOM A09;
    public XOM A0A;
    public XOM A0B;
    public XOM A0C;
    public XOM A0D;
    public C9N2 A0E;
    public boolean A0F;
    public boolean A0G;
    public float[] A0H;
    public float[] A0I;
    public XOB A0J;
    public C72236XZn A0K;
    public FloatBuffer A0L;
    public boolean A0M;
    public boolean A0N;
    public final int A0O;
    public final Rect A0P;
    public final C72783Xn3 A0Q;
    public final String A0R;
    public final List A0S;
    public final InterfaceC197718oi[] A0T;
    public final C8M7 A0U;
    public final Context A0V;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public VideoFilter(Context context, List list) {
        this.A0Q = new Object();
        this.A0P = new Rect();
        this.A06 = new C9N3();
        this.A0E = C9N1.A00();
        this.A0V = context;
        this.A0O = -3;
        this.A0R = "ImageOverlay";
        this.A0S = list;
        this.A0T = new InterfaceC197718oi[list.size()];
        this.A03 = 100;
        this.A0U = null;
        this.A07 = null;
    }

    public static float[] A00(int i) {
        return new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, 1.0f};
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r5.length != 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(float[] r4, float[] r5) {
        /*
            r3 = this;
            int r0 = r4.length
            r2 = 4
            if (r0 != r2) goto L8
            int r0 = r5.length
            r1 = 1
            if (r0 == r2) goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r0 = " Color must contain 4 elements R, G, B, A"
            X.C18C.A0H(r1, r0)
            java.lang.Object r0 = r4.clone()
            float[] r0 = (float[]) r0
            r3.A0I = r0
            java.lang.Object r0 = r5.clone()
            float[] r0 = (float[]) r0
            r3.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.VideoFilter.A05(float[], float[]):void");
    }

    public final int A01() {
        int i = this.A01;
        if (i == 0) {
            try {
                int compileProgram = GlProgramCompiler.compileProgram(this.A0R, this.A0G, false, this.A0M);
                this.A01 = compileProgram;
                this.A08 = new XO3(compileProgram);
                GLES20.glUseProgram(this.A01);
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.A01, "image"), 0);
                XOM xom = (XOM) ((AbstractC72243XZy) this.A08.A03.get("u_filterStrength"));
                this.A09 = xom;
                if (xom != null) {
                    xom.A00(1.0f);
                }
                this.A0J = (XOB) ((AbstractC72243XZy) this.A08.A03.get("u_enableTransformMatrix"));
                A04(this.A0N);
                this.A0K = (C72236XZn) ((AbstractC72243XZy) this.A08.A03.get("u_transformMatrix"));
                A02(this.A06);
                this.A0C = (XOM) ((AbstractC72243XZy) this.A08.A03.get("u_min"));
                this.A0B = (XOM) ((AbstractC72243XZy) this.A08.A03.get("u_max"));
                this.A0D = (XOM) ((AbstractC72243XZy) this.A08.A03.get("u_width"));
                this.A0A = (XOM) ((AbstractC72243XZy) this.A08.A03.get("u_height"));
                this.A00 = GLES20.glGetAttribLocation(this.A01, "position");
                this.A04 = GLES20.glGetAttribLocation(this.A01, "transformedTextureCoordinate");
                this.A02 = GLES20.glGetAttribLocation(this.A01, "staticTextureCoordinate");
                XOQ xoq = this.A07;
                if (xoq != null) {
                    XO3 xo3 = this.A08;
                    if (xoq instanceof XOR) {
                        XOR xor = (XOR) xoq;
                        Map map = xo3.A03;
                        xor.A02 = XOQ.A00("u_bottomColor", map);
                        xor.A04 = XOQ.A00("u_topColor", map);
                        xor.A01 = (C72239XZr) AbstractC72046XLm.A09("u_direction", map);
                        xor.A03 = XOQ.A00("u_cropRect", map);
                        xor.A05 = (XO8) AbstractC72046XLm.A09("bitmapBackgroundSampler", map);
                    } else if (xoq instanceof C72231XZi) {
                        C72231XZi c72231XZi = (C72231XZi) xoq;
                        Map map2 = xo3.A03;
                        c72231XZi.A0C = XOQ.A00("uInputImageSize", map2);
                        c72231XZi.A0D = XOQ.A00("uLutSize", map2);
                        c72231XZi.A07 = AbstractC72046XLm.A08("uLutBlend", map2);
                        c72231XZi.A09 = AbstractC72046XLm.A08("uSatBlendPow", map2);
                        c72231XZi.A0B = XOQ.A00("uInnerTint", map2);
                        c72231XZi.A0F = XOQ.A00("uOuterTint", map2);
                        c72231XZi.A06 = AbstractC72046XLm.A08("uInnerRadius", map2);
                        c72231XZi.A08 = AbstractC72046XLm.A08("uOuterRadius", map2);
                        c72231XZi.A05 = AbstractC72046XLm.A08("uHighPass", map2);
                        c72231XZi.A0E = XOQ.A00("uNoiseFreqAmp", map2);
                        c72231XZi.A0G = XOQ.A00("uRadialChromaticAberration", map2);
                        c72231XZi.A0A = AbstractC72046XLm.A08("uTime", map2);
                        if (c72231XZi.A0C == null || c72231XZi.A0D == null || c72231XZi.A07 == null || c72231XZi.A09 == null || c72231XZi.A0B == null || c72231XZi.A0F == null || c72231XZi.A06 == null || c72231XZi.A08 == null || c72231XZi.A05 != null) {
                        }
                    } else if (xoq instanceof C72233XZk) {
                        C72233XZk c72233XZk = (C72233XZk) xoq;
                        Map map3 = xo3.A03;
                        c72233XZk.A0F = (XO8) AbstractC72046XLm.A09("sSmallBuffA", map3);
                        c72233XZk.A0C = (C72240XZt) AbstractC72046XLm.A09("uPassIndex", map3);
                        c72233XZk.A0E = (XO8) AbstractC72046XLm.A09("lookup", map3);
                        c72233XZk.A08 = (C72239XZr) AbstractC72046XLm.A09("uInputImageSize", map3);
                        c72233XZk.A0D = (C72240XZt) AbstractC72046XLm.A09("uUseLut", map3);
                        c72233XZk.A00 = AbstractC72046XLm.A08("uLutAlpha", map3);
                        c72233XZk.A04 = AbstractC72046XLm.A08("uSmoothingAlpha", map3);
                        c72233XZk.A05 = AbstractC72046XLm.A08("uSmoothingIntensity", map3);
                        c72233XZk.A09 = (XZs) AbstractC72046XLm.A09("uColorIntensity", map3);
                        c72233XZk.A03 = AbstractC72046XLm.A08("uSharpeningIntensity", map3);
                        c72233XZk.A01 = AbstractC72046XLm.A08("uPhotoScreen", map3);
                        c72233XZk.A02 = AbstractC72046XLm.A08("uSCurve", map3);
                        c72233XZk.A0A = XOQ.A00("uVignetteInColor", map3);
                        c72233XZk.A0B = XOQ.A00("uVignetteOutColor", map3);
                        c72233XZk.A06 = AbstractC72046XLm.A08("uVignetteInRadius", map3);
                        c72233XZk.A07 = AbstractC72046XLm.A08("uVignetteOutRadius", map3);
                        if (c72233XZk.A0E == null || c72233XZk.A08 == null || c72233XZk.A0D == null || c72233XZk.A00 == null || c72233XZk.A04 == null || c72233XZk.A05 == null || c72233XZk.A09 == null || c72233XZk.A03 == null || c72233XZk.A01 == null || c72233XZk.A02 == null || c72233XZk.A0A != null) {
                        }
                    } else if (!(xoq instanceof C72232XZj)) {
                        C72234XZl c72234XZl = (C72234XZl) xoq;
                        C14360o3.A0B(xo3, 0);
                        Map map4 = xo3.A03;
                        c72234XZl.A09 = (XO8) AbstractC72046XLm.A09("sLookup", map4);
                        c72234XZl.A08 = (XO8) AbstractC72046XLm.A09("blurred", map4);
                        c72234XZl.A07 = (C72240XZt) AbstractC72046XLm.A09("uPassIndex", map4);
                        c72234XZl.A06 = (C72239XZr) AbstractC72046XLm.A09("uInputImageSize", map4);
                        c72234XZl.A02 = AbstractC72046XLm.A08("uSharpen", map4);
                        c72234XZl.A04 = AbstractC72046XLm.A08("uSigmaFr", map4);
                        c72234XZl.A03 = AbstractC72046XLm.A08("uSigmaFb", map4);
                        c72234XZl.A05 = AbstractC72046XLm.A08("uStrength", map4);
                        c72234XZl.A01 = (XOB) AbstractC72046XLm.A09("uHasFace", map4);
                        c72234XZl.A00 = (XOB) AbstractC72046XLm.A09("uAlwaysUseStrongerLut", map4);
                        if (c72234XZl.A09 != null && c72234XZl.A07 != null && c72234XZl.A06 != null && c72234XZl.A02 != null) {
                            XOM xom2 = c72234XZl.A04;
                        }
                    }
                }
                int i2 = 0;
                while (true) {
                    List list = this.A0S;
                    if (i2 >= list.size()) {
                        break;
                    }
                    TextureAsset textureAsset = (TextureAsset) list.get(i2);
                    int i3 = this.A01;
                    String str = textureAsset.A00;
                    str.getClass();
                    int i4 = i2 + 1;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(i3, str), i4);
                    InterfaceC197718oi[] interfaceC197718oiArr = this.A0T;
                    Context context = this.A0V;
                    String str2 = textureAsset.A01;
                    str2.getClass();
                    boolean z = textureAsset.A02;
                    BitmapFactory.Options options = C209089Mq.A00;
                    C14360o3.A0B(context, 0);
                    interfaceC197718oiArr[i2] = C209089Mq.A01(context, str2, 2, z, false);
                    i2 = i4;
                }
            } catch (Exception e) {
                C0K8.A0O("VideoFilter", "Error initializing %s program: ", this.A0R, e);
            }
            return this.A01;
        }
        return i;
    }

    public void A03(YPq yPq, InterfaceC197718oi interfaceC197718oi, YRL yrl) {
        XOQ xoq = this.A07;
        if (xoq != null) {
            xoq.A02(this.A08, yPq, interfaceC197718oi, yrl, this.A0T);
        }
    }

    public final void A04(boolean z) {
        this.A0N = z;
        XOB xob = this.A0J;
        if (xob != null) {
            xob.A00(z);
        }
        if (this.A0N) {
            A02(this.A06);
        }
    }

    @Override // X.BCA
    public final void AHR(YPq yPq) {
        for (InterfaceC197718oi interfaceC197718oi : this.A0T) {
            if (interfaceC197718oi != null) {
                interfaceC197718oi.cleanup();
            }
        }
        int i = this.A01;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.A01 = 0;
        }
    }

    public final void finalize() {
        for (InterfaceC197718oi interfaceC197718oi : this.A0T) {
            if (interfaceC197718oi != null) {
                interfaceC197718oi.cleanup();
            }
        }
        int i = this.A01;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.A01 = 0;
        }
    }

    public final void A02(InterfaceC1122755a interfaceC1122755a) {
        interfaceC1122755a.getClass();
        this.A06 = interfaceC1122755a;
        if (this.A0N && this.A0K != null) {
            FloatBuffer floatBuffer = this.A0L;
            if (floatBuffer == null || !AbstractC50102Ry.A00(floatBuffer.array(), this.A06.C6v())) {
                this.A0L = FloatBuffer.wrap(this.A06.C6v());
            }
            C72236XZn c72236XZn = this.A0K;
            c72236XZn.A00 = this.A0L;
            ((AbstractC72243XZy) c72236XZn).A00 = true;
        }
    }

    @Override // com.instagram.filterkit.filter.BaseFilter
    public final String toString() {
        return this.A0R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public VideoFilter(Context context, XOQ xoq, C8M7 c8m7) {
        this.A0Q = new Object();
        this.A0P = new Rect();
        this.A06 = new C9N3();
        this.A0E = C9N1.A00();
        this.A0V = context;
        int i = c8m7.A00;
        this.A0O = i;
        this.A0R = c8m7.A05;
        List list = c8m7.A06;
        this.A0S = list;
        this.A0M = c8m7.A07;
        this.A0T = new InterfaceC197718oi[list.size()];
        this.A03 = 100;
        this.A0F = AbstractC167007dF.A1P(i, -1);
        this.A0U = c8m7;
        this.A07 = xoq;
    }
}
