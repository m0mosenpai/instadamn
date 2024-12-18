package X;

import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDO extends C03E implements InterfaceC16620sF {
    public static final MDO A00 = new MDO();

    public MDO() {
        super(2, AbstractC46455KhF.class, "generateProfile", "generateProfile(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/user/model/User;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LEN len = (LEN) obj;
        User user = (User) obj2;
        AbstractC167017dG.A1N(len, user);
        return AbstractC47996LLi.A08(AbstractC43593JPy.A0g(user), null, user.getUsername(), user.getFullName(), null, null, LEN.A00(len));
    }
}
