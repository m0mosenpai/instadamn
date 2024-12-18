package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* renamed from: X.NyV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54250NyV {
    public static final boolean A00(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        User user = c41181vS.A0i;
        if ((c41181vS.A0b != null || c41181vS.A18()) && user != null && ((AbstractC31174DnI.A1Y(user, userSession.userId) || user.A0M() == C05F.A01) && c41551w4.A0H.A0P != ReelType.A0c)) {
            return true;
        }
        return false;
    }
}
