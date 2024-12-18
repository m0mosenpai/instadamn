package X;

/* renamed from: X.Aya, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24814Aya implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RunnableC208819Lp A02;

    public RunnableC24814Aya(RunnableC208819Lp runnableC208819Lp, int i, int i2) {
        this.A02 = runnableC208819Lp;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC208819Lp runnableC208819Lp = this.A02;
        int i = runnableC208819Lp.A01;
        int i2 = this.A01;
        if (i != i2 || runnableC208819Lp.A00 != this.A00) {
            runnableC208819Lp.A01 = i2;
            runnableC208819Lp.A00 = this.A00;
        }
    }
}
