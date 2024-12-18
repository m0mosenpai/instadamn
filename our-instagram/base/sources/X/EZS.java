package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EZS extends AbstractRunnableC14200nk {
    public EZS() {
        super(1634543048);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19630xq interfaceC19630xq = C454627g.A01;
        if (interfaceC19630xq != null) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G(AbstractC43591JPw.A00(1131), currentTimeMillis);
            ARD.apply();
        }
        UserSession userSession = C454627g.A00;
        if (userSession != null) {
            InterfaceC19610xo ARD2 = ((AnonymousClass487) userSession.A01(AnonymousClass487.class, new GSw(userSession, 13))).A00.ARD();
            ARD2.E7G("last_app_foreground_background_timestamp", currentTimeMillis);
            ARD2.apply();
        }
    }
}
