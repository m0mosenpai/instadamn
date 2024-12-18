package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDA extends C03E implements InterfaceC16620sF {
    public static final MDA A00 = new MDA();

    public MDA() {
        super(2, LJK.class, "generateFundraiserUrl", "generateFundraiserUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC167017dG.A1N(str, obj2);
        return AnonymousClass001.A0R("https://www.instagram.com/linking/fundraiser?fundraiser_id=", str);
    }
}
