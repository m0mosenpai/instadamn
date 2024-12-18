package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Nad, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52882Nad extends AbstractC31842Dz3 {
    public final C2GT A00;
    public final OFG A01;
    public final IgLiveBroadcastInfoManager A02;
    public final MTU A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final boolean A06;

    public final void A07(String str) {
        AbstractC166997dE.A1Y(this.A05, AbstractC167007dF.A1O(str.length()));
        Object value = this.A02.A06.getValue();
        if (value != null) {
            AbstractC166987dD.A1Z(new PZQ(value, this, str, null, 23), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52882Nad(UserSession userSession, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, OLC olc, MTU mtu, boolean z) {
        super(userSession, 6);
        OFG ofg = new OFG(userSession);
        C14360o3.A0B(igLiveBroadcastInfoManager, 2);
        AbstractC167007dF.A1F(olc, 3, mtu);
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = mtu;
        this.A01 = ofg;
        this.A06 = z;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        C0UO c0uo = ofg.A07;
        C0UO c0uo2 = ofg.A08;
        this.A04 = C10Q.A00(new D5F(3, (InterfaceC23621Ds) null), A1A, c0uo, c0uo2);
        this.A00 = AbstractC31172DnG.A0E(MV5.A00(this, AbstractC50522MSa.A1b(new C0UO[]{A1A, olc.A0V, olc.A0Z, olc.A0h, olc.A0a, c0uo2, c0uo}), 30));
        A05();
    }

    @Override // X.AbstractC31842Dz3
    public final InterfaceC19390xP A04() {
        return this.A04;
    }

    @Override // X.AbstractC31842Dz3
    public final Integer A02() {
        return 2131964096;
    }

    @Override // X.AbstractC31842Dz3
    public final void A06() {
        C57164PZi.A03(this, AbstractC141776au.A00(this), 22);
    }
}
