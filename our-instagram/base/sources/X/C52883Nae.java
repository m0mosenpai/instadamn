package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Nae, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52883Nae extends AbstractC31842Dz3 {
    public final OFF A00;
    public final IgLiveModerationRepository A01;
    public final IgLiveBroadcastInfoManager A02;
    public final MTU A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C05A A06;

    @Override // X.AbstractC31842Dz3
    public final void A06() {
        Object A0A = AbstractC001800i.A0A(A03());
        if (A0A != null) {
            AbstractC166987dD.A1Z(new PZQ(A0A, this, "add_moderator_sheet", null, 25), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52883Nae(UserSession userSession, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, MTU mtu) {
        super(userSession, 6);
        OFF off = new OFF(userSession);
        AbstractC167027dH.A13(userSession, igLiveBroadcastInfoManager, mtu);
        C14360o3.A0B(igLiveModerationRepository, 4);
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = mtu;
        this.A01 = igLiveModerationRepository;
        this.A00 = off;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A06 = A1A;
        this.A05 = C10E.A00(OUC.A05);
        this.A04 = C10Q.A00(new D5F(4, (InterfaceC23621Ds) null), A1A, off.A07, off.A08);
        A05();
    }

    @Override // X.AbstractC31842Dz3
    public final int A01() {
        return 1 - AbstractC166987dD.A0H(this.A01.A09.getValue());
    }

    @Override // X.AbstractC31842Dz3
    public final InterfaceC19390xP A04() {
        return this.A04;
    }

    public final void A07() {
        AbstractC43594JPz.A1T(this.A06);
        C57164PZi.A03(this, AbstractC141776au.A00(this), 38);
    }

    @Override // X.AbstractC31842Dz3
    public final Integer A02() {
        return 2131964094;
    }
}
