package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FBY {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        if (!AbstractC166987dD.A0x(userSession).getBoolean("has_shown_featured_products_seller_nux", false)) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            AbstractC31173DnH.A15(context, A0I, R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
            A0I.A0A(2131962367);
            A0I.A09(2131962370);
            A0I.A07();
            A0I.A0H(new DialogInterfaceOnClickListenerC35451Fk8(context, A01, str, 11), 2131965052);
            AbstractC166987dD.A1W(A0I);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_shopping_seller_featured_product_nux_impression");
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("prior_module", str);
            A0f.AAQ(c0Zx, "navigation_info");
            A0f.Cht();
            AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "has_shown_featured_products_seller_nux");
        }
    }
}
