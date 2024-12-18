package X;

/* renamed from: X.TBx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64387TBx implements InterfaceC65668Tqy {
    public static final C64387TBx A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TBx] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("languageOption");
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0D(enumC61072Rem, A032, 3);
        A02 = C63407Sjf.A0G(enumC61072Rem, "isUsingLegacyApi");
        A03 = C63407Sjf.A0H(enumC61072Rem, "sdkVersion");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, ((SNP) obj).A00);
        interfaceC65523Tls.A7W(A02, null);
        interfaceC65523Tls.A7W(A03, null);
    }
}
