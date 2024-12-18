package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDR extends C03E implements InterfaceC16620sF {
    public static final MDR A00 = new MDR();

    public MDR() {
        super(2, AbstractC46455KhF.class, "generateStoryShare", "generateStoryShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectStoryShareMedia;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        String str;
        LEN len = (LEN) obj;
        C7QP c7qp = (C7QP) obj2;
        AbstractC167017dG.A1N(len, c7qp);
        Context context = (Context) len.A00.invoke();
        C38321qM c38321qM = c7qp.A01;
        ExtendedImageUrl extendedImageUrl2 = null;
        if (c38321qM != null) {
            user = AbstractC25226BEj.A14(c38321qM);
        } else {
            user = null;
        }
        if (user != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        if (c38321qM != null) {
            extendedImageUrl2 = c38321qM.A1q(context);
        }
        return AbstractC47996LLi.A04(extendedImageUrl, extendedImageUrl2, null, str, null, null, LEN.A00(len), 4, 0);
    }
}
