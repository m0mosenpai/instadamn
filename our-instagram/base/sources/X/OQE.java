package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public abstract class OQE {
    public static final boolean A00(UserSession userSession, User user) {
        AbstractC167017dG.A1N(user, userSession);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        if (!A01(userSession, user) && !AbstractC43594JPz.A1Z(A0Y, user)) {
            if (user.A03.AkJ() != null) {
                Boolean AkJ = user.A03.AkJ();
                if (AkJ == null || !AkJ.booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean CeC;
        AbstractC167017dG.A1N(user, userSession);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        if (user.A03.CeC() == null || (CeC = user.A03.CeC()) == null || CeC.booleanValue() || AbstractC43594JPz.A1Z(A0Y, user)) {
            if (A0Y.A0M() == C05F.A0C && !user.A27() && !AbstractC43594JPz.A1Z(A0Y, user)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
