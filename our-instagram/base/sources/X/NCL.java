package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class NCL extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        C147856lA c147856lA = ((AbstractC147826l7) A00).A03;
        OJ4 oj4 = (OJ4) A00.A00.getValue();
        OF1 of1 = (OF1) A00.A04.getValue();
        MTU A03 = A00.A03();
        return new C50959MfS(interfaceC11380iw, userSession, A002.A00, (C147776l2) A002.A05.getValue(), oj4, of1, A01, c147856lA, A03);
    }

    public NCL(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
