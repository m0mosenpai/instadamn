package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* loaded from: classes9.dex */
public final class NDI extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final boolean A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C147846l9 A00 = AbstractC147816l6.A00(userSession);
        C147766l1 A002 = AbstractC147736ky.A00(this.A01, userSession);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = ((AbstractC147826l7) A00).A04;
        IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository = (IgLiveViewerJoinFlowRepository) A00.A02.getValue();
        IgLiveCobroadcastRepository A003 = A00.A00(this.A00, userSession);
        OF0 of0 = (OF0) A002.A02.getValue();
        EnumC142806cg enumC142806cg = EnumC142806cg.A05;
        boolean z = this.A03;
        AbstractC167017dG.A1N(userSession, enumC142806cg);
        return new C51005MgC(userSession, of0, A003, igLiveViewerJoinFlowRepository, A01, igLiveHeartbeatManager, z);
    }

    public NDI(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = z;
    }
}
