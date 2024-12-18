package X;

/* renamed from: X.WeD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70633WeD implements XCK {
    public final /* synthetic */ C50627MWo A00;
    public final /* synthetic */ C69285Vkt A01;
    public final /* synthetic */ XA7 A02;
    public final /* synthetic */ String A03;

    public C70633WeD(C50627MWo c50627MWo, C69285Vkt c69285Vkt, XA7 xa7, String str) {
        this.A00 = c50627MWo;
        this.A02 = xa7;
        this.A03 = str;
        this.A01 = c69285Vkt;
    }

    @Override // X.XCK
    public final void DFf() {
        C69285Vkt c69285Vkt = this.A01;
        C69094Vhk c69094Vhk = c69285Vkt.A01;
        VRO.A00(c69094Vhk, c69094Vhk.A00, "promote_client_token_cleared");
        ((C68725Vb4) c69285Vkt.A03.getValue()).A00 = null;
        WFC.A00(this.A00, c69285Vkt, this.A02);
    }

    @Override // X.XCK
    public final void onSuccess() {
        WFC.A02(this.A00, this.A02, this.A03);
    }
}
