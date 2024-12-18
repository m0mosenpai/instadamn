package X;

/* renamed from: X.TBw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64386TBw implements InterfaceC65668Tqy {
    public static final C64386TBw A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TBw] */
    static {
        C63407Sjf A022 = C63407Sjf.A02();
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A022);
        A02 = C63407Sjf.A0E(enumC61072Rem, "imageInfo");
        A03 = C63407Sjf.A0F(enumC61072Rem, "recognizerOptions");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SGW sgw = (SGW) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sgw.A01);
        interfaceC65523Tls.A7W(A02, sgw.A00);
        interfaceC65523Tls.A7W(A03, sgw.A02);
    }
}
