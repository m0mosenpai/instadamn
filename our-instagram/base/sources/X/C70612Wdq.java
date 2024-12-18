package X;

/* renamed from: X.Wdq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70612Wdq implements XA5 {
    public final /* synthetic */ V4G A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public C70612Wdq(V4G v4g, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = v4g;
        this.A02 = c102884kP;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fg;
    }

    @Override // X.XA5
    public final void D9G(int i) {
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE interfaceC103384lE = this.A03;
        C6FX c6fx = new C6FX();
        c6fx.A01(Integer.valueOf(i));
        C6FP.A03(this.A01, c102884kP, c6fx.A00(), interfaceC103384lE);
    }
}
