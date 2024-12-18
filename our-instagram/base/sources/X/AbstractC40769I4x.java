package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.I4x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40769I4x {
    public static final void A00(Fragment fragment, UserSession userSession) {
        long A01 = C18U.A01(AbstractC25225BEi.A0j(userSession, 1), userSession, 36595822896482573L);
        C1AU A012 = C1AT.A01(userSession);
        C1AV c1av = C1AV.A2u;
        InterfaceC19630xq A03 = A012.A03(c1av);
        if (A01 == -1 || A03.getInt("product_tagging_for_everyone_tagged_seller_dialog_impressions", 0) < A01) {
            C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
            A0O.A0j(fragment.requireContext().getDrawable(R.drawable.ig_illustrations_illo_business_heart_refresh));
            A0O.A0J(DialogInterfaceOnClickListenerC41828Ifi.A00, 2131975172);
            A0O.A0H(new DialogInterfaceOnClickListenerC35455FkC(50, fragment, userSession), 2131975170);
            A0O.A0A(2131975173);
            A0O.A09(2131975171);
            AbstractC166987dD.A1W(A0O);
        }
        AbstractC167017dG.A0g(C1AT.A01(userSession).A03(c1av), "product_tagging_for_everyone_tagged_seller_dialog_impressions").apply();
    }
}
