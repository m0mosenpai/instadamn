package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public abstract class LHo {
    public static final LE7 A00 = new LE7(C47893LDn.A00);

    public static final boolean A00(UserSession userSession, User user) {
        C166217bp A01;
        C28151Xt c28151Xt = C28151Xt.A02;
        if (!AbstractC167007dF.A1W(c28151Xt) || c28151Xt == null || (A01 = c28151Xt.A01(userSession)) == null || !A01.A00 || A01.A02.contains(user.getId())) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, User user) {
        C166217bp A01;
        C28151Xt c28151Xt = C28151Xt.A02;
        if (!AbstractC167007dF.A1W(c28151Xt) || c28151Xt == null || (A01 = c28151Xt.A01(userSession)) == null || !A01.A00 || !A01.A02.contains(user.getId())) {
            return false;
        }
        return true;
    }
}
