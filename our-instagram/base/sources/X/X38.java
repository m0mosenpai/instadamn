package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class X38 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X38(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        super(0);
        this.A00 = i4;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC180277zH AMi;
        String str;
        if (this.A00 != 0) {
            C152816u9 c152816u9 = (C152816u9) this.A05;
            C152816u9.A00(c152816u9);
            C152816u9.A01(c152816u9);
        } else {
            WIM wim = ((W37) this.A05).A00;
            if (wim == null) {
                str = "framesHandler";
            } else {
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.A04;
                int i = this.A01;
                int i2 = this.A03;
                int i3 = this.A02;
                C14360o3.A0B(surfaceTexture, 0);
                if (wim.A0O.get() == 5) {
                    C0K8.A0C("DecoderOutputSurfaceHandler", "gl resources already destroyed while trimming");
                } else {
                    if (wim.A04 == null || (AMi = wim.A08) == null) {
                        Surface surface = new Surface(surfaceTexture);
                        C178927x4 c178927x4 = wim.A06;
                        if (c178927x4 == null) {
                            str = "selfEGLCore";
                        } else {
                            AMi = c178927x4.AMi(surface);
                            wim.A08 = AMi;
                            wim.A04 = surface;
                        }
                    }
                    if (AMi != null) {
                        AMi.A05();
                    }
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i) {
                        float f = i;
                        int i6 = i4 + 1;
                        int i7 = ((int) ((i2 / f) * i6)) - i5;
                        GLES20.glViewport(i5, 0, i7, i3);
                        float f2 = i4 / f;
                        C200688uB c200688uB = (C200688uB) wim.A0N.get(Math.round(f2 * (r1.size() - 1)));
                        try {
                            AKR akr = wim.A0D;
                            if (akr == null) {
                                C14360o3.A0F("boomerangFramesGLRenderer");
                                throw C00O.createAndThrow();
                            }
                            C201278vB c201278vB = wim.A0K;
                            c201278vB.A01(c200688uB.A03, wim.A0Q, 0L);
                            akr.A04(c201278vB);
                            i5 += i7;
                            i4 = i6;
                        } catch (C9Yj e) {
                            C0K8.A0F("DecoderOutputSurfaceHandler", AbstractC111324zv.A00(3012), e);
                        }
                    }
                    AbstractC180277zH abstractC180277zH = wim.A08;
                    if (abstractC180277zH != null) {
                        abstractC180277zH.A03();
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return C0eB.A00;
    }
}
