package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDS extends C03E implements InterfaceC16620sF {
    public static final MDS A00 = new MDS();

    public MDS() {
        super(2, AbstractC46455KhF.class, "generateLiveViewerInvite", "generateLiveViewerInvite(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectLiveViewerInvite;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        String str;
        ImageUrl A02;
        LEN len = (LEN) obj;
        IKN ikn = (IKN) obj2;
        AbstractC167017dG.A1N(len, ikn);
        C105824pt c105824pt = ikn.A01;
        if (c105824pt != null) {
            user = c105824pt.A03();
        } else {
            user = ikn.A02;
        }
        ExtendedImageUrl extendedImageUrl2 = null;
        if (user != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        C105824pt c105824pt2 = ikn.A01;
        if (c105824pt2 != null && (A02 = c105824pt2.A02()) != null) {
            extendedImageUrl2 = new ExtendedImageUrl(A02);
        }
        return AbstractC47996LLi.A04(extendedImageUrl, extendedImageUrl2, null, str, null, null, LEN.A00(len), 4, 7);
    }
}
