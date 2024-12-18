package X;

/* loaded from: classes9.dex */
public final class PSH implements Runnable {
    public float A00;
    public boolean A01;
    public final /* synthetic */ C50809McW A02;

    public PSH(C50809McW c50809McW) {
        this.A02 = c50809McW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50809McW c50809McW = this.A02;
        C50809McW.A05(c50809McW, this.A00);
        this.A01 = false;
        c50809McW.removeCallbacks(this);
    }
}
