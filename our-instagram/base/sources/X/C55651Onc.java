package X;

/* renamed from: X.Onc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55651Onc implements XE6 {
    public final /* synthetic */ C51673Ms4 A00;
    public final /* synthetic */ C55097Ob8 A01;
    public final /* synthetic */ C55066OaM A02;
    public final /* synthetic */ String A03;

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        C55097Ob8 c55097Ob8 = this.A01;
        C51673Ms4 c51673Ms4 = this.A00;
        c55097Ob8.A03(c51673Ms4.A02);
        C55066OaM c55066OaM = this.A02;
        c55066OaM.A01.A00(c51673Ms4, C05F.A1F, this.A03, "Upload failure", via, c55066OaM.A05);
    }

    @Override // X.XE6
    public final void Dbk(float f) {
    }

    @Override // X.XE6
    public final void onStart() {
    }

    public C55651Onc(C51673Ms4 c51673Ms4, C55097Ob8 c55097Ob8, C55066OaM c55066OaM, String str) {
        this.A01 = c55097Ob8;
        this.A00 = c51673Ms4;
        this.A02 = c55066OaM;
        this.A03 = str;
    }

    @Override // X.XE6
    public final void D1z() {
        C55097Ob8 c55097Ob8 = this.A01;
        C51673Ms4 c51673Ms4 = this.A00;
        c55097Ob8.A03(c51673Ms4.A02);
        C55066OaM.A01(c51673Ms4, this.A02, C05F.A1I, this.A03);
    }

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C55097Ob8 c55097Ob8 = this.A01;
        C51673Ms4 c51673Ms4 = this.A00;
        c55097Ob8.A03(c51673Ms4.A02);
        C55066OaM.A01(c51673Ms4, this.A02, C05F.A15, this.A03);
    }
}
