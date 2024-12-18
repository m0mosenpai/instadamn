package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.user.model.User;

/* renamed from: X.7Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162767Qn {
    public static final String A00(C160787Im c160787Im) {
        IGAIAgentType iGAIAgentType;
        User user;
        User user2 = c160787Im.A0K;
        if (user2 == null || user2.A03.Aah() == null) {
            return null;
        }
        User user3 = c160787Im.A0K;
        if (user3 != null) {
            iGAIAgentType = user3.A03.Aah();
        } else {
            iGAIAgentType = null;
        }
        if (iGAIAgentType == IGAIAgentType.A07 || (user = c160787Im.A0K) == null) {
            return null;
        }
        return AbstractC76433bn.A00(user);
    }
}
