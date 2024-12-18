package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FBZ {
    public static void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C62862tP A02 = C62862tP.A02(abstractC59962oe, AbstractC31171DnF.A0D("IGCartPrefetch"), userSession, null);
        C36026FvO c36026FvO = new C36026FvO(8);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        new BitSet(0);
        FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.globalstatepublish.async", A1G, A1G2).A00(abstractC59962oe.requireContext(), A02);
        if (str != null) {
            HashMap A1G3 = AbstractC166987dD.A1G();
            HashMap A0h = AbstractC31177DnL.A0h();
            A1G3.put("merchant_id", str);
            FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.globalstatepublish.secondary.async", A1G3, A0h).A00(abstractC59962oe.requireContext(), A02);
            HashMap A1G4 = AbstractC166987dD.A1G();
            HashMap A0h2 = AbstractC31177DnL.A0h();
            A1G4.put("merchant_id", str);
            A1G4.put("is_empty_cart", false);
            A1G4.put("is_one_page_cart", AbstractC166997dE.A0b());
            FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.promotion.async", A1G4, A0h2).A00(abstractC59962oe.requireContext(), A02);
        }
    }
}
