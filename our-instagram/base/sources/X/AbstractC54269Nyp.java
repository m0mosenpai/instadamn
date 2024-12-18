package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Nyp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54269Nyp {
    public static final OMc A00(AbstractC59962oe abstractC59962oe, UserSession userSession, User user, InterfaceC147636ko interfaceC147636ko, EnumC142806cg enumC142806cg, AbstractC147826l7 abstractC147826l7) {
        AbstractC167007dF.A1E(userSession, 1, interfaceC147636ko);
        C14360o3.A0B(abstractC147826l7, 6);
        C55807OqI c55807OqI = C55807OqI.A00;
        C55128Obp c55128Obp = null;
        AbstractC169097gi.A00(null, userSession, new C61972ry(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), null), new C36695GFq(userSession, 8), "coefficient_besties_list_ranking", AbstractC166987dD.A1J(AbstractC166997dE.A0Y(userSession)), true);
        if (enumC142806cg.ordinal() == 1 && !C18U.A06(C06090Tz.A05, userSession, 36325274316583887L)) {
            c55128Obp = new C55128Obp(abstractC59962oe.requireContext(), abstractC59962oe.requireView(), MSX.A1X(AbstractC147826l7.A0K.A00(userSession, enumC142806cg).A02().A0V.getValue()));
        }
        return new OMc(c55807OqI, abstractC59962oe, userSession, user, interfaceC147636ko, enumC142806cg, abstractC147826l7, c55128Obp);
    }
}
