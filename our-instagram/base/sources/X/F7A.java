package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F7A {
    public static final boolean A00(UserSession userSession) {
        Boolean CVn;
        Boolean CZ8;
        User A10 = AbstractC166987dD.A10(userSession);
        if (!A10.A2E() && (((CVn = A10.A03.CVn()) == null || !CVn.booleanValue()) && ((CZ8 = A10.A03.CZ8()) == null || !CZ8.booleanValue()))) {
            return false;
        }
        return true;
    }
}
