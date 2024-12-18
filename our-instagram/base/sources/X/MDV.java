package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDV extends C03E implements InterfaceC16620sF {
    public static final MDV A00 = new MDV();

    public MDV() {
        super(2, AbstractC46455KhF.class, "generateClipsShare", "generateClipsShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectClipsShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        LEN len = (LEN) obj;
        C1575375n c1575375n = (C1575375n) obj2;
        AbstractC167017dG.A1N(len, c1575375n);
        Context context = (Context) len.A00.invoke();
        C38321qM c38321qM = c1575375n.A01;
        C14360o3.A07(c38321qM);
        User A14 = AbstractC25226BEj.A14(c38321qM);
        String str = null;
        if (A14 != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(A14);
            str = A14.getUsername();
        } else {
            extendedImageUrl = null;
        }
        return AbstractC47996LLi.A02(EnumC910243u.SINGLE, extendedImageUrl, c38321qM.A1q(context), null, false, false, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, LEN.A00(len), null, null, null, null, 4, 8, 0, !TextUtils.isEmpty(c1575375n.A03));
    }
}
