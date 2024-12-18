package X;

/* loaded from: classes10.dex */
public final class TD5 implements InterfaceC65668Tqy {
    public static final TD5 A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;
    public static final C63200Sf3 A05;
    public static final C63200Sf3 A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TD5, java.lang.Object] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("maxMs");
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A032);
        A02 = C63407Sjf.A0E(enumC61072Rem, "minMs");
        A03 = C63407Sjf.A0F(enumC61072Rem, "avgMs");
        A04 = C63407Sjf.A0G(enumC61072Rem, "firstQuartileMs");
        A05 = C63407Sjf.A0H(enumC61072Rem, "medianMs");
        A06 = C63407Sjf.A0I(enumC61072Rem, "thirdQuartileMs");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        C62609SIq c62609SIq = (C62609SIq) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, c62609SIq.A00);
        interfaceC65523Tls.A7W(A02, c62609SIq.A01);
        interfaceC65523Tls.A7W(A03, c62609SIq.A02);
        interfaceC65523Tls.A7W(A04, c62609SIq.A03);
        interfaceC65523Tls.A7W(A05, c62609SIq.A04);
        interfaceC65523Tls.A7W(A06, c62609SIq.A05);
    }
}
