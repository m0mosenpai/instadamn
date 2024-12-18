package X;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

/* renamed from: X.WsB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71343WsB implements Runnable {
    public final /* synthetic */ C70862WiS A00;

    public RunnableC71343WsB(C70862WiS c70862WiS) {
        this.A00 = c70862WiS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70862WiS c70862WiS = this.A00;
        c70862WiS.A01 = new C69560VrP();
        APK apk = c70862WiS.A02;
        if (apk != null) {
            apk.A03();
        }
        c70862WiS.A05.set(true);
        APK apk2 = new APK(c70862WiS.A03, c70862WiS.A07);
        c70862WiS.A02 = apk2;
        C69560VrP c69560VrP = c70862WiS.A01;
        if (c69560VrP != null) {
            c69560VrP.A00 = apk2;
            apk2.onSurfaceCreated(null, null);
            GLSurfaceView.Renderer renderer = c69560VrP.A00;
            if (renderer != null) {
                renderer.onSurfaceChanged(null, 4, 4);
            }
            while (true) {
                if (c70862WiS.A04.get()) {
                    C69560VrP c69560VrP2 = c70862WiS.A01;
                    if (c69560VrP2 == null) {
                        break;
                    }
                    GLSurfaceView.Renderer renderer2 = c69560VrP2.A00;
                    if (renderer2 != null) {
                        renderer2.onDrawFrame(null);
                    }
                    AbstractC1808580n.A03(AbstractC111324zv.A00(2477));
                    GLES20.glFinish();
                    AbstractC1808580n.A01();
                } else {
                    C70862WiS.A00(c70862WiS);
                    C69560VrP c69560VrP3 = c70862WiS.A01;
                    if (c69560VrP3 != null) {
                        c69560VrP3.A00();
                        c70862WiS.A06.set(true);
                        c70862WiS.A00 = null;
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("eglSurface");
        throw C00O.createAndThrow();
    }
}
