package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Doa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31252Doa {
    public static final boolean A00(UserSession userSession, String str) {
        User A0k;
        if (C18U.A06(C06090Tz.A05, userSession, 36325209892008835L) && (A0k = AbstractC31174DnI.A0k(userSession, str)) != null && A0k.A26() && A0k.A27()) {
            return true;
        }
        return false;
    }
}
