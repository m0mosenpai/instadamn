package X;

/* renamed from: X.Wo6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71109Wo6 implements InterfaceC59892oW {
    public final /* synthetic */ C66268U6m A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ String A03;

    public C71109Wo6(C66268U6m c66268U6m, C6FG c6fg, C102884kP c102884kP, String str) {
        this.A00 = c66268U6m;
        this.A03 = str;
        this.A02 = c102884kP;
        this.A01 = c6fg;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        if (!this.A03.equals("top")) {
            i = i2;
        }
        C102884kP c102884kP = this.A02;
        if (c102884kP.A03(31, 0) != i) {
            AnonymousClass630 A02 = AnonymousClass634.A02(this.A01);
            A02.A0G(new C70695WfI(c102884kP.A04), new V4Y(this, i));
            A02.A09();
        }
    }
}
