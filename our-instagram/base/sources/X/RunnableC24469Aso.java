package X;

/* renamed from: X.Aso, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24469Aso implements Runnable {
    public final /* synthetic */ C3W5 A00;

    public RunnableC24469Aso(C3W5 c3w5) {
        this.A00 = c3w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        C3W5 c3w5 = this.A00;
        C75113Zb c75113Zb = c3w5.A04;
        if (c75113Zb != null && !C3W5.A03(c3w5, c75113Zb)) {
            C75113Zb c75113Zb2 = c3w5.A04;
            if (c75113Zb2 != null) {
                num = c75113Zb2.A14;
            } else {
                num = null;
            }
            if (num == C05F.A01) {
                C3W5.A02(c3w5, C05F.A00);
            }
            Runnable runnable = c3w5.A06;
            if (runnable != null) {
                c3w5.A08.removeCallbacks(runnable);
            }
            c3w5.A06 = null;
            C3W5.A01(c3w5);
            return;
        }
        Runnable runnable2 = c3w5.A06;
        if (runnable2 != null) {
            c3w5.A08.removeCallbacks(runnable2);
        }
        c3w5.A06 = null;
    }
}
