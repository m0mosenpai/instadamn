package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MfN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50954MfN extends AbstractC52922bZ {
    public boolean A00;
    public boolean A01;
    public final C54810OKj A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final IgLiveModerationRepository A07;
    public final IgLiveBroadcastInfoManager A08;
    public final IgLiveHeartbeatManager A09;

    public C50954MfN(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54810OKj c54810OKj, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager) {
        JQ0.A1O(userSession, interfaceC11380iw, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveModerationRepository);
        C14360o3.A0B(c54810OKj, 6);
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = igLiveBroadcastInfoManager;
        this.A09 = igLiveHeartbeatManager;
        this.A07 = igLiveModerationRepository;
        this.A02 = c54810OKj;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A03 = A12;
        this.A04 = AbstractC07080Za.A03(A12);
        MSZ.A18(this, new MU8(this, (InterfaceC23621Ds) null, 43), igLiveHeartbeatManager.A08, igLiveBroadcastInfoManager.A06);
    }
}
