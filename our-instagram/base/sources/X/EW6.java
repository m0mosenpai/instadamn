package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EW6 extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public EW6(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        return new C31806DyQ(userSession, new C33088Eil(interfaceC11380iw, userSession));
    }
}
