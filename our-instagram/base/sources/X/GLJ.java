package X;

/* loaded from: classes6.dex */
public final class GLJ implements Runnable {
    public final /* synthetic */ C32285EJx A00;

    public GLJ(C32285EJx c32285EJx) {
        this.A00 = c32285EJx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189478aR c189478aR = this.A00.A08;
        if (c189478aR != null) {
            c189478aR.A03.A00 = 0;
            C3DN c3dn = c189478aR.A00;
            if (c3dn != null) {
                c3dn.A0C();
            }
        }
    }
}
