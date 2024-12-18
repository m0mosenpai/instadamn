package X;

/* renamed from: X.PLj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56864PLj implements Runnable {
    public final /* synthetic */ P0A A00;

    public RunnableC56864PLj(P0A p0a) {
        this.A00 = p0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0A p0a = this.A00;
        MXD mxd = p0a.A0F;
        mxd.A02.removeCallbacks(p0a.A0J);
        C197368o7 c197368o7 = p0a.A03;
        p0a.A03 = null;
        p0a.A02 = null;
        C81N c81n = p0a.A05;
        if (c81n != null) {
            c81n.A09 = null;
        }
        p0a.A05 = null;
        p0a.A0N = 0;
        p0a.A0M = 0;
        if (c197368o7 != null && mxd.A00 != null) {
            c197368o7.A0C(new RunnableC56984PPz(c197368o7, p0a));
            p0a.A0E.A02.remove(p0a);
        }
    }
}
