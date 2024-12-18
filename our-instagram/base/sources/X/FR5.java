package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FR5 {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    public final void A00() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "follow_requests_manage_tapped");
        AbstractC31175DnJ.A14(A0f, this.A00);
        A0f.Cht();
    }

    public final void A01(String str, Integer num) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "batch_follow_requests_action");
        A0f.AAP("action_type", str);
        AbstractC31175DnJ.A14(A0f, this.A00);
        if (num != null) {
            l = AbstractC25229BEm.A0n(num);
        } else {
            l = null;
        }
        A0f.A9K("num_requests", l);
        A0f.Cht();
    }

    public FR5(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
