package X;

/* loaded from: classes7.dex */
public final class HH4 extends AbstractC60592pi {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public HH4(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C102884kP c102884kP = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FW c6fw = C6FW.A01;
        C6FG c6fg = this.A00;
        C6FP.A03(c6fg, c102884kP, c6fw, interfaceC103384lE);
        C6BQ.A0J(c6fg, this);
    }
}
