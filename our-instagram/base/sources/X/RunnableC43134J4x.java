package X;

/* renamed from: X.J4x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43134J4x implements Runnable {
    public final /* synthetic */ C75113Zb A00;
    public final /* synthetic */ C3YH A01;

    public RunnableC43134J4x(C75113Zb c75113Zb, C3YH c3yh) {
        this.A00 = c75113Zb;
        this.A01 = c3yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A00;
        if (c75113Zb.A1z) {
            this.A01.A00();
            c75113Zb.A0k(false);
        }
        C3YH c3yh = this.A01;
        Runnable runnable = c3yh.A02;
        if (runnable != null) {
            c3yh.A07.removeCallbacks(runnable);
            c3yh.A02 = null;
        }
    }
}
