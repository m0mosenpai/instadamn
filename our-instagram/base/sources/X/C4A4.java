package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4A4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4A4 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Object CES = A00.A0L.CES(A00, C23031Ai.A8c[139]);
        if (!C08730cb.A00(userSession).A00().A1L() && !"eligible".equals(CES) && !"at_risk_of_becoming_ineligible".equals(CES)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A03(userSession, 36312982120105545L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316104562315250L) && C18U.A06(c06090Tz, userSession, 36316104562577398L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, long j) {
        C229419w A02 = C18U.A02(userSession, j);
        if (A02 != null && A02.AhE(C06090Tz.A04, j)) {
            return true;
        }
        return false;
    }
}
