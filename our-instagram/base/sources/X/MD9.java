package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD9 extends C03E implements InterfaceC16620sF {
    public static final MD9 A00 = new MD9();

    public MD9() {
        super(2, LJK.class, "generateDestinationShareUrl", "generateDestinationShareUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean A1a = AbstractC167017dG.A1a(str, obj2);
        if (AbstractC43592JPx.A1a("#", A1a ? 1 : 0, str)) {
            str = AbstractC43592JPx.A0z(str, A1a ? 1 : 0);
        }
        return AnonymousClass001.A0R("https://www.instagram.com/explore/tags/", str);
    }
}
