package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

/* renamed from: X.VuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69716VuB {
    public C69796Vvg A00;
    public final W68 A03;
    public final C70127W5n A04;
    public final C70127W5n A05;
    public final WFK A06;
    public volatile boolean A07;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new WIK(this, 1);
    public final SurfaceTexture.OnFrameAvailableListener A01 = new WIK(this, 2);

    public final synchronized void A00() {
        W68 w68 = this.A03;
        if (!w68.A03()) {
            C70127W5n c70127W5n = this.A05;
            C176507t8 c176507t8 = c70127W5n.A09;
            if (c176507t8 != null) {
                c70127W5n.A01();
                c176507t8.A01();
            }
            C70127W5n c70127W5n2 = this.A04;
            C176507t8 c176507t82 = c70127W5n2.A09;
            if (c176507t82 != null) {
                c70127W5n2.A01();
                c176507t82.A01();
            }
            C69796Vvg c69796Vvg = this.A00;
            this.A00 = null;
            if (c69796Vvg != null) {
                c69796Vvg.A03();
            }
            WFK wfk = this.A06;
            C69326VlY c69326VlY = wfk.A00;
            if (c69326VlY != null) {
                GLES20.glDeleteProgram(c69326VlY.A00);
                c69326VlY.A00 = -1;
                wfk.A00 = null;
            }
            w68.A02();
        }
    }

    public final synchronized void A01(float f, float f2, float f3, float f4) {
        WFK wfk = this.A06;
        synchronized (wfk) {
            wfk.A02 = f;
            wfk.A03 = f2;
            wfk.A05 = f3;
            wfk.A04 = f4;
            wfk.A0A = true;
        }
    }

    public C69716VuB() {
        Object obj = W68.A05;
        W68 w68 = new W68(obj);
        this.A03 = w68;
        w68.A01();
        this.A06 = new WFK();
        this.A05 = new C70127W5n(w68, obj);
        this.A04 = new C70127W5n(w68, obj);
    }
}
