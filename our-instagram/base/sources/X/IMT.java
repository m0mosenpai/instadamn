package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class IMT {
    public final FragmentActivity A00;
    public final C57312k6 A01;
    public final UserSession A02;
    public final C146076i5 A03;
    public final UpcomingEventReminderRepository A04;
    public final C146066i4 A05;
    public final InterfaceC09390do A06 = C1XM.A00(new C43204J8b(this, 8));
    public final InterfaceC60442pS A07;
    public final String A08;

    public IMT(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A07 = interfaceC60442pS;
        this.A08 = str;
        this.A01 = C07Y.A00(fragmentActivity);
        this.A04 = new UpcomingEventReminderRepository(userSession, interfaceC60442pS, null);
        this.A03 = new C146076i5(interfaceC60442pS, userSession, null);
        this.A05 = new C146066i4(userSession);
    }

    public final void A00(UpcomingEvent upcomingEvent, String str) {
        AbstractC22762A2g.A00();
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        String str2 = this.A08;
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        new IN2(fragmentActivity, userSession, interfaceC60442pS, null, str2).A01(upcomingEvent.getId()).A00();
        this.A03.A04(upcomingEvent, str, "upcoming_event_view_in_upcoming_events_tap", "clips_reminder_ad_cta_bar_view_in_upcoming_events");
    }
}
