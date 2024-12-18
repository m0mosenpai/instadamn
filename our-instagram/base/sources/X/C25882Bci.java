package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.AggregatedWallFeedRepository;

/* renamed from: X.Bci, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25882Bci extends AbstractC52922bZ implements InterfaceC31065Dl7 {
    public final AggregatedWallFeedRepository A00;
    public final InterfaceC24731Iq A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final C0UO A04;
    public final UserSession A05;
    public final boolean A06;

    @Override // X.InterfaceC31065Dl7
    public final void E1Y(WallPostItem wallPostItem) {
        InterfaceC30835DhA c29430Cy5;
        C14360o3.A0B(wallPostItem, 0);
        if (this.A06) {
            c29430Cy5 = new C29429Cy4(wallPostItem.Bez().A04.A00.getId());
        } else {
            c29430Cy5 = new C29430Cy5(wallPostItem);
        }
        A00(c29430Cy5);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1Z(WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1c(C51740MtP c51740MtP, WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1d(WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31065Dl7
    public final void Dxx(String str) {
        A00(new C29428Cy3(str));
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1b(String str) {
        A00(new C29427Cy2(str));
    }

    public C25882Bci(UserSession userSession, AggregatedWallFeedRepository aggregatedWallFeedRepository) {
        this.A05 = userSession;
        this.A00 = aggregatedWallFeedRepository;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 2342165307118790779L);
        this.A06 = A06;
        C008002u A1H = AbstractC25225BEi.A1H(new C45125Jxu(A06));
        this.A03 = A1H;
        this.A04 = A1H;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A01 = A12;
        this.A02 = AbstractC07080Za.A03(A12);
        AbstractC166987dD.A1Z(new PYu(this, null, 28), AbstractC141776au.A00(this));
        AbstractC25232BEp.A1J(this, new C57154PYy(this, null, 24), C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 18), aggregatedWallFeedRepository.A07, aggregatedWallFeedRepository.A06));
    }

    private final void A00(InterfaceC30835DhA interfaceC30835DhA) {
        AbstractC166987dD.A1Z(new C57157PZb(interfaceC30835DhA, this, (InterfaceC23621Ds) null, 32), AbstractC141776au.A00(this));
    }
}
