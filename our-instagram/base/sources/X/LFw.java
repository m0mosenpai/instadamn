package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFw {
    public static final C19L A02 = AbstractC43594JPz.A13(C12L.A00, 2071973230);
    public final C23031Ai A00;
    public final UserSession A01;

    public LFw(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC23021Ah.A00(userSession);
    }

    public final void A00(String str) {
        UserSession userSession = this.A01;
        C008302x A00 = AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G());
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36888774025937729L);
        if (A04.length() > 0) {
            AbstractC166987dD.A1Z(new C50125MBz(this, A00, str, A04, null, 12), A02);
        }
    }
}
