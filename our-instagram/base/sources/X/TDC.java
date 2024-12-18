package X;

/* loaded from: classes10.dex */
public final class TDC implements InterfaceC65668Tqy {
    public static final TDC A00 = new Object();
    public static final C63200Sf3 A02 = C63200Sf3.A00("eventTimeMs");
    public static final C63200Sf3 A01 = C63200Sf3.A00("eventCode");
    public static final C63200Sf3 A03 = C63200Sf3.A00("eventUptimeMs");
    public static final C63200Sf3 A06 = C63200Sf3.A00("sourceExtension");
    public static final C63200Sf3 A05 = C63200Sf3.A00("sourceExtensionJsonProto3");
    public static final C63200Sf3 A07 = C63200Sf3.A00("timezoneOffsetSeconds");
    public static final C63200Sf3 A04 = C63200Sf3.A00("networkConnectionInfo");

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        C60634REt c60634REt = (C60634REt) ((S2B) obj);
        interfaceC65523Tls.A7V(A02, c60634REt.A00);
        interfaceC65523Tls.A7W(A01, c60634REt.A04);
        interfaceC65523Tls.A7V(A03, c60634REt.A01);
        interfaceC65523Tls.A7W(A06, c60634REt.A06);
        interfaceC65523Tls.A7W(A05, c60634REt.A05);
        interfaceC65523Tls.A7V(A07, c60634REt.A02);
        interfaceC65523Tls.A7W(A04, c60634REt.A03);
    }
}
