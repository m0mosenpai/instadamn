package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.2u7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC63292u7 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC63302u8.A00(userSession).A04(UserMonetizationProductType.A0C);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36323912811818684L);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36312960645465665L);
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        FanClubInfoDict B4O = C08730cb.A00(userSession).A00().A03.B4O();
        if (B4O != null && B4O.getFanClubId() != null && C18U.A06(C06090Tz.A06, userSession, 36315872633097884L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36323925696720577L) && !AbstractC55222Oeo.A01(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323925696720577L)) {
            if (AbstractC55222Oeo.A05(userSession) && C18U.A06(c06090Tz, userSession, 36325678043706632L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        FanClubInfoDict B4O = C08730cb.A00(userSession).A00().A03.B4O();
        if (B4O != null && B4O.getFanClubId() != null && C18U.A06(C06090Tz.A05, userSession, 36315872633097884L)) {
            return true;
        }
        return false;
    }
}
