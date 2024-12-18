package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76783cQ {
    public static final boolean A01(UserSession userSession) {
        return C08730cb.A00(userSession).A00().A0M() == C05F.A01 && !C08730cb.A00(userSession).A00().A2I();
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM) {
        User A2E;
        if (c38321qM.A0C.AaN() == null && !c38321qM.A5U() && c38321qM.A1x() != EnumC76383bi.A0C) {
            if ((C14360o3.A0K(C17060sy.A01.A01(userSession), c38321qM.A2E(userSession)) && (A2E = c38321qM.A2E(userSession)) != null && A2E.A1J()) || A03(userSession, c38321qM)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM, Integer num, boolean z) {
        C06090Tz c06090Tz;
        long j;
        User A2E;
        C14360o3.A0B(userSession, 0);
        if ((!C14360o3.A0K(C08730cb.A00(userSession).A00(), c38321qM.A2E(userSession)) || (A2E = c38321qM.A2E(userSession)) == null || !A2E.A1M()) && !c38321qM.A4V() && !C14360o3.A0K(c38321qM.A0C.Aoo(), true) && !A03(userSession, c38321qM)) {
            if (!A01(userSession) || !C14360o3.A0K(C08730cb.A00(userSession).A00(), c38321qM.A2E(userSession))) {
                return false;
            }
            if (num != C05F.A0C && num != C05F.A01 && num != C05F.A0Y && (!A01(userSession) || !C18U.A06(C06090Tz.A06, userSession, 36321756738692916L))) {
                return false;
            }
            if (c38321qM.A6F()) {
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                j = 36321756738430769L;
            } else if (c38321qM.A5g()) {
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                j = 36321756738234158L;
            } else if (c38321qM.A5P()) {
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                j = 36321756738365232L;
            } else {
                if (!c38321qM.A5d() && !c38321qM.A5x() && !c38321qM.A5F()) {
                    return false;
                }
                if (z) {
                    c06090Tz = C06090Tz.A05;
                } else {
                    c06090Tz = C06090Tz.A06;
                }
                j = 36321756738299695L;
            }
            if (!C18U.A06(c06090Tz, userSession, j)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A00(C120985dq c120985dq) {
        C40031tU c40031tU;
        String str;
        String str2;
        boolean z;
        C38321qM c38321qM = c120985dq.A02;
        String str3 = null;
        if (c38321qM != null) {
            c40031tU = c38321qM.A0c;
            str = c40031tU.A07;
            str2 = c40031tU.A01;
            str3 = c40031tU.A06;
        } else {
            c40031tU = null;
            str = null;
            str2 = null;
        }
        if (c40031tU != null) {
            z = c40031tU.A09;
        } else {
            z = false;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || C14360o3.A0K(str3, "EXPIRED") || !z) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36330226413814517L) && !C18U.A06(c06090Tz, userSession, 36320747420918640L)) {
            if (A01(userSession) && C18U.A06(c06090Tz, userSession, 36321756738692916L) && C18U.A06(C06090Tz.A05, userSession, 36321756738496306L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        C08730cb c08730cb = C17060sy.A01;
        if (C14360o3.A0K(c08730cb.A01(userSession), c38321qM.A2E(userSession)) && c38321qM.A2D() != null && !c38321qM.A63() && !c08730cb.A01(userSession).A2H()) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM, AnonymousClass341 anonymousClass341, Integer num, boolean z) {
        if (anonymousClass341 == AnonymousClass341.A0O || ((!A04(userSession, c38321qM) && !A06(userSession, c38321qM, num, z)) || ((c38321qM.CdW() && !c38321qM.A5K()) || c38321qM.A0C.Ar6() != null || c38321qM.A0C.BAo() != null))) {
            return false;
        }
        return true;
    }
}
