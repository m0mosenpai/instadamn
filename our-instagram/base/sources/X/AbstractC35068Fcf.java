package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;

/* renamed from: X.Fcf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35068Fcf {
    public static final void A00(Fragment fragment, C44451JlJ c44451JlJ) {
        C14360o3.A0B(c44451JlJ, 1);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner, fragment, c07s, c44451JlJ, null, 42), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A01(FragmentActivity fragmentActivity, C50679MYx c50679MYx, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        int i;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "subscription_content_public_preview_upsell_impression");
        AbstractC31171DnF.A1I(A0f, interfaceC11380iw.getModuleName());
        String str = c50679MYx.A00;
        AbstractC31178DnM.A17(A0f, str);
        A0f.Cht();
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        int i2 = R.drawable.ig_illustrations_illo_exclusive_posts_refresh;
        if (z) {
            i2 = R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh;
        }
        A0H.A0k(fragmentActivity.getDrawable(i2));
        A0H.A0A(2131962119);
        AbstractC31177DnL.A0v(fragmentActivity, A0H, c50679MYx.A01, 2131962118);
        if (AbstractC31171DnF.A1W(userSession, str)) {
            i = 2131961124;
        } else {
            A0H.A0J(new DialogInterfaceOnClickListenerC35369Fik(2, fragmentActivity, interfaceC11380iw, userSession, c50679MYx, A01, interfaceC16820sZ), 2131962187);
            i = 2131968687;
        }
        A0H.A0H(null, i);
        AbstractC166987dD.A1W(A0H);
    }

    @Deprecated(message = "Use the version that takes a CreatorInfo as param instead of User")
    public static final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        A01(fragmentActivity, new C50679MYx(user.getId(), user.getUsername(), 48), interfaceC11380iw, userSession, interfaceC16820sZ, z);
    }
}
