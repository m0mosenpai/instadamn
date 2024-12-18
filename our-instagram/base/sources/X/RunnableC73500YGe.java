package X;

/* renamed from: X.YGe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73500YGe implements Runnable {
    public final /* synthetic */ C3YD A00;

    public RunnableC73500YGe(C3YD c3yd) {
        this.A00 = c3yd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb;
        C3YD c3yd = this.A00;
        if (C3YD.A08(c3yd) || ((c75113Zb = c3yd.A02) != null && c75113Zb.A2R)) {
            Runnable runnable = c3yd.A08;
            if (runnable != null) {
                c3yd.A0G.removeCallbacks(runnable);
                c3yd.A08 = null;
                return;
            }
            return;
        }
        if (C3YD.A00(c3yd).A00 == C05F.A01) {
            c3yd.A0G(C05F.A0C);
        }
        Runnable runnable2 = c3yd.A08;
        if (runnable2 != null) {
            c3yd.A0G.removeCallbacks(runnable2);
            c3yd.A08 = null;
        }
        if (C3YD.A00(c3yd).A06) {
            return;
        }
        C3YD.A04(c3yd);
    }
}
