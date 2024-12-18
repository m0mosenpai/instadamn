package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.KmL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46764KmL {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        IGAIAgentType iGAIAgentType;
        IGAIAgentType iGAIAgentType2;
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 1);
        if (c2ec.CYg()) {
            c06090Tz = C06090Tz.A05;
            j = 36325669454165244L;
        } else {
            User Ba5 = c2ec.Ba5();
            if (Ba5 != null) {
                iGAIAgentType = Ba5.A03.Aah();
            } else {
                iGAIAgentType = null;
            }
            if (iGAIAgentType == IGAIAgentType.A05) {
                c06090Tz = C06090Tz.A05;
                j = 36325669454230781L;
            } else {
                User Ba52 = c2ec.Ba5();
                if (Ba52 != null) {
                    iGAIAgentType2 = Ba52.A03.Aah();
                } else {
                    iGAIAgentType2 = null;
                }
                if (iGAIAgentType2 != IGAIAgentType.A08) {
                    return true;
                }
                c06090Tz = C06090Tz.A05;
                j = 36325669454296318L;
            }
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
