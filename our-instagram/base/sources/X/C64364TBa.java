package X;

/* renamed from: X.TBa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64364TBa implements InterfaceC65668Tqy {
    public static final C64364TBa A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TBa, java.lang.Object] */
    static {
        C63407Sjf A012 = C63407Sjf.A01();
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A012);
        A02 = C63407Sjf.A0E(enumC61072Rem, "eventCount");
        A03 = C63407Sjf.A0F(enumC61072Rem, "inferenceDurationStats");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SGV sgv = (SGV) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sgv.A00);
        interfaceC65523Tls.A7W(A02, sgv.A02);
        interfaceC65523Tls.A7W(A03, sgv.A01);
    }
}
