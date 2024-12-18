package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class WG1 {
    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A06, userSession, 36323066703326103L) && C18U.A06(C06090Tz.A05, userSession, 36323066703391640L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        int A01 = A01(userSession);
        if (A01 != 1 && A01 != 2 && !C18U.A06(C06090Tz.A05, userSession, 36319858362818263L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        int A00;
        C14360o3.A0B(userSession, 0);
        int A01 = A01(userSession);
        if (A01 == 1 || A01 == 2 || (A00 = A00(userSession)) == 4 || A00 == 5) {
            return true;
        }
        return false;
    }

    public static final int A00(UserSession userSession) {
        return (int) C18U.A01(C06090Tz.A05, userSession, 36601333339394204L);
    }

    public static final int A01(UserSession userSession) {
        return (int) C18U.A01(C06090Tz.A05, userSession, 36601333339590813L);
    }

    public static final boolean A04(UserSession userSession) {
        int A01 = A01(userSession);
        if (A01 != 1 && A01 != 2 && !C18U.A06(C06090Tz.A05, userSession, 36319858362752726L)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328212074151250L);
    }
}
