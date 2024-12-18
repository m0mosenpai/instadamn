package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5SJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5SJ {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A01(userSession) && !A02(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C08730cb.A00(userSession).A00().A0M() == C05F.A01) {
            if (C7HD.A00(userSession) || AbstractC31269Dor.A00(userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        boolean A02;
        C06090Tz c06090Tz;
        C08730cb c08730cb = C17060sy.A01;
        if (C2E7.A01(c08730cb.A01(userSession))) {
            if (!z) {
                A02 = C18U.A06(C06090Tz.A05, userSession, 36315833978326632L);
            }
            c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36317908448581291L) && C18U.A06(c06090Tz, userSession, 36317908449171123L)) {
                return true;
            }
        }
        A02 = C2E7.A02(c08730cb.A01(userSession));
        if (!A02) {
            return false;
        }
        c06090Tz = C06090Tz.A05;
        return !C18U.A06(c06090Tz, userSession, 36317908448581291L) ? false : false;
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        C08730cb c08730cb = C17060sy.A01;
        if (C2E7.A01(c08730cb.A01(userSession))) {
            if (!z && !C18U.A06(C06090Tz.A05, userSession, 36315833978326632L)) {
                return false;
            }
        } else if (!C2E7.A02(c08730cb.A01(userSession)) || C18U.A06(C06090Tz.A05, userSession, 36317908447991458L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (!AbstractC2051396d.A01(userSession) && !AbstractC2051496e.A01(userSession)) {
            return false;
        }
        return true;
    }
}
