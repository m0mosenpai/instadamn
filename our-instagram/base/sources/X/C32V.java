package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32V, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C32V {
    public static final String A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319742399159938L) && C18U.A06(c06090Tz, userSession, 36319742399225475L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            return (String) A00.A06.CES(A00, C23031Ai.A8c[369]);
        }
        return null;
    }

    public static final boolean A07(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C06090Tz c06090Tz;
        long j;
        if (!z) {
            if (!z2 || !A01(userSession) || !z3) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36319742399618695L;
        } else {
            if (!A01(userSession)) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36319742399094401L;
        }
        if (!C18U.A06(c06090Tz, userSession, j)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        Object obj;
        if (C18U.A06(C06090Tz.A05, userSession, 36319742399225475L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            obj = A00.A06.CES(A00, C23031Ai.A8c[369]);
        } else {
            obj = null;
        }
        if (!C14360o3.A0K(obj, C3YY.ACTIVE.toString()) && !C14360o3.A0K(obj, C3YY.DOGFOODING.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319742398832253L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319742398897790L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        if (A01(userSession) && z && C18U.A06(C06090Tz.A05, userSession, 36319742398701179L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, boolean z) {
        if (A01(userSession) && z && C18U.A06(C06090Tz.A05, userSession, 36319742398766716L)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        if (A01(userSession) && z && C18U.A06(C06090Tz.A05, userSession, 36319742398570105L)) {
            return true;
        }
        return false;
    }
}
