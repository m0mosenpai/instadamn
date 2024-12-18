package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1XT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XT {
    public static final int A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        int min = Math.min((int) C18U.A01(c06090Tz, userSession, 36592571606696567L), (int) C18U.A01(c06090Tz, userSession, 36599069891628449L));
        if (min <= 0) {
            return 4;
        }
        return min;
    }

    public static final long A01(UserSession userSession) {
        return C18U.A01(C06090Tz.A05, userSession, 36592571606565494L);
    }

    public static final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328418232843780L)) {
            if (!C18U.A06(c06090Tz, userSession, 36328418233171463L) || AbstractC23021Ah.A00(userSession).A01.getBoolean("is_ifr_eligible", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328418232516098L)) {
            if (!C18U.A06(c06090Tz, userSession, 36328418233171463L) || AbstractC23021Ah.A00(userSession).A01.getBoolean("is_ifr_eligible", true)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
