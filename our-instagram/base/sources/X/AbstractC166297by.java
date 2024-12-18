package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166297by {
    public static final boolean A02(C38321qM c38321qM) {
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            return C14360o3.A0K(clipsMetadata.Cd0(), true);
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        String str;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        return C14360o3.A0K(str, userSession.userId);
    }

    public static final boolean A01(C38321qM c38321qM) {
        if (c38321qM.A0u() <= 0 && c38321qM.A0v() <= 0) {
            return false;
        }
        return true;
    }
}
