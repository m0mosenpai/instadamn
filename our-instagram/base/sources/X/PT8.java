package X;

/* loaded from: classes9.dex */
public final class PT8 implements Runnable {
    public float A00;
    public int A01;
    public boolean A02;
    public final /* synthetic */ C50809McW A03;

    public PT8(C50809McW c50809McW) {
        this.A03 = c50809McW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50809McW c50809McW = this.A03;
        int i = c50809McW.A05;
        int i2 = this.A01;
        c50809McW.A05 = i + i2;
        this.A02 = false;
        if (c50809McW.A0B == 3) {
            C50809McW.A06(c50809McW, i2, false);
        } else {
            if (!c50809McW.A0A()) {
                return;
            }
            C50809McW.A02(c50809McW, i2, this.A00);
        }
    }
}
