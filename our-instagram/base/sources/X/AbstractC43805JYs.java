package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JYs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43805JYs {
    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC47132Ef.A00(userSession).A03() && C18U.A06(C06090Tz.A05, userSession, 36316486813553064L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC47132Ef.A00(userSession).A03() && AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36316486813356455L)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(UserSession userSession) {
        if (A03(userSession) && new C131305wJ(userSession).A03.A01(112)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        if (A03(userSession) && new C131305wJ(userSession).A03.A01(113)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        if (A04(userSession) && new C131305wJ(userSession).A03.A01(111)) {
            return true;
        }
        return false;
    }
}
