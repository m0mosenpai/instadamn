package X;

/* renamed from: X.J4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43125J4o implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C141596ac A01;

    public RunnableC43125J4o(C41181vS c41181vS, C141596ac c141596ac) {
        this.A01 = c141596ac;
        this.A00 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!C6WP.A03) {
            C6WP.A02 = C05F.A01;
            C141596ac c141596ac = this.A01;
            c141596ac.A02(c141596ac.A0B + (0.1f / 30.0f));
            C41181vS c41181vS = this.A00;
            C6WP.A04(c41181vS, c141596ac);
            if (c41181vS != null && c141596ac.A0B >= 1.0f && !C6WP.A03) {
                AbstractC79383gk.A01(new J3N(c41181vS));
            }
        }
    }
}
