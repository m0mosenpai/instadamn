package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

/* loaded from: classes11.dex */
public final class W4Z {
    public C69796Vvg A00;
    public C69796Vvg A01;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new WIK(this, 0);
    public final W68 A03;
    public final C70127W5n A04;
    public final WFO A05;
    public final C176537tB A06;

    public final synchronized void A01() {
        W68 w68 = this.A03;
        if (!w68.A03()) {
            C70127W5n c70127W5n = this.A04;
            C176507t8 c176507t8 = c70127W5n.A09;
            if (c176507t8 != null) {
                c70127W5n.A01();
                c176507t8.A01();
            }
            C69796Vvg c69796Vvg = this.A01;
            if (c69796Vvg != null) {
                c69796Vvg.A03();
            }
            this.A01 = null;
            C69796Vvg c69796Vvg2 = this.A00;
            if (c69796Vvg2 != null) {
                c69796Vvg2.A03();
            }
            this.A00 = null;
            WFO wfo = this.A05;
            C69375VmL c69375VmL = wfo.A00;
            if (c69375VmL != null) {
                GLES20.glDeleteProgram(c69375VmL.A00);
                c69375VmL.A00 = -1;
                wfo.A00 = null;
            }
            w68.A02();
        }
    }

    public static void A00(W4Z w4z, C69796Vvg c69796Vvg) {
        C176507t8 c176507t8;
        W68 w68;
        if (c69796Vvg != null && (c176507t8 = c69796Vvg.A00) != null) {
            synchronized (c176507t8) {
                if (c176507t8.A04()) {
                    try {
                        c69796Vvg.A02();
                        WFO wfo = w4z.A05;
                        C70127W5n c70127W5n = w4z.A04;
                        wfo.A03(c70127W5n.A01, c70127W5n.A00, c70127W5n.A07, c70127W5n.A06, c69796Vvg.A01(), c69796Vvg.A00(), 0, false);
                        c69796Vvg.A05(w4z.A06.A00(c70127W5n.A08));
                        c69796Vvg.A04();
                        w68 = w4z.A03;
                    } catch (RuntimeException unused) {
                        w68 = w4z.A03;
                    } catch (Throwable th) {
                        w4z.A03.A01();
                        throw th;
                    }
                    w68.A01();
                }
            }
        }
    }

    public W4Z() {
        Object obj = W68.A05;
        W68 w68 = new W68(obj);
        this.A03 = w68;
        w68.A01();
        this.A05 = new WFO();
        this.A04 = new C70127W5n(w68, obj);
        this.A06 = new C176537tB();
    }
}
