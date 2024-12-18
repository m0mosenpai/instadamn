package X;

/* loaded from: classes7.dex */
public final class Gi8 implements InterfaceC31054Dku {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public final C37542Gfy A02;

    public Gi8(C37542Gfy c37542Gfy) {
        this.A02 = c37542Gfy;
    }

    @Override // X.InterfaceC31054Dku
    public final void CJc(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38681GzM c38681GzM = new C38681GzM(EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c38681GzM);
            this.A02.A01(c120985dq, c37644Ghd);
        }
    }

    @Override // X.InterfaceC31054Dku
    public final void CJd(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38681GzM c38681GzM = new C38681GzM(EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd);
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c38681GzM);
            this.A02.A00(c120985dq);
        }
    }

    @Override // X.InterfaceC31054Dku
    public final void EXh(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31054Dku
    public final void EXi(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
