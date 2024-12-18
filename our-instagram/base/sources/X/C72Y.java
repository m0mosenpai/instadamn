package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.72Y, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72Y {
    public static final C5QE A00(UserSession userSession, User user) {
        int i;
        if (C14360o3.A0K(userSession.userId, user.getId())) {
            FanClubInfoDict B4O = user.A03.B4O();
            if (B4O != null && B4O.getFanClubId() != null) {
                return new BHS(new Object[0], 2131962192);
            }
        } else {
            switch (user.A02.ordinal()) {
                case 3:
                    i = 2131962187;
                    break;
                case 4:
                    i = 2131962189;
                    break;
                case 5:
                    i = 2131962188;
                    break;
            }
            return new BHS(new Object[0], i);
        }
        return MVZ.A00("");
    }

    public static final boolean A01(UserSession userSession, User user) {
        if (C14360o3.A0K(userSession.userId, user.getId())) {
            FanClubInfoDict B4O = user.A03.B4O();
            if (B4O != null && B4O.getFanClubId() != null) {
                return true;
            }
        } else {
            switch (user.A02.ordinal()) {
                case 3:
                case 4:
                case 5:
                    if (AbstractC63292u7.A03(userSession)) {
                        return true;
                    }
                default:
                    return false;
            }
        }
        return false;
    }
}
