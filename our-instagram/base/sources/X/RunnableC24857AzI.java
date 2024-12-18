package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: X.AzI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24857AzI implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ C23128AMg A04;

    public RunnableC24857AzI(SurfaceTexture surfaceTexture, C23128AMg c23128AMg, float f, int i, int i2) {
        this.A04 = c23128AMg;
        this.A03 = surfaceTexture;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC180277zH AMi;
        C23128AMg c23128AMg = this.A04;
        if (c23128AMg.A08 != null && c23128AMg.A0F != null) {
            if (c23128AMg.A07 == null || (AMi = c23128AMg.A0B) == null) {
                Surface surface = new Surface(this.A03);
                c23128AMg.A07 = surface;
                AMi = c23128AMg.A08.AMi(surface);
                c23128AMg.A0B = AMi;
            }
            AMi.A05();
            C200688uB c200688uB = (C200688uB) c23128AMg.A0T.get((int) ((r4.size() - 1) * Math.max(0.0f, Math.min(this.A00, 1.0f))));
            int i = this.A02;
            double d = i;
            int i2 = this.A01;
            double d2 = i2;
            double d3 = c200688uB.A02 / c200688uB.A01;
            if (d / d2 > d3) {
                int i3 = (int) (d / d3);
                GLES20.glViewport(0, -((i3 - i2) / 2), i, i3);
            } else {
                int i4 = (int) (d2 * d3);
                GLES20.glViewport(-((i4 - i) / 2), 0, i4, i2);
            }
            AKR akr = c23128AMg.A0F;
            C201278vB c201278vB = c23128AMg.A0O;
            c201278vB.A01(c200688uB.A03, c23128AMg.A0X, 0L);
            akr.A04(c201278vB);
            c23128AMg.A0B.A03();
            return;
        }
        C0K8.A0C("BoomerangFramesHandlerImpl", "gl resources unavailable while trimming");
    }
}
