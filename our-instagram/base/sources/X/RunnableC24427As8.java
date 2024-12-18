package X;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

/* renamed from: X.As8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24427As8 implements Runnable {
    public final /* synthetic */ C80P A00;

    public RunnableC24427As8(C80P c80p) {
        this.A00 = c80p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69560VrP c69560VrP = new C69560VrP();
        C80P c80p = this.A00;
        c80p.A00 = new APK(c80p.A02, c80p.A06);
        c80p.A03.set(true);
        try {
            APK apk = c80p.A00;
            if (apk != null) {
                B5y b5y = new B5y(c80p, 20);
                synchronized (apk) {
                    apk.A00 = b5y;
                }
                c69560VrP.A00 = apk;
                apk.onSurfaceCreated(null, null);
                GLSurfaceView.Renderer renderer = c69560VrP.A00;
                if (renderer != null) {
                    renderer.onSurfaceChanged(null, 4, 4);
                }
            }
            while (!c80p.A05.get()) {
                GLSurfaceView.Renderer renderer2 = c69560VrP.A00;
                if (renderer2 != null) {
                    renderer2.onDrawFrame(null);
                }
                AbstractC1808580n.A03(AbstractC111324zv.A00(2477));
                GLES20.glFinish();
                AbstractC1808580n.A01();
            }
        } finally {
            C80P.A01(c80p);
            c69560VrP.A00();
            c80p.A04.set(true);
            c80p.A01 = null;
        }
    }
}
