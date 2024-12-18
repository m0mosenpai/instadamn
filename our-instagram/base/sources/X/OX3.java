package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* loaded from: classes9.dex */
public final class OX3 {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, OX3 ox3, C55011OVw c55011OVw, String str, String str2, int i) {
        EnumC201098ur enumC201098ur;
        C22P c22p;
        boolean A1P = AbstractC167007dF.A1P(i, 1);
        boolean A1a = AbstractC25225BEi.A1a(str2, "QP");
        boolean A1b = AbstractC43593JPy.A1b(c55011OVw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_camera_clips_share_to_facebook_primer_selection");
        String A0t = AbstractC166997dE.A0t(userSession);
        if (A0t == null) {
            A0t = "";
        }
        if (A0f.isSampled()) {
            if (A1a) {
                c22p = C22P.A2C;
            } else {
                c22p = C22P.A49;
            }
            AbstractC167017dG.A1A(c22p, A0f);
            MSW.A1M(EnumC50631MWs.A0G, A0f);
            MSW.A1O(AnonymousClass249.NONE, A0f);
            A0f.A8R(MYO.OTHER, "media_source");
            A0f.A8R(EnumC193318hB.A08, "capture_type");
            AbstractC166987dD.A1S(A0f, A0t);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.A7v("is_crosspost", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(A1P), "allow_selection", A1b));
            AbstractC37302Gc3.A0t(A0f);
            AbstractC50523MSb.A0z(A0f, "1337");
        }
        if (A1P) {
            enumC201098ur = EnumC201098ur.ACCEPT;
        } else {
            enumC201098ur = EnumC201098ur.DECLINE;
        }
        C55195Oe1.A02(enumC201098ur, userSession, c55011OVw);
        if (C14360o3.A0K(str2, "PRO_HOME")) {
            fragmentActivity.finish();
        } else {
            AbstractC25225BEi.A0r(fragmentActivity, userSession).A0G(str2, 1);
        }
        if (A1P) {
            C55195Oe1.A01(fragmentActivity, interfaceC11380iw, userSession, A1P);
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            A0P.A0A = str2;
            A0P.A0D(ox3.A02(userSession, str2, str));
            A0P.A04();
            return;
        }
        if (!C14360o3.A0K(str2, "PRO_HOME")) {
            return;
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/user/set_default_share_to_fb_enabled/");
        A0c.A9s("default_share_to_fb_enabled", "false");
        A0c.A9s("bonus_xar_upsell_declined_via_comms", "true");
        A0c.A9s("container_module", interfaceC11380iw.getModuleName());
        C1GJ.A03(AbstractC31175DnJ.A0D(A0c, C40781ul.class, C55702hA.class, true));
    }

