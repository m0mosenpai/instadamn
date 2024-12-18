package X;

/* loaded from: classes9.dex */
public final class PT6 implements Runnable {
    public final /* synthetic */ C52240NAe A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public PT6(C52240NAe c52240NAe, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = c52240NAe;
        this.A03 = interfaceC103384lE;
        this.A02 = c102884kP;
        this.A01 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC103384lE interfaceC103384lE = this.A03;
        C102884kP c102884kP = this.A02;
        C6FG c6fg = this.A01;
        if (interfaceC103384lE != null) {
            C6FP.A03(c6fg, c102884kP, AbstractC31179DnN.A0I(c6fg).A00(), interfaceC103384lE);
        }
    }
}
