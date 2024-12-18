package X;

/* loaded from: classes6.dex */
public final class GHB implements C7XU {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C32857Ecz A01;
    public final /* synthetic */ C189478aR A02;
    public final /* synthetic */ C7XU A03;
    public final /* synthetic */ C3DN A04;

    public GHB(AbstractC59962oe abstractC59962oe, C32857Ecz c32857Ecz, C189478aR c189478aR, C7XU c7xu, C3DN c3dn) {
        this.A03 = c7xu;
        this.A04 = c3dn;
        this.A02 = c189478aR;
        this.A01 = c32857Ecz;
        this.A00 = abstractC59962oe;
    }

    @Override // X.C7XU
    public final void DAy() {
        this.A02.A03(this.A01.A00, this.A00);
    }

    @Override // X.C7XU
    public final void DB3() {
        C7XU c7xu = this.A03;
        if (c7xu != null && ((C3DP) this.A04).A0g) {
            c7xu.DB3();
        }
    }
}
