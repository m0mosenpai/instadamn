package X;

/* renamed from: X.CnP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28793CnP implements InterfaceC74963Ym {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public final C28795CnR A02;
    public final /* synthetic */ CU1 A03;

    public C28793CnP(CU1 cu1, C28795CnR c28795CnR, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A03 = cu1;
        this.A02 = c28795CnR;
        this.A01 = interfaceC16660sJ;
        this.A00 = interfaceC16660sJ2;
    }

    public final void A00(InterfaceC31030DkT interfaceC31030DkT) {
        Object invoke = this.A00.invoke(interfaceC31030DkT.C5W());
        if (AbstractC25230BEn.A1X(this.A03.A03.A05)) {
            this.A02.A03((C5Y5) this.A01.invoke(interfaceC31030DkT), this.A00.invoke(interfaceC31030DkT.BHg()), invoke);
        } else {
            this.A02.A02((C5Y5) this.A01.invoke(interfaceC31030DkT), invoke);
        }
    }

    @Override // X.InterfaceC74963Ym
    public final Object getValue() {
        A00(this.A03.A03.A03());
        return this.A02.A09.getValue();
    }
}
