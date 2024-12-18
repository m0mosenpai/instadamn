package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OI6 {
    public OWf A00;
    public final UserSession A01;

    public final void A00(InterfaceC57853PlJ interfaceC57853PlJ) {
        C14360o3.A0B(interfaceC57853PlJ, 0);
        OWf oWf = this.A00;
        if (oWf == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "Attempt to log event while stopped.", 245701013);
        } else {
            oWf.A02(interfaceC57853PlJ);
        }
    }

    public OI6(UserSession userSession) {
        this.A01 = userSession;
    }
}
