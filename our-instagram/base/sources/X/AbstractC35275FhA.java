package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1;
import com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FhA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35275FhA {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public static final android.net.Uri A00(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("destination_id") && bundle.containsKey("encoded_query")) {
            Uri.Builder encodedQuery = AbstractC31175DnJ.A04(AnonymousClass001.A0R("ig://", bundle.getString("destination_id"))).encodedQuery(bundle.getString("encoded_query"));
            encodedQuery.appendQueryParameter("dummy_param_random_uuid", AbstractC166997dE.A0n());
            return encodedQuery.build();
        }
        return null;
    }

    public static final void A03(Activity activity, Bundle bundle) {
        C14360o3.A0B(activity, 0);
        Intent A06 = AbstractC31176DnK.A06(activity);
        android.net.Uri A002 = A00(bundle);
        if (A002 != null) {
            A06.setData(A002);
        }
        C12260kU.A0C(activity, A06);
        activity.finish();
    }

    public static final void A04(Activity activity, AbstractC12990ll abstractC12990ll, C2Fb c2Fb, String str, String str2) {
        AbstractC167007dF.A1K(activity, abstractC12990ll);
        if (abstractC12990ll instanceof UserSession) {
            C63397SjR c63397SjR = new C63397SjR(activity, (UserSession) abstractC12990ll, c2Fb, str, false);
            c63397SjR.A0S = str2;
            c63397SjR.A0A();
        }
    }

    public static final void A0C(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167027dH.A12(userSession, fragmentActivity, bundle);
        String string = bundle.getString("media_id");
        if (string != null) {
            String A0Z = AbstractC31171DnF.A0Z(bundle);
            if (A0Z == null) {
                A0Z = "eligiblity_awareness_megaphone_channel";
            }
            C1Y6 A002 = AbstractC69888VxF.A00();
            C35968FuS c35968FuS = new C35968FuS();
            A002.A00 = new C42150Ily(fragmentActivity, 4);
            AbstractC166987dD.A1Z(new PZ9(userSession, fragmentActivity, c35968FuS, A002, string, A0Z, null, 0), C07Y.A00(fragmentActivity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0E(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, HashMap hashMap) {
        FragmentActivity fragmentActivity2;
        Context context;
        InterfaceC53722dB A002 = AbstractC54852fj.A00();
        if (A002 != 0) {
            A002.EfI(C1QO.A0E);
        }
        C08730cb c08730cb = C17060sy.A01;
        AbstractC31171DnF.A1Q(abstractC12990ll);
        UserSession userSession = (UserSession) abstractC12990ll;
        User A01 = c08730cb.A01(userSession);
        if (C2E7.A00(A01) || C2E7.A01(A01)) {
            C14360o3.A0B(abstractC12990ll, 0);
            C006802i.A0p.markerStart(962537714);
            AbstractC167007dF.A0J().postDelayed(new RunnableC36806GKf(abstractC12990ll), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            C35969FuT c35969FuT = new C35969FuT();
            if (C18U.A06(C06090Tz.A05, userSession, 36320966464250904L)) {
                hashMap.put("origin", AnonymousClass001.A0R((String) hashMap.getOrDefault("origin", ""), "_monarch"));
                C66277U6x A012 = C66277U6x.A01(AbstractC111324zv.A00(4132), hashMap);
                if (A002 == 0) {
                    context = fragmentActivity;
                } else {
                    context = (Context) A002;
                }
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC12990ll);
                AbstractC31171DnF.A10(fragmentActivity, A0C, 2131970065);
                AbstractC31173DnH.A14(context, A0C, A012);
            } else {
                if (A002 == 0) {
                    fragmentActivity2 = fragmentActivity;
                } else {
                    fragmentActivity2 = (FragmentActivity) A002;
                }
                A0D(fragmentActivity2, c35969FuT, abstractC12990ll, "com.instagram.pro_home.action", "ProfessionalDashboard", hashMap);
            }
            if (A002 == 0) {
                AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity);
                A0D.A0r(new C55551Oll(3, fragmentActivity, A0D));
                return;
            }
        }
        fragmentActivity.finish();
    }

    public static final void A0F(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, boolean z) {
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC31177DnL.A0m();
        AbstractC31364DqT.A03();
        C32366ENp c32366ENp = new C32366ENp();
        c32366ENp.setArguments(AbstractC31176DnK.A08("quick_promotion"));
        C140966Yy A0N = AbstractC31174DnI.A0N(c32366ENp, fragmentActivity, abstractC12990ll);
        if (!z) {
            A0N.A0D = false;
        }
        A0N.A04();
    }

    public static final C25020B4x A01() {
        C913045j c913045j = C913045j.A00;
        C54s c54s = new C54s(c913045j);
        c54s.A0F("entrypoint", "ad_topics_settings_phase_1");
        c54s.A0F("node_identifier", "ad_topics");
        return new C25020B4x(AbstractC31177DnL.A0K(c54s, c913045j), 4);
    }

    public static final void A06(Bundle bundle, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll instanceof UserSession) {
            AbstractC31173DnH.A1C(bundle, (UserSession) abstractC12990ll);
            C59952od c59952od = new C59952od();
            boolean z = bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK");
            C140966Yy A0O = AbstractC31173DnH.A0O(bundle, c59952od, fragmentActivity, abstractC12990ll);
            if (!z) {
                A0O.A0D = false;
            }
            A0O.A04();
            return;
        }
        AbstractC35178FfV.A01(fragmentActivity, bundle, abstractC12990ll);
    }

    public static final void A08(Bundle bundle, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll instanceof UserSession) {
            HDI hdi = new HDI();
            AbstractC31173DnH.A1C(bundle, (UserSession) abstractC12990ll);
            hdi.setArguments(bundle);
            boolean z = bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK");
            C140966Yy A0N = AbstractC31174DnI.A0N(hdi, fragmentActivity, abstractC12990ll);
            if (!z) {
                A0N.A0D = false;
            }
            A0N.A04();
            return;
        }
        AbstractC35178FfV.A01(fragmentActivity, bundle, abstractC12990ll);
    }

    public static final void A09(Bundle bundle, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        String str;
        C57312k6 A002;
        InterfaceC16620sF deepLinkUtil$handlePromoteFlowDeepLink$1;
        String A0Z;
        int i;
        int i2;
        AbstractC167017dG.A1P(fragmentActivity, bundle);
        String string = bundle.getString("media_id");
        boolean z = bundle.getBoolean("is_client_spec_override");
        AbstractC31171DnF.A1Q(abstractC12990ll);
        UserSession userSession = (UserSession) abstractC12990ll;
        if (z) {
            if (string != null) {
                String string2 = bundle.getString("objective");
                String string3 = bundle.getString("duration");
                String string4 = bundle.getString("budget");
                C15370ps A1F = AbstractC25225BEi.A1F();
                String A0Z2 = AbstractC31171DnF.A0Z(bundle);
                A1F.A00 = A0Z2;
                if (A0Z2 == null || A0Z2.length() == 0) {
                    A1F.A00 = "DEEP_LINK_UNKNOWN";
                }
                if (string4 != null) {
                    i = Integer.parseInt(string4);
                } else {
                    i = 0;
                }
                if (string3 != null) {
                    i2 = Integer.parseInt(string3);
                } else {
                    i2 = 0;
                }
                A002 = C07Y.A00(fragmentActivity);
                deepLinkUtil$handlePromoteFlowDeepLink$1 = new DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(fragmentActivity, userSession, string, string2, null, A1F, i, i2);
                AbstractC166987dD.A1Z(deepLinkUtil$handlePromoteFlowDeepLink$1, A002);
                return;
            }
            C14360o3.A0B(userSession, 0);
            String string5 = bundle.getString("coupon_offer_id");
            boolean z2 = bundle.getBoolean(AbstractC111324zv.A00(2611), false);
            boolean z3 = bundle.getBoolean("is_ctwa_coupon_aymt", false);
            boolean z4 = bundle.getBoolean("is_cta_ctwa_aymt", false);
            A0Z = AbstractC31171DnF.A0Z(bundle);
            if (A0Z != null || A0Z.length() == 0) {
                A0Z = "DEEP_LINK_UNKNOWN";
            }
            boolean z5 = bundle.getBoolean("has_relaunched_from_main_activity", false);
            if (!(fragmentActivity instanceof InterfaceC53722dB) || !z5) {
                AbstractC69888VxF.A00().A0A(fragmentActivity, userSession, A0Z, string5, z2, z3, z4);
                return;
            }
        } else {
            if (string != null) {
                String string6 = bundle.getString("coupon_offer_id");
                String string7 = bundle.getString("objective");
                boolean z6 = bundle.getBoolean("is_cta_ctwa_aymt");
                boolean z7 = bundle.getBoolean("is_ctwa_coupon_aymt");
                boolean z8 = bundle.getBoolean("is_cta_lead_ads_aymt");
                String string8 = bundle.getString("aymt_channel");
                C15370ps A1F2 = AbstractC25225BEi.A1F();
                A1F2.A00 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                String string9 = bundle.getString("referral_code");
                CharSequence charSequence = (CharSequence) A1F2.A00;
                if (charSequence == null || charSequence.length() == 0) {
                    if (string9 != null && string9.length() != 0) {
                        str = AbstractC111324zv.A00(3990);
                    } else {
                        str = "DEEP_LINK_UNKNOWN";
                    }
                    A1F2.A00 = str;
                }
                boolean z9 = bundle.getBoolean("has_relaunched_from_main_activity", false);
                if (fragmentActivity instanceof InterfaceC53722dB) {
                    A002 = C07Y.A00(fragmentActivity);
                    deepLinkUtil$handlePromoteFlowDeepLink$1 = new DeepLinkUtil$handlePromoteFlowDeepLink$1(fragmentActivity, userSession, string, string6, string7, string8, string9, null, A1F2, z7, z8, z6);
                    AbstractC166987dD.A1Z(deepLinkUtil$handlePromoteFlowDeepLink$1, A002);
                    return;
                }
                if (!z9) {
                    Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("promote");
                    authority.appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A1F2.A00);
                    authority.appendQueryParameter("media_id", string);
                    if (string6 != null) {
                        authority.appendQueryParameter("coupon_offer_id", string6);
                    }
                    if (string7 != null) {
                        authority.appendQueryParameter("objective", string7);
                    }
                    String str2 = "false";
                    String str3 = "false";
                    if (z6) {
                        str3 = "true";
                    }
                    authority.appendQueryParameter("is_cta_ctwa_aymt", str3);
                    if (z7) {
                        str2 = "true";
                    }
                    authority.appendQueryParameter("is_ctwa_coupon_aymt", str2);
                    if (string8 != null) {
                        authority.appendQueryParameter("aymt_channel", string8);
                    }
                    if (string9 != null) {
                        authority.appendQueryParameter("referral_code", string9);
                    }
                    authority.appendQueryParameter("has_relaunched_from_main_activity", "true");
                    C12260kU.A0C(fragmentActivity, AbstractC31173DnH.A09(AbstractC31176DnK.A06(fragmentActivity), authority.build()));
                }
            }
            C14360o3.A0B(userSession, 0);
            String string52 = bundle.getString("coupon_offer_id");
            boolean z22 = bundle.getBoolean(AbstractC111324zv.A00(2611), false);
            boolean z32 = bundle.getBoolean("is_ctwa_coupon_aymt", false);
            boolean z42 = bundle.getBoolean("is_cta_ctwa_aymt", false);
            A0Z = AbstractC31171DnF.A0Z(bundle);
            if (A0Z != null) {
            }
            A0Z = "DEEP_LINK_UNKNOWN";
            boolean z52 = bundle.getBoolean("has_relaunched_from_main_activity", false);
            if (!(fragmentActivity instanceof InterfaceC53722dB)) {
            }
            AbstractC69888VxF.A00().A0A(fragmentActivity, userSession, A0Z, string52, z22, z32, z42);
            return;
        }
        fragmentActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(android.os.Bundle r22, androidx.fragment.app.FragmentActivity r23, X.AbstractC12990ll r24) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35275FhA.A0A(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0ll):void");
    }

    public static final void A02(Activity activity, android.net.Uri uri, AbstractC12990ll abstractC12990ll, String str) {
        AbstractC167017dG.A1N(activity, abstractC12990ll);
        Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity(AbstractC58317Pt9.A00(8), "android.intent.category.APP_BROWSER");
        makeMainSelectorActivity.setData(uri);
        if (!C12260kU.A0E(activity, makeMainSelectorActivity)) {
            A04(activity, abstractC12990ll, C2Fb.A1T, uri.toString(), str);
        }
    }

    public static final void A05(Context context, String str) {
        boolean A1a = AbstractC167017dG.A1a(context, str);
        Intent A04 = AbstractC31172DnG.A0l().A04(context, AbstractC25227BEk.A0B(str));
        A04.putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", A1a);
        C12260kU.A0C(context, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(Bundle bundle, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        String str;
        AbstractC167027dH.A12(abstractC12990ll, fragmentActivity, bundle);
        String string = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String string2 = bundle.getString("dummy_param_random_uuid");
        boolean z = bundle.getBoolean("should_show_promotion_content");
        String string3 = bundle.getString("media_id");
        if (string == null || string.length() == 0) {
            string = "deep_link";
        }
        AbstractC155756z4.A00().A02();
        Bundle A0D = AbstractC31177DnL.A0D(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string, "media_id", string3);
        A0D.putBoolean("should_show_promotion_content", z);
        ELG elg = new ELG();
        elg.setArguments(A0D);
        AbstractC31173DnH.A1C(elg.requireArguments(), (UserSession) abstractC12990ll);
        if (fragmentActivity instanceof InterfaceC53722dB) {
            ((InterfaceC53722dB) fragmentActivity).EfI(C1QO.A0E);
            AbstractC31177DnL.A16(elg, fragmentActivity, abstractC12990ll);
            return;
        }
        if (string2 == null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("instagram").authority("pro_inspiration").appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("should_show_promotion_content", str);
            if (string3 != null) {
                appendQueryParameter2.appendQueryParameter("media_id", string3);
            }
            appendQueryParameter2.appendQueryParameter("dummy_param_random_uuid", AbstractC166997dE.A0n());
            C12260kU.A0C(fragmentActivity, AbstractC31173DnH.A09(AbstractC31176DnK.A06(fragmentActivity), appendQueryParameter2.build()));
        }
        fragmentActivity.finish();
    }

    public static final void A0B(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167027dH.A12(fragmentActivity, userSession, bundle);
        String string = bundle.getString("media_id");
        if (string != null) {
            AbstractC155756z4.A00().A02();
            N5O n5o = new N5O();
            n5o.setArguments(AbstractC31174DnI.A0F("media_id", string));
            AbstractC31177DnL.A16(n5o, fragmentActivity, userSession);
        }
    }

    public static final void A0D(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, Map map) {
        AbstractC167017dG.A1N(fragmentActivity, abstractC12990ll);
        C14360o3.A0B(str2, 5);
        A0G(AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll), abstractC12990ll, str, str2, map);
    }

    public static final void A0G(C62862tP c62862tP, AbstractC12990ll abstractC12990ll, String str, String str2, Map map) {
        AbstractC192798gL A05 = C192108fB.A05(abstractC12990ll, str, map);
        A05.A00(new C32390EOr(c62862tP, abstractC12990ll, str, str2, map));
        C1GJ.A03(A05);
    }
}
