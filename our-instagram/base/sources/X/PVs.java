package X;

/* loaded from: classes9.dex */
public final class PVs implements InterfaceC31063Dl5 {
    public InterfaceC16660sJ A00;
    public final C0YS A01;
    public final C0YS A02;
    public final C0YS A03;

    @Override // X.InterfaceC31063Dl5
    public final void ETK(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31063Dl5
    public final InterfaceC16660sJ AyR() {
        return this.A00;
    }

    @Override // X.InterfaceC31063Dl5
    public final /* bridge */ /* synthetic */ InterfaceC16820sZ B9j() {
        return (InterfaceC16820sZ) this.A01;
    }

    @Override // X.InterfaceC31063Dl5
    public final /* bridge */ /* synthetic */ InterfaceC16660sJ Bmz() {
        return (InterfaceC16660sJ) this.A02;
    }

    @Override // X.InterfaceC31063Dl5
    public final /* bridge */ /* synthetic */ InterfaceC16660sJ C3O() {
        return (InterfaceC16660sJ) this.A03;
    }

    public PVs(C14510oO c14510oO, C15370ps c15370ps, C15370ps c15370ps2, C15370ps c15370ps3, C15370ps c15370ps4) {
        this.A01 = new C57211Pav(c14510oO, c15370ps);
        this.A00 = new C57218Pb2(c14510oO, c15370ps, c15370ps2, c15370ps3, c15370ps4, 0);
        this.A03 = new C57217Pb1(c14510oO, c15370ps3, c15370ps4);
        this.A02 = new C57218Pb2(c14510oO, c15370ps2, c15370ps, c15370ps3, c15370ps4, 1);
    }
}
