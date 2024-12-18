package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.Vxe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69913Vxe {
    public static final void A00(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, XA8 xa8, W65 w65, UserSession userSession, ProductType productType, boolean z, boolean z2, boolean z3) {
        String A0p;
        SpannableStringBuilder spannableStringBuilder;
        int A06;
        String A00;
        String str;
        String A0p2;
        String A0p3;
        String A0p4;
        int i;
        C14360o3.A0B(userSession, 3);
        w65.A05(false);
        w65.A03(xa8);
        w65.A02(AbstractC138316On.A00(productType, z3));
        if (xIGIGBoostDestination != null && xIGIGBoostDestination == XIGIGBoostDestination.A07) {
            Context context = w65.A00.getContext();
            boolean A1T = AbstractC167007dF.A1T(AbstractC166997dE.A0Y(userSession).A03.CTD());
            String A0p5 = AbstractC166997dE.A0p(context, 2131970901);
            String A0p6 = AbstractC166997dE.A0p(context, 2131970898);
            String A0p7 = AbstractC166997dE.A0p(context, 2131965026);
            String A0p8 = AbstractC166997dE.A0p(context, 2131965025);
            String string = context.getString(2131970907, A0p5, A0p6, A0p7);
            C14360o3.A07(string);
            String string2 = context.getString(2131970906, A0p5, A0p6, A0p7, A0p8);
            C14360o3.A07(string2);
            if (A1T) {
                string = string2;
            }
            spannableStringBuilder = new SpannableStringBuilder(string);
            AnonymousClass773.A04(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, "help_link_terms", "https://www.facebook.com/ads/leadgen/restricted_tos", context.getColor(AbstractC53242c7.A06(context))), A0p7);
            AnonymousClass773.A04(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context.getColor(AbstractC53242c7.A06(context))), A0p5);
            W65.A00(context, spannableStringBuilder, fragmentActivity, w65, userSession, A0p6, AbstractC111324zv.A00(119), "help_link_guidelines", AbstractC53242c7.A06(context));
            if (A1T) {
                AnonymousClass773.A04(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, "help_link_terms", AbstractC43591JPw.A00(382), context.getColor(AbstractC53242c7.A06(context))), A0p8);
            }
        } else {
            ProductType productType2 = ProductType.CLIPS;
            Context context2 = w65.A00.getContext();
            if (productType == productType2) {
                A0p3 = AbstractC166997dE.A0p(context2, 2131970901);
                A0p4 = AbstractC166997dE.A0p(context2, 2131970898);
                A0p2 = AbstractC166997dE.A0p(context2, 2131970897);
                i = 2131970903;
            } else if (z) {
                A0p3 = AbstractC166997dE.A0p(context2, 2131970901);
                A0p4 = AbstractC166997dE.A0p(context2, 2131970898);
                A0p2 = AbstractC166997dE.A0p(context2, 2131970897);
                i = 2131970902;
            } else {
                String A0p9 = AbstractC166997dE.A0p(context2, 2131970901);
                if (z2) {
                    String A0p10 = AbstractC166997dE.A0p(context2, 2131970900);
                    A0p2 = AbstractC166997dE.A0p(context2, 2131970898);
                    spannableStringBuilder = new SpannableStringBuilder(context2.getString(2131970905, A0p9, A0p10, A0p2));
                    W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, A0p10, "https://www.facebook.com/legal/couponterms/", "help_link_coupon_terms", AbstractC53242c7.A06(context2));
                    AnonymousClass773.A04(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context2.getColor(AbstractC53242c7.A06(context2))), A0p9);
                    A06 = AbstractC53242c7.A06(context2);
                    A00 = AbstractC111324zv.A00(119);
                    str = "help_link_guidelines";
                    A0p = A0p2;
                    W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, A0p, A00, str, A06);
                } else {
                    A0p = AbstractC166997dE.A0p(context2, 2131970898);
                    spannableStringBuilder = new SpannableStringBuilder(AbstractC31174DnI.A0t(context2, A0p9, A0p, 2131970904));
                    AnonymousClass773.A04(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, "help_link_terms", "https://www.facebook.com/legal/self_service_ads_terms/", context2.getColor(AbstractC53242c7.A06(context2))), A0p9);
                    A06 = AbstractC53242c7.A06(context2);
                    A00 = AbstractC111324zv.A00(119);
                    str = "help_link_guidelines";
                    W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, A0p, A00, str, A06);
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(context2.getString(i, A0p3, A0p4, A0p2));
            W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, A0p3, "https://www.facebook.com/legal/self_service_ads_terms/", "help_link_terms", AbstractC53242c7.A06(context2));
            String str2 = A0p4;
            W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, str2, AbstractC111324zv.A00(119), "help_link_guidelines", AbstractC53242c7.A06(context2));
            A06 = AbstractC53242c7.A06(context2);
            A00 = "https://www.facebook.com/business/help/2405092116183307";
            str = "help_link_ad_library_learn_more";
            A0p = A0p2;
            W65.A00(context2, spannableStringBuilder, fragmentActivity, w65, userSession, A0p, A00, str, A06);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = w65.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(spannableStringBuilder);
        }
    }

    public static final void A01(XA8 xa8, W65 w65, String str) {
        w65.A05(AbstractC167007dF.A1U(xa8));
        w65.A03(xa8);
        if (str == null) {
            str = "";
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = w65.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(str);
        }
    }
}
