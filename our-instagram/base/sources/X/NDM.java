package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NDM extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Context A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        C147766l1 A002 = AbstractC147736ky.A00(this.A00, userSession);
        MTU A03 = A00.A03();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository = (IgLiveViewerJoinFlowRepository) A00.A02.getValue();
        C54706OEi c54706OEi = (C54706OEi) A002.A01.getValue();
        C147796l4 c147796l4 = (C147796l4) A002.A06.getValue();
        EnumC142806cg enumC142806cg = EnumC142806cg.A05;
        boolean z = this.A02;
        AbstractC167017dG.A1N(userSession, enumC142806cg);
        return new C51003MgA(userSession, c54706OEi, c147796l4, igLiveViewerJoinFlowRepository, A01, igLiveHeartbeatManager, A03, z);
    }

    public NDM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        this.A01 = userSession;
        this.A03 = context;
        this.A00 = interfaceC11380iw;
        this.A02 = z;
    }
}
