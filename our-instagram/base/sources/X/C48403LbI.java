package X;

/* renamed from: X.LbI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48403LbI implements C6D2 {
    public static final C48403LbI A00 = new C48403LbI();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C48496Lcn) {
            C0w9.A03("MsysClientInfra", AbstractC166997dE.A0y("getMediaFileRx with Error ", (Throwable) AbstractC132975zM.A00(interfaceC132965zL)));
            return null;
        }
        Object A01 = AbstractC132975zM.A01(interfaceC132965zL);
        C14360o3.A07(A01);
        C09530e4 c09530e4 = (C09530e4) A01;
        return new C49097Lna(AbstractC25227BEk.A0B((String) c09530e4.A01), (EnumC40111tc) c09530e4.A00);
    }
}
