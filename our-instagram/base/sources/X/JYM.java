package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;

/* loaded from: classes8.dex */
public abstract class JYM {
    public static final C43777JXq A00(UserSession userSession, EnumC132075xi enumC132075xi) {
        C14360o3.A0B(userSession, 0);
        MutedWordsFilterManager A00 = AbstractC2042992d.A00(userSession);
        if (A00 != null) {
            return (C43777JXq) userSession.A01(C43777JXq.class, new ME4(23, enumC132075xi, userSession, A00));
        }
        return null;
    }
}
