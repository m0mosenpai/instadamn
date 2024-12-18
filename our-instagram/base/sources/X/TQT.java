package X;

/* loaded from: classes10.dex */
public final class TQT implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ String A03;

    public TQT(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, String str) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A03 = str;
        this.A00 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C102884kP c102884kP = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(this.A03);
        C6FP.A03(this.A00, c102884kP, A0s.A00(), interfaceC103384lE);
    }
}
