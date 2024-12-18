package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDU extends C03E implements InterfaceC16620sF {
    public static final MDU A00 = new MDU();

    public MDU() {
        super(2, AbstractC46455KhF.class, "generateFelixShare", "generateFelixShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectIGTVShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        LEN len = (LEN) obj;
        C206409Bx c206409Bx = (C206409Bx) obj2;
        AbstractC167017dG.A1N(len, c206409Bx);
        Context context = (Context) len.A00.invoke();
        C38321qM c38321qM = (C38321qM) c206409Bx.A00;
        User A14 = AbstractC25226BEj.A14(c38321qM);
        String str = null;
        if (A14 != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(A14);
            str = A14.getUsername();
        } else {
            extendedImageUrl = null;
        }
        return AbstractC47996LLi.A03(extendedImageUrl, c38321qM.A1q(context), null, 2, str, c38321qM.A0C.getTitle(), null, LEN.A00(len), null, 4, 0);
    }
}
