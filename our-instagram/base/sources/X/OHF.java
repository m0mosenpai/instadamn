package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OHF {
    public final C18920wW A00;

    public OHF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public final void A00(String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "dogfooding_rageshake_event");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str);
            A0f.Cht();
        }
    }
}
