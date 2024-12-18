package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCK extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        C147766l1 A002 = AbstractC147736ky.A00(this.A00, userSession);
        return new C50947MfG((C147776l2) A002.A05.getValue(), (OJ4) A00.A00.getValue(), ((AbstractC147826l7) A00).A03, A00.A03());
    }

    public NCK(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
