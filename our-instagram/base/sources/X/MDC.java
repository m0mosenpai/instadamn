package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDC extends C03E implements InterfaceC16620sF {
    public static final MDC A00 = new MDC();

    public MDC() {
        super(2, LJK.class, "generateLocationShareUrl", "generateLocationShareUrl(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC167017dG.A1N(str, obj2);
        return AnonymousClass001.A0R("https://www.instagram.com/explore/locations/", str);
    }
}
