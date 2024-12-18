package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Mfv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50988Mfv extends AbstractC52922bZ {
    public final UserSession A00;
    public final C17060sy A01;
    public final C56804PIv A02;
    public final IgLiveCobroadcastRepository A03;
    public final IgLiveBroadcastInfoManager A04;
    public final ODQ A05;
    public final MTU A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;

    public final void A00(boolean z) {
        Object value = this.A04.A06.getValue();
        if (value != null) {
            AbstractC166987dD.A1Z(new C50533MSm(value, this, (InterfaceC23621Ds) null, 20, z), AbstractC141776au.A00(this));
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        AbstractC147826l7.A0K.A01(this.A00, EnumC142806cg.A04);
    }

    public C50988Mfv(UserSession userSession, C17060sy c17060sy, C56804PIv c56804PIv, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, ODQ odq, MTU mtu) {
        AbstractC167017dG.A1Q(userSession, odq);
        AbstractC25234BEr.A0k(4, igLiveBroadcastInfoManager, mtu, c56804PIv, c17060sy);
        this.A00 = userSession;
        this.A03 = igLiveCobroadcastRepository;
        this.A05 = odq;
        this.A04 = igLiveBroadcastInfoManager;
        this.A06 = mtu;
        this.A02 = c56804PIv;
        this.A01 = c17060sy;
        C24721Ip A0s = MSY.A0s();
        this.A07 = A0s;
        this.A08 = AbstractC07080Za.A03(A0s);
        MSZ.A17(this, new C57158PZc(this, null, 46), mtu.A00);
        MSZ.A17(this, new C57168PZm(this, (InterfaceC23621Ds) null, 10), odq.A04);
    }
}
