package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151366re {
    public static final C151366re A00 = new Object();

    public static final String A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C98J.A00(userSession).booleanValue()) {
            String A04 = C18U.A04(C06090Tz.A05, userSession, 36881807589179807L);
            if (A04.length() != 0) {
                return A04;
            }
        }
        return "Threads";
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C98J.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36318857636616781L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C98J.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36318857637927520L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        return "6875945d398f9fd6e332c3950d576e7b".equals(C18U.A04(C06090Tz.A05, userSession, 36881807591080355L));
    }

    public static final boolean A02(UserSession userSession) {
        if (!C98J.A00(userSession).booleanValue()) {
            return false;
        }
        if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("barcelona_has_seen_golden_ticket", false) && !C18U.A06(C06090Tz.A05, userSession, 36318857635568195L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        if (C98J.A00(userSession).booleanValue()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318857636092486L) && !C18U.A06(c06090Tz, userSession, 36327700973042470L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        if (A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36318857637337688L)) {
            return true;
        }
        return false;
    }
}
