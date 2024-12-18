package X;

/* loaded from: classes12.dex */
public final class YH5 implements Runnable {
    public final /* synthetic */ C129265so A00;
    public final /* synthetic */ C72838XoX A01;

    public YH5(C129265so c129265so, C72838XoX c72838XoX) {
        this.A01 = c72838XoX;
        this.A00 = c129265so;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72838XoX c72838XoX = this.A01;
        C129165sd c129165sd = c72838XoX.A01;
        if (c129165sd != null) {
            C129265so c129265so = this.A00;
            C129235sl c129235sl = c72838XoX.A00;
            if (c129235sl != null && c129235sl.A02(c129265so)) {
                c72838XoX.A05.A01(c129165sd, c129235sl, c72838XoX.A07, (c72838XoX.A06.now() - c129165sd.A05) / 1000.0d, c72838XoX.A04.A04);
                c72838XoX.A00();
            }
        }
    }
}
