package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.EnumSet;

/* renamed from: X.3bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76443bo {
    public static final Integer A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C76463bq c76463bq = AbstractC76453bp.A00;
        if (c76463bq.A09(c38321qM)) {
            if (c76463bq.A08(c38321qM)) {
                return C05F.A01;
            }
            if (c76463bq.A0A(c38321qM)) {
                return C05F.A0C;
            }
        } else {
            if (C76473br.A00(userSession, c38321qM)) {
                if (C14360o3.A0K(interfaceC60442pS.getModuleName(), "profile")) {
                    return C05F.A1I;
                }
                return C05F.A0Y;
            }
            if (A02(userSession, c38321qM)) {
                UpcomingEvent A2B = c38321qM.A2B(userSession);
                if (A2B != null) {
                    if (A2B.getReminderEnabled()) {
                        return C05F.A1F;
                    }
                    return C05F.A15;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        return C05F.A0j;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B == null || !AbstractC41774Ieq.A0B(A2B)) {
            return false;
        }
        if ((AbstractC41774Ieq.A07(A2B) || AbstractC41774Ieq.A0D(A2B, System.currentTimeMillis())) && !AbstractC41774Ieq.A09(A2B)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.CdW()) {
            EnumSet enumSet = AbstractC75103Za.A00;
            if (!C76253bV.A03(userSession, c38321qM)) {
                return false;
            }
        }
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null && (!AbstractC41774Ieq.A0B(A2B))) {
            if (new C146066i4(userSession).A00(A2B) || (C76253bV.A04(userSession, c38321qM) && C76253bV.A09(c38321qM))) {
                return AbstractC76233bT.A00(userSession, c38321qM);
            }
            return false;
        }
        return false;
    }
}
