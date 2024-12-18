package X;

import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.3bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76253bV {
    public static final C76253bV A00 = new Object();

    public static final boolean A00(C120985dq c120985dq, UserSession userSession) {
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c120985dq, 1);
        if (!c120985dq.CdW() || (c38321qM = c120985dq.A02) == null || !A03(userSession, c38321qM)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C38321qM c38321qM) {
        String BFc;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected == null || (BFc = injected.BFc()) == null || !(!AbstractC001900j.A0T(BFc))) {
            return false;
        }
        return true;
    }

    public static final boolean A09(C38321qM c38321qM) {
        C38321qM A1e;
        if ((!c38321qM.A3Y().isEmpty()) || (c38321qM.A5M() && (A1e = c38321qM.A1e(0)) != null && (!A1e.A3Y().isEmpty()))) {
            return true;
        }
        return false;
    }

    public final String A0A(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb injected;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        if (!A06(c38321qM) || !C18U.A06(C06090Tz.A05, userSession, 36328388167876083L) || (injected = c38321qM.A0C.getInjected()) == null) {
            return null;
        }
        return injected.BFc();
    }

    public static final boolean A07(C38321qM c38321qM) {
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CRm(), true);
        }
        return false;
    }

    public static final boolean A08(C38321qM c38321qM) {
        boolean z;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            z = C14360o3.A0K(injected.CW5(), true);
        } else {
            z = false;
        }
        return !z;
    }

    private final boolean A01(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW() && c38321qM.A6a(userSession)) {
            if (c38321qM.A0C.BUm() == MomentAdsTypeEnum.A09 && C18U.A06(C06090Tz.A05, userSession, 36323590689598868L)) {
                return true;
            }
            if (c38321qM.A0C.BUm() == MomentAdsTypeEnum.A0A && !A09(c38321qM)) {
                if (!A07(c38321qM) || A05(userSession, c38321qM)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW() && c38321qM.A0C.BUm() != MomentAdsTypeEnum.A07 && !A00.A01(userSession, c38321qM) && c38321qM.A2B(userSession) != null) {
            if (!A07(c38321qM) || A05(userSession, c38321qM)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW() && ((c38321qM.A0C.BUm() == MomentAdsTypeEnum.A07 || A00.A01(userSession, c38321qM)) && c38321qM.A6a(userSession))) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM) {
        if (!A03(userSession, c38321qM) && !A02(userSession, c38321qM)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        long j;
        if (!A07(c38321qM)) {
            return false;
        }
        boolean A08 = A08(c38321qM);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A08) {
            j = 2342169331502495558L;
        } else {
            j = 2342169331502430021L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
