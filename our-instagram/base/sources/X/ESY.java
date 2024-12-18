package X;

/* loaded from: classes6.dex */
public final class ESY extends C1P1 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C35131ks A01;

    public ESY(InterfaceC37261GbE interfaceC37261GbE, C35131ks c35131ks) {
        this.A00 = interfaceC37261GbE;
        this.A01 = c35131ks;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1177492887);
        int A032 = C0f9.A03(1586323673);
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        String str = this.A01.A01;
        if (str != null) {
            interfaceC37261GbE.DUq(null, str);
            C0f9.A0A(1361178306, A032);
            C0f9.A0A(1001056932, A03);
            return;
        }
        C14360o3.A0F("itemId");
        throw C00O.createAndThrow();
    }
}
