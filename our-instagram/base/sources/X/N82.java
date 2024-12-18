package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;

/* loaded from: classes9.dex */
public final class N82 extends C3r5 {
    public final UserSession A00;
    public final FollowRequestsRepository A01;
    public final C166257bu A02;
    public final C63702ur A03;
    public final InterfaceC09390do A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final boolean A09;

    public N82(UserSession userSession, FollowRequestsRepository followRequestsRepository, C166257bu c166257bu, C63702ur c63702ur, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = c166257bu;
        this.A01 = followRequestsRepository;
        this.A09 = z;
        this.A03 = c63702ur;
        C008002u A00 = C10E.A00(C16910sj.A00);
        this.A08 = A00;
        this.A07 = A00;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
        this.A04 = C1XM.A00(new C57245PbT(this, 43));
    }

    @Override // X.C3r5
    public final void A04(AbstractC61152qd abstractC61152qd, boolean z) {
        super.A04(abstractC61152qd, true);
        this.A02.A04(abstractC61152qd, true);
    }
}
