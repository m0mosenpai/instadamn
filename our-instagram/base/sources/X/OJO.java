package X;

/* loaded from: classes9.dex */
public final class OJO {
    public int A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16660sJ A02;
    public final OML A03;
    public final AbstractC53631Nnc A04;
    public final C53640Nnl A05;

    public final void A00(OLS ols, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(ols, 0);
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
        OML oml = this.A03;
        long j = ((long) this.A05.A00) * 1000;
        C57514Pfo c57514Pfo = new C57514Pfo(this, 27);
        OIF oif = oml.A02;
        AbstractC166987dD.A1Z(new MCF(oif, "upload_edit_start", null, 0), oif.A02);
        oml.A03.execute(new PT4(oif, oml, c57514Pfo, j));
        this.A04.A04(ols, this);
    }

    public OJO(C53640Nnl c53640Nnl, OML oml, AbstractC53631Nnc abstractC53631Nnc) {
        this.A04 = abstractC53631Nnc;
        this.A05 = c53640Nnl;
        this.A03 = oml;
        this.A00 = c53640Nnl.A01;
    }
}
