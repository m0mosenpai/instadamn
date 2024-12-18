package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;

/* renamed from: X.Dow, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31274Dow {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(userSession, 1);
        if (c2ec != null) {
            SmartSuggestion Bxt = c2ec.Bxt();
            if (!c2ec.CVQ() && !c2ec.CX1()) {
                Integer num = C05F.A0Y;
                if (Bxt != null && num == Bxt.A03 && C4K3.A01(userSession) && C18U.A06(C06090Tz.A06, userSession, 36314867610749816L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(userSession, 1);
        if (c2ec != null) {
            SmartSuggestion Bxt = c2ec.Bxt();
            if (!c2ec.CVQ() && !c2ec.CX1()) {
                Integer num = C05F.A0Y;
                if (Bxt != null && num == Bxt.A03) {
                    if (C4K3.A01(userSession) || C18U.A06(C06090Tz.A05, userSession, 36316813231133345L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
