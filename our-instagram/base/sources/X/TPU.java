package X;

/* loaded from: classes10.dex */
public final class TPU implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ String A02;

    public TPU(C6FG c6fg, C102884kP c102884kP, String str) {
        this.A01 = c102884kP;
        this.A00 = c6fg;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C102884kP c102884kP = this.A01;
        InterfaceC103384lE A0B = c102884kP.A0B(51);
        C6FX A0s = AbstractC25225BEi.A0s();
        C6FG c6fg = this.A00;
        A0s.A01(c6fg);
        AbstractC58322PtE.A1M(c6fg, c102884kP, A0s, A0B, this.A02);
    }
}
