package X;

/* loaded from: classes10.dex */
public final class TDZ implements InterfaceC65668Tqy {
    public static final TDZ A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;
    public static final C63200Sf3 A05;
    public static final C63200Sf3 A06;
    public static final C63200Sf3 A07;
    public static final C63200Sf3 A08;
    public static final C63200Sf3 A09;
    public static final C63200Sf3 A0A;
    public static final C63200Sf3 A0B;
    public static final C63200Sf3 A0C;
    public static final C63200Sf3 A0D;
    public static final C63200Sf3 A0E;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TDZ] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("appId");
        EnumC61071Rel enumC61071Rel = EnumC61071Rel.DEFAULT;
        A01 = C63407Sjf.A04(enumC61071Rel, A032);
        A02 = C63407Sjf.A06(enumC61071Rel, "appVersion");
        A03 = C63407Sjf.A07(enumC61071Rel, "firebaseProjectId");
        A04 = C63407Sjf.A08(enumC61071Rel, "mlSdkVersion");
        A05 = C63407Sjf.A09(enumC61071Rel, "tfliteSchemaVersion");
        A06 = C63407Sjf.A0A(enumC61071Rel, "gcmSenderId");
        A07 = C63407Sjf.A0B(enumC61071Rel, "apiKey");
        A08 = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("languages"), 8);
        A09 = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("mlSdkInstanceId"), 9);
        A0A = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("isClearcutClient"), 10);
        A0B = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("isStandaloneMlkit"), 11);
        A0C = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("isJsonLogging"), 12);
        A0D = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("buildLevel"), 13);
        A0E = C63407Sjf.A05(enumC61071Rel, C63407Sjf.A03("optionalModuleVersion"), 14);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SJR sjr = (SJR) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sjr.A06);
        interfaceC65523Tls.A7W(A02, sjr.A07);
        interfaceC65523Tls.A7W(A03, null);
        interfaceC65523Tls.A7W(A04, sjr.A08);
        interfaceC65523Tls.A7W(A05, sjr.A09);
        interfaceC65523Tls.A7W(A06, null);
        interfaceC65523Tls.A7W(A07, null);
        interfaceC65523Tls.A7W(A08, sjr.A00);
        interfaceC65523Tls.A7W(A09, sjr.A0A);
        interfaceC65523Tls.A7W(A0A, sjr.A01);
        interfaceC65523Tls.A7W(A0B, sjr.A02);
        interfaceC65523Tls.A7W(A0C, sjr.A03);
        interfaceC65523Tls.A7W(A0D, sjr.A04);
        interfaceC65523Tls.A7W(A0E, sjr.A05);
    }
}
