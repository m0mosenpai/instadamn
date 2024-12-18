package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NBM extends AbstractC61132qb {
    public final UserSession A00;

    public NBM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        EnumC142806cg enumC142806cg = EnumC142806cg.A04;
        C52817NZa A00 = AbstractC54266Nym.A00(userSession, enumC142806cg);
        MTU A03 = A00.A03();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A00.A04;
        ODQ odq = A00.A00;
        OLC A02 = A00.A02();
        JQ0.A1O(userSession, A03, A01, igLiveHeartbeatManager, odq);
        C14360o3.A0B(A02, 6);
        return new C50989Mfw(userSession, enumC142806cg, A01, odq, igLiveHeartbeatManager, A02, A03);
    }
}
