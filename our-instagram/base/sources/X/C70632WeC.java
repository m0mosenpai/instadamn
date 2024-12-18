package X;

/* renamed from: X.WeC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70632WeC implements XCK {
    public final /* synthetic */ C50627MWo A00;
    public final /* synthetic */ C69285Vkt A01;
    public final /* synthetic */ XA7 A02;

    public C70632WeC(C50627MWo c50627MWo, C69285Vkt c69285Vkt, XA7 xa7) {
        this.A01 = c69285Vkt;
        this.A00 = c50627MWo;
        this.A02 = xa7;
    }

    @Override // X.XCK
    public final void DFf() {
        C69285Vkt c69285Vkt = this.A01;
        C69094Vhk c69094Vhk = c69285Vkt.A01;
        VRO.A00(c69094Vhk, c69094Vhk.A00, "promote_client_token_cleared");
        ((C68725Vb4) c69285Vkt.A03.getValue()).A00 = null;
        this.A02.Dh1(V20.A00);
    }

    @Override // X.XCK
    public final void onSuccess() {
        WFC.A01(this.A00, this.A01, this.A02);
    }
}
