package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OTa {
    public final long A00;
    public final C1QT A01;
    public final UserSession A02;

    public static final boolean A00(OTa oTa) {
        return C18U.A06(C06090Tz.A05, oTa.A02, 36322018731239375L);
    }

    public OTa(UserSession userSession) {
        this.A02 = userSession;
        C1QT A00 = C1QS.A00(userSession);
        this.A01 = A00;
        this.A00 = A00.generateNewFlowId(173998081);
    }
}
