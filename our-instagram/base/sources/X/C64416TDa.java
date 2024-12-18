package X;

/* renamed from: X.TDa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64416TDa implements InterfaceC65668Tqy {
    public static final C64416TDa A00 = new Object();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TDa, java.lang.Object] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("appId");
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A032);
        A02 = C63407Sjf.A0E(enumC61072Rem, "appVersion");
        A03 = C63407Sjf.A0F(enumC61072Rem, "firebaseProjectId");
        A04 = C63407Sjf.A0G(enumC61072Rem, "mlSdkVersion");
        A05 = C63407Sjf.A0H(enumC61072Rem, "tfliteSchemaVersion");
        A06 = C63407Sjf.A0I(enumC61072Rem, "gcmSenderId");
        A07 = C63407Sjf.A0J(enumC61072Rem, "apiKey");
        A08 = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("languages"), 8);
        A09 = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("mlSdkInstanceId"), 9);
        A0A = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("isClearcutClient"), 10);
        A0B = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("isStandaloneMlkit"), 11);
        A0C = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("isJsonLogging"), 12);
        A0D = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("buildLevel"), 13);
        A0E = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("optionalModuleVersion"), 14);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SJT sjt = (SJT) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sjt.A06);
        interfaceC65523Tls.A7W(A02, sjt.A07);
        interfaceC65523Tls.A7W(A03, null);
        interfaceC65523Tls.A7W(A04, sjt.A08);
        interfaceC65523Tls.A7W(A05, sjt.A09);
        interfaceC65523Tls.A7W(A06, null);
        interfaceC65523Tls.A7W(A07, null);
        interfaceC65523Tls.A7W(A08, sjt.A00);
        interfaceC65523Tls.A7W(A09, sjt.A0A);
        interfaceC65523Tls.A7W(A0A, sjt.A01);
        interfaceC65523Tls.A7W(A0B, sjt.A02);
        interfaceC65523Tls.A7W(A0C, sjt.A03);
        interfaceC65523Tls.A7W(A0D, sjt.A04);
        interfaceC65523Tls.A7W(A0E, sjt.A05);
    }
}
