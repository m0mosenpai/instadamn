package X;

import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD3 extends C03E implements InterfaceC16620sF {
    public static final MD3 A00 = new MD3();

    public MD3() {
        super(2, LJK.class, "generatorProfileUrl", "generatorProfileUrl(Lcom/instagram/user/model/User;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user = (User) obj;
        AbstractC167017dG.A1N(user, obj2);
        return AnonymousClass001.A0R("https://www.instagram.com/", user.getUsername());
    }
}
