package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.NDd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52314NDd extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final UpcomingEvent A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C52314NDd(InterfaceC11380iw interfaceC11380iw, UserSession userSession, UpcomingEvent upcomingEvent, String str, String str2) {
        AbstractC25233BEq.A0x(1, userSession, str, str2);
        C14360o3.A0B(upcomingEvent, 6);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = "ig_live_scheduling_share";
        this.A05 = str;
        this.A03 = str2;
        this.A02 = upcomingEvent;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C17060sy A00 = C08730cb.A00(userSession);
        UpcomingEvent upcomingEvent = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        return new C50928Mex(A00, new C146076i5(interfaceC11380iw, userSession, this.A04), upcomingEvent, new OUK(interfaceC11380iw, userSession, this.A05, this.A03, upcomingEvent.getId()));
    }
}
