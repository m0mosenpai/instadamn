package X;

import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes9.dex */
public final class ND7 extends AbstractC61132qb {
    public final UserSession A00;
    public final C38321qM A01;
    public final InterfaceC60442pS A02;
    public final UpcomingEvent A03;

    public ND7(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, UpcomingEvent upcomingEvent) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = upcomingEvent;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50920Mep(userSession, this.A01, new UpcomingEventReminderRepository(userSession, this.A02, null), this.A03);
    }
}
