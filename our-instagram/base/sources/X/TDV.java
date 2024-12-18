package X;

/* loaded from: classes10.dex */
public final class TDV implements InterfaceC65668Tqy {
    public static final TDV A00 = new Object();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TDV] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("durationMs");
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A032);
        A02 = C63407Sjf.A0E(enumC61072Rem, "errorCode");
        A03 = C63407Sjf.A0F(enumC61072Rem, "isColdCall");
        A04 = C63407Sjf.A0G(enumC61072Rem, "autoManageModelOnBackground");
        A05 = C63407Sjf.A0H(enumC61072Rem, "autoManageModelOnLowMemory");
        A06 = C63407Sjf.A0I(enumC61072Rem, "isNnApiEnabled");
        A07 = C63407Sjf.A0J(enumC61072Rem, "eventsCount");
        A08 = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("otherErrors"), 8);
        A09 = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("remoteConfigValueForAcceleration"), 9);
        A0A = C63407Sjf.A0D(enumC61072Rem, C63407Sjf.A03("isAccelerated"), 10);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SIS sis = (SIS) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sis.A04);
        interfaceC65523Tls.A7W(A02, sis.A00);
        interfaceC65523Tls.A7W(A03, sis.A01);
        interfaceC65523Tls.A7W(A04, sis.A02);
        interfaceC65523Tls.A7W(A05, sis.A03);
        interfaceC65523Tls.A7W(A06, null);
        interfaceC65523Tls.A7W(A07, null);
        interfaceC65523Tls.A7W(A08, null);
        interfaceC65523Tls.A7W(A09, null);
        interfaceC65523Tls.A7W(A0A, null);
    }
}
