package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;

/* renamed from: X.92d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2042992d {
    public static final MutedWordsFilterManager A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C36741nX.A00 != null) {
            return (MutedWordsFilterManager) userSession.A01(MutedWordsFilterManager.class, new C9E1(userSession, 36));
        }
        return null;
    }
}
