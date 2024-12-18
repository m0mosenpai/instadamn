package X;

/* renamed from: X.Tuq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65833Tuq implements Runnable {
    public boolean A00;
    public final C07R A01;
    public final C0eR A02;

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A00) {
            this.A02.A0B(this.A01);
            this.A00 = true;
        }
    }

    public RunnableC65833Tuq(C07R c07r, C0eR c0eR) {
        this.A02 = c0eR;
        this.A01 = c07r;
    }
}
