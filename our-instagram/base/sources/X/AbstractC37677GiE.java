package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GiE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37677GiE {
    public static final boolean A00(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession) {
        C14360o3.A0B(c37644Ghd, 0);
        C14360o3.A0B(userSession, 2);
        C38321qM c38321qM = c120985dq.A02;
        if (c37644Ghd.A0D == EnumC75193Zm.A0F) {
            if (c38321qM != null && C3YS.A00(userSession).A05(c38321qM)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
