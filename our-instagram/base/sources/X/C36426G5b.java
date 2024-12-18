package X;

/* renamed from: X.G5b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36426G5b implements InterfaceC37261GbE {
    public final /* synthetic */ LE3 A00;
    public final /* synthetic */ C31701fD A01;
    public final /* synthetic */ GZ3 A02;
    public final /* synthetic */ Integer A03;

    public C36426G5b(LE3 le3, C31701fD c31701fD, GZ3 gz3, Integer num) {
        this.A00 = le3;
        this.A01 = c31701fD;
        this.A02 = gz3;
        this.A03 = num;
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
            C26141Ov A01 = C26141Ov.A01(this.A00.A00);
            C31701fD c31701fD = this.A01;
            A01.A08(((C1OW) c31701fD).A05, null, null);
            this.A02.DqN(new C36539G9o(c31701fD), this.A03);
            return;
        }
        this.A02.DFl(c114675Fx, this.A03);
    }
}
