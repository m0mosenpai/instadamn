package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.model.androidlink.AndroidLinkImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Geo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37470Geo {
    public static C37471Gep parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            C5Fa c5Fa = null;
            String str3 = null;
            C87703ve c87703ve = null;
            String str4 = null;
            C114555Fb c114555Fb = null;
            String str5 = null;
            C1s4 c1s4 = null;
            ArrayList arrayList = null;
            String str6 = null;
            AppstoreMetadataDictImpl appstoreMetadataDictImpl = null;
            BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            Long l = null;
            H2W h2w = null;
            String str7 = null;
            String str8 = null;
            C87883vw c87883vw = null;
            C38011pl c38011pl = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C114565Fc c114565Fc = null;
            C52r c52r = null;
            C114575Fd c114575Fd = null;
            C1sA c1sA = null;
            IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = null;
            Boolean bool2 = null;
            String str9 = null;
            Boolean bool3 = null;
            String str10 = null;
            Integer num2 = null;
            ArrayList arrayList4 = null;
            DynamicProductAdDisplayOption dynamicProductAdDisplayOption = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str11 = null;
            String str12 = null;
            AdFormatType adFormatType = null;
            C114595Ff c114595Ff = null;
            C38891rO c38891rO = null;
            String str13 = null;
            ArrayList arrayList5 = null;
            H3Y h3y = null;
            C39411sM c39411sM = null;
            String str14 = null;
            C38730H3t c38730H3t = null;
            IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl = null;
            C106004qE c106004qE = null;
            String str15 = null;
            C38211qB c38211qB = null;
            ArrayList arrayList6 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Integer num3 = null;
            ArrayList arrayList7 = null;
            String str16 = null;
            H4L h4l = null;
            C108034tm c108034tm = null;
            String str17 = null;
            String str18 = null;
            C102724k9 c102724k9 = null;
            String str19 = null;
            Integer num4 = null;
            C38697H2i c38697H2i = null;
            String str20 = null;
            C114615Fj c114615Fj = null;
            C51L c51l = null;
            String str21 = null;
            String str22 = null;
            C5G3 c5g3 = null;
            String str23 = null;
            String str24 = null;
            C38739H4d c38739H4d = null;
            C106024qG c106024qG = null;
            String str25 = null;
            String str26 = null;
            C5Fk c5Fk = null;
            C5Fl c5Fl = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            C106594rE c106594rE = null;
            C38891rO c38891rO2 = null;
            TestimonialDictImpl testimonialDictImpl = null;
            Integer num5 = null;
            C38732H3v c38732H3v = null;
            String str27 = null;
            C114625Fm c114625Fm = null;
            Integer num6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("actor_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ad_action".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("ad_disclaimer_info".equals(A0q)) {
                    c5Fa = IR6.parseFromJson(c16l);
                } else if ("ad_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("ad_tag".equals(A0q)) {
                    c87703ve = AbstractC87693vd.parseFromJson(c16l);
                } else if ("ad_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("ads_shopping_info".equals(A0q)) {
                    c114555Fb = AbstractC41239INf.parseFromJson(c16l);
                } else if ("adtaxon_i18n_top1_l7_prediction".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("afi_info".equals(A0q)) {
                    c1s4 = AbstractC39261s3.parseFromJson(c16l);
                } else if ("android_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("appstore_metadata".equals(A0q)) {
                    appstoreMetadataDictImpl = AbstractC87753vj.parseFromJson(c16l);
                } else if ("bca_ppl_removal_option".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption2 = (BrandedContentAdsPaidPartnershipLabelRemovalOption) BrandedContentAdsPaidPartnershipLabelRemovalOption.A01.get(A1P4);
                    brandedContentAdsPaidPartnershipLabelRemovalOption = brandedContentAdsPaidPartnershipLabelRemovalOption2;
                    if (brandedContentAdsPaidPartnershipLabelRemovalOption2 == null) {
                        brandedContentAdsPaidPartnershipLabelRemovalOption = BrandedContentAdsPaidPartnershipLabelRemovalOption.A06;
                    }
                } else if ("brs_threshold".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("buyer_incentive_feed".equals(A0q)) {
                    h2w = AbstractC39791Hl1.parseFromJson(c16l);
                } else if ("campaign_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("carousel_parent_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("carousel_rendering_configuration".equals(A0q)) {
                    c87883vw = AbstractC39803HlD.parseFromJson(c16l);
                } else if ("client_gap_rules".equals(A0q)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("cookies".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList2.add(A1P3);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("cop_render_output".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38781rA parseFromJson2 = AbstractC38771r9.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("creative_transformations".equals(A0q)) {
                    c114565Fc = C69M.parseFromJson(c16l);
                } else if ("creative_transformations_v2".equals(A0q)) {
                    c52r = C69O.parseFromJson(c16l);
                } else if ("cta_info".equals(A0q)) {
                    c114575Fd = AbstractC38255Gry.parseFromJson(c16l);
                } else if ("ctj_ads_info".equals(A0q)) {
                    c1sA = AbstractC39291s9.parseFromJson(c16l);
                } else if ("ctmessaging_ads_info".equals(A0q)) {
                    iGCTMessagingAdsInfoDict = AbstractC1116151a.parseFromJson(c16l);
                } else if ("direct_share".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("display_domain".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("display_fb_page_name".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("dominant_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("dr_ad_type".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("dynamic_ads_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H39 parseFromJson3 = AbstractC41258INz.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("dynamic_product_ad_display_option".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption2 = (DynamicProductAdDisplayOption) DynamicProductAdDisplayOption.A01.get(A1P2);
                    dynamicProductAdDisplayOption = dynamicProductAdDisplayOption2;
                    if (dynamicProductAdDisplayOption2 == null) {
                        dynamicProductAdDisplayOption = DynamicProductAdDisplayOption.A05;
                    }
                } else if ("enable_ads_follow_button".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("enable_reels_end_scene".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("fb_app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("fb_page_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    AdFormatType adFormatType2 = (AdFormatType) AdFormatType.A01.get(A1P);
                    adFormatType = adFormatType2;
                    if (adFormatType2 == null) {
                        adFormatType = AdFormatType.A0A;
                    }
                } else if ("gesture_to_action_info".equals(A0q)) {
                    c114595Ff = AbstractC37921GmI.parseFromJson(c16l);
                } else if ("headline".equals(A0q)) {
                    c38891rO = AbstractC38841rG.parseFromJson(c16l);
                } else if ("hide_flow_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("hide_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("hide_reasons_v2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C39321sD parseFromJson4 = AbstractC39311sC.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList5.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("house_ad_context".equals(A0q)) {
                    h3y = AbstractC39964Hnt.parseFromJson(c16l);
                } else if ("iab_post_click_data".equals(A0q)) {
                    c39411sM = AbstractC39401sL.parseFromJson(c16l);
                } else if ("iaw_wca_exclusion_targeting_rule_oc".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("ig_oops_survey_info".equals(A0q)) {
                    c38730H3t = AbstractC40012Hot.parseFromJson(c16l);
                } else if ("ig_rf_survey_info".equals(A0q)) {
                    iGRFSurveyInfoDictImpl = AbstractC40021Hp3.parseFromJson(c16l);
                } else if ("ig_transparency_and_control_disclaimer_data".equals(A0q)) {
                    c106004qE = AbstractC105964qA.parseFromJson(c16l);
                } else if ("interaction_timestamp".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("invalidation_rules".equals(A0q)) {
                    c38211qB = AbstractC39431sO.parseFromJson(c16l);
                } else if ("ios_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C26121Bh6 parseFromJson5 = AbstractC39748HkK.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList6.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("is_app_mae_ad_exclusion_eligible".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_conversions_ad_with_upcoming_event".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_delayed_skip_ad".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_demo".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_ig_events_excluded_ad".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_luxury_vertical_ad".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_multi_ads_eligible".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pharma_and_sensitive_vertical_ad".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pharma_vertical_ad".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("is_rev_share".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("is_sensitive_vertical_ad".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                } else if ("item_type".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList7.add(A00);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("lead_gen_multi_ads_data".equals(A0q)) {
                    h4l = AbstractC40095HqM.parseFromJson(c16l);
                } else if ("lead_gen_preclick_data".equals(A0q)) {
                    c108034tm = AbstractC107994ti.parseFromJson(c16l);
                } else if ("link_hint_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("link_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("media_background".equals(A0q)) {
                    c102724k9 = AbstractC102684k5.parseFromJson(c16l);
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str19 = null;
                    } else {
                        str19 = c16l.A1P();
                    }
                } else if ("media_type".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("multi_ads_data".equals(A0q)) {
                    c38697H2i = AbstractC39818HlS.parseFromJson(c16l);
                } else if ("multi_ads_media_tap_destination".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str20 = null;
                    } else {
                        str20 = c16l.A1P();
                    }
                } else if ("music_info".equals(A0q)) {
                    c114615Fj = AbstractC41281IOw.parseFromJson(c16l);
                } else if ("on_impressions_control".equals(A0q)) {
                    c51l = C51J.parseFromJson(c16l);
                } else if ("original_dominant_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str21 = null;
                    } else {
                        str21 = c16l.A1P();
                    }
                } else if ("overlay_ad_host_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str22 = null;
                    } else {
                        str22 = c16l.A1P();
                    }
                } else if ("overlay_ads_format".equals(A0q)) {
                    c5g3 = AbstractC40131Hqy.parseFromJson(c16l);
                } else if ("overlay_subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str23 = null;
                    } else {
                        str23 = c16l.A1P();
                    }
                } else if ("page_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str24 = null;
                    } else {
                        str24 = c16l.A1P();
                    }
                } else if ("pcm".equals(A0q)) {
                    c38739H4d = AbstractC40159HrU.parseFromJson(c16l);
                } else if ("political_context".equals(A0q)) {
                    c106024qG = AbstractC106014qF.parseFromJson(c16l);
                } else if ("primary_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str25 = null;
                    } else {
                        str25 = c16l.A1P();
                    }
                } else if ("primary_media_pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str26 = null;
                    } else {
                        str26 = c16l.A1P();
                    }
                } else if ("reels_mid_scene_info".equals(A0q)) {
                    c5Fk = AbstractC41367ISu.parseFromJson(c16l);
                } else if ("reels_multi_ads_info".equals(A0q)) {
                    c5Fl = I9N.parseFromJson(c16l);
                } else if ("should_fetch_preview_comments".equals(A0q)) {
                    bool16 = Boolean.valueOf(c16l.A0d());
                } else if ("show_ad_choices".equals(A0q)) {
                    bool17 = Boolean.valueOf(c16l.A0d());
                } else if ("sponsored_ad_disclaimer".equals(A0q)) {
                    c106594rE = AbstractC87673vZ.parseFromJson(c16l);
                } else if ("testimonial_data".equals(A0q)) {
                    c38891rO2 = AbstractC38841rG.parseFromJson(c16l);
                } else if ("testimonial_data_v2".equals(A0q)) {
                    testimonialDictImpl = AbstractC102204ir.parseFromJson(c16l);
                } else if ("testimonial_variant".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("text_overlay".equals(A0q)) {
                    c38732H3v = AbstractC40022Hp5.parseFromJson(c16l);
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str27 = null;
                    } else {
                        str27 = c16l.A1P();
                    }
                } else if ("urp_card_transformation".equals(A0q)) {
                    c114625Fm = IPT.parseFromJson(c16l);
                } else if ("view_state_item_type".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("ad_action", c16l, "AdMediaItemImpl");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("ad_title", c16l, "AdMediaItemImpl");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("android_links", c16l, "AdMediaItemImpl");
                } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("cookies", c16l, "AdMediaItemImpl");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hide_flow_type", c16l, "AdMediaItemImpl");
                } else if (arrayList5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hide_reasons_v2", c16l, "AdMediaItemImpl");
                } else if (arrayList6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("ios_links", c16l, "AdMediaItemImpl");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_demo", c16l, "AdMediaItemImpl");
                } else if (arrayList7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_ITEMS, c16l, "AdMediaItemImpl");
                } else if (str16 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("label", c16l, "AdMediaItemImpl");
                } else if (str17 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("link_hint_text", c16l, "AdMediaItemImpl");
                } else if (bool17 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_ad_choices", c16l, "AdMediaItemImpl");
                } else if (str27 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("tracking_token", c16l, "AdMediaItemImpl");
                } else {
                    return new C37471Gep(adFormatType, c114555Fb, c1s4, appstoreMetadataDictImpl, brandedContentAdsPaidPartnershipLabelRemovalOption, h2w, c114575Fd, c87883vw, c1sA, c38697H2i, c114565Fc, c52r, dynamicProductAdDisplayOption, c87703ve, c114595Ff, h3y, iGCTMessagingAdsInfoDict, c39411sM, c108034tm, c38730H3t, iGRFSurveyInfoDictImpl, c38732H3v, c106004qE, h4l, c51l, c5g3, c106024qG, c38739H4d, c102724k9, c106594rE, c114615Fj, testimonialDictImpl, c114625Fm, c38891rO, c38891rO2, c5Fa, c38211qB, c5Fk, c5Fl, c38011pl, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, num2, num3, num4, num5, num6, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, num.intValue(), bool.booleanValue(), bool17.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("ad_id", c16l, "AdMediaItemImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
