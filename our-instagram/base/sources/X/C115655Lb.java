package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.5Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115655Lb {
    public final UserSession A00;

    public final boolean A01(C38321qM c38321qM) {
        UpcomingEvent A2B;
        UpcomingEvent A2B2;
        UserSession userSession = this.A00;
        if ((c38321qM.A6a(userSession) && C76253bV.A08(c38321qM) && C76253bV.A02(userSession, c38321qM) && (A2B2 = c38321qM.A2B(userSession)) != null && AbstractC41774Ieq.A03(A2B2) == C05F.A00 && C76253bV.A09(c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36327524879317649L)) || (((A2B = c38321qM.A2B(userSession)) != null && AbstractC41774Ieq.A0C(A2B) && C76253bV.A08(c38321qM) && C76253bV.A02(userSession, c38321qM) && C76253bV.A09(c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36327524880104084L)) || A00(userSession, c38321qM))) {
            return true;
        }
        return false;
    }

    public C115655Lb(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean A00(UserSession userSession, C38321qM c38321qM) {
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B == null || !AbstractC41774Ieq.A0C(A2B) || !C76253bV.A08(c38321qM) || !C76253bV.A02(userSession, c38321qM) || !C76253bV.A09(c38321qM)) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327524879383186L);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (!A06) {
            return false;
        }
        return true;
    }
}
