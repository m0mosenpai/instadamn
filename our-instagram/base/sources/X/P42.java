package X;

/* loaded from: classes9.dex */
public final class P42 implements InterfaceC57955Pn1 {
    public final /* synthetic */ NMW A00;

    public P42(NMW nmw) {
        this.A00 = nmw;
    }

    @Override // X.InterfaceC57955Pn1
    public final void Dhe() {
        NMW nmw = this.A00;
        C55104ObH c55104ObH = new C55104ObH(nmw.requireContext(), EnumC53319Nhv.A07);
        C38321qM c38321qM = nmw.A0C;
        if (c38321qM == null) {
            C14360o3.A0F("editMedia");
            throw C00O.createAndThrow();
        }
        c55104ObH.A07(c38321qM, null, nmw.A0K, null, null, nmw.A0J, null, null, null);
        c55104ObH.A03(AbstractC166987dD.A0r(nmw.A0Y));
        C12260kU.A06(nmw, c55104ObH.A02(), 1000);
    }
}
