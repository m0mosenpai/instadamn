package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class F0C {
    public static void A00(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        AbstractC167027dH.A0a(1, user, userSession, fragmentActivity, str);
        String id = user.getId();
        C14360o3.A0B(userSession, 1);
        C31368DqX.A02(AbstractC31173DnH.A0P(fragmentActivity, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession, id, "user_list", str));
    }
}
