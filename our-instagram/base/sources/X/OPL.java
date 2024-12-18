package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OPL {
    public static final C55170OdY A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C55170OdY) userSession.A01(C55170OdY.class, new C57551PgP(userSession, 38));
    }

    public static void A01(UserSession userSession) {
        C55170OdY A00 = A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A03.ARD();
        ARD.E7G("browser_last_clear_link_history_date_key", currentTimeMillis);
        ARD.apply();
    }
}
