package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;

/* renamed from: X.MUg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50575MUg extends AbstractC61132qb {
    public final Application A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final GZI A03;
    public final AbstractC129825tm A04;
    public final InterfaceC168017ew A05;

    public C50575MUg(Application application, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GZI gzi, AbstractC129825tm abstractC129825tm, InterfaceC168017ew interfaceC168017ew) {
        AbstractC25233BEq.A0x(3, userSession, interfaceC11380iw, gzi);
        this.A00 = application;
        this.A04 = abstractC129825tm;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = gzi;
        this.A05 = interfaceC168017ew;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        ActivityFeedRepository A00 = C4DU.A00(userSession, new C4DT(userSession));
        C107264sX A002 = AbstractC107254sW.A00(userSession);
        C14360o3.A0B(userSession, 0);
        C50576MUh c50576MUh = (C50576MUh) userSession.A01(C50576MUh.class, new C57245PbT(userSession, 37));
        InterfaceC168017ew interfaceC168017ew = this.A05;
        C14360o3.A0B(interfaceC168017ew, 1);
        ActivityFeedRecommendedUserRepository activityFeedRecommendedUserRepository = (ActivityFeedRecommendedUserRepository) userSession.A01(ActivityFeedRecommendedUserRepository.class, C57531Pg5.A00(interfaceC168017ew, userSession, 35));
        Application application = this.A00;
        AbstractC129825tm abstractC129825tm = this.A04;
        Object obj = AbstractC54352ep.A00.get(C54602fI.class);
        if (obj != null) {
            C25671My A003 = AbstractC25651Mw.A00(userSession);
            GZI gzi = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            JWB jwb = new JWB(interfaceC11380iw, userSession, gzi);
            return new ActivityFeedViewModel(application, interfaceC11380iw, A003, userSession, abstractC129825tm, (C50579MUm) userSession.A01(C50579MUm.class, new C57245PbT(userSession, 36)), A002, activityFeedRecommendedUserRepository, A00, c50576MUh, jwb, (C54602fI) obj);
        }
        throw AbstractC166987dD.A15("null cannot be cast to non-null type com.instagram.notifications.badging.repository.BadgingRepository");
    }
}
