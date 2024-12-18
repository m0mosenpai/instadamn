package X;

/* renamed from: X.G5c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36427G5c implements InterfaceC37261GbE {
    public final /* synthetic */ FGS A00;
    public final /* synthetic */ C31391ei A01;
    public final /* synthetic */ GZ3 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    public C36427G5c(FGS fgs, C31391ei c31391ei, GZ3 gz3, Integer num, String str) {
        this.A00 = fgs;
        this.A01 = c31391ei;
        this.A02 = gz3;
        this.A03 = num;
        this.A04 = str;
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA B4C() {
        return new C19260xA();
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA BtO() {
        return new C19260xA();
    }

    @Override // X.InterfaceC37261GbE
    public final void DUq(C114675Fx c114675Fx, String str) {
        if (c114675Fx == null) {
            C26141Ov.A01(this.A00.A00).A08(((C1OW) this.A01).A05, str, null);
            this.A02.DqN(new C36538G9n(this.A04), this.A03);
            return;
        }
        this.A02.DFl(c114675Fx, this.A03);
    }
}
