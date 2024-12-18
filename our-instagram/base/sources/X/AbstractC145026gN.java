package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC145026gN {
    public static boolean A00(UserSession userSession, C3G2 c3g2) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324673022407016L) || ((c3g2 == C3G2.A1Y || c3g2 == C3G2.A16) && C18U.A06(c06090Tz, userSession, 36324673021686112L))) {
            return true;
        }
        return false;
    }

    public static boolean A01(UserSession userSession, C3G2 c3g2) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36310375074955302L)) {
            return false;
        }
        if (c3g2 == C3G2.A1L) {
            return C18U.A06(c06090Tz, userSession, 36310375074889765L);
        }
        return true;
    }
}
