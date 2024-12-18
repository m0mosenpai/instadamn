package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.MfR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50958MfR extends AbstractC52922bZ {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;
    public final IgLiveBroadcastInfoManager A04;
    public final MTU A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final IgLiveHeartbeatManager A0B;

    public C50958MfR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, MTU mtu) {
        JQ0.A1O(userSession, interfaceC11380iw, igLiveBroadcastInfoManager, igLiveHeartbeatManager, mtu);
        C14360o3.A0B(enumC142806cg, 6);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = igLiveBroadcastInfoManager;
        this.A0B = igLiveHeartbeatManager;
        this.A05 = mtu;
        this.A03 = enumC142806cg;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A06 = A12;
        this.A07 = AbstractC07080Za.A03(A12);
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        this.A0A = AbstractC208910l.A02(A00);
        C008002u A0y = MSZ.A0y();
        this.A09 = A0y;
        MSZ.A19(this, new C57183PaJ(this, null, 7), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, A0y);
    }
}
