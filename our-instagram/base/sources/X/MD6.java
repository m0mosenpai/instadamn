package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD6 extends C03E implements InterfaceC16620sF {
    public static final MD6 A00 = new MD6();

    public MD6() {
        super(2, LJK.class, "generateShopShareUrl", "generateShopShareUrl(Lcom/instagram/direct/model/DirectShopShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C45116Jxl c45116Jxl = (C45116Jxl) obj;
        AbstractC167017dG.A1N(c45116Jxl, obj2);
        return AnonymousClass001.A13("https://www.instagram.com/_n/profile_shop?merchant_id=", c45116Jxl.A01, "&merchant_username=", c45116Jxl.A02, "&link_id=", c45116Jxl.A00);
    }
}
