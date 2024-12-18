package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BNC implements MPP {
    public final C51762Yz A00;
    public final UserSession A01;
    public final C75113Zb A02;

    @Override // X.MPP
    public final void CwX() {
        this.A00.A01(null);
        C75113Zb c75113Zb = this.A02;
        c75113Zb.A1X = null;
        C75113Zb.A00(c75113Zb, 42);
    }

    public BNC(C51762Yz c51762Yz, UserSession userSession, C75113Zb c75113Zb) {
        AbstractC167027dH.A13(c51762Yz, c75113Zb, userSession);
        this.A00 = c51762Yz;
        this.A02 = c75113Zb;
        this.A01 = userSession;
    }
}
