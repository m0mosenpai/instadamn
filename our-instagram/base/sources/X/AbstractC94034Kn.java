package X;

import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94034Kn {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C41871wb A00 = AbstractC41851wZ.A00(userSession);
        if (!C023409i.A0A.A09(userSession)) {
            if (A00.A05(AccountSession.class) && !AbstractC453326q.A04(userSession)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
