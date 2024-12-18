package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceEventType;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.71k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1566271k {
    public static final List A00 = AbstractC16960so.A1Q("instagram_shopping_related_posts_grid", "rtc_call", "guide_add_items");

    public static final int A00(Context context) {
        C14360o3.A0B(context, 1);
        if ("".length() > 0) {
            return Color.parseColor("");
        }
        return context.getColor(R.color.default_cta_dominant_color);
    }

    public static final SpannableString A01(Context context, Product product, int i, int i2) {
        int ordinal;
        int i3;
        C14360o3.A0B(context, 1);
        ProductReviewStatus productReviewStatus = product.A05;
        if (productReviewStatus == null) {
            ordinal = -1;
        } else {
            ordinal = productReviewStatus.ordinal();
        }
        String str = "";
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal == 5) {
                    i3 = 2131970045;
                }
            } else {
                i3 = 2131970044;
            }
            str = context.getString(i3);
            C14360o3.A0A(str);
        }
        if (productReviewStatus != ProductReviewStatus.A07) {
            i = i2;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final SpannableStringBuilder A02(Context context, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(userSession, 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "(").append((CharSequence) str).append((CharSequence) ")");
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), 0, spannableStringBuilder.length(), 33);
        if (z) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SpannableStringBuilder A04(Context context, String str, String str2) {
        String str3;
        int A002 = A00(context);
        if (Integer.valueOf(A002) != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(A002), 0, spannableString.length(), 33);
            str3 = spannableString;
        } else {
            str3 = str;
        }
        SpannableString spannableString2 = new SpannableString(str3);
        spannableString2.setSpan(new TextAppearanceSpan(context, R.style.PriceIncentiveExperimentStyle), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new TextAppearanceSpan(context, R.style.SalePriceIncentiveExperimentStyle), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str2);
        spannableString3.setSpan(new StrikethroughSpan(), 0, spannableString3.length(), 33);
        spannableString3.setSpan(new TextAppearanceSpan(context, R.style.StrikeThroughPriceIncentiveExperimentStyle), 0, spannableString3.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) " ").append((CharSequence) spannableString3);
        return spannableStringBuilder;
    }

    public static final User A07(UserSession userSession, User user) {
        List list;
        C14360o3.A0B(userSession, 1);
        if (!A0T(userSession, user)) {
            CreatorShoppingInfo At3 = user.A03.At3();
            if (At3 != null) {
                list = At3.BNf();
            } else {
                list = null;
            }
            Integer A0A = A0A(userSession, user);
            if (C05F.A00 != A0A && C05F.A0C != A0A) {
                if (list != null && (!list.isEmpty())) {
                    return (User) AbstractC001800i.A0J(list);
                }
                return null;
            }
            return user;
        }
        return null;
    }

    public static final Integer A0A(UserSession userSession, User user) {
        List B1A;
        List BNf;
        C14360o3.A0B(userSession, 1);
        if (!user.A1Y()) {
            if (user.A1g()) {
                return C05F.A00;
            }
            CreatorShoppingInfo At3 = user.A03.At3();
            if (At3 != null && (BNf = At3.BNf()) != null && (!BNf.isEmpty())) {
                return C05F.A01;
            }
            if (C2TN.A04(userSession, user) && (B1A = C08730cb.A00(userSession).A00().A03.B1A()) != null && B1A.contains("ADD_SHOP")) {
                return C05F.A0N;
            }
            if (C2TN.A04(userSession, user) && user.CQw() && AbstractC38041GoU.A00(userSession)) {
                return C05F.A0C;
            }
        }
        return C05F.A0Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0B(Fragment fragment, UserSession userSession, EnumC33447EqK enumC33447EqK, String str, boolean z) {
        if ((fragment instanceof InterfaceC69913Ca) && fragment.getContext() != null) {
            Context context = fragment.getContext();
            InterfaceC69913Ca interfaceC69913Ca = (InterfaceC69913Ca) fragment;
            C14360o3.A0B(interfaceC69913Ca, 1);
            if (context != null) {
                AbstractC69933Cc.A00(context, userSession, interfaceC69913Ca).Emy(enumC33447EqK, EnumC69983Ch.A02);
                if (z) {
                    C6WI.A01().A0X = true;
                }
                C6WI.A01().A0D = str;
            }
        }
    }

    public static final void A0C(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(fragmentActivity, 4);
        InterfaceC104174mf Apq = user.A03.Apq();
        if (Apq == null || (str3 = Apq.BWF()) == null) {
            str3 = "";
        }
        FP2 fp2 = FEV.A01;
        fp2.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        AbstractC19330xH A002 = AbstractC11060iN.A00(userSession);
        C19280xC A01 = C19280xC.A01("instagram_shopping_cis_onboarding_click_entry_point", str);
        A01.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A01.A0C("waterfall_id", obj);
        A002.EHW(A01);
        if (z) {
            C1XJ.A00.A14(fragmentActivity, userSession, user, str3, str, str2, obj);
            return;
        }
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0F = true;
        C1XJ.A00.A0T();
        HashMap hashMap = new HashMap();
        hashMap.put("prior_module", str);
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        fp2.A00();
        hashMap.put("waterfall_id", obj);
        hashMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        C66277U6x A012 = C66277U6x.A01("com.bloks.www.bloks.commerce.integrity.system.entrypoint", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = str3;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A012));
        c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        c140966Yy.A04();
    }

    public static final void A0D(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.commerce.order_summary", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131953953);
        igBloksScreenConfig.A0l = true;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static final void A0E(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(fragmentActivity, 1);
        Rb1 A05 = A05(userSession, fragmentActivity.getString(2131964681), str);
        if (A05 != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0D(A05);
            c140966Yy.A04();
        }
    }

    public static final void A0F(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(fragmentActivity, 1);
        Bundle bundle = new Bundle();
        bundle.putString("invoice_id", str);
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(userSession, "IgOrderReturnDetailsApp");
        c64501TGn.A07 = fragmentActivity.getString(2131972571);
        c64501TGn.A00(bundle);
        c64501TGn.EqV(fragmentActivity).A04();
    }

    public static final void A0G(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.commerce.checkout.update_payment_method", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131976285);
        igBloksScreenConfig.A0l = true;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static final void A0H(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(fragmentActivity, 3);
        FEV.A01.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        if (userSession != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0F = true;
            C1XJ.A00.A0T();
            String string = fragmentActivity.getString(2131973950);
            C14360o3.A07(string);
            C913045j c913045j = C913045j.A00;
            C54s c54s = new C54s(c913045j);
            if (str == null) {
                str = "";
            }
            c54s.A0F(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            c54s.A0F("waterfall_id", obj);
            if (str2 == null) {
                str2 = "";
            }
            c54s.A0F("prior_module", str2);
            C54s c54s2 = new C54s(c913045j);
            c54s2.A0C(c54s, "server_params");
            HashMap hashMap = new HashMap();
            hashMap.put("params", c54s2.toString());
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.commerce.onboarding.adscredit.progress", hashMap);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            igBloksScreenConfig.A0U = string;
            c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
            c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            c140966Yy.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r15.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0K(androidx.fragment.app.FragmentActivity r13, com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r0 = 0
            r3 = r14
            X.C14360o3.A0B(r14, r0)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            java.lang.String r4 = X.AbstractC58442PvL.A02()
            r6 = r15
            if (r15 == 0) goto L17
            int r1 = r15.length()
            r0 = 0
            if (r1 != 0) goto L18
        L17:
            r0 = 1
        L18:
            r12 = r0 ^ 1
            r7 = 0
            java.lang.String r5 = "orders_hub"
            r9 = r16
            r10 = r17
            r11 = r18
            r8 = r7
            X.AbstractC34306FBa.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "referrer_surface"
            r1.put(r0, r15)
            r0 = 6
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r1.put(r0, r4)
            java.lang.String r0 = "additional_logging_data"
            r1.put(r0, r9)
            X.6Yy r2 = new X.6Yy
            r2.<init>(r13, r14)
            java.lang.String r0 = "com.bloks.www.fbpay.hub_landing"
            X.U6x r1 = X.C66277U6x.A01(r0, r1)
            r0 = 110176278(0x6912816, float:5.460184E-35)
            r1.A00 = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>(r14)
            X.3Nv r0 = X.W6d.A02(r0, r1)
            r2.A0B(r7, r0)
            r0 = 0
            r2.A0D = r0
            r2.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1566271k.A0K(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0L(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", str);
        hashMap.put("merchant_id", str2);
        hashMap.put("seeded_star_index", str3);
        hashMap.put("survey_entry_point", str4);
        hashMap.put("referral_surface", str5);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.bk.commerce.ratings_and_reviews.product.composer", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131953949);
        igBloksScreenConfig.A0l = false;
        igBloksScreenConfig.A0S = "shops_rr_product_composer";
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static final void A0M(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 3);
        FEV.A01.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0F = true;
        C1XJ.A00.A0T();
        String string = fragmentActivity.getString(2131964381);
        C14360o3.A07(string);
        HashMap hashMap = new HashMap();
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        hashMap.put("waterfall_id", obj);
        hashMap.put("prior_module", str);
        hashMap.put(AbstractC58317Pt9.A00(86), str3);
        hashMap.put("business_name", str4);
        hashMap.put("banhammer_state", str5);
        hashMap.put("banhammer_action_date", str6);
        C66277U6x A01 = C66277U6x.A01("com.instagram.shopping.screens.banhammer", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = string;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        c140966Yy.A04();
    }

    public static final void A0N(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        String A02 = AbstractC58442PvL.A02();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("referrer_surface", str2);
        hashMap.put("order_item_ids", str3);
        hashMap.put("orders_hub_session_id", A02);
        hashMap.put("additional_logging_data", str4);
        hashMap.put("deeplink_destination", str5);
        boolean z = true;
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            z = false;
        }
        AbstractC34306FBa.A00(userSession, A02, "hub_order_details", str2, str, str3, str4, str5, str6, z);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.orders_hub.order_details", hashMap);
        A01.A00 = 951391000;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0l = false;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static final void A0O(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 3);
        FEV.A01.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0F = true;
        C1XJ.A00.A0T();
        String string = fragmentActivity.getString(2131974003);
        C14360o3.A07(string);
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        hashMap.put("waterfall_id", obj);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("prior_module", str2);
        if (z) {
            str3 = "modal";
        } else {
            str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        hashMap.put("presentation_style", str3);
        C66277U6x A01 = C66277U6x.A01("com.instagram.shopping.screens.seller_policy_migration", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = string;
        c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
        c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        c140966Yy.A04();
    }

    public static final void A0P(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(fragmentActivity, 4);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        if (z) {
            str3 = "modal";
        } else {
            str3 = TraceEventType.Push;
        }
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C1XJ.A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        bundle.putString("waterfall_id", obj);
        bundle.putString("prior_module", str);
        bundle.putString("presentation_style", str3);
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(bundle);
        c140966Yy.A0D(abstractC59962oe);
        c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        c140966Yy.A04();
    }

    public static final void A0R(UserSession userSession, Activity activity, String str) {
        C14360o3.A0B(userSession, 1);
        if ((C14360o3.A0K(str, "product_tagging") || C14360o3.A0K(str, MSV.A00(399))) && C08730cb.A00(userSession).A00().A1O()) {
            C41768Iek c41768Iek = C41768Iek.A00;
            if (!C41768Iek.A02(userSession, c41768Iek).getBoolean("has_seen_influencers_nux_dialog", false)) {
                C1XJ.A00.A0c(activity, userSession, str, true);
                InterfaceC19610xo ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                ARD.E77("has_seen_influencers_nux_dialog", true);
                ARD.apply();
            }
        }
    }

    public static final boolean A0S(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 1);
        Integer A0A = A0A(userSession, user);
        if (C05F.A00 != A0A && C05F.A0C != A0A && C05F.A01 != A0A) {
            return false;
        }
        return true;
    }

    public static final boolean A0T(UserSession userSession, User user) {
        List list;
        CreatorShoppingInfo At3 = user.A03.At3();
        if (At3 != null) {
            list = At3.BNf();
        } else {
            list = null;
        }
        Integer A0A = A0A(userSession, user);
        if (C05F.A00 != A0A && C05F.A0C != A0A) {
            if (list == null || list.size() <= 1) {
                return false;
            }
        } else if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 1);
        if (str.equals("rtc_call")) {
            return !C18U.A06(C06090Tz.A05, userSession, 36314012912191862L);
        }
        return A00.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SpannableStringBuilder A03(Context context, Integer num, String str, String str2) {
        String str3;
        if (num != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
            str3 = spannableString;
        } else {
            str3 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static final Rb1 A05(UserSession userSession, String str, String str2) {
        if (str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("itemID", str2);
        AbstractC27401Ut.getInstance().getFragmentFactory();
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(userSession).A01("IgPaymentsItemDetailsRoute");
        A01.A07 = str;
        A01.A00(bundle);
        Bundle AEf = A01.AEf();
        Rb1 rb1 = new Rb1();
        rb1.setArguments(AEf);
        return rb1;
    }

    public static final Rb1 A06(UserSession userSession, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("receiptID", str2);
        bundle.putString("sessionID", str3);
        bundle.putString("transactionSource", str4);
        AbstractC27401Ut.getInstance().getFragmentFactory();
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(userSession).A01("IgPaymentsReceiptRoute");
        A01.A07 = str;
        A01.A00(bundle);
        Bundle AEf = A01.AEf();
        Rb1 rb1 = new Rb1();
        rb1.setArguments(AEf);
        return rb1;
    }

    public static final CharSequence A08(Context context, Product product, Integer num, Integer num2) {
        String str = product.A0L;
        String str2 = product.A0G;
        if (!product.A05()) {
            return A09(context, str, num);
        }
        return A03(context, num2, str, str2);
    }

    public static final CharSequence A09(Context context, CharSequence charSequence, Integer num) {
        if (num != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new TextAppearanceSpan(context, num.intValue()), 0, spannableString.length(), 33);
            return spannableString;
        }
        return charSequence;
    }

    public static final void A0I(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        FEV.A01.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        if (fragmentActivity != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0F = true;
            C1XJ.A00.A0T();
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            bundle.putString("waterfall_id", obj);
            bundle.putString("prior_module", str2);
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            abstractC59962oe.setArguments(bundle);
            c140966Yy.A0D(abstractC59962oe);
            c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            c140966Yy.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0J(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0D(A06(userSession, fragmentActivity.getString(2131969241), str, str2, str3));
        c140966Yy.A04();
    }

    public static final void A0Q(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        FEV.A01.A00();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        if (fragmentActivity != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0F = true;
            C1XJ.A00.A0T();
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            bundle.putString("waterfall_id", obj);
            bundle.putString("prior_module", str2);
            bundle.putBoolean("is_deferred_payout", z);
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            abstractC59962oe.setArguments(bundle);
            c140966Yy.A0D(abstractC59962oe);
            c140966Yy.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            c140966Yy.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
