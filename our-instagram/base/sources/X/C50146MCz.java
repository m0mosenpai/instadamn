package X;

/* renamed from: X.MCz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50146MCz extends C03E implements InterfaceC16620sF {
    public static final C50146MCz A00 = new C50146MCz();

    public C50146MCz() {
        super(2, LJK.class, "generateFelixShareUrl", "generateFelixShareUrl(Ljava/lang/Object;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String A2f;
        AbstractC167017dG.A1N(obj, obj2);
        if (obj instanceof String) {
            A2f = (String) obj;
        } else {
            if (C206409Bx.A00(obj, 8)) {
                obj = ((C206409Bx) obj).A00;
            } else if (!(obj instanceof C38321qM)) {
                throw AbstractC43594JPz.A0o(obj, "Expected either DirectIGTVShare or Media, found: ", AbstractC166987dD.A1C());
            }
            A2f = ((C38321qM) obj).A2f();
        }
        return AnonymousClass001.A0R("https://www.instagram.com/tv/", A2f);
    }
}