    public final C72743Nv A01(UserSession userSession, String str, String str2) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C09530e4 A1L = AbstractC166987dD.A1L("deal_template_id", str);
        if (str2 != null) {
            str3 = AbstractC31178DnM.A0f(str2);
        } else {
            str3 = null;
        }
        return AbstractC31180DnO.A0G(userSession, "com.instagram.incentive_platform.screens.deal_information_unit", AbstractC06930Yk.A02(AbstractC25229BEm.A1b(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3, A1L)));
    }

    public final KC3 A04(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        C82G c82g;
        Long l;
        C22P c22p;
        MYO myo = MYO.OTHER;
        boolean equals = str2.equals("QP");
        if (!equals) {
            c82g = C82G.A0K;
        } else {
            c82g = C82G.A0M;
        }
        C55011OVw c55011OVw = new C55011OVw(c82g, C82H.A0n, myo, null, interfaceC11380iw.getModuleName(), "1337", null, 0);
        boolean z = !equals;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_camera_clips_share_to_facebook_primer_impression");
        String A0t = AbstractC166997dE.A0t(userSession);
        if (A0t == null) {
            A0t = "";
        }
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "RecommendOnFbUtils");
        C08730cb c08730cb = C17060sy.A01;
        Integer B7S = AbstractC31171DnF.A0T(userSession, c08730cb).B7S();
        if (B7S != null) {
            l = AbstractC25229BEm.A0n(B7S);
        } else {
            l = null;
        }
        if (A0f.isSampled()) {
            if (z) {
                c22p = C22P.A2C;
            } else {
                c22p = C22P.A49;
            }
            AbstractC50522MSa.A16(c22p, A0f, 2);
            MSW.A1M(EnumC50631MWs.A0G, A0f);
            MSW.A1O(AnonymousClass249.NONE, A0f);
            A0f.A8R(myo, "media_source");
            A0f.A8R(EnumC193318hB.A08, "capture_type");
            AbstractC166987dD.A1S(A0f, A0t);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.A7v("is_crosspost", false);
            AbstractC37302Gc3.A0t(A0f);
            A0f.A7v("do_not_use_is_fb_connected", Boolean.valueOf(A1X));
            A0f.A9K("follower_count", l);
            AbstractC50523MSb.A0z(A0f, "1337");
        }
        C55195Oe1.A02(EnumC201098ur.VIEW, userSession, c55011OVw);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131955705);
        IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_money_pano_outline_24);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        InfoItem infoItem = new InfoItem(simpleIconConfig, valueOf, A0p, null);
        String A0c = AbstractC31178DnM.A0c(fragmentActivity, c08730cb.A01(userSession), 2131955706);
        C14360o3.A07(A0c);
        PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(new TitleIcon(null, R.drawable.ig_illustrations_illo_reels_distribution_refresh), null, null, null, null, null, null, null, "recommend_on_facebook_primer", AbstractC166997dE.A0p(fragmentActivity, 2131955703), AbstractC166997dE.A0p(fragmentActivity, 2131955708), null, AbstractC16960so.A1Q(infoItem, AbstractC50523MSb.A0L(valueOf, A0c, R.drawable.instagram_facebook_circle_pano_outline_24), AbstractC50523MSb.A0L(valueOf, AbstractC166997dE.A0p(fragmentActivity, 2131955707), R.drawable.instagram_circle_play_pano_outline_24)), 2131955709, true, true, false);
        String A0p2 = AbstractC166997dE.A0p(fragmentActivity, 2131955734);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(fragmentActivity, A0p2, 2131955704));
        AnonymousClass773.A03(A0H, new C50764MbV(0, fragmentActivity, userSession), A0p2);
        C47947LGc c47947LGc = new C47947LGc(userSession, primerBottomSheetConfig, A0H, false, false, false);
        c47947LGc.A00 = new ViewOnClickListenerC55428Ojd(fragmentActivity, interfaceC11380iw, userSession, this, c55011OVw, str, str2);
        c47947LGc.A01 = new ViewOnClickListenerC38248Grr(fragmentActivity, interfaceC11380iw, this, userSession, c55011OVw, str2, 1);
        return C47947LGc.A00(c47947LGc);
    }

    public final C72743Nv A02(UserSession userSession, String str, String str2) {
        return AbstractC31180DnO.A0G(userSession, "com.bloks.www.ig.bonus.bonus-progress-tracking", AbstractC06930Yk.A02(AbstractC25229BEm.A1b("fbid_of_incentive", str2, AbstractC166987dD.A1L("origin", AbstractC31178DnM.A0f(str)))));
    }

    public final N6G A03(UserSession userSession, String str, String str2, String str3) {
        N6G nq3;
        Bundle A0C = AbstractC31177DnL.A0C(userSession);
        A0C.putString("ARGUMENT_ENTRY_POINT", str);
        A0C.putString("ARGUMENT_ENTRY_EXTRA", str2);
        if (str3 != null) {
            A0C.putString("ARGUMENT_PROGRAM_TYPE", str3);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36316564122767882L)) {
            nq3 = new EgI();
        } else {
            nq3 = new NQ3();
        }
        nq3.setArguments(A0C);
        return nq3;
    }
}
