package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.Mep, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50920Mep extends AbstractC52922bZ {
    public final C38321qM A00;
    public final UpcomingEventReminderRepository A01;
    public final UpcomingEvent A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final UserSession A05;

    public C50920Mep(UserSession userSession, C38321qM c38321qM, UpcomingEventReminderRepository upcomingEventReminderRepository, UpcomingEvent upcomingEvent) {
        C51736MtJ c51736MtJ;
        ImageUrl Bhu;
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A02 = upcomingEvent;
        this.A00 = c38321qM;
        this.A01 = upcomingEventReminderRepository;
        if (upcomingEvent != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324217754628076L);
            Integer num = C05F.A01;
            boolean reminderEnabled = upcomingEvent.getReminderEnabled();
            User Bah = upcomingEvent.Bah();
            if (Bah != null || (c38321qM != null && (Bah = AbstractC25226BEj.A14(c38321qM)) != null)) {
                Bhu = Bah.Bhu();
            } else {
                Bhu = null;
            }
            c51736MtJ = new C51736MtJ(Bhu, num, upcomingEvent.getTitle(), C16930sl.A00, upcomingEvent.getStartTime(), reminderEnabled, A06);
        } else {
            c51736MtJ = new C51736MtJ(null, C05F.A00, "", C16930sl.A00, 0L, false, false);
        }
        C008002u A00 = C10E.A00(c51736MtJ);
        this.A04 = A00;
        this.A03 = AbstractC208910l.A02(A00);
    }
}
