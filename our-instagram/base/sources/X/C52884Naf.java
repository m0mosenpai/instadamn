package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Naf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52884Naf extends AbstractC31842Dz3 {
    public AnonymousClass195 A00;
    public final C2GT A01;
    public final IgLiveJoinRequestsRepository A02;
    public final IgLiveBroadcastInfoManager A03;
    public final MTU A04;
    public final boolean A05;
    public final int A06;
    public final OLC A07;
    public final InterfaceC19390xP A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52884Naf(UserSession userSession, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, OLC olc, MTU mtu, boolean z) {
        super(userSession, 6);
        AbstractC25234BEr.A0j(2, igLiveJoinRequestsRepository, igLiveBroadcastInfoManager, mtu, olc);
        this.A02 = igLiveJoinRequestsRepository;
        this.A03 = igLiveBroadcastInfoManager;
        this.A04 = mtu;
        this.A07 = olc;
        this.A05 = z;
        C0UO c0uo = igLiveJoinRequestsRepository.A08;
        C0UO c0uo2 = igLiveJoinRequestsRepository.A0A;
        this.A08 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 15), c0uo, c0uo2);
        this.A06 = (olc.A00 - 1) - ((java.util.Set) olc.A0V.getValue()).size();
        this.A01 = MSZ.A0L(new C57183PaJ(this, null, 8), olc.A0h, c0uo, c0uo2);
        A05();
    }

    @Override // X.AbstractC31842Dz3
    public final int A01() {
        return this.A06;
    }

    @Override // X.AbstractC31842Dz3
    public final InterfaceC19390xP A04() {
        return this.A08;
    }

    public final void A07() {
        if (!this.A05 && this.A00 == null) {
            this.A00 = AbstractC25226BEj.A1L(new C57164PZi(this, (InterfaceC23621Ds) null, 23), AbstractC141776au.A00(this));
        }
    }

    public final void A08() {
        if (!this.A05) {
            this.A00 = MSY.A0r(this.A00);
        }
    }

    @Override // X.AbstractC31842Dz3
    public final Integer A02() {
        return 2131964093;
    }

    @Override // X.AbstractC31842Dz3
    public final void A06() {
        C57164PZi.A03(this, AbstractC141776au.A00(this), 24);
    }
}
