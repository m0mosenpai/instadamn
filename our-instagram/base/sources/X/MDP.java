package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDP extends C03E implements InterfaceC16620sF {
    public static final MDP A00 = new MDP();

    public MDP() {
        super(2, AbstractC46455KhF.class, "generateMediaShare", "generateMediaShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectMediaShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C38321qM c38321qM;
        ExtendedImageUrl extendedImageUrl;
        String str;
        int i;
        String str2;
        String str3;
        LEN len = (LEN) obj;
        C9CL c9cl = (C9CL) obj2;
        AbstractC167007dF.A1K(len, c9cl);
        Context context = (Context) len.A00.invoke();
        C38321qM c38321qM2 = (C38321qM) c9cl.A00;
        if (!c38321qM2.A5F() || (((str3 = c9cl.A02) == null || (c38321qM = c38321qM2.A1h(str3)) == null) && (c38321qM = c38321qM2.A1e(0)) == null)) {
            c38321qM = c38321qM2;
        }
        User A14 = AbstractC25226BEj.A14(c38321qM2);
        String str4 = null;
        if (A14 != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(A14);
            str = A14.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (c38321qM2.Cff()) {
            i = 2;
        } else if (c38321qM2.A5F()) {
            i = 1;
        } else if (c38321qM2.A53()) {
            i = 5;
        } else {
            i = 0;
            if (c38321qM2.A0C.CD4() != null) {
                i = 6;
            }
        }
        C84923qg A1V = c38321qM2.A1V();
        if (A1V != null && (str2 = A1V.A0e) != null && (A14 == null || (str4 = AbstractC31174DnI.A0t(context, A14.getUsername(), str2, 2131969510)) == null)) {
            str4 = str2;
        }
        return AbstractC47996LLi.A03(extendedImageUrl, A1q, null, 2, str, str4, null, LEN.A00(len), null, 0, i);
    }
}
