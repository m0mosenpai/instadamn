package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.96d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2051396d {
    public static final int A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (int) C18U.A01(C06090Tz.A05, userSession, 36596089184848184L);
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        FanClubInfoDict B4O = C08730cb.A00(userSession).A00().A03.B4O();
        if (B4O != null && B4O.getFanClubId() != null && C18U.A06(C06090Tz.A05, userSession, 36314614207613680L)) {
            return true;
        }
        return false;
    }
}
