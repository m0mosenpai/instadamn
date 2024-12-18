package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: X.AzJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24858AzJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ C23128AMg A04;

    public RunnableC24858AzJ(SurfaceTexture surfaceTexture, C23128AMg c23128AMg, int i, int i2, int i3) {
        this.A04 = c23128AMg;
        this.A03 = surfaceTexture;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC180277zH AMi;
        C23128AMg c23128AMg = this.A04;
        if (c23128AMg.A08 != null && c23128AMg.A0F != null) {
            if (c23128AMg.A06 == null || (AMi = c23128AMg.A0A) == null) {
                Surface surface = new Surface(this.A03);
                c23128AMg.A06 = surface;
                AMi = c23128AMg.A08.AMi(surface);
                c23128AMg.A0A = AMi;
            }
            AMi.A05();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.A00;
                if (i < i3) {
                    float f = i3;
                    int i4 = i + 1;
                    int i5 = ((int) ((this.A02 / f) * i4)) - i2;
                    GLES20.glViewport(i2, 0, i5, this.A01);
                    float f2 = i / f;
                    C200688uB c200688uB = (C200688uB) c23128AMg.A0T.get(AbstractC166987dD.A0A(f2, r1.size() - 1));
                    try {
                        AKR akr = c23128AMg.A0F;
                        C201278vB c201278vB = c23128AMg.A0O;
                        c201278vB.A01(c200688uB.A03, c23128AMg.A0X, 0L);
                        akr.A04(c201278vB);
                        i2 += i5;
                        i = i4;
                    } catch (C9Yj unused) {
                        C0K8.A0C("BoomerangFramesHandlerImplOOM", AbstractC111324zv.A00(3012));
                        return;
                    }
                } else {
                    c23128AMg.A0A.A03();
                    return;
                }
            }
        } else {
            C0K8.A0C("BoomerangFramesHandlerImpl", "gl resources unavailable while trimming");
        }
    }
}
