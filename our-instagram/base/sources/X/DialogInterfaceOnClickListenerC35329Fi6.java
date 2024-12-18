package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Fi6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35329Fi6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3BU A00;
    public final /* synthetic */ Integer A01;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Fragment fragment;
        UserSession userSession;
        UserSession userSession2;
        User user;
        UserSession userSession3;
        User user2;
        User user3;
        UserSession userSession4;
        User user4;
        UserSession userSession5;
        User user5;
        C14360o3.A0B(dialogInterface, 0);
        C3BU c3bu = this.A00;
        WeakReference weakReference = c3bu.A03;
        FragmentActivity fragmentActivity = null;
        if (weakReference != null) {
            fragment = (Fragment) weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference weakReference2 = c3bu.A04;
        if (weakReference2 != null) {
            fragmentActivity = (FragmentActivity) weakReference2.get();
        }
        Integer num = this.A01;
        switch (num.intValue()) {
            case 0:
            case 5:
                if (fragmentActivity == null || (userSession5 = c3bu.A01) == null || (user5 = c3bu.A02) == null) {
                    return;
                }
                AbstractC41775Ier.A0E(userSession5, "instagram_shopping_post_onboarding_nux_tag_product_button_clicked", user5.A03.Bum());
                C36324G0t c36324G0t = new C36324G0t(c3bu, 4);
                UserSession userSession6 = c3bu.A01;
                C14360o3.A0A(userSession6);
                EnumC33447EqK enumC33447EqK = EnumC33447EqK.A0X;
                String string = fragmentActivity.getString(2131973996);
                C14360o3.A0B(userSession6, 2);
                AbstractC69933Cc.A00(fragmentActivity, userSession6, c36324G0t).Emy(enumC33447EqK, EnumC69983Ch.A02);
                C6WI.A01().A0X = true;
                C6WI.A01().A0D = string;
                return;
            case 1:
                if (fragmentActivity == null || fragment == null || (userSession4 = c3bu.A01) == null || (user4 = c3bu.A02) == null) {
                    return;
                }
                String Bum = user4.A03.Bum();
                String A00 = AbstractC111324zv.A00(66);
                AbstractC41775Ier.A0E(userSession4, "instagram_shopping_post_onboarding_nux_add_product_to_shop_button_clicked", Bum);
                C1XJ c1xj = C1XJ.A00;
                UserSession userSession7 = c3bu.A01;
                C14360o3.A0A(userSession7);
                c1xj.A0a(fragmentActivity, fragment, userSession7, c3bu.A05, A00);
                return;
            case 2:
                if (fragmentActivity == null || c3bu.A01 == null || (user3 = c3bu.A02) == null) {
                    return;
                }
                List A0S = user3.A0S();
                if (A0S != null) {
                    EnumC33406Epd enumC33406Epd = EnumC33406Epd.A05;
                    if (A0S.contains(enumC33406Epd) && num == C05F.A0C) {
                        C1XJ c1xj2 = C1XJ.A00;
                        UserSession userSession8 = c3bu.A01;
                        C14360o3.A0A(userSession8);
                        c1xj2.A1D(fragmentActivity, userSession8, c3bu.A05, enumC33406Epd.toString(), null, null, true, false, false);
                        return;
                    }
                }
                UserSession userSession9 = c3bu.A01;
                if (userSession9 != null) {
                    User user6 = c3bu.A02;
                    C14360o3.A0A(user6);
                    String Bum2 = user6.A03.Bum();
                    String A002 = AbstractC111324zv.A00(66);
                    AbstractC41775Ier.A0E(userSession9, "instagram_shopping_post_onboarding_nux_add_product_to_catalog_button_clicked", Bum2);
                    UserSession userSession10 = c3bu.A01;
                    if (userSession10 != null) {
                        if (c3bu.A02 != null) {
                            AbstractC1566271k.A0P(fragmentActivity, userSession10, A002, "feed_post_onboard_nux_dialog", true);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 3:
                if (fragmentActivity == null || fragment == null || (userSession3 = c3bu.A01) == null || (user2 = c3bu.A02) == null) {
                    return;
                }
                String Bum3 = user2.A03.Bum();
                String A003 = AbstractC111324zv.A00(66);
                AbstractC41775Ier.A0E(userSession3, "instagram_shopping_post_onboarding_nux_finish_checkout_setup_button_clicked", Bum3);
                AbstractC1566271k.A0Q(fragmentActivity, c3bu.A01, "feed_post_onboard_nux_dialog", A003, false);
                return;
            case 4:
                if (fragmentActivity == null || fragment == null || (userSession2 = c3bu.A01) == null || (user = c3bu.A02) == null) {
                    return;
                }
                String Bum4 = user.A03.Bum();
                String A004 = AbstractC111324zv.A00(66);
                AbstractC41775Ier.A0E(userSession2, "instagram_shopping_post_onboarding_nux_add_payout_info_button_clicked", Bum4);
                AbstractC1566271k.A0Q(fragmentActivity, c3bu.A01, "feed_post_onboard_nux_dialog", A004, true);
                return;
            case 6:
            case 7:
                if (fragmentActivity == null || (userSession = c3bu.A01) == null) {
                    return;
                }
                AbstractC1566271k.A0H(fragmentActivity, userSession, "feed_post_onboard_nux_dialog", AbstractC111324zv.A00(66));
                return;
            default:
                return;
        }
    }

    public DialogInterfaceOnClickListenerC35329Fi6(C3BU c3bu, Integer num) {
        this.A00 = c3bu;
        this.A01 = num;
    }
}
