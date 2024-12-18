package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.62f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1337462f {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C08730cb.A00(userSession).A00().A0I() != EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession, 36316392324075874L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36317139649237822L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A01(C08730cb.A00(userSession).A00()) && !C18U.A06(C06090Tz.A05, userSession, 2342160148862473016L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A01(C08730cb.A00(userSession).A00()) && C18U.A06(C06090Tz.A05, userSession, 36317139648844601L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C2E7.A02(C08730cb.A00(userSession).A00()) && C18U.A06(C06090Tz.A05, userSession, 36317139649303359L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        if (C17060sy.A01.A01(userSession).A0I() == EnumC222416a.A05) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36315198323166316L) || (C18U.A06(c06090Tz, userSession, 36315198323297389L) && !C18U.A06(c06090Tz, userSession, 36315198323362926L))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A0C(userSession, true) || !C18U.A06(C06090Tz.A05, userSession, 36317139648713527L)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A0C(userSession, true) || !C18U.A06(C06090Tz.A05, userSession, 36317139648910138L)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC47132Ef.A00(userSession).A03() && C18U.A06(C06090Tz.A05, userSession, 36313209753306948L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (C2E7.A01(C08730cb.A00(userSession).A00())) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36317139649041212L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0C(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (C2E7.A01(C08730cb.A00(userSession).A00())) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36317139648582453L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        C08730cb c08730cb = C17060sy.A01;
        if ((C2E7.A01(c08730cb.A01(userSession)) || C2E7.A00(c08730cb.A01(userSession))) && !A0C(userSession, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (C2E7.A01(C17060sy.A01.A01(userSession))) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36317139648975675L)) {
                return true;
            }
        }
        return false;
    }
}
