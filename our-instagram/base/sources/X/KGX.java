package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGX extends AbstractC61132qb {
    public final C12N A00;
    public final UserSession A01;
    public final KPC A02;
    public final InterfaceC16660sJ A03;

    public KGX(C12N c12n, UserSession userSession, KPC kpc, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25233BEq.A0w(1, userSession, c12n, interfaceC16660sJ);
        this.A01 = userSession;
        this.A02 = kpc;
        this.A00 = c12n;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        KPC kpc = this.A02;
        return new C44525JmV(this.A00, (C42221xC) this.A03.invoke(userSession), userSession, kpc);
    }
}
