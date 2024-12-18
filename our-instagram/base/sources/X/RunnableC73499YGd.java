package X;

/* renamed from: X.YGd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73499YGd implements Runnable {
    public final /* synthetic */ C3YD A00;

    public RunnableC73499YGd(C3YD c3yd) {
        this.A00 = c3yd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3YD c3yd = this.A00;
        if (C3YD.A08(c3yd)) {
            Runnable runnable = c3yd.A07;
            if (runnable != null) {
                c3yd.A0G.removeCallbacks(runnable);
                c3yd.A07 = null;
                return;
            }
            return;
        }
        if (C3YD.A00(c3yd).A00 == C05F.A0C) {
            c3yd.A0G(C05F.A01);
        }
        Runnable runnable2 = c3yd.A07;
        if (runnable2 != null) {
            c3yd.A0G.removeCallbacks(runnable2);
            c3yd.A07 = null;
        }
        if (C3YD.A00(c3yd).A02) {
            return;
        }
        C3YD.A06(c3yd);
    }
}
