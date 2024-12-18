package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.HbK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39432HbK extends AbstractC77473dX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C905641r A01;
    public final /* synthetic */ C38321qM A02;

    public C39432HbK(UserSession userSession, C905641r c905641r, C38321qM c38321qM) {
        this.A00 = userSession;
        this.A01 = c905641r;
        this.A02 = c38321qM;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C55101ObE c55101ObE = new C55101ObE(this.A00, AbstractC166997dE.A0L(AbstractC166987dD.A0d(this.A01.A0F)));
        String A2u = this.A02.A2u();
        UserSession userSession = c55101ObE.A07;
        InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_open_carousel_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(EnumC39652Hih.A0V, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
            AbstractC37300Gc1.A0h(A0f, C55101ObE.A00(A2u));
            A0f.Cht();
        }
    }
}
