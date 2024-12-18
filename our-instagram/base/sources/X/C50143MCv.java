package X;

/* renamed from: X.MCv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50143MCv extends C03E implements InterfaceC16620sF {
    public static final C50143MCv A00 = new C50143MCv();

    public C50143MCv() {
        super(2, LJK.class, "generateLiveVideoShareUrl", "generateLiveVideoShareUrl(Lcom/instagram/model/iglive/broadcast/BroadcastItem;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C105824pt c105824pt = (C105824pt) obj;
        AbstractC167017dG.A1N(c105824pt, obj2);
        String username = c105824pt.A03().getUsername();
        String str = c105824pt.A0X;
        str.getClass();
        return AnonymousClass001.A0u("https://www.instagram.com/", username, "/live/", str);
    }
}
