package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Y6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y6 {
    public static C1Y6 A01;
    public XDF A00;

    private final void A00(Bundle bundle, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        BaseFragmentActivity baseFragmentActivity;
        if ((fragmentActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) fragmentActivity) != null) {
            baseFragmentActivity.registerOnActivityResultListener(new C70730Wfw(bundle, fragmentActivity, baseFragmentActivity, this, interfaceC11380iw, userSession));
        }
        C70816WhZ A00 = VRD.A00(userSession);
        C67908V1x c67908V1x = C67908V1x.A00;
        if (c67908V1x.A00 != 0) {
            C70816WhZ.A00(c67908V1x, A00);
        }
        C1QT c1qt = A00.A00;
        long flowStartForMarker = c1qt.flowStartForMarker(c67908V1x.A01, str, true);
        c67908V1x.A00 = flowStartForMarker;
        c1qt.flowAnnotate(flowStartForMarker, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        Intent intent = new Intent(fragmentActivity, (Class<?>) PromoteActivity.class);
        intent.putExtras(bundle);
        C12260kU.A08(fragmentActivity, intent, 17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A06(Fragment fragment, WEX wex, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        UserSession userSession = wex.A03;
        C70399WUb.A00(userSession).A0U(wex.A09, wex.A0A);
        if (fragment instanceof InterfaceC59992oh) {
            InterfaceC59992oh interfaceC59992oh = (InterfaceC59992oh) fragment;
            interfaceC59992oh.registerLifecycleListener(new EVE(fragment, interfaceC11380iw, interfaceC59992oh));
        }
        Bundle A00 = WEX.A00(wex);
        Intent intent = new Intent(fragment.requireContext(), (Class<?>) PromoteActivity.class);
        intent.putExtras(A00);
        C12260kU.A06(fragment, intent, 17);
    }

    public final void A07(Fragment fragment, XDF xdf, PromoteLaunchOrigin promoteLaunchOrigin, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        C69667Vt8 c69667Vt8 = new C69667Vt8(fragment.requireActivity(), interfaceC11380iw, userSession, c38321qM, str);
        c69667Vt8.A06 = str2;
        c69667Vt8.A0B = false;
        c69667Vt8.A03 = promoteLaunchOrigin;
        c69667Vt8.A0F = z;
        c69667Vt8.A02 = xdf;
        A0C(c69667Vt8);
    }

    public final void A08(Fragment fragment, XDF xdf, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        PromoteLaunchOrigin promoteLaunchOrigin;
        BoostFlowType boostFlowType;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 4);
        if (xdf != null) {
            this.A00 = xdf;
            xdf.DOa();
        }
        if (!list.isEmpty()) {
            String str3 = (String) AbstractC001800i.A0I(list);
            if (list.size() == 2) {
                promoteLaunchOrigin = PromoteLaunchOrigin.A02;
                boostFlowType = BoostFlowType.A03;
            } else {
                promoteLaunchOrigin = PromoteLaunchOrigin.A08;
                boostFlowType = BoostFlowType.A06;
            }
            FragmentActivity requireActivity = fragment.requireActivity();
            C09530e4 c09530e4 = new C09530e4("promote_launch_origin", promoteLaunchOrigin);
            C09530e4 c09530e42 = new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            C09530e4 c09530e43 = new C09530e4("is_sub_flow", true);
            C09530e4 c09530e44 = new C09530e4("media_id", AbstractC69888VxF.A01(str3));
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC69888VxF.A01((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            AbstractC001800i.A0r(arrayList, arrayList2);
            A00(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("media_ids", arrayList2), new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str), new C09530e4("coupon_offer_id", str2), new C09530e4("is_ctwa_coupon_aymt", Boolean.valueOf(z)), new C09530e4("is_from_direct_inbox_entry_point", Boolean.valueOf(z2)), new C09530e4("is_from_ctwa_upsell", Boolean.valueOf(z3)), new C09530e4("boost_flow_type", boostFlowType)), requireActivity, interfaceC11380iw, userSession, str);
        }
    }

    public final void A09(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        A0A(fragmentActivity, userSession, str, null, false, false, false);
    }

    public final void A0A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3) {
        Bundle bundle;
        Fragment c67885V0r;
        EnumC68121VCe enumC68121VCe;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(str, 2);
        A01(this);
        if (fragmentActivity instanceof InterfaceC53722dB) {
            C70399WUb A00 = C70399WUb.A00(userSession);
            A00.A01 = str;
            A00.A02 = null;
            C70399WUb.A05(A00);
            if (str.equals("organic_insights_compare_cell")) {
                AbstractC155756z4.A00().A00();
                enumC68121VCe = EnumC68121VCe.A02;
            } else if (WG1.A02(userSession)) {
                AbstractC155756z4.A00().A00();
                enumC68121VCe = EnumC68121VCe.A03;
            } else {
                AbstractC155756z4.A00().A00.getValue();
                bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                bundle.putString("coupon_offer_id", str2);
                bundle.putBoolean("is_from_direct_inbox_entry_point", z);
                bundle.putBoolean("is_ctwa_coupon_aymt", z2);
                bundle.putBoolean("is_from_ctwa_upsell", z3);
                c67885V0r = new C67885V0r();
                c67885V0r.setArguments(bundle);
                C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
                c140966Yy.A0D(c67885V0r);
                c140966Yy.A08();
                c140966Yy.A04();
                return;
            }
            bundle = new Bundle();
            c67885V0r = new KCH();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            bundle.putString("media_picker_option", enumC68121VCe.toString());
            bundle.putString("coupon_offer_id", str2);
            bundle.putBoolean("is_from_direct_inbox_entry_point", z);
            bundle.putBoolean("is_ctwa_coupon_aymt", z2);
            bundle.putBoolean("is_from_ctwa_upsell", z3);
            c67885V0r.setArguments(bundle);
            C140966Yy c140966Yy2 = new C140966Yy(fragmentActivity, userSession);
            c140966Yy2.A0D(c67885V0r);
            c140966Yy2.A08();
            c140966Yy2.A04();
            return;
        }
        Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("promote");
        authority.appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        authority.appendQueryParameter("is_from_direct_inbox_entry_point", String.valueOf(z));
        if (str2 != null) {
            authority.appendQueryParameter("coupon_offer_id", str2);
        }
        authority.appendQueryParameter("has_relaunched_from_main_activity", "true");
        Intent data = C14H.A03.A00().A01(fragmentActivity).setData(authority.build());
        C14360o3.A07(data);
        C12260kU.A0C(fragmentActivity, data);
        fragmentActivity.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0534, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A08, 36319471815695824L) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0237, code lost:
    
        if (r1 != 10) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x025e, code lost:
    
        switch(r9.ordinal()) {
            case 0: goto L117;
            case 1: goto L31;
            case 2: goto L31;
            case 3: goto L120;
            case 4: goto L31;
            case 5: goto L120;
            case 6: goto L117;
            case 7: goto L117;
            case 8: goto L31;
            case 9: goto L117;
            default: goto L31;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0263, code lost:
    
        if (r6 != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0265, code lost:
    
        r0 = X.C05F.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x026d, code lost:
    
        if (r6 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x026f, code lost:
    
        r0 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0273, code lost:
    
        r0 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0258, code lost:
    
        if (X.C18U.A06(r5, r10, r0) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00f9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C69667Vt8 r15) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Y6.A0C(X.Vt8):void");
    }

    public static final void A01(C1Y6 c1y6) {
        XDF xdf = c1y6.A00;
        if (xdf != null) {
            xdf.DOV();
        }
        c1y6.A00 = null;
    }

    public static final void A02(C1Y6 c1y6, C69667Vt8 c69667Vt8, boolean z) {
        C69490VoD c69490VoD = new C69490VoD(c69667Vt8);
        UserSession userSession = c69490VoD.A08;
        AbstractC54961OSm.A01(c69490VoD.A02, new O79(c1y6, c69667Vt8), userSession, c69490VoD.A0A, C70399WUb.A00(userSession).A03, z);
    }

    public static final void A03(C1Y6 c1y6, C69490VoD c69490VoD) {
        UserSession userSession = c69490VoD.A08;
        FragmentActivity fragmentActivity = c69490VoD.A02;
        InterfaceC11380iw interfaceC11380iw = c69490VoD.A07;
        String str = c69490VoD.A0G;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("media_id", c69490VoD.A0H);
        bundle.putSerializable("promote_launch_origin", c69490VoD.A06);
        bundle.putString("audience_id", null);
        bundle.putParcelable("media_url", null);
        bundle.putString("ad_account_id", null);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        bundle.putBoolean("is_sub_flow", c69490VoD.A0Q);
        bundle.putString("coupon_offer_id", c69490VoD.A0E);
        bundle.putString("objective", c69490VoD.A0I);
        bundle.putString("destination_cta", null);
        bundle.putString("political_ad_byline_text", null);
        bundle.putBoolean("has_product_tag", c69490VoD.A0M);
        bundle.putStringArray("sponsor_ids", c69490VoD.A0R);
        bundle.putSerializable("destination", c69490VoD.A03);
        bundle.putSerializable("personalized_destination", null);
        bundle.putInt("default_budget", c69490VoD.A00);
        bundle.putInt("default_duration", c69490VoD.A01);
        bundle.putBoolean("is_from_ctwa_upsell", c69490VoD.A0O);
        bundle.putBoolean("is_ctwa_coupon_aymt", c69490VoD.A0N);
        bundle.putBoolean("is_from_lead_ads_upsell", c69490VoD.A0P);
        bundle.putString("aymt_channel", c69490VoD.A0D);
        bundle.putSerializable("media_product_type", c69490VoD.A0B);
        bundle.putBoolean("is_from_direct_inbox_entry_point", false);
        bundle.putString("selected_audio_spec", c69490VoD.A0K);
        bundle.putParcelable("selected_audio_overlay_track", c69490VoD.A0C);
        bundle.putString("reference_code_for_aymt_dropoff", c69490VoD.A0J);
        bundle.putString("draft_id", c69490VoD.A0F);
        bundle.putSerializable("boost_flow_type", c69490VoD.A05);
        bundle.putBoolean("has_bio_product", c69490VoD.A0L);
        bundle.putSerializable("media_boosted_status", c69490VoD.A09);
        c1y6.A00(bundle, fragmentActivity, interfaceC11380iw, userSession, str);
    }

    private final void A04(C69667Vt8 c69667Vt8, boolean z) {
        C69490VoD c69490VoD = new C69490VoD(c69667Vt8);
        C193328hC c193328hC = new C193328hC((Activity) c69490VoD.A02);
        int i = 2131953999;
        if (z) {
            i = 2131953995;
        }
        c193328hC.A0A(i);
        c193328hC.A09(2131953998);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC55269Ofi(this, c69667Vt8), 2131954034);
        c193328hC.A0H(new WHR(this, c69490VoD), 2131954033);
        c193328hC.A0D(new WHS(this, c69490VoD));
        C0fJ.A00(c193328hC.A02());
    }

    public final void A0B(WEX wex) {
        UserSession userSession = wex.A03;
        C70399WUb.A00(userSession).A0U(wex.A09, wex.A0A);
        Context context = wex.A0E;
        Bundle A00 = WEX.A00(wex);
        Intent intent = new Intent(context, (Class<?>) PromoteActivity.class);
        intent.putExtras(A00);
        C12260kU.A0C(context, intent);
    }

    public final void A05(Context context, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(str5, 6);
        Intent intent = new Intent(context, (Class<?>) PromoteActivity.class);
        intent.putExtras(AbstractC61636Rr0.A00(new C09530e4("promote_launch_origin", PromoteLaunchOrigin.A04), new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), new C09530e4("media_id", AbstractC69888VxF.A01(str)), new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2), new C09530e4("remaining_budget", str3), new C09530e4("remaining_duration", str4), new C09530e4("daily_spend_offset", str5), new C09530e4("spent_budget_offset_amount", Integer.valueOf(i)), new C09530e4("total_budget_offset_amount", Integer.valueOf(i2)), new C09530e4("elapsed_duration_in_days", Integer.valueOf(i3)), new C09530e4("total_duration_in_days", Integer.valueOf(i4)), new C09530e4("remaining_duration_in_hours", Integer.valueOf(i5)), new C09530e4("boosted_id", str6)));
        C12260kU.A0C(context, intent);
    }
}
