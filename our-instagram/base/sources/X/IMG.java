package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class IMG {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;
    public final C19L A04;
    public final Context A05;

    public final void A00(C38321qM c38321qM, JHX jhx, UpcomingEventReminderRepository upcomingEventReminderRepository, UpcomingEvent upcomingEvent) {
        Hj4 hj4;
        BHS bhs;
        InterfaceC16660sJ mil;
        C14360o3.A0B(upcomingEventReminderRepository, 3);
        String str = this.A03;
        if (C14360o3.A0K(str, AbstractC111324zv.A00(3174)) && upcomingEvent.getReminderEnabled()) {
            bhs = new BHS(new Object[0], 2131952155);
            AbstractC22762A2g.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            AbstractC167017dG.A1P(userSession, interfaceC60442pS);
            mil = new C57746PjZ(new IN2(fragmentActivity, userSession, interfaceC60442pS, str, null).A01(upcomingEvent.getId()), 38);
        } else if (upcomingEvent.getReminderEnabled()) {
            bhs = new BHS(new Object[0], 2131952154);
            mil = new MIL(22, c38321qM, this, upcomingEventReminderRepository, upcomingEvent, jhx);
        } else {
            hj4 = C39412Haw.A00;
            new C146096i7(this.A05, null).A00(c38321qM, hj4, upcomingEvent, null).A01(upcomingEvent.getReminderEnabled());
        }
        hj4 = new C39411Hav(bhs, mil);
        new C146096i7(this.A05, null).A00(c38321qM, hj4, upcomingEvent, null).A01(upcomingEvent.getReminderEnabled());
    }

    public IMG(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, C19L c19l) {
        AbstractC37302Gc3.A1U(userSession, interfaceC60442pS);
        this.A05 = context;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = str;
        this.A04 = c19l;
    }
}
