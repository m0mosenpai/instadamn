package X;

/* renamed from: X.PPo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56973PPo implements Runnable {
    public boolean A00;
    public final C1ON A01;

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A00) {
            this.A00 = true;
            C1GJ.A03(this.A01);
        }
    }

    public RunnableC56973PPo(C1ON c1on) {
        this.A01 = c1on;
    }
}
