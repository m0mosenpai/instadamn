package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NCG extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public NCG(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        return new C50954MfN(interfaceC11380iw, userSession, (C54810OKj) ((AbstractC147746kz) A002).A05.getValue(), MSX.A0W(A00), A01, igLiveHeartbeatManager);
    }
}
