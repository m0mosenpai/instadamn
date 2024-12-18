package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.41m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC905141m {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, EnumC40111tc enumC40111tc) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 2);
        if (enumC40111tc != EnumC40111tc.A0a) {
            if ((c38321qM.A4y() || (c38321qM.A50() && C36A.A0G(userSession))) && C36A.A0J(userSession, c38321qM.A0C.CDj(), c38321qM.A4i())) {
                return true;
            }
            return false;
        }
        return true;
    }
}
