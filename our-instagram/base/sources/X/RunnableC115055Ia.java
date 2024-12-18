package X;

/* renamed from: X.5Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC115055Ia implements Runnable {
    public final int A00;
    public final C2MX A01;
    public final C1113750b A02;
    public final boolean A03;

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC52072a7 A00;
        boolean z = this.A03;
        C2MX c2mx = this.A01;
        C1113750b c1113750b = this.A02;
        int i = this.A00;
        String str = c1113750b.A00.A01;
        synchronized (c2mx.A09) {
            if (z) {
                A00 = C2MX.A00(c2mx, str);
            } else if (c2mx.A05.get(str) != null) {
                C48442Kl.A00();
            } else {
                java.util.Set set = (java.util.Set) c2mx.A06.get(str);
                if (set != null && set.contains(c1113750b)) {
                    A00 = C2MX.A00(c2mx, str);
                }
            }
            C2MX.A01(A00, i);
        }
        C48442Kl.A00();
        C48442Kl.A01("StopWorkRunnable");
    }

    public RunnableC115055Ia(C2MX c2mx, C1113750b c1113750b, int i, boolean z) {
        this.A01 = c2mx;
        this.A02 = c1113750b;
        this.A03 = z;
        this.A00 = i;
    }
}
