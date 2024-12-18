package X;

/* loaded from: classes5.dex */
public final class DKM extends C0YY implements InterfaceC16660sJ {
    public static final DKM A00 = new DKM();

    public DKM() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BHB bhb = (BHB) obj;
        C14360o3.A0B(bhb, 0);
        bhb.A00 = 10000;
        Float valueOf = Float.valueOf(0.1f);
        BZQ A002 = bhb.A00(valueOf, 500);
        InterfaceC30898DiB interfaceC30898DiB = AbstractC25328BIx.A01;
        A002.A00 = interfaceC30898DiB;
        bhb.A00(valueOf, 3000);
        Float valueOf2 = Float.valueOf(0.4f);
        bhb.A00(valueOf2, 3500).A00 = interfaceC30898DiB;
        bhb.A00(valueOf2, 6000);
        Float valueOf3 = Float.valueOf(0.7f);
        bhb.A00(valueOf3, 6500).A00 = interfaceC30898DiB;
        bhb.A00(valueOf3, 9000);
        Float A0m = AbstractC25227BEk.A0m();
        bhb.A00(A0m, 9500).A00 = interfaceC30898DiB;
        bhb.A00(A0m, 10000);
        return C0eB.A00;
    }
}
