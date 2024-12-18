package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I67 {
    public static final void A00(UserSession userSession, JHL jhl, IFE ife, C39350HZp c39350HZp) {
        C14360o3.A0B(ife, 1);
        User A2E = c39350HZp.A00.A2E(userSession);
        if (A2E != null) {
            I69.A00(ViewOnClickListenerC38053Gog.A02(jhl, c39350HZp, 0), ViewOnClickListenerC38053Gog.A02(jhl, c39350HZp, 1), ife, A2E.getUsername(), 2131965091);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
