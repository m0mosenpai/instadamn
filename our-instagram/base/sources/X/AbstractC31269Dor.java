package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dor, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31269Dor {
    public static final boolean A00(UserSession userSession) {
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC31178DnM.A0T(userSession));
        if (A0M != null && A0M.getFanClubId() != null && C18U.A06(C06090Tz.A05, userSession, 36316525468324330L)) {
            return true;
        }
        return false;
    }
}
