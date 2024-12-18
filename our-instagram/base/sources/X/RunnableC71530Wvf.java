package X;

/* renamed from: X.Wvf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71530Wvf implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public RunnableC71530Wvf(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C102884kP c102884kP = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FX c6fx = new C6FX();
        C6FG c6fg = this.A00;
        c6fx.A01(c6fg);
        AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, interfaceC103384lE);
    }
}
