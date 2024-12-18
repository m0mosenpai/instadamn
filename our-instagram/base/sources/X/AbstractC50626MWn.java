package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.MWn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50626MWn {
    public static final EnumC1571773w A00(UserSession userSession, FollowStatus followStatus, Integer num, String str) {
        AbstractC167017dG.A1O(userSession, num);
        if (str.equals(userSession.userId)) {
            return EnumC1571773w.A05;
        }
        if (C57582kX.A00(userSession).A0M(followStatus, num, str) == FollowStatus.A05) {
            return EnumC1571773w.A03;
        }
        return EnumC1571773w.A04;
    }
}
