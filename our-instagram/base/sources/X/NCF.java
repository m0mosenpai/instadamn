package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NCF extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public NCF(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        NZZ A02 = OYB.A02(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        NYV A01 = OQX.A01(interfaceC11380iw, userSession);
        MTU A03 = A02.A03();
        IgLiveBroadcastInfoManager A012 = A02.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A02.A04;
        OLC A022 = A02.A02();
        return new C50953MfM(interfaceC11380iw, userSession, (C54810OKj) A01.A05.getValue(), MSX.A0W(A02), A012, igLiveHeartbeatManager, A022, A03);
    }
}
