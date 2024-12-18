package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.FCf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34337FCf {
    public static void A00(UserSession userSession, User user, boolean z) {
        user.A0v(z);
        AbstractC25651Mw.A00(userSession).E4s(new C42281xI(user));
        AbstractC129875tr.A00(userSession).A0D(FollowStatus.A06, user, true);
        user.A0c(userSession);
        if (z) {
            AbstractC65792TuA.A00(userSession).A00(user);
            C57582kX.A00(userSession).A0P(user);
        }
    }
}
