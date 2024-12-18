package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3eJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77913eJ {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, String str) {
        String BNu;
        C14360o3.A0B(c38321qM, 1);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null && (BNu = A2E.A03.BNu()) != null && BNu.length() != 0) {
            if ("topical_explore".equals(str) || "contextual_feed".equals(str) || "main_feed".equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
