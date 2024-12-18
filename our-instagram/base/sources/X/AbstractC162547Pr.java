package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162547Pr {
    public static final boolean A00(UserSession userSession, C160787Im c160787Im) {
        String str;
        User user = c160787Im.A0K;
        IGAIAgentType iGAIAgentType = null;
        if (user != null) {
            str = user.A03.Aaj();
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, userSession.userId)) {
            User user2 = c160787Im.A0K;
            if (user2 != null) {
                iGAIAgentType = user2.A03.Aah();
            }
            if (iGAIAgentType == IGAIAgentType.A04 && c160787Im.A0G.A08 != 1013) {
                return true;
            }
        }
        return false;
    }
}
