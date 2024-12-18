package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76273bX {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM.A5M() && ((c38321qM.A4y() || (c38321qM.A50() && C36A.A0G(userSession))) && C36A.A0J(userSession, c38321qM.A2E(userSession), c38321qM.A4i()))) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM.A5x() && ((c38321qM.A4y() || (c38321qM.A50() && C36A.A0G(userSession))) && C36A.A0I(userSession, c38321qM.A2E(userSession)))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C38321qM c38321qM) {
        if (!c38321qM.A5R() && !c38321qM.A5P()) {
            return false;
        }
        return true;
    }
}
