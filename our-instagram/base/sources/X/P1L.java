package X;

/* loaded from: classes9.dex */
public final class P1L implements InterfaceC57942Pmm {
    public final /* synthetic */ InterfaceC58204PrA A00;
    public final /* synthetic */ String A01;

    public P1L(InterfaceC58204PrA interfaceC58204PrA, String str) {
        this.A00 = interfaceC58204PrA;
        this.A01 = str;
    }

    @Override // X.InterfaceC57942Pmm
    public final void DqD(String str, int i, int i2) {
        C14360o3.A0B(str, 0);
        InterfaceC58204PrA interfaceC58204PrA = this.A00;
        String str2 = this.A01;
        interfaceC58204PrA.ESH(str);
        interfaceC58204PrA.ESG(false);
        interfaceC58204PrA.ESN(i);
        interfaceC58204PrA.ESK(i2);
        C54741OFs Bf0 = interfaceC58204PrA.Bf0();
        if (Bf0 != null) {
            Bf0.A01 = interfaceC58204PrA.AsO();
            Bf0.A00 = interfaceC58204PrA.AsL();
        }
        interfaceC58204PrA.Bf1().A0B(str2);
    }
}
