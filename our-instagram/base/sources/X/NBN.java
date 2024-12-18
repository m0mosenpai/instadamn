package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NBN extends AbstractC61132qb {
    public final UserSession A00;

    public NBN(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NZZ A02 = OYB.A02(userSession);
        MTU A03 = A02.A03();
        IgLiveBroadcastInfoManager A01 = A02.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A02.A04;
        ODQ odq = ((C52817NZa) A02).A00;
        OLC A022 = A02.A02();
        JQ0.A1O(userSession, A03, A01, igLiveHeartbeatManager, odq);
        C14360o3.A0B(A022, 6);
        return new C50989Mfw(userSession, EnumC142806cg.A03, A01, odq, igLiveHeartbeatManager, A022, A03);
    }
}
