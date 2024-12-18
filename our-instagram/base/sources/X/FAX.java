package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FAX {
    public static final void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C84923qg c84923qg, String str, String str2) {
        User user;
        ExtendedImageUrl extendedImageUrl;
        AbstractC167027dH.A13(userSession, str, str2);
        if (c84923qg != null && (user = c84923qg.A08) != null) {
            String str3 = c84923qg.A0e;
            C34725FRo A06 = C28531Zo.A04.A02.A06(interfaceC11380iw, userSession, AbstractC111324zv.A00(2966));
            A06.A03(str);
            A06.A04(str2);
            A06.A06(user.getId());
            A06.A02(str2);
            String str4 = c84923qg.A0G;
            C14360o3.A0B(str4, 0);
            Bundle bundle = A06.A01;
            bundle.putString(AbstractC111324zv.A00(614), str4);
            String username = user.getUsername();
            C38321qM c38321qM = c84923qg.A07;
            if (c38321qM != null) {
                extendedImageUrl = c38321qM.A1q(activity);
            } else {
                extendedImageUrl = null;
            }
            bundle.putParcelable(AbstractC111324zv.A00(616), new DirectPendingLayeredXma(extendedImageUrl, new ExtendedImageUrl(user.Bhu()), user, username, str3, false, false));
            bundle.putString(AbstractC111324zv.A00(306), AbstractC111324zv.A00(885));
            C14360o3.A0B(str3, 0);
            bundle.putString(AbstractC111324zv.A00(307), str3);
            A06.A05(str3);
            A06.A01("story_comment_reply");
            C32331EMd A00 = A06.A00();
            C189478aR A002 = AbstractC31177DnL.A0X(userSession, false).A00();
            C14360o3.A0A(A00);
            A002.A02(activity, A00);
        }
    }
}
