package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FgP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35232FgP {
    public static final C35232FgP A00 = new Object();

    public static final boolean A01(UserSession userSession, C79313gc c79313gc) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC79333ge.A00(userSession, c79313gc)) {
            C35232FgP c35232FgP = A00;
            if ((!C85363rR.A02(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36320618577011463L)) {
                return true;
            }
            if (c35232FgP.A06(userSession) && C18U.A06(C06090Tz.A05, userSession, 36320618577142537L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C85363rR.A02(userSession)) {
            if ((A05(userSession) && A04(userSession)) || A00(userSession) == EnumC33396EpT.A07) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final EnumC33396EpT A00(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36602093552210511L);
        for (EnumC33396EpT enumC33396EpT : EnumC33396EpT.values()) {
            if (enumC33396EpT.A00 == A01) {
                return enumC33396EpT;
            }
        }
        return EnumC33396EpT.A05;
    }

    public static final boolean A02(UserSession userSession, boolean z, boolean z2, boolean z3) {
        if (z && !z2 && z3 && (!C85363rR.A02(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36320618577011463L)) {
            return true;
        }
        return false;
    }

    public final boolean A04(UserSession userSession) {
        if ((!C85363rR.A02(userSession)) && !A06(userSession)) {
            if ((!C85363rR.A02(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36320618577011463L)) {
                return false;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36320618575176439L) && !C18U.A06(c06090Tz, userSession, 36320618575241976L)) {
                if ((!C85363rR.A02(userSession)) && (C18U.A06(c06090Tz, userSession, 36320618575176439L) || A00(userSession) == EnumC33396EpT.A03)) {
                    return true;
                }
                if (!(!C85363rR.A02(userSession)) || A00(userSession) != EnumC33396EpT.A05) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession) {
        if (!C85363rR.A02(userSession)) {
            if (C18U.A06(C06090Tz.A05, userSession, 36320618575241976L) || A00(userSession) == EnumC33396EpT.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A06(UserSession userSession) {
        if ((!C85363rR.A02(userSession)) && AbstractC16960so.A1Q(EnumC33396EpT.A06, EnumC33396EpT.A08, EnumC33396EpT.A07).contains(A00(userSession))) {
            return true;
        }
        return false;
    }
}
