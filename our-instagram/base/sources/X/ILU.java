package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class ILU {
    public final UserSession A00;
    public final C37502GfK A01;

    public final AbstractC40989IDk A00(C38321qM c38321qM) {
        UpcomingEvent CD4;
        UserSession userSession = this.A00;
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            UpcomingEvent A2B2 = c38321qM.A2B(userSession);
            if (A2B2 != null && C76253bV.A04(userSession, c38321qM) && C76253bV.A09(c38321qM) && (!new C146066i4(userSession).A00(A2B2) || (((CD4 = c38321qM.A0C.CD4()) != null && CD4.getReminderEnabled()) || A2B2.getReminderEnabled()))) {
                return new AbstractC40989IDk(this.A01);
            }
            if (!A2B.getReminderEnabled()) {
                return new AbstractC40989IDk(this.A01);
            }
        }
        return new AbstractC40989IDk(this.A01);
    }

    public ILU(UserSession userSession, C37502GfK c37502GfK) {
        this.A00 = userSession;
        this.A01 = c37502GfK;
    }
}
