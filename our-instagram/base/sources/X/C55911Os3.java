package X;

/* renamed from: X.Os3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55911Os3 implements InterfaceC151096rC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NQJ A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC151096rC
    public final void Cko() {
    }

    @Override // X.InterfaceC151096rC
    public final void Clw() {
    }

    public C55911Os3(NQJ nqj, String str, int i) {
        this.A01 = nqj;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC151096rC
    public final void Ci5() {
        InterfaceC09390do interfaceC09390do = this.A01.A0F;
        C24U A0V = MSZ.A0V(interfaceC09390do);
        String str = this.A02;
        A0V.A05(this.A00, "http task aborted");
        MSZ.A0V(interfaceC09390do).A08(str);
    }

    @Override // X.InterfaceC151096rC
    public final void Cj9(String str) {
        MSZ.A0V(this.A01.A0F).A09(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void CjI(String str) {
        MSZ.A0V(this.A01.A0F).A09(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void Ckj() {
        InterfaceC09390do interfaceC09390do = this.A01.A0F;
        C24U A0V = MSZ.A0V(interfaceC09390do);
        String str = this.A02;
        A0V.A05(this.A00, "http task cancelled");
        MSZ.A0V(interfaceC09390do).A08(str);
    }

    @Override // X.InterfaceC151096rC
    public final void Ckk() {
        MSZ.A0V(this.A01.A0F).A0A(this.A02);
    }

    @Override // X.InterfaceC151096rC
    public final void ClN() {
        MSZ.A0V(this.A01.A0F).A04(this.A00);
    }

    @Override // X.InterfaceC151096rC
    public final void ClO() {
        MSZ.A0V(this.A01.A0F).A03(this.A00);
    }
}
