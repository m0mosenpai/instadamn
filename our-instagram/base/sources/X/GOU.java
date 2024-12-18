package X;

/* loaded from: classes6.dex */
public final class GOU implements Runnable {
    public final /* synthetic */ C0SG A00;
    public final /* synthetic */ C32491ESr A01;

    public GOU(C0SG c0sg, C32491ESr c32491ESr) {
        this.A01 = c32491ESr;
        this.A00 = c0sg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33623EtZ c33623EtZ = this.A01.A00;
        if (!c33623EtZ.A01.isFinishing()) {
            this.A00.A0B(c33623EtZ.A01.getSupportFragmentManager(), "feedbackDialog");
        }
    }
}
