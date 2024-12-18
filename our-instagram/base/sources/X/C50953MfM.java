package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MfM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50953MfM extends AbstractC52922bZ {
    public final C54810OKj A00;
    public final IgLiveModerationRepository A01;
    public final IgLiveBroadcastInfoManager A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final IgLiveHeartbeatManager A07;
    public final OLC A08;
    public final MTU A09;

    public C50953MfM(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54810OKj c54810OKj, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        JQ0.A1O(userSession, interfaceC11380iw, mtu, igLiveBroadcastInfoManager, igLiveHeartbeatManager);
        AbstractC167017dG.A1U(olc, igLiveModerationRepository);
        C14360o3.A0B(c54810OKj, 8);
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A09 = mtu;
        this.A02 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A08 = olc;
        this.A01 = igLiveModerationRepository;
        this.A00 = c54810OKj;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A03 = A12;
        this.A04 = AbstractC07080Za.A03(A12);
        MSZ.A18(this, new C57181PaA(this, (InterfaceC23621Ds) null, 16), igLiveBroadcastInfoManager.A06, olc.A0s);
        PZY.A01(this, igLiveModerationRepository.A04, 35);
        PZY.A01(this, mtu.A00, 36);
    }
}
