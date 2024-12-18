package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F15 {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        if (A2E == null) {
            return false;
        }
        if (C2TN.A04(userSession, A2E)) {
            return true;
        }
        if (A2E.A0M() == C05F.A0C || A2E.A24()) {
            return false;
        }
        return true;
    }
}
