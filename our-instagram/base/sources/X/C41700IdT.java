package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.IdT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41700IdT {
    public static final C41700IdT A00 = new Object();

    public static final void A00(IIE iie, INQ inq, IKK ikk) {
        if (ikk.A00 != EnumC39541HdD.A02) {
            inq.A01(iie.A03);
        }
        AbstractC37302Gc3.A0o(iie.A00, iie.A03, ikk.A04.A0J, 2131963481);
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IIE iie, INQ inq, C38376GuD c38376GuD, JPq jPq, C39350HZp c39350HZp, IKK ikk, INL inl) {
        AbstractC167017dG.A1N(userSession, iie);
        AbstractC25234BEr.A1R(c39350HZp, ikk, inq, c38376GuD, jPq);
        AbstractC167007dF.A1I(interfaceC11380iw, 7, inl);
        C42797IwZ c42797IwZ = iie.A02;
        C14360o3.A0B(c42797IwZ, 1);
        C41679Id8.A00(interfaceC11380iw, userSession, c39350HZp.A00, c42797IwZ, c38376GuD, jPq, c39350HZp, ikk, inl, new C43210J8h(15, ikk, c39350HZp, jPq));
        A00(iie, inq, ikk);
        ExtendedImageUrl A002 = c39350HZp.A00(iie.A00);
        if (A002 != null) {
            iie.A01.setUrl(A002, interfaceC11380iw);
        }
        AbstractC37304Gc5.A0v(iie.A01, ikk.A00, EnumC39541HdD.A03, true);
    }

    public final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IIE iie, INQ inq, C38376GuD c38376GuD, JPq jPq, IKK ikk, C39352HZr c39352HZr, INL inl) {
        AbstractC167017dG.A1N(userSession, iie);
        AbstractC25234BEr.A1R(c39352HZr, ikk, inq, c38376GuD, jPq);
        AbstractC167007dF.A1I(interfaceC11380iw, 7, inl);
        C42797IwZ c42797IwZ = iie.A02;
        C14360o3.A0B(c42797IwZ, 1);
        C41679Id8.A00(interfaceC11380iw, userSession, c39352HZr.A00, c42797IwZ, c38376GuD, jPq, c39352HZr, ikk, inl, new C29901DGp(25, jPq, c39352HZr, ikk, c42797IwZ));
        A00(iie, inq, ikk);
        ExtendedImageUrl A002 = c39352HZr.A00(iie.A00);
        if (A002 != null) {
            iie.A01.setUrl(A002, interfaceC11380iw);
        }
        AbstractC37304Gc5.A0v(iie.A01, ikk.A00, EnumC39541HdD.A03, true);
    }
}
