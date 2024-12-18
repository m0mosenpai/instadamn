package X;

/* loaded from: classes9.dex */
public final class PC4 implements InterfaceC57985PnV {
    public C51900Mwi A00;
    public O54 A01;
    public final InterfaceC09390do A02 = C57553PgR.A01(this, 40);
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51900Mwi c51900Mwi = (C51900Mwi) interfaceC57856PlM;
        C14360o3.A0B(c51900Mwi, 0);
        if (!C14360o3.A0K(this.A00, c51900Mwi)) {
            this.A00 = c51900Mwi;
            boolean z = c51900Mwi.A02;
            if (z) {
                Ok3.A00(AbstractC166987dD.A0d(this.A03), 23, this);
            }
            AbstractC166987dD.A0d(this.A02).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public PC4(InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = C57553PgR.A01(interfaceC16820sZ, 41);
    }
}
