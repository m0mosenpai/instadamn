package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class X34 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ W37 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X34(SurfaceTexture surfaceTexture, W37 w37, float f, int i, int i2) {
        super(0);
        this.A04 = w37;
        this.A03 = surfaceTexture;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC180277zH AMi;
        String str;
        WIM wim = this.A04.A00;
        if (wim == null) {
            str = "framesHandler";
        } else {
            SurfaceTexture surfaceTexture = this.A03;
            float f = this.A00;
            int i = this.A02;
            int i2 = this.A01;
            if (wim.A0O.get() == 5) {
                C0K8.A0C("DecoderOutputSurfaceHandler", "gl resources already destroyed while trimming");
            } else {
                if (wim.A05 == null || (AMi = wim.A09) == null) {
                    Surface surface = new Surface(surfaceTexture);
                    wim.A05 = surface;
                    C178927x4 c178927x4 = wim.A06;
                    if (c178927x4 == null) {
                        str = "selfEGLCore";
                    } else {
                        AMi = c178927x4.AMi(surface);
                        wim.A09 = AMi;
                    }
                }
                if (AMi != null) {
                    AMi.A05();
                    C200688uB c200688uB = (C200688uB) wim.A0N.get((int) ((r3.size() - 1) * AbstractC58322PtE.A01(f, 1.0f, 0.0f)));
                    double d = i;
                    double d2 = i2;
                    double d3 = c200688uB.A02 / c200688uB.A01;
                    if (d / d2 > d3) {
                        int i3 = (int) (d / d3);
                        GLES20.glViewport(0, -((i3 - i2) / 2), i, i3);
                    } else {
                        int i4 = (int) (d2 * d3);
                        GLES20.glViewport(-((i4 - i) / 2), 0, i4, i2);
                    }
                    AKR akr = wim.A0D;
                    if (akr == null) {
                        str = "boomerangFramesGLRenderer";
                    } else {
                        C201278vB c201278vB = wim.A0K;
                        c201278vB.A01(c200688uB.A03, wim.A0Q, 0L);
                        akr.A04(c201278vB);
                        AbstractC180277zH abstractC180277zH = wim.A09;
                        if (abstractC180277zH != null) {
                            abstractC180277zH.A03();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return C0eB.A00;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
