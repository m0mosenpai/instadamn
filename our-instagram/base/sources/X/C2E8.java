package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2E8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2E8 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C2E7.A00(C08730cb.A00(userSession).A00())) {
            return false;
        }
        boolean A03 = AbstractC47132Ef.A00(userSession).A03();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A03) {
            if (!C18U.A06(c06090Tz, userSession, 36315365826890917L) || !C18U.A06(c06090Tz, userSession, 36315365827742889L)) {
                return false;
            }
            return true;
        }
        return C18U.A06(c06090Tz, userSession, 36315365826890917L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A00(C08730cb.A00(userSession).A00()) && C18U.A06(C06090Tz.A05, userSession, 36325935741482515L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A02(userSession) && C18U.A06(C06090Tz.A05, userSession, 36325935741613588L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A02(C08730cb.A00(userSession).A00()) && C18U.A06(C06090Tz.A05, userSession, 36317908449760954L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E9.A0A(userSession) || ((C08730cb.A00(userSession).A00().CQw() || C2E7.A01(C08730cb.A00(userSession).A00())) && AbstractC31235DoI.A01(userSession))) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C08730cb.A00(userSession).A00().CQw() && !C2E7.A01(C08730cb.A00(userSession).A00()) && ((!C2E7.A00(C08730cb.A00(userSession).A00()) || !C18U.A06(C06090Tz.A05, userSession, 36316881950347981L)) && !C2E9.A09(userSession))) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C2E7.A01(C08730cb.A00(userSession).A00()) && !C2E7.A00(C08730cb.A00(userSession).A00()) && !C2E9.A09(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C4K3.A01(userSession) || (C2E7.A01(C08730cb.A00(userSession).A00()) && AbstractC23021Ah.A00(userSession).A1t() && C18U.A06(C06090Tz.A05, userSession, 36316813231133345L));
    }

    public static final boolean A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C2E7.A03(C08730cb.A00(userSession).A00()) && !C2E9.A0A(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (!A07(userSession)) {
            return false;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316671496950370L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A0B(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A02(C08730cb.A00(userSession).A00())) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317908447532699L)) {
                if (!C18U.A06(c06090Tz, userSession, 36317908449760954L)) {
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        if (C2E7.A01(C08730cb.A00(userSession).A00())) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36316813231133345L) && C18U.A06(c06090Tz, userSession, 36319050908834717L)) {
                return true;
            }
        }
        return false;
    }
}
