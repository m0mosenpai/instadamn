package X;

/* loaded from: classes7.dex */
public final class J2K implements InterfaceC43457JHv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C101274gj A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41589Iac A03;

    public J2K(C101274gj c101274gj, C41181vS c41181vS, C41589Iac c41589Iac, int i) {
        this.A03 = c41589Iac;
        this.A01 = c101274gj;
        this.A02 = c41181vS;
        this.A00 = i;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        String A2u;
        C41589Iac c41589Iac = this.A03;
        C101274gj c101274gj = this.A01;
        C41181vS c41181vS = this.A02;
        C82713mZ A00 = C41589Iac.A00(c101274gj, c41589Iac, this.A00);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (A2u = c38321qM.A2u()) != null) {
            A00.A3d = AbstractC25228BEl.A13(A2u);
            A00.A14 = Boolean.valueOf(AbstractC37302Gc3.A0Q(c41589Iac.A00).A03(A2u));
        }
        return new C82753md(A00);
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }
}
