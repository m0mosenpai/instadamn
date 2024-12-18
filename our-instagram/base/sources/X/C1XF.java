package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;

/* renamed from: X.1XF, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XF {
    public static C1XF A00;
    public static final InterfaceC11380iw A01 = new InterfaceC11380iw() { // from class: X.1XG
        public static final String __redex_internal_original_name = "CheckoutPlugin$Companion$analyticModule$1";

        @Override // X.InterfaceC11380iw
        public final String getModuleName() {
            return "checkout_module";
        }
    };

    public abstract void A04(FragmentActivity fragmentActivity, UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, String str);
}
