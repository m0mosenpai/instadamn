package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.WUb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70399WUb implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A00(C70399WUb.class);
    public static final InterfaceC11380iw A08 = new C70672Wes();
    public static final String __redex_internal_original_name = "PromotedPostsLogger";
    public LinkingAuthState A00;
    public String A02;
    public boolean A04;
    public final C18920wW A05;
    public final UserSession A06;
    public String A01 = "entry_point_unknown";
    public String A03 = C1QE.A01("boost_posts").A05();

    public static void A01(DestinationRecommendationReason destinationRecommendationReason, XIGIGBoostDestination xIGIGBoostDestination, C70399WUb c70399WUb, Long l, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3) {
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(c70399WUb, c70399WUb.A05, "promoted_posts_finish_step");
        A0I.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0I.AAP("m_pk", c70399WUb.A02);
        A0I.AAP("bfa_platform", "native_android");
        C0Zx c0Zx = new C0Zx();
        if (str2 != null) {
            c0Zx.A06("destination", str2);
        }
        if (str5 != null && !str5.isEmpty()) {
            c0Zx.A06("aymt_channel", str5);
        }
        if (xIGIGBoostDestination != null) {
            c0Zx.A06("recommended_destination", xIGIGBoostDestination.toString());
        }
        if (destinationRecommendationReason != null) {
            c0Zx.A06("destination_recommendation_reason", destinationRecommendationReason.toString());
        }
        C0Zx c0Zx2 = null;
        if (!AbstractC83893oY.A00(list) && !AbstractC83893oY.A00(list2) && list3 != null) {
            c0Zx2 = new C0Zx();
            c0Zx2.A07("selected_set", list);
            c0Zx2.A07("predicted_set", list2);
            c0Zx2.A07("intersection_set", list3);
            c0Zx2.A05("selected_count", Long.valueOf(list.size()));
            c0Zx2.A05("predicted_count", Long.valueOf(list2.size()));
            c0Zx2.A05("intersection_count", Long.valueOf(list3.size()));
            c0Zx2.A04("precision", Double.valueOf(list3.size() / list.size()));
            c0Zx2.A04("recall", Double.valueOf(list3.size() / list2.size()));
        }
        A0I.AAQ(c0Zx, "selected_values");
        C0Zx c0Zx3 = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx3, c70399WUb);
        c0Zx3.A06("m_pk", c70399WUb.A02);
        c0Zx3.A06("media_grid_type", str3);
        c0Zx3.A05(AbstractC111324zv.A00(233), l);
        c0Zx3.A03("dark_post_media_contains_edit", null);
        c0Zx3.A03("dark_post_media_contains_caption", null);
        c0Zx3.A03("dark_post_media_contains_hashtag", null);
        c0Zx3.A03("dark_post_media_contains_location", null);
        c0Zx3.A02(c0Zx2, "recommendation_precision_recall_values");
        c0Zx3.A06(AbstractC111324zv.A00(517), str4);
        AbstractC65702TsY.A1B(A0I, c0Zx3);
    }

    public static void A03(VG4 vg4, C70399WUb c70399WUb, SpecialRequirementCategory specialRequirementCategory, EnumC39597He7 enumC39597He7, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        A02(null, vg4, c70399WUb, specialRequirementCategory, enumC39597He7, bool, bool2, null, bool3, null, str, null, null, null, null, null);
    }

    public static void A04(VG4 vg4, C70399WUb c70399WUb, Boolean bool, String str) {
        A02(null, vg4, c70399WUb, null, null, null, null, bool, null, null, str, null, null, null, null, null);
    }

    public final void A0G(VG4 vg4, String str) {
        A04(vg4, this, null, str);
    }

    public final void A0S(String str, String str2) {
        A06(this, str, str2, null);
    }

    public final void A0T(String str, String str2) {
        A07(this, str, str2, null);
    }

    public final void A0V(String str, String str2, String str3) {
        A08(this, str, str2, str3, null, null);
    }

    public static C70399WUb A00(UserSession userSession) {
        return (C70399WUb) userSession.A01(C70399WUb.class, new C71678WyW(userSession, 1));
    }

    public static void A05(C70399WUb c70399WUb) {
        C1QE.A01("boost_posts").A08();
        c70399WUb.A03 = C1QE.A01("boost_posts").A05();
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(c70399WUb, c70399WUb.A05, "promoted_posts_tap_entry_point");
        A0I.AAP("m_pk", c70399WUb.A02);
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, c70399WUb);
        AbstractC65702TsY.A1B(A0I, c0Zx);
    }

    public static void A06(C70399WUb c70399WUb, String str, String str2, String str3) {
        C18920wW c18920wW = c70399WUb.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_action");
        if (A00.isSampled()) {
            A00.AAP("waterfall_id", c70399WUb.A03);
            A00.AAP("action", str2);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c70399WUb.A01);
            AbstractC65702TsY.A1E(A00, c70399WUb, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            C0Zx c0Zx = new C0Zx();
            AbstractC65702TsY.A1I(c0Zx, c70399WUb);
            c0Zx.A06("last_promote_flow_step", str3);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public static void A07(C70399WUb c70399WUb, String str, String str2, String str3) {
        C18920wW c18920wW = c70399WUb.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_start_step");
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A00.AAP("waterfall_id", c70399WUb.A03);
        AbstractC65702TsY.A1E(A00, c70399WUb, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, c70399WUb);
        c0Zx.A06(AbstractC111324zv.A00(517), str3);
        AbstractC65702TsY.A1A(A00, c0Zx);
    }

    public static void A08(C70399WUb c70399WUb, String str, String str2, String str3, String str4, String str5) {
        C18920wW c18920wW = c70399WUb.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_action_error");
        if (A00.isSampled()) {
            A00.AAP("waterfall_id", c70399WUb.A03);
            A00.AAP("action", str2);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c70399WUb.A01);
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A00.AAP("error_message", str3);
            A00.AAP("error_identifier", str4);
            C0Zx c0Zx = new C0Zx();
            AbstractC65702TsY.A1I(c0Zx, c70399WUb);
            c0Zx.A06("last_promote_flow_step", str5);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public final void A09(DestinationRecommendationReason destinationRecommendationReason, XIGIGBoostDestination xIGIGBoostDestination, XIGIGBoostDestination xIGIGBoostDestination2, VG4 vg4, String str) {
        String str2;
        String str3;
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_ctd_default_messaging_intent_regex_match");
        boolean equals = VG4.A17.equals(vg4);
        StringBuilder A11 = AbstractC166997dE.A11("ig_ctd_default_");
        if (equals) {
            A11.append(destinationRecommendationReason);
            str2 = "_objective_screen";
        } else {
            A11.append(destinationRecommendationReason);
            str2 = "_summary_screen";
        }
        String A0x = AbstractC166997dE.A0x(str2, A11);
        boolean A1X = AbstractC167007dF.A1X(xIGIGBoostDestination, xIGIGBoostDestination2);
        if (XIGIGBoostDestination.A04.equals(xIGIGBoostDestination) && A00.isSampled()) {
            A00.AAK(C4SX.A00(this.A06.userId), "ig_userid");
            A00.A9K("ad_account_id", AbstractC167007dF.A0d());
            StringBuilder sb = new StringBuilder();
            if (A1X) {
                sb.append(A0x);
                str3 = "_opt_in";
            } else {
                sb.append(A0x);
                str3 = "_opt_out";
            }
            A00.AAP("event", AbstractC166997dE.A0x(str3, sb));
            AbstractC25236BEt.A0r(A00, str);
            A00.AAP("media_caption", "");
            A00.Cht();
        }
    }

    public final void A0A(Estimate estimate, XIGIGBoostDestination xIGIGBoostDestination, VG4 vg4, Boolean bool, String str, String str2, String str3, int i, int i2, int i3) {
        String obj;
        Long valueOf;
        Long valueOf2;
        if (xIGIGBoostDestination == null) {
            obj = "";
        } else {
            obj = xIGIGBoostDestination.toString();
        }
        if (estimate == null) {
            valueOf = null;
            valueOf2 = null;
        } else {
            valueOf = Long.valueOf(estimate.A00);
            valueOf2 = Long.valueOf(estimate.A01);
        }
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("destination", obj);
        c0Zx.A06("audience_code", str);
        c0Zx.A05("selected_budget_w_offset", Long.valueOf(i));
        c0Zx.A05(AbstractC111324zv.A00(3061), Long.valueOf(i2));
        c0Zx.A06("currency", str2);
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A05("lower_bound", valueOf);
        c0Zx2.A05("upper_bound", valueOf2);
        c0Zx.A02(c0Zx2, "reach_estimate");
        C0Zx c0Zx3 = new C0Zx();
        c0Zx3.A05("lower_bound", null);
        c0Zx3.A05("upper_bound", null);
        c0Zx.A02(c0Zx3, "outcome_estimate");
        if (i3 >= 0) {
            C0Zx c0Zx4 = new C0Zx();
            c0Zx4.A05("position", AbstractC167007dF.A0d());
            c0Zx.A02(c0Zx4, "selected_boost_packages");
        }
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_submit");
        AbstractC65702TsY.A1D(A00, this, vg4);
        C0Zx c0Zx5 = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx5, this);
        c0Zx5.A06("promote_flow_type", str3);
        c0Zx5.A03("is_default_welcome_message_enabled", bool);
        A00.AAQ(c0Zx5, "configurations");
        A00.AAQ(c0Zx, "selected_values");
        A00.A8R(VHX.IG_ANDROID, "creation_platform_id");
        A00.AAP("bfa_platform", "native_android");
        A00.Cht();
    }

    public final void A0D(VG4 vg4, Boolean bool) {
        A03(vg4, this, null, null, bool, null, null, "ad_preview");
    }

    public final void A0F(VG4 vg4, String str) {
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(this, this.A05, "promoted_posts_finish_step_error");
        A0I.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, vg4.toString());
        C0Zx c0Zx = new C0Zx();
        A0I.AAP("error_message", "User didn't complete billing required wizard");
        A0I.AAQ(c0Zx, "selected_values");
        A0I.AAP("component", null);
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A06(AbstractC111324zv.A00(517), str);
        AbstractC65702TsY.A1B(A0I, c0Zx2);
    }

    public final void A0H(VG4 vg4, String str) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_tap_component");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("messaging_app", str);
            A00.AAP("component", "messaging_app_radio_button");
            AbstractC65702TsY.A1D(A00, this, vg4);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public final void A0I(VG4 vg4, String str) {
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_view_component");
        A00.AAP("component", str);
        AbstractC65702TsY.A1D(A00, this, vg4);
        AbstractC65702TsY.A1B(A00, c0Zx);
    }

    public final void A0K(VG4 vg4, String str, String str2) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_submit_error");
        AbstractC65702TsY.A1D(A00, this, vg4);
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        c0Zx.A06("promote_flow_type", str2);
        A00.AAQ(c0Zx, "configurations");
        A00.AAP("error_message", str);
        A00.AAP("bfa_platform", "native_android");
        A00.Cht();
    }

    public final void A0L(VG4 vg4, String str, String str2, String str3) {
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        if (str2 != null) {
            c0Zx.A06("recommended_destination", str2);
        }
        if (str3 != null) {
            c0Zx.A06("destination_recommendation_reason", str3);
        }
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_view_component");
        A00.AAP("component", str);
        AbstractC65702TsY.A1D(A00, this, vg4);
        AbstractC65702TsY.A1B(A00, c0Zx);
    }

    public final void A0M(VG4 vg4, String str, Throwable th) {
        String str2;
        if (th != null && th.getMessage() != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        A0J(vg4, str, str2);
    }

    public final void A0N(VG4 vg4, boolean z) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_tap_component");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_advantage_audience_toggle_on", Boolean.valueOf(z));
            A00.AAP("component", "adv_audience_toggle");
            AbstractC65702TsY.A1D(A00, this, vg4);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public final void A0O(VG4 vg4, boolean z) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_tap_component");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_advantage_audience_optional_section_open", Boolean.valueOf(z));
            A00.AAP("component", "optional_suggestions");
            AbstractC65702TsY.A1D(A00, this, vg4);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public final void A0P(UserSession userSession, String str, String str2, String str3) {
        this.A01 = str2;
        this.A04 = AbstractC167007dF.A1W(AbstractC68468VRy.A00(userSession).A00);
        A0X(str, str3, null);
    }

    public final void A0Q(EnumC39597He7 enumC39597He7, String str, String str2, String str3, String str4) {
        this.A02 = str;
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        LinkingAuthState linkingAuthState = this.A00;
        if (linkingAuthState == null) {
            linkingAuthState = LinkingAuthState.A03;
        }
        c0Zx.A06("token_auth_state", linkingAuthState.toString());
        if (enumC39597He7 != null) {
            c0Zx.A06("media_boosted_status", enumC39597He7.toString());
        }
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(this, this.A05, "promoted_posts_enter_error");
        A0I.AAP("m_pk", this.A02);
        A0I.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A0I.AAP("error_identifier", str3);
        A0I.AAP("error_message", str4);
        AbstractC65702TsY.A1A(A0I, c0Zx);
    }

    public final void A0R(String str) {
        A07(this, this.A01, str, null);
    }

    public final void A0U(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        A05(this);
    }

    public final void A0W(String str, String str2, String str3) {
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(this, this.A05, "promoted_posts_fetch_data_error");
        AbstractC65702TsY.A1E(A0I, this, "action", str2);
        A0I.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0I.AAP("error_message", str3);
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        AbstractC65702TsY.A1B(A0I, c0Zx);
    }

    public final void A0X(String str, String str2, String str3) {
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        if (str3 != null) {
            c0Zx.A06("audience_identifiers", str3);
        }
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(this, this.A05, "promoted_posts_fetch_data");
        AbstractC65702TsY.A1E(A0I, this, "action", str2);
        A0I.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC65702TsY.A1B(A0I, c0Zx);
    }

    public final void A0Y(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(this, this.A05, "promoted_posts_start_step");
        AbstractC65702TsY.A1E(A0I, this, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        C0Zx c0Zx = new C0Zx();
        AbstractC65702TsY.A1I(c0Zx, this);
        c0Zx.A06("prefill_destination", str2);
        c0Zx.A06("prefill_website", str3);
        c0Zx.A06("prefill_website_cta", str4);
        c0Zx.A06("aymt_channel", str5);
        c0Zx.A06("recommended_destination", str6);
        c0Zx.A06("destination_recommendation_reason", str7);
        AbstractC65702TsY.A1A(A0I, c0Zx);
    }

    public final void A0Z(String str, String str2, Throwable th) {
        String str3;
        if (th != null && th.getMessage() != null) {
            str3 = th.getMessage();
        } else {
            str3 = "";
        }
        A08(this, str, str2, str3, null, null);
    }

    public C70399WUb(UserSession userSession) {
        this.A05 = AbstractC12220kQ.A01(A08, userSession);
        this.A06 = userSession;
        this.A04 = AbstractC167007dF.A1W(AbstractC68468VRy.A00(userSession).A00);
    }

    public final void A0B(VG4 vg4) {
        A01(null, null, this, null, vg4.toString(), null, null, null, null, null, null, null);
    }

    public final void A0C(VG4 vg4, PromoteData promoteData) {
        String obj = vg4.toString();
        String A0k = AbstractC31180DnO.A0k(promoteData.A0i);
        String str = promoteData.A1E;
        A01(promoteData.A0S, promoteData.A0h, this, null, obj, A0k, null, null, str, null, null, null);
    }

    public final void A0E(VG4 vg4, String str) {
        A0X(vg4.toString(), str, null);
    }

    public final void A0J(VG4 vg4, String str, String str2) {
        A0W(vg4.toString(), str, str2);
    }

    public static void A02(XIGIGBoostCallToAction xIGIGBoostCallToAction, VG4 vg4, C70399WUb c70399WUb, SpecialRequirementCategory specialRequirementCategory, EnumC39597He7 enumC39597He7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, String str5, String str6) {
        C18920wW c18920wW = c70399WUb.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "promoted_posts_tap_component");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            AbstractC65702TsY.A1I(c0Zx, c70399WUb);
            if (bool != null) {
                c0Zx.A03("is_story_placement_eligible", bool);
            }
            if (str2 != null) {
                c0Zx.A06("website", str2);
            }
            if (xIGIGBoostCallToAction != null) {
                c0Zx.A06(AbstractC111324zv.A00(1373), xIGIGBoostCallToAction.toString());
            }
            if (specialRequirementCategory != null) {
                c0Zx.A06("regulated_category_type", specialRequirementCategory.A01);
            }
            if (bool2 != null) {
                c0Zx.A03("is_fb_placement_toggle_on", bool2);
            }
            if (bool3 != null) {
                c0Zx.A03("run_continuously", bool3);
            }
            if (str3 != null) {
                c0Zx.A06(MSV.A00(1115), str3);
            }
            if (str4 != null) {
                c0Zx.A06(MSV.A00(1116), str4);
            }
            if (str5 != null) {
                c0Zx.A06("daily_budget_selected", str5);
            }
            if (str6 != null) {
                c0Zx.A06("duration_in_days_selected", str6);
            }
            if (bool4 != null) {
                c0Zx.A03("is_default_welcome_message_enabled", bool4);
            }
            if (bool5 != null) {
                c0Zx.A03("is_taiwan_finserv_toggle_on", bool5);
            }
            if (enumC39597He7 != null) {
                c0Zx.A06("media_boosted_status", enumC39597He7.toString());
            }
            A00.AAP("component", str);
            AbstractC65702TsY.A1D(A00, c70399WUb, vg4);
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }
}
