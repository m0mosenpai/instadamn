package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MaN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50722MaN {
    public static final boolean A00(UserSession userSession) {
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        boolean A06 = C18U.A06(A0U, userSession, 36323049523391361L);
        boolean A062 = C18U.A06(A0U, userSession, 36323049523522435L);
        boolean A063 = C18U.A06(A0U, userSession, 36323049523587972L);
        if (!A06 && !A062 && !A063) {
            return false;
        }
        return true;
    }
}
