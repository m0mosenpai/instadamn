package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MgC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51005MgC extends AbstractC52922bZ {
    public static final long A0B = TimeUnit.SECONDS.toMillis(60);
    public AnonymousClass195 A00;
    public final UserSession A01;
    public final C17060sy A02;
    public final OF0 A03;
    public final IgLiveCobroadcastRepository A04;
    public final IgLiveViewerJoinFlowRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final IgLiveHeartbeatManager A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final boolean A0A;

    public /* synthetic */ C51005MgC(UserSession userSession, OF0 of0, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, boolean z) {
        C17060sy A00 = C08730cb.A00(userSession);
        AbstractC25233BEq.A0w(2, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveViewerJoinFlowRepository);
        AbstractC167007dF.A1I(of0, 6, A00);
        this.A01 = userSession;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A05 = igLiveViewerJoinFlowRepository;
        this.A04 = igLiveCobroadcastRepository;
        this.A03 = of0;
        this.A0A = z;
        this.A02 = A00;
        C24721Ip A0s = MSY.A0s();
        this.A08 = A0s;
        this.A09 = AbstractC07080Za.A03(A0s);
        MSZ.A17(this, C57167PZl.A01(this, null, 46), igLiveBroadcastInfoManager.A06);
        MSZ.A17(this, C57167PZl.A01(this, null, 47), igLiveHeartbeatManager.A08);
        AbstractC25232BEp.A1J(this, new PZY(this, null, 26), igLiveViewerJoinFlowRepository.A07);
    }
}
