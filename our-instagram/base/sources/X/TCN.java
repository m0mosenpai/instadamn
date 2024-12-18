package X;

/* loaded from: classes10.dex */
public final class TCN implements InterfaceC65668Tqy {
    public static final TCN A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TCN, java.lang.Object] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("imageFormat");
        EnumC61072Rem enumC61072Rem = EnumC61072Rem.DEFAULT;
        A01 = C63407Sjf.A0C(enumC61072Rem, A032);
        A02 = C63407Sjf.A0E(enumC61072Rem, "originalImageSize");
        A03 = C63407Sjf.A0F(enumC61072Rem, "compressedImageSize");
        A04 = C63407Sjf.A0G(enumC61072Rem, "isOdmlImage");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        C62716SNf c62716SNf = (C62716SNf) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, c62716SNf.A00);
        interfaceC65523Tls.A7W(A02, c62716SNf.A01);
        interfaceC65523Tls.A7W(A03, null);
        interfaceC65523Tls.A7W(A04, null);
    }
}
