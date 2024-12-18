package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MgA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51003MgA extends AbstractC52922bZ {
    public final UserSession A00;
    public final C23031Ai A01;
    public final C17060sy A02;
    public final C54706OEi A03;
    public final C147796l4 A04;
    public final IgLiveViewerJoinFlowRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final IgLiveHeartbeatManager A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final boolean A0A;

    public static final int A00(C3PO c3po, C51003MgA c51003MgA, Integer num, String str) {
        if (c3po == C3PO.A07) {
            return 2131965417;
        }
        if (c3po != C3PO.A05) {
            if (c3po == C3PO.A04) {
                if (!c51003MgA.A0A) {
                    return 2131965414;
                }
                return 2131965415;
            }
            if (str != null && str.length() != 0) {
                return 2131965401;
            }
            Integer A0M = c51003MgA.A02.A00().A0M();
            Integer num2 = C05F.A0C;
            if (A0M == num2 && num == num2) {
                return 2131965423;
            }
            return 2131965422;
        }
        return 2131965415;
    }

    public /* synthetic */ C51003MgA(UserSession userSession, C54706OEi c54706OEi, C147796l4 c147796l4, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, MTU mtu, boolean z) {
        C17060sy A00 = C08730cb.A00(userSession);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        AbstractC25234BEr.A1R(mtu, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveViewerJoinFlowRepository, c54706OEi);
        C14360o3.A0B(c147796l4, 7);
        AbstractC25229BEm.A1J(A00, 9, A002);
        this.A00 = userSession;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A05 = igLiveViewerJoinFlowRepository;
        this.A03 = c54706OEi;
        this.A04 = c147796l4;
        this.A0A = z;
        this.A02 = A00;
        this.A01 = A002;
        C24721Ip A0s = MSY.A0s();
        this.A08 = A0s;
        this.A09 = AbstractC07080Za.A03(A0s);
        MSZ.A17(this, new C57168PZm(this, (InterfaceC23621Ds) null, 27), mtu.A00);
        MSZ.A19(this, new C57183PaJ(this, null, 9), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, igLiveViewerJoinFlowRepository.A06);
    }
}
