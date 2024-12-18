package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD5 extends C03E implements InterfaceC16620sF {
    public static final MD5 A00 = new MD5();

    public MD5() {
        super(2, LJK.class, "generateShopsCollectionShareUrl", "generateShopsCollectionShareUrl(Lcom/instagram/direct/model/DirectShopsCollectionShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C26069Bfx c26069Bfx = (C26069Bfx) obj;
        AbstractC167017dG.A1N(c26069Bfx, obj2);
        return AnonymousClass001.A16("https://www.instagram.com/_n/product_collection?title=", c26069Bfx.A03, "&merchant_id=", c26069Bfx.A00, "&collection_id=", c26069Bfx.A01, "&collection_type=", c26069Bfx.A02);
    }
}
