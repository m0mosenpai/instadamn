package X;

/* loaded from: classes6.dex */
public final class GLH implements Runnable {
    public final /* synthetic */ C32285EJx A00;

    public GLH(C32285EJx c32285EJx) {
        this.A00 = c32285EJx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32285EJx c32285EJx = this.A00;
        if (!C32285EJx.A0I(c32285EJx)) {
            C56352iT c56352iT = c32285EJx.A02;
            if (c56352iT != null) {
                c56352iT.A0X(c32285EJx);
                return;
            }
            return;
        }
        C189478aR c189478aR = c32285EJx.A08;
        if (c189478aR == null) {
            return;
        }
        c189478aR.A03.A0O();
    }
}
