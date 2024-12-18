package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WjS implements InterfaceC165857bD {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;

    @Override // X.InterfaceC165857bD
    public final void ARi() {
        C71162Wox c71162Wox = new C71162Wox(this, 0);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        c08730cb.A01(userSession).A1A(true);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        C57312k6 A0S = AbstractC25235BEs.A0S(this.A00);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCL(c71603Jf, c71162Wox, this, null, 1), A0S);
    }

    public WjS(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        AbstractC167017dG.A1Q(abstractC59962oe, interfaceC08830cm);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = interfaceC08830cm;
    }
}
