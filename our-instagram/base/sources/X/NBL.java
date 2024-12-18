package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NBL extends AbstractC61132qb {
    public final UserSession A00;

    public NBL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NZZ A02 = OYB.A02(userSession);
        IgLiveBroadcastInfoManager A01 = A02.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A02.A04;
        return new C52892Nan(userSession, (C54817OKs) A02.A07.getValue(), A01, A02.A03, igLiveHeartbeatManager, A02.A02(), A02.A03());
    }
}
