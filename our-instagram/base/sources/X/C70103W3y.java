package X;

import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.W3y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70103W3y {
    public static final C70103W3y A00 = new Object();

    public final boolean A00(PromoteData promoteData) {
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36319600664649270L)) {
            if (promoteData.A2F || !C18U.A06(c06090Tz, userSession, 36319201232690210L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
