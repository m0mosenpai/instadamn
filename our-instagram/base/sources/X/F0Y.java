package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F0Y {
    public static final boolean A00(UserSession userSession) {
        User A00;
        Boolean BBV;
        User A002 = AbstractC08690cX.A00(userSession);
        if (A002 != null && A002.A2I() && (A00 = AbstractC08690cX.A00(userSession)) != null && (BBV = A00.A03.BBV()) != null && BBV.booleanValue()) {
            return true;
        }
        return false;
    }
}
