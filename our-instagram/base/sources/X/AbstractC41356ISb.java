package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.ISb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41356ISb {
    public static void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        A0H.A0j(fragmentActivity.getDrawable(R.drawable.checkout_chevron_96));
        A0H.A0A(2131955150);
        AbstractC31177DnL.A0v(fragmentActivity, A0H, str2, 2131955149);
        A0H.A0F(new DialogInterfaceOnClickListenerC35446Fk3(str, A01, 18));
        A0H.A0H(new LMK(fragmentActivity, interfaceC11380iw, userSession, str, str2, 1), 2131965052);
        A0H.A0t(true);
        A0H.A0C(new WHH(str, A01, 1));
        AbstractC166987dD.A1W(A0H);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_shopping_checkout_awareness_dialog_impression");
        A0f.AAP("visual_style", AbstractC111324zv.A00(185));
        AbstractC37300Gc1.A0t(A0f, str);
        A0f.Cht();
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
        A0e.E77("has_shown_checkout_awareness_interstitial", true);
        A0e.apply();
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("merchant_username", str);
        AbstractC37300Gc1.A0c(A0b, str2);
        A0b.putString("prior_submodule_name", str3);
        A0b.putString("shopping_session_id", str4);
        AbstractC25228BEl.A1G(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(4086));
    }
}
