package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD4 extends C03E implements InterfaceC16620sF {
    public static final MD4 A00 = new MD4();

    public MD4() {
        super(2, LJK.class, "generateReelsAudioShare", "generateReelsAudioShare(Ljava/lang/String;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC167017dG.A1N(str, obj2);
        return AnonymousClass001.A0R("https://www.instagram.com/reels/audio/", str);
    }
}
