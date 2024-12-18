package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class X1v extends Thread {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public WD4 A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final WeakReference A0I;
    public final ArrayList A0J;

    public X1v(WeakReference weakReference) {
        C14360o3.A0B(weakReference, 1);
        this.A09 = true;
        this.A0J = new ArrayList();
        this.A0F = true;
        this.A00 = 1;
        this.A0I = weakReference;
    }

    public final void A05(int i) {
        if (i >= 0 && i <= 1) {
            W4S w4s = GLDrawingView.A0I;
            synchronized (w4s) {
                this.A00 = i;
                w4s.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        throw new java.lang.IllegalArgumentException("No config chosen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013e, code lost:
    
        throw new java.lang.RuntimeException("eglInitialize failed");
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x041a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X1v.A00():void");
    }

    private final void A01() {
        if (this.A04) {
            WD4 wd4 = this.A0E;
            if (wd4 != null) {
                wd4.A01();
            }
            this.A04 = false;
            W4S w4s = GLDrawingView.A0I;
            if (w4s.A00 == this) {
                w4s.A00 = null;
            }
            w4s.notifyAll();
        }
    }

    private final void A02() {
        if (this.A05) {
            this.A05 = false;
            WD4 wd4 = this.A0E;
            if (wd4 != null) {
                WD4.A00(wd4);
            }
        }
    }

    private final boolean A03() {
        if (!this.A06 && this.A03 && !this.A0H && this.A0D > 0 && this.A0C > 0) {
            if (this.A09 || this.A00 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A04() {
        W4S w4s = GLDrawingView.A0I;
        synchronized (w4s) {
            this.A0G = true;
            w4s.notifyAll();
            while (!this.A01) {
                try {
                    w4s.wait();
                } catch (InterruptedException unused) {
                    AbstractC58318PtA.A18();
                }
            }
        }
    }

    public final void A06(int i, int i2) {
        W4S w4s = GLDrawingView.A0I;
        synchronized (w4s) {
            this.A0D = i;
            this.A0C = i2;
            this.A0F = true;
            this.A09 = true;
            this.A07 = false;
            w4s.notifyAll();
            while (!this.A01 && !this.A06 && !this.A07 && this.A04 && this.A05 && A03()) {
                try {
                    w4s.wait();
                } catch (InterruptedException unused) {
                    AbstractC58318PtA.A18();
                }
            }
        }
    }

    public final void A07(Runnable runnable) {
        W4S w4s = GLDrawingView.A0I;
        synchronized (w4s) {
            this.A0J.add(runnable);
            w4s.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName(AnonymousClass001.A0Q("GLThread ", getId()));
        try {
            A00();
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            GLDrawingView.A0I.A01(this);
            throw th;
        }
        GLDrawingView.A0I.A01(this);
    }
}
