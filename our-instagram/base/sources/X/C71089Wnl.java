package X;

/* renamed from: X.Wnl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71089Wnl implements XBP {
    public final /* synthetic */ V4N A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    public C71089Wnl(V4N v4n, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = v4n;
        this.A02 = c102884kP;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fg;
    }

    @Override // X.XBP
    public final void Dcy(float f, float f2, float f3, float f4) {
        C102884kP c102884kP = this.A02;
        float A02 = c102884kP.A02(36, 0.0f) * Math.round(f / r1);
        float A022 = c102884kP.A02(36, 0.0f) * Math.round(f2 / r5);
        InterfaceC103384lE interfaceC103384lE = this.A03;
        C6FX c6fx = new C6FX();
        c6fx.A01(C6DZ.A00(A02));
        c6fx.A02(C6DZ.A00(A022));
        C6FP.A03(this.A01, c102884kP, c6fx.A00(), interfaceC103384lE);
    }
}
