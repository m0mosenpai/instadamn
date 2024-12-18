package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4K3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4K3 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A02(userSession, C08730cb.A00(userSession).A00());
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        User A00 = C08730cb.A00(userSession).A00();
        if (A00.CQw() || (A00.A0I() == EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession, 36319699448962648L))) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, User user) {
        return user.CQw() || (user.A0I() == EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession, 36319699448897111L));
    }
}
