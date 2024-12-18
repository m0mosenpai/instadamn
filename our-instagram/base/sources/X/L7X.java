package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* loaded from: classes8.dex */
public final class L7X {
    public final C9A2 A00;
    public final L8o A01;
    public final UserSession A02;
    public final C47778L8d A03;

    public final void A00(ThreadFetchReason threadFetchReason, String str, InterfaceC16660sJ interfaceC16660sJ, int i, long j, long j2) {
        UserSession userSession = this.A00.A00;
        C9A3 c9a3 = (C9A3) userSession.A01(C9A3.class, new C37056GUm(userSession, 40));
        InterfaceC19610xo ARD = AbstractC31174DnI.A0g(C1AT.A01(c9a3.A00), C1AV.A0E, c9a3).ARD();
        ARD.E7K(String.valueOf(j), AnonymousClass001.A0H(str, ':', i));
        ARD.apply();
        this.A01.A00(str, null, 117, 0);
        boolean A1P = AbstractC167007dF.A1P(i, 16);
        C49271LqR c49271LqR = new C49271LqR(this, str, interfaceC16660sJ, j);
        C47778L8d c47778L8d = this.A03;
        if (A1P) {
            c47778L8d.A01(threadFetchReason, c49271LqR, j);
        } else {
            c47778L8d.A00(threadFetchReason, c49271LqR, j2);
        }
    }

    public L7X(UserSession userSession, L8o l8o) {
        AbstractC167017dG.A1P(userSession, l8o);
        this.A02 = userSession;
        this.A01 = l8o;
        this.A00 = (C9A2) userSession.A01(C9A2.class, new C37056GUm(userSession, 41));
        this.A03 = (C47778L8d) userSession.A01(C47778L8d.class, new C37056GUm(userSession, 44));
    }
}
