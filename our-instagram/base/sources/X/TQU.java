package X;

/* loaded from: classes10.dex */
public final class TQU implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TQU(C6FG c6fg, C102884kP c102884kP, String str, String str2) {
        this.A01 = c102884kP;
        this.A00 = c6fg;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C102884kP c102884kP = this.A01;
        if (c102884kP.A0B(55) != null) {
            InterfaceC103384lE A0B = c102884kP.A0B(55);
            C6FX A0s = AbstractC25225BEi.A0s();
            C6FG c6fg = this.A00;
            A0s.A01(c6fg);
            A0s.A02(this.A02);
            C6FP.A03(c6fg, c102884kP, AbstractC25227BEk.A0f(A0s, this.A03, 2), A0B);
        }
    }
}
