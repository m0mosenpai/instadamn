package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.CallAdsInfoDictImpl;
import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTATextVariantSource;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextDictImpl;
import com.instagram.api.schemas.IGRFSurveyContextMappingDict;
import com.instagram.api.schemas.IGRFSurveyContextMappingDictImpl;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.IceBreakerMessage;
import com.instagram.api.schemas.OnFeedMessages;
import com.instagram.api.schemas.PartnerTypes;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.PrivacyDisclosureInfoImpl;
import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.SocialProofInfoImpl;
import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.api.schemas.WhatsAppAttributionInfo;
import com.instagram.api.schemas.WhatsAppAttributionInfoImpl;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39241s1 {
    public static C39531sa parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        String A1P9;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C5Fa c5Fa = null;
            Long l = null;
            String str4 = null;
            Integer num = null;
            C37881pR c37881pR = null;
            C87703ve c87703ve = null;
            String str5 = null;
            C37881pR c37881pR2 = null;
            AdsIAWRatingInfo adsIAWRatingInfo = null;
            AdsRatingInfo adsRatingInfo = null;
            C114555Fb c114555Fb = null;
            String str6 = null;
            C1s4 c1s4 = null;
            String str7 = null;
            AppstoreMetadataDictImpl appstoreMetadataDictImpl = null;
            BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            C914346k c914346k = null;
            ArrayList arrayList = null;
            Long l2 = null;
            H2W h2w = null;
            CallAdsInfoDictImpl callAdsInfoDictImpl = null;
            String str8 = null;
            ArrayList arrayList2 = null;
            C1s7 c1s7 = null;
            String str9 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            String str10 = null;
            C114565Fc c114565Fc = null;
            C52r c52r = null;
            C114575Fd c114575Fd = null;
            CTAStyle cTAStyle = null;
            C87563vO c87563vO = null;
            C1sA c1sA = null;
            IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = null;
            C38691H2c c38691H2c = null;
            Boolean bool = null;
            String str11 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str12 = null;
            Integer num2 = null;
            ArrayList arrayList5 = null;
            DynamicProductAdDisplayOption dynamicProductAdDisplayOption = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str13 = null;
            String str14 = null;
            C114585Fe c114585Fe = null;
            AdFormatType adFormatType = null;
            C114595Ff c114595Ff = null;
            Integer num3 = null;
            Integer num4 = null;
            String str15 = null;
            ArrayList arrayList6 = null;
            C39381sJ c39381sJ = null;
            C39411sM c39411sM = null;
            String str16 = null;
            UQv uQv = null;
            UQw uQw = null;
            AdsCTATrustInfo adsCTATrustInfo = null;
            AdsTextTrustInfo adsTextTrustInfo = null;
            IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl = null;
            IGCTATextVariantImpl iGCTATextVariantImpl = null;
            String str17 = null;
            C100444f8 c100444f8 = null;
            C5L8 c5l8 = null;
            C38730H3t c38730H3t = null;
            C1117552c c1117552c = null;
            IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl = null;
            C106004qE c106004qE = null;
            C102724k9 c102724k9 = null;
            Integer num5 = null;
            Integer num6 = null;
            C38211qB c38211qB = null;
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
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Integer num7 = null;
            ArrayList arrayList7 = null;
            String str18 = null;
            Boolean bool30 = null;
            ArrayList arrayList8 = null;
            String str19 = null;
            Boolean bool31 = null;
            String str20 = null;
            ArrayList arrayList9 = null;
            Boolean bool32 = null;
            C108034tm c108034tm = null;
            String str21 = null;
            String str22 = null;
            C102724k9 c102724k92 = null;
            String str23 = null;
            C114605Fi c114605Fi = null;
            C114615Fj c114615Fj = null;
            C51L c51l = null;
            String str24 = null;
            String str25 = null;
            ArrayList arrayList10 = null;
            String str26 = null;
            String str27 = null;
            C106024qG c106024qG = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl = null;
            C104014mN c104014mN = null;
            C5Fk c5Fk = null;
            C5Fl c5Fl = null;
            C108344uL c108344uL = null;
            Boolean bool33 = null;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            C106594rE c106594rE = null;
            H5V h5v = null;
            IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl = null;
            C38891rO c38891rO = null;
            TestimonialDictImpl testimonialDictImpl = null;
            C38732H3v c38732H3v = null;
            String str28 = null;
            C114625Fm c114625Fm = null;
            Integer num8 = null;
            ArrayList arrayList13 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("about_ad_params".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("actor_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("ad_action".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("ad_disclaimer_info".equals(A0q)) {
                    c5Fa = IR6.parseFromJson(c16l);
                } else if ("ad_expiry_timestamp_in_millis".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("ad_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("ad_objective_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("ad_pod_rules".equals(A0q)) {
                    c37881pR = AbstractC38751r7.parseFromJson(c16l);
                } else if ("ad_tag".equals(A0q)) {
                    c87703ve = AbstractC87693vd.parseFromJson(c16l);
                } else if ("ad_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("adpod_rules".equals(A0q)) {
                    c37881pR2 = AbstractC38751r7.parseFromJson(c16l);
                } else if ("ads_iaw_rating_info".equals(A0q)) {
                    adsIAWRatingInfo = AbstractC41368ISv.parseFromJson(c16l);
                } else if ("ads_rating_and_review_info".equals(A0q)) {
                    adsRatingInfo = C5QZ.parseFromJson(c16l);
                } else if ("ads_shopping_info".equals(A0q)) {
                    c114555Fb = AbstractC41239INf.parseFromJson(c16l);
                } else if ("adtaxon_i18n_top1_l7_prediction".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("afi_info".equals(A0q)) {
                    c1s4 = AbstractC39261s3.parseFromJson(c16l);
                } else if ("app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("appstore_metadata".equals(A0q)) {
                    appstoreMetadataDictImpl = AbstractC87753vj.parseFromJson(c16l);
                } else if ("bca_ppl_removal_option".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P9 = null;
                    } else {
                        A1P9 = c16l.A1P();
                    }
                    brandedContentAdsPaidPartnershipLabelRemovalOption = (BrandedContentAdsPaidPartnershipLabelRemovalOption) BrandedContentAdsPaidPartnershipLabelRemovalOption.A01.get(A1P9);
                    if (brandedContentAdsPaidPartnershipLabelRemovalOption == null) {
                        brandedContentAdsPaidPartnershipLabelRemovalOption = BrandedContentAdsPaidPartnershipLabelRemovalOption.A06;
                    }
                } else if ("bloks_cta_component".equals(A0q)) {
                    c914346k = IQ3.parseFromJson(c16l);
                } else if ("brs_applied_content_blocklists".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("brs_threshold".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("buyer_incentive_feed".equals(A0q)) {
                    h2w = AbstractC39791Hl1.parseFromJson(c16l);
                } else if ("call_ads_info".equals(A0q)) {
                    callAdsInfoDictImpl = AbstractC39795Hl5.parseFromJson(c16l);
                } else if ("campaign_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("cca_optimization_options".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38781rA parseFromJson = AbstractC38771r9.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("click_to_direct_lead_gen_ads_info".equals(A0q)) {
                    c1s7 = C1s6.parseFromJson(c16l);
                } else if ("contextual_label_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("cookies".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P8 = c16l.A1P()) != null) {
                                arrayList3.add(A1P8);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("cop_render_output".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38781rA parseFromJson2 = AbstractC38771r9.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("creation_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("creative_transformations".equals(A0q)) {
                    c114565Fc = C69M.parseFromJson(c16l);
                } else if ("creative_transformations_v2".equals(A0q)) {
                    c52r = C69O.parseFromJson(c16l);
                } else if ("cta_info".equals(A0q)) {
                    c114575Fd = AbstractC38255Gry.parseFromJson(c16l);
                } else if ("cta_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P7 = null;
                    } else {
                        A1P7 = c16l.A1P();
                    }
                    cTAStyle = (CTAStyle) CTAStyle.A01.get(A1P7);
                    if (cTAStyle == null) {
                        cTAStyle = CTAStyle.A06;
                    }
                } else if ("ctd_ads_info".equals(A0q)) {
                    c87563vO = AbstractC87553vN.parseFromJson(c16l);
                } else if ("ctj_ads_info".equals(A0q)) {
                    c1sA = AbstractC39291s9.parseFromJson(c16l);
                } else if ("ctmessaging_ads_info".equals(A0q)) {
                    iGCTMessagingAdsInfoDict = AbstractC1116151a.parseFromJson(c16l);
                } else if ("ctw_fallback_wrapper".equals(A0q)) {
                    c38691H2c = AbstractC39806HlG.parseFromJson(c16l);
                } else if ("direct_share".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("display_domain".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("display_fb_page_name".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("display_viewability_eligible".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("dominant_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("dr_ad_type".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("dynamic_ads_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H39 parseFromJson3 = AbstractC41258INz.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList5.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("dynamic_product_ad_display_option".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P6 = null;
                    } else {
                        A1P6 = c16l.A1P();
                    }
                    dynamicProductAdDisplayOption = (DynamicProductAdDisplayOption) DynamicProductAdDisplayOption.A01.get(A1P6);
                    if (dynamicProductAdDisplayOption == null) {
                        dynamicProductAdDisplayOption = DynamicProductAdDisplayOption.A05;
                    }
                } else if ("enable_ads_follow_button".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("enable_reels_end_scene".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("fb_app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("fb_page_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("feed_end_scene_data".equals(A0q)) {
                    c114585Fe = FSH.parseFromJson(c16l);
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    adFormatType = (AdFormatType) AdFormatType.A01.get(A1P5);
                    if (adFormatType == null) {
                        adFormatType = AdFormatType.A0A;
                    }
                } else if ("gesture_to_action_info".equals(A0q)) {
                    c114595Ff = AbstractC37921GmI.parseFromJson(c16l);
                } else if ("global_position".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("hide_flow_type".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("hide_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("hide_reasons_v2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C39321sD parseFromJson4 = AbstractC39311sC.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList6.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("iab".equals(A0q)) {
                    c39381sJ = AbstractC39341sF.parseFromJson(c16l);
                } else if ("iab_post_click_data".equals(A0q)) {
                    c39411sM = AbstractC39401sL.parseFromJson(c16l);
                } else if ("iaw_wca_exclusion_targeting_rule_oc".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("ig_ad_media_smart_crop_info".equals(A0q)) {
                    uQv = VOQ.parseFromJson(c16l);
                } else if ("ig_ad_media_text_ocr_info".equals(A0q)) {
                    uQw = VOS.parseFromJson(c16l);
                } else if ("ig_ad_rendering_cta_trust_info_data".equals(A0q)) {
                    adsCTATrustInfo = AbstractC40877I9b.parseFromJson(c16l);
                } else if ("ig_ad_rendering_text_trust_info_data".equals(A0q)) {
                    adsTextTrustInfo = AbstractC40881I9f.parseFromJson(c16l);
                } else if ("ig_ads_iab_screenshot_data".equals(A0q)) {
                    iGAdsIABScreenshotDataDictImpl = AbstractC39972Ho7.parseFromJson(c16l);
                } else if ("ig_cta_text_variant_data".equals(A0q)) {
                    iGCTATextVariantImpl = AbstractC33701Eup.parseFromJson(c16l);
                } else if ("ig_events_extracted_date".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("ig_feed_video_watch_and_browse_info".equals(A0q)) {
                    c100444f8 = AbstractC100434f6.parseFromJson(c16l);
                } else if ("ig_format_liquidity_ads_info".equals(A0q)) {
                    c5l8 = C5L7.parseFromJson(c16l);
                } else if ("ig_oops_survey_info".equals(A0q)) {
                    c38730H3t = AbstractC40012Hot.parseFromJson(c16l);
                } else if ("ig_pbia_profile_and_browse_info".equals(A0q)) {
                    c1117552c = AbstractC1117452a.parseFromJson(c16l);
                } else if ("ig_rf_survey_info".equals(A0q)) {
                    iGRFSurveyInfoDictImpl = AbstractC40021Hp3.parseFromJson(c16l);
                } else if ("ig_transparency_and_control_disclaimer_data".equals(A0q)) {
                    c106004qE = AbstractC105964qA.parseFromJson(c16l);
                } else if ("igtv_media_background".equals(A0q)) {
                    c102724k9 = AbstractC102684k5.parseFromJson(c16l);
                } else if ("imp_signature".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("impression_signature".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("invalidation_rules".equals(A0q)) {
                    c38211qB = AbstractC39431sO.parseFromJson(c16l);
                } else if ("isExternalUrlLandingPage".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_app_mae_ad_exclusion_eligible".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_autotranslated".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_bau_ifu_eligible".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_boosted".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_consent_growth_ifu_eligible".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("is_consent_growth_popup_eligible".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("is_conversions_ad_with_upcoming_event".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("is_delayed_skip_ad".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("is_demo".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                } else if ("is_feed_glados_control_eligible".equals(A0q)) {
                    bool16 = Boolean.valueOf(c16l.A0d());
                } else if ("is_form_extension_eligible".equals(A0q)) {
                    bool17 = Boolean.valueOf(c16l.A0d());
                } else if ("is_holdout".equals(A0q)) {
                    bool18 = Boolean.valueOf(c16l.A0d());
                } else if ("is_ig_events_excluded_ad".equals(A0q)) {
                    bool19 = Boolean.valueOf(c16l.A0d());
                } else if ("is_leadgen_native_eligible".equals(A0q)) {
                    bool20 = Boolean.valueOf(c16l.A0d());
                } else if ("is_luxury_vertical_ad".equals(A0q)) {
                    bool21 = Boolean.valueOf(c16l.A0d());
                } else if ("is_multi_ads_eligible".equals(A0q)) {
                    bool22 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pharma_and_sensitive_vertical_ad".equals(A0q)) {
                    bool23 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pharma_vertical_ad".equals(A0q)) {
                    bool24 = Boolean.valueOf(c16l.A0d());
                } else if ("is_post_click_afi_eligible".equals(A0q)) {
                    bool25 = Boolean.valueOf(c16l.A0d());
                } else if ("is_previewable_video_ad".equals(A0q)) {
                    bool26 = Boolean.valueOf(c16l.A0d());
                } else if ("is_rev_share".equals(A0q)) {
                    bool27 = Boolean.valueOf(c16l.A0d());
                } else if ("is_sensitive_vertical_ad".equals(A0q)) {
                    bool28 = Boolean.valueOf(c16l.A0d());
                } else if ("is_shops_ifu_eligible".equals(A0q)) {
                    bool29 = Boolean.valueOf(c16l.A0d());
                } else if ("item_type".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList7.add(A0C);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("lead_gen_allow_phone_zip_format_improvement".equals(A0q)) {
                    bool30 = Boolean.valueOf(c16l.A0d());
                } else if ("lead_gen_android_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson5 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList8.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("lead_gen_call_to_action_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str19 = null;
                    } else {
                        str19 = c16l.A1P();
                    }
                } else if ("lead_gen_force_full_page_context_card".equals(A0q)) {
                    bool31 = Boolean.valueOf(c16l.A0d());
                } else if ("lead_gen_form_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str20 = null;
                    } else {
                        str20 = c16l.A1P();
                    }
                } else if ("lead_gen_ios_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson6 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson6 != null) {
                                arrayList9.add(parseFromJson6);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("lead_gen_new_experience_ineligible".equals(A0q)) {
                    bool32 = Boolean.valueOf(c16l.A0d());
                } else if ("lead_gen_preclick_data".equals(A0q)) {
                    c108034tm = AbstractC107994ti.parseFromJson(c16l);
                } else if ("link_hint_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str21 = null;
                    } else {
                        str21 = c16l.A1P();
                    }
                } else if ("link_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str22 = null;
                    } else {
                        str22 = c16l.A1P();
                    }
                } else if ("media_background".equals(A0q)) {
                    c102724k92 = AbstractC102684k5.parseFromJson(c16l);
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str23 = null;
                    } else {
                        str23 = c16l.A1P();
                    }
                } else if ("message_extension_info".equals(A0q)) {
                    c114605Fi = AbstractC40073Hpz.parseFromJson(c16l);
                } else if ("music_info".equals(A0q)) {
                    c114615Fj = AbstractC41281IOw.parseFromJson(c16l);
                } else if ("on_impressions_control".equals(A0q)) {
                    c51l = C51J.parseFromJson(c16l);
                } else if ("optimization_goal_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str24 = null;
                    } else {
                        str24 = c16l.A1P();
                    }
                } else if ("overlay_subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str25 = null;
                    } else {
                        str25 = c16l.A1P();
                    }
                } else if ("pac_ad_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList10 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList10.add(A1P4);
                            }
                        }
                    } else {
                        arrayList10 = null;
                    }
                } else if ("page_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str26 = null;
                    } else {
                        str26 = c16l.A1P();
                    }
                } else if (AbstractC37307Gc9.A01(0, 12, 106).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str27 = null;
                    } else {
                        str27 = c16l.A1P();
                    }
                } else if ("political_context".equals(A0q)) {
                    c106024qG = AbstractC106014qF.parseFromJson(c16l);
                } else if ("post_trigger_experience_eligibilities".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList11 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P3 = null;
                            } else {
                                A1P3 = c16l.A1P();
                            }
                            IGPostTriggerExperience iGPostTriggerExperience = (IGPostTriggerExperience) IGPostTriggerExperience.A01.get(A1P3);
                            if (iGPostTriggerExperience == null) {
                                iGPostTriggerExperience = IGPostTriggerExperience.A0C;
                            }
                            arrayList11.add(iGPostTriggerExperience);
                        }
                    } else {
                        arrayList11 = null;
                    }
                } else if ("post_trigger_experience_eligible_triggers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList12 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger = (PostTriggerExperienceEligibleTrigger) PostTriggerExperienceEligibleTrigger.A01.get(A1P2);
                            if (postTriggerExperienceEligibleTrigger == null) {
                                postTriggerExperienceEligibleTrigger = PostTriggerExperienceEligibleTrigger.A0A;
                            }
                            arrayList12.add(postTriggerExperienceEligibleTrigger);
                        }
                    } else {
                        arrayList12 = null;
                    }
                } else if ("profile_product_tab_data".equals(A0q)) {
                    iGAdProfileProductTabDictImpl = AbstractC33699Eun.parseFromJson(c16l);
                } else if ("profile_visit_ads_info".equals(A0q)) {
                    c104014mN = AbstractC104004mM.parseFromJson(c16l);
                } else if ("reels_mid_scene_info".equals(A0q)) {
                    c5Fk = AbstractC41367ISu.parseFromJson(c16l);
                } else if ("reels_multi_ads_info".equals(A0q)) {
                    c5Fl = I9N.parseFromJson(c16l);
                } else if ("short_video_dtd".equals(A0q)) {
                    c108344uL = AbstractC108334uK.parseFromJson(c16l);
                } else if ("should_fetch_preview_comments".equals(A0q)) {
                    bool33 = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_exclusive_info_cta".equals(A0q)) {
                    bool34 = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_secondary_cta_on_profile".equals(A0q)) {
                    bool35 = Boolean.valueOf(c16l.A0d());
                } else if ("show_ad_choices".equals(A0q)) {
                    bool36 = Boolean.valueOf(c16l.A0d());
                } else if ("show_icon".equals(A0q)) {
                    bool37 = Boolean.valueOf(c16l.A0d());
                } else if ("show_page_name_in_headline".equals(A0q)) {
                    bool38 = Boolean.valueOf(c16l.A0d());
                } else if ("sponsored_ad_disclaimer".equals(A0q)) {
                    c106594rE = AbstractC87673vZ.parseFromJson(c16l);
                } else if ("story_dynamic_ad_flexible_tiles_info".equals(A0q)) {
                    h5v = AbstractC40278Hti.parseFromJson(c16l);
                } else if ("systematic_caption".equals(A0q)) {
                    iGAdCreativeStory9x16CaptionDataImpl = Ho2.parseFromJson(c16l);
                } else if ("testimonial_data".equals(A0q)) {
                    c38891rO = AbstractC38841rG.parseFromJson(c16l);
                } else if ("testimonial_data_v2".equals(A0q)) {
                    testimonialDictImpl = AbstractC102204ir.parseFromJson(c16l);
                } else if ("text_overlay".equals(A0q)) {
                    c38732H3v = AbstractC40022Hp5.parseFromJson(c16l);
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str28 = null;
                    } else {
                        str28 = c16l.A1P();
                    }
                } else if ("urp_card_transformation".equals(A0q)) {
                    c114625Fm = IPT.parseFromJson(c16l);
                } else if ("validated_product_cursor".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("view_tags".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList13 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList13.add(A1P);
                            }
                        }
                    } else {
                        arrayList13 = null;
                    }
                }
                c16l.A0z();
            }
            return new C39531sa(adFormatType, c114555Fb, c1s4, appstoreMetadataDictImpl, brandedContentAdsPaidPartnershipLabelRemovalOption, h2w, c114575Fd, callAdsInfoDictImpl, c87563vO, c1sA, c38691H2c, c114565Fc, c52r, dynamicProductAdDisplayOption, c114585Fe, c87703ve, c114595Ff, iGAdCreativeStory9x16CaptionDataImpl, uQv, uQw, iGAdProfileProductTabDictImpl, c100444f8, iGAdsIABScreenshotDataDictImpl, iGCTATextVariantImpl, iGCTMessagingAdsInfoDict, c1s7, c5l8, c39381sJ, c39411sM, c108034tm, c38730H3t, c1117552c, iGRFSurveyInfoDictImpl, c38732H3v, c108344uL, c106004qE, c114605Fi, c51l, c106024qG, c104014mN, c102724k9, c102724k92, c106594rE, c114615Fj, h5v, testimonialDictImpl, c114625Fm, c914346k, c38891rO, cTAStyle, c37881pR, c37881pR2, c5Fa, c38211qB, c5Fk, c5Fl, adsCTATrustInfo, adsIAWRatingInfo, adsRatingInfo, adsTextTrustInfo, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, num, num2, num3, num4, num5, num6, num7, num8, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C39531sa c39531sa) {
        anonymousClass182.A0d();
        String str = c39531sa.A1k;
        if (str != null) {
            anonymousClass182.A0S("about_ad_params", str);
        }
        String str2 = c39531sa.A1l;
        if (str2 != null) {
            anonymousClass182.A0S("actor_id", str2);
        }
        String str3 = c39531sa.A1m;
        if (str3 != null) {
            anonymousClass182.A0S("ad_action", str3);
        }
        C5Fa c5Fa = c39531sa.A0q;
        if (c5Fa != null) {
            anonymousClass182.A0r("ad_disclaimer_info");
            IR6.A00(anonymousClass182, c5Fa);
        }
        Long l = c39531sa.A1i;
        if (l != null) {
            anonymousClass182.A0R("ad_expiry_timestamp_in_millis", l.longValue());
        }
        String str4 = c39531sa.A1n;
        if (str4 != null) {
            anonymousClass182.A0S("ad_id", str4);
        }
        Integer num = c39531sa.A1a;
        if (num != null) {
            anonymousClass182.A0Q("ad_objective_type", num.intValue());
        }
        C37881pR c37881pR = c39531sa.A0o;
        if (c37881pR != null) {
            anonymousClass182.A0r("ad_pod_rules");
            AbstractC38751r7.A00(anonymousClass182, c37881pR);
        }
        C87703ve c87703ve = c39531sa.A0F;
        if (c87703ve != null) {
            anonymousClass182.A0r("ad_tag");
            AbstractC87693vd.A00(anonymousClass182, c87703ve);
        }
        String str5 = c39531sa.A1o;
        if (str5 != null) {
            anonymousClass182.A0S("ad_title", str5);
        }
        C37881pR c37881pR2 = c39531sa.A0p;
        if (c37881pR2 != null) {
            anonymousClass182.A0r("adpod_rules");
            AbstractC38751r7.A00(anonymousClass182, c37881pR2);
        }
        AdsIAWRatingInfo adsIAWRatingInfo = c39531sa.A0v;
        if (adsIAWRatingInfo != null) {
            anonymousClass182.A0r("ads_iaw_rating_info");
            AbstractC41368ISv.A00(anonymousClass182, adsIAWRatingInfo);
        }
        AdsRatingInfo adsRatingInfo = c39531sa.A0w;
        if (adsRatingInfo != null) {
            anonymousClass182.A0r("ads_rating_and_review_info");
            C5QZ.A00(anonymousClass182, adsRatingInfo);
        }
        C114555Fb c114555Fb = c39531sa.A01;
        if (c114555Fb != null) {
            anonymousClass182.A0r("ads_shopping_info");
            AbstractC41239INf.A00(anonymousClass182, c114555Fb);
        }
        String str6 = c39531sa.A1p;
        if (str6 != null) {
            anonymousClass182.A0S("adtaxon_i18n_top1_l7_prediction", str6);
        }
        C1s4 c1s4 = c39531sa.A02;
        if (c1s4 != null) {
            anonymousClass182.A0r("afi_info");
            AbstractC39261s3.A00(anonymousClass182, c1s4);
        }
        String str7 = c39531sa.A1q;
        if (str7 != null) {
            anonymousClass182.A0S("app_id", str7);
        }
        AppstoreMetadataDict appstoreMetadataDict = c39531sa.A03;
        if (appstoreMetadataDict != null) {
            anonymousClass182.A0r("appstore_metadata");
            AbstractC87753vj.A00(anonymousClass182, appstoreMetadataDict.Eqw());
        }
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = c39531sa.A04;
        if (brandedContentAdsPaidPartnershipLabelRemovalOption != null) {
            anonymousClass182.A0S("bca_ppl_removal_option", brandedContentAdsPaidPartnershipLabelRemovalOption.A00);
        }
        C914346k c914346k = c39531sa.A0l;
        if (c914346k != null) {
            anonymousClass182.A0r("bloks_cta_component");
            IQ3.A00(anonymousClass182, c914346k);
        }
        List<Number> list = c39531sa.A2C;
        if (list != null) {
            C16V.A03(anonymousClass182, "brs_applied_content_blocklists");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        Long l2 = c39531sa.A1j;
        if (l2 != null) {
            anonymousClass182.A0R("brs_threshold", l2.longValue());
        }
        InterfaceC104784ni interfaceC104784ni = c39531sa.A05;
        if (interfaceC104784ni != null) {
            anonymousClass182.A0r("buyer_incentive_feed");
            H2W ErV = interfaceC104784ni.ErV();
            anonymousClass182.A0d();
            String str8 = ErV.A01;
            if (str8 != null) {
                anonymousClass182.A0S("button_text", str8);
            }
            String str9 = ErV.A02;
            if (str9 != null) {
                anonymousClass182.A0S("description_text", str9);
            }
            ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles = ErV.A00;
            if (shoppingIGFundedIncentivesShopAdsBannerStyles != null) {
                anonymousClass182.A0S("display_variant", shoppingIGFundedIncentivesShopAdsBannerStyles.A00);
            }
            String str10 = ErV.A03;
            if (str10 != null) {
                anonymousClass182.A0S("incentive_id", str10);
            }
            String str11 = ErV.A04;
            if (str11 != null) {
                anonymousClass182.A0S("terms_and_conditions_body", str11);
            }
            String str12 = ErV.A05;
            if (str12 != null) {
                anonymousClass182.A0S("terms_and_conditions_title", str12);
            }
            anonymousClass182.A0a();
        }
        CallAdsInfoDict callAdsInfoDict = c39531sa.A07;
        if (callAdsInfoDict != null) {
            anonymousClass182.A0r("call_ads_info");
            CallAdsInfoDictImpl ErZ = callAdsInfoDict.ErZ();
            anonymousClass182.A0d();
            String str13 = ErZ.A00;
            if (str13 != null) {
                anonymousClass182.A0S("parsed_phone_number", str13);
            }
            anonymousClass182.A0T("should_render_phone_number_to_cta", ErZ.A01);
            anonymousClass182.A0a();
        }
        String str14 = c39531sa.A1r;
        if (str14 != null) {
            anonymousClass182.A0S("campaign_id", str14);
        }
        List<C38781rA> list2 = c39531sa.A2D;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "cca_optimization_options");
            for (C38781rA c38781rA : list2) {
                if (c38781rA != null) {
                    AbstractC38771r9.A00(anonymousClass182, c38781rA);
                }
            }
            anonymousClass182.A0Z();
        }
        C1s7 c1s7 = c39531sa.A0P;
        if (c1s7 != null) {
            anonymousClass182.A0r("click_to_direct_lead_gen_ads_info");
            anonymousClass182.A0d();
            Boolean bool = c1s7.A00;
            if (bool != null) {
                anonymousClass182.A0T("isLeadGenAd", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        String str15 = c39531sa.A1s;
        if (str15 != null) {
            anonymousClass182.A0S("contextual_label_info", str15);
        }
        List<String> list3 = c39531sa.A2E;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "cookies");
            for (String str16 : list3) {
                if (str16 != null) {
                    anonymousClass182.A0u(str16);
                }
            }
            anonymousClass182.A0Z();
        }
        List<C38781rA> list4 = c39531sa.A2F;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "cop_render_output");
            for (C38781rA c38781rA2 : list4) {
                if (c38781rA2 != null) {
                    AbstractC38771r9.A00(anonymousClass182, c38781rA2);
                }
            }
            anonymousClass182.A0Z();
        }
        String str17 = c39531sa.A1t;
        if (str17 != null) {
            anonymousClass182.A0S("creation_source", str17);
        }
        C114565Fc c114565Fc = c39531sa.A0B;
        if (c114565Fc != null) {
            anonymousClass182.A0r("creative_transformations");
            anonymousClass182.A0d();
            IgShowreelComposition igShowreelComposition = c114565Fc.A01;
            if (igShowreelComposition != null) {
                anonymousClass182.A0r("showreel_composition");
                AbstractC105404p6.A00(anonymousClass182, igShowreelComposition.F6Y());
            }
            C69N c69n = c114565Fc.A00;
            if (c69n != null) {
                anonymousClass182.A0r("showreel_native_animation");
                H5B EzX = c69n.EzX();
                anonymousClass182.A0d();
                String str18 = EzX.A03;
                if (str18 != null) {
                    anonymousClass182.A0S("animation_payload", str18);
                }
                List<String> list5 = EzX.A07;
                if (list5 != null) {
                    C16V.A03(anonymousClass182, "assets");
                    for (String str19 : list5) {
                        if (str19 != null) {
                            anonymousClass182.A0u(str19);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                List<JLX> list6 = EzX.A08;
                if (list6 != null) {
                    C16V.A03(anonymousClass182, "assets_info");
                    for (JLX jlx : list6) {
                        if (jlx != null) {
                            H5C EzY = jlx.EzY();
                            anonymousClass182.A0d();
                            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, EzY.A00);
                            String str20 = EzY.A02;
                            if (str20 != null) {
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str20);
                            }
                            String str21 = EzY.A03;
                            if (str21 != null) {
                                anonymousClass182.A0S("url", str21);
                            }
                            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, EzY.A01);
                            anonymousClass182.A0a();
                        }
                    }
                    anonymousClass182.A0Z();
                }
                ShowreelNativeClientName showreelNativeClientName = EzX.A00;
                if (showreelNativeClientName != null) {
                    anonymousClass182.A0S("client_name", showreelNativeClientName.A00);
                }
                String str22 = EzX.A04;
                if (str22 != null) {
                    anonymousClass182.A0S("content", str22);
                }
                Integer num2 = EzX.A01;
                if (num2 != null) {
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
                }
                String str23 = EzX.A05;
                if (str23 != null) {
                    anonymousClass182.A0S("logging_info", str23);
                }
                String str24 = EzX.A06;
                if (str24 != null) {
                    anonymousClass182.A0S("template_name", str24);
                }
                Integer num3 = EzX.A02;
                if (num3 != null) {
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num3.intValue());
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        C52r c52r = c39531sa.A0C;
        if (c52r != null) {
            anonymousClass182.A0r("creative_transformations_v2");
            C69O.A00(anonymousClass182, c52r);
        }
        C114575Fd c114575Fd = c39531sa.A06;
        if (c114575Fd != null) {
            anonymousClass182.A0r("cta_info");
            AbstractC38255Gry.A00(anonymousClass182, c114575Fd);
        }
        CTAStyle cTAStyle = c39531sa.A0n;
        if (cTAStyle != null) {
            anonymousClass182.A0S("cta_style", cTAStyle.A00);
        }
        InterfaceC87573vP interfaceC87573vP = c39531sa.A08;
        if (interfaceC87573vP != null) {
            anonymousClass182.A0r("ctd_ads_info");
            C87563vO Erl = interfaceC87573vP.Erl();
            anonymousClass182.A0d();
            Float f = Erl.A00;
            if (f != null) {
                anonymousClass182.A0P("business_response_time_in_sec", f.floatValue());
            }
            String str25 = Erl.A01;
            if (str25 != null) {
                anonymousClass182.A0S("business_responsiveness_time_text", str25);
            }
            String str26 = Erl.A02;
            if (str26 != null) {
                anonymousClass182.A0S("welcome_message_text", str26);
            }
            anonymousClass182.A0a();
        }
        InterfaceC39301sB interfaceC39301sB = c39531sa.A09;
        if (interfaceC39301sB != null) {
            anonymousClass182.A0r("ctj_ads_info");
            C1sA Erm = interfaceC39301sB.Erm();
            anonymousClass182.A0d();
            String str27 = Erm.A02;
            if (str27 != null) {
                anonymousClass182.A0S("channel_name", str27);
            }
            String str28 = Erm.A03;
            if (str28 != null) {
                anonymousClass182.A0S("ig_channel_id", str28);
            }
            String str29 = Erm.A04;
            if (str29 != null) {
                anonymousClass182.A0S("invite_link", str29);
            }
            Integer num4 = Erm.A01;
            if (num4 != null) {
                anonymousClass182.A0Q("number_of_members", num4.intValue());
            }
            Boolean bool2 = Erm.A00;
            if (bool2 != null) {
                anonymousClass182.A0T("should_skip_channel_suffix_bool", bool2.booleanValue());
            }
            anonymousClass182.A0a();
        }
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = c39531sa.A0O;
        if (iGCTMessagingAdsInfoDict != null) {
            anonymousClass182.A0r("ctmessaging_ads_info");
            anonymousClass182.A0d();
            String str30 = iGCTMessagingAdsInfoDict.A08;
            if (str30 != null) {
                anonymousClass182.A0S("igAdvertiserId", str30);
            }
            Boolean bool3 = iGCTMessagingAdsInfoDict.A04;
            if (bool3 != null) {
                anonymousClass182.A0T("isActive", bool3.booleanValue());
            }
            Boolean bool4 = iGCTMessagingAdsInfoDict.A05;
            if (bool4 != null) {
                anonymousClass182.A0T("isEligibleForOnFeedMessages", bool4.booleanValue());
            }
            OnFeedMessages onFeedMessages = iGCTMessagingAdsInfoDict.A00;
            if (onFeedMessages != null) {
                anonymousClass182.A0r("model");
                anonymousClass182.A0d();
                Integer num5 = onFeedMessages.A02;
                if (num5 != null) {
                    anonymousClass182.A0Q("destinationType", num5.intValue());
                }
                String str31 = onFeedMessages.A03;
                if (str31 != null) {
                    anonymousClass182.A0S("genericUrl", str31);
                }
                String str32 = onFeedMessages.A04;
                if (str32 != null) {
                    anonymousClass182.A0S("greetingText", str32);
                }
                String str33 = onFeedMessages.A05;
                if (str33 != null) {
                    anonymousClass182.A0S("headerText", str33);
                }
                String str34 = onFeedMessages.A06;
                if (str34 != null) {
                    anonymousClass182.A0S("icebreakerDisclaimerText", str34);
                }
                String str35 = onFeedMessages.A07;
                if (str35 != null) {
                    anonymousClass182.A0S("icebreakerDisclaimerTextFAQsSticker", str35);
                }
                List<IceBreakerMessage> list7 = onFeedMessages.A08;
                if (list7 != null) {
                    C16V.A03(anonymousClass182, "icebreakerMessages");
                    for (IceBreakerMessage iceBreakerMessage : list7) {
                        if (iceBreakerMessage != null) {
                            anonymousClass182.A0d();
                            String str36 = iceBreakerMessage.A00;
                            if (str36 != null) {
                                anonymousClass182.A0S("actionUrl", str36);
                            }
                            String str37 = iceBreakerMessage.A01;
                            if (str37 != null) {
                                anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str37);
                            }
                            String str38 = iceBreakerMessage.A02;
                            if (str38 != null) {
                                anonymousClass182.A0S("messageKey", str38);
                            }
                            anonymousClass182.A0a();
                        }
                    }
                    anonymousClass182.A0Z();
                }
                GreetingAttachment greetingAttachment = onFeedMessages.A00;
                if (greetingAttachment != null) {
                    anonymousClass182.A0r("imageAttachment");
                    anonymousClass182.A0d();
                    Integer num6 = greetingAttachment.A00;
                    if (num6 != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num6.intValue());
                    }
                    String str39 = greetingAttachment.A02;
                    if (str39 != null) {
                        anonymousClass182.A0S("url", str39);
                    }
                    Integer num7 = greetingAttachment.A01;
                    if (num7 != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num7.intValue());
                    }
                    anonymousClass182.A0a();
                }
                Boolean bool5 = onFeedMessages.A01;
                if (bool5 != null) {
                    anonymousClass182.A0T("shouldSendAttachment", bool5.booleanValue());
                }
                anonymousClass182.A0a();
            }
            String str40 = iGCTMessagingAdsInfoDict.A09;
            if (str40 != null) {
                anonymousClass182.A0S("pageID", str40);
            }
            PrivacyDisclosureInfo privacyDisclosureInfo = iGCTMessagingAdsInfoDict.A01;
            if (privacyDisclosureInfo != null) {
                anonymousClass182.A0r("privacyDisclosureInfo");
                PrivacyDisclosureInfoImpl EyC = privacyDisclosureInfo.EyC();
                anonymousClass182.A0d();
                String str41 = EyC.A00;
                if (str41 != null) {
                    anonymousClass182.A0S("fbAdvertiserDisclosure", str41);
                }
                String str42 = EyC.A01;
                if (str42 != null) {
                    anonymousClass182.A0S("privacyString", str42);
                }
                anonymousClass182.A0a();
            }
            String str43 = iGCTMessagingAdsInfoDict.A0A;
            if (str43 != null) {
                anonymousClass182.A0S("responsivenessText", str43);
            }
            String str44 = iGCTMessagingAdsInfoDict.A0B;
            if (str44 != null) {
                anonymousClass182.A0S("secondaryCTASubtitle", str44);
            }
            Boolean bool6 = iGCTMessagingAdsInfoDict.A06;
            if (bool6 != null) {
                anonymousClass182.A0T("shouldNavigateToThread", bool6.booleanValue());
            }
            Boolean bool7 = iGCTMessagingAdsInfoDict.A07;
            if (bool7 != null) {
                anonymousClass182.A0T("shouldTreatLinkStickerAsCTA", bool7.booleanValue());
            }
            SocialProofInfo socialProofInfo = iGCTMessagingAdsInfoDict.A02;
            if (socialProofInfo != null) {
                anonymousClass182.A0r("socialProofInfo");
                SocialProofInfoImpl Ezh = socialProofInfo.Ezh();
                anonymousClass182.A0d();
                Integer num8 = Ezh.A00;
                if (num8 != null) {
                    anonymousClass182.A0Q("numOfConversationsStartedWithBusiness", num8.intValue());
                }
                anonymousClass182.A0a();
            }
            WhatsAppAttributionInfo whatsAppAttributionInfo = iGCTMessagingAdsInfoDict.A03;
            if (whatsAppAttributionInfo != null) {
                anonymousClass182.A0r("whatsaAppAttributionInfo");
                WhatsAppAttributionInfoImpl F3v = whatsAppAttributionInfo.F3v();
                anonymousClass182.A0d();
                String str45 = F3v.A00;
                if (str45 != null) {
                    anonymousClass182.A0S("actionLink", str45);
                }
                String str46 = F3v.A01;
                if (str46 != null) {
                    anonymousClass182.A0S("adWhatsAppNumber", str46);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        InterfaceC104824nn interfaceC104824nn = c39531sa.A0A;
        if (interfaceC104824nn != null) {
            anonymousClass182.A0r("ctw_fallback_wrapper");
            C38691H2c Ern = interfaceC104824nn.Ern();
            anonymousClass182.A0d();
            String str47 = Ern.A01;
            if (str47 != null) {
                anonymousClass182.A0S("actionLink", str47);
            }
            String str48 = Ern.A02;
            if (str48 != null) {
                anonymousClass182.A0S("actionLinkFallback", str48);
            }
            String str49 = Ern.A03;
            if (str49 != null) {
                anonymousClass182.A0S("fallbackCTALabel", str49);
            }
            Integer num9 = Ern.A00;
            if (num9 != null) {
                anonymousClass182.A0Q("fallbackDestination", num9.intValue());
            }
            anonymousClass182.A0a();
        }
        Boolean bool8 = c39531sa.A0y;
        if (bool8 != null) {
            anonymousClass182.A0T("direct_share", bool8.booleanValue());
        }
        String str50 = c39531sa.A1u;
        if (str50 != null) {
            anonymousClass182.A0S("display_domain", str50);
        }
        Boolean bool9 = c39531sa.A0z;
        if (bool9 != null) {
            anonymousClass182.A0T("display_fb_page_name", bool9.booleanValue());
        }
        Boolean bool10 = c39531sa.A10;
        if (bool10 != null) {
            anonymousClass182.A0T("display_viewability_eligible", bool10.booleanValue());
        }
        String str51 = c39531sa.A1v;
        if (str51 != null) {
            anonymousClass182.A0S("dominant_color", str51);
        }
        Integer num10 = c39531sa.A1b;
        if (num10 != null) {
            anonymousClass182.A0Q("dr_ad_type", num10.intValue());
        }
        List<H39> list8 = c39531sa.A2G;
        if (list8 != null) {
            C16V.A03(anonymousClass182, "dynamic_ads_links");
            for (H39 h39 : list8) {
                if (h39 != null) {
                    AbstractC41258INz.A00(anonymousClass182, h39);
                }
            }
            anonymousClass182.A0Z();
        }
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = c39531sa.A0D;
        if (dynamicProductAdDisplayOption != null) {
            anonymousClass182.A0S("dynamic_product_ad_display_option", dynamicProductAdDisplayOption.A00);
        }
        Boolean bool11 = c39531sa.A11;
        if (bool11 != null) {
            anonymousClass182.A0T("enable_ads_follow_button", bool11.booleanValue());
        }
        Boolean bool12 = c39531sa.A12;
        if (bool12 != null) {
            anonymousClass182.A0T("enable_reels_end_scene", bool12.booleanValue());
        }
        String str52 = c39531sa.A1w;
        if (str52 != null) {
            anonymousClass182.A0S("fb_app_id", str52);
        }
        String str53 = c39531sa.A1x;
        if (str53 != null) {
            anonymousClass182.A0S("fb_page_url", str53);
        }
        C114585Fe c114585Fe = c39531sa.A0E;
        if (c114585Fe != null) {
            anonymousClass182.A0r("feed_end_scene_data");
            FSH.A00(anonymousClass182, c114585Fe);
        }
        AdFormatType adFormatType = c39531sa.A00;
        if (adFormatType != null) {
            anonymousClass182.A0S("format_type", adFormatType.A00);
        }
        C114595Ff c114595Ff = c39531sa.A0G;
        if (c114595Ff != null) {
            anonymousClass182.A0r("gesture_to_action_info");
            anonymousClass182.A0d();
            Boolean bool13 = c114595Ff.A00;
            if (bool13 != null) {
                anonymousClass182.A0T("enable_reels_ads_nudge", bool13.booleanValue());
            }
            anonymousClass182.A0a();
        }
        Integer num11 = c39531sa.A1c;
        if (num11 != null) {
            anonymousClass182.A0Q("global_position", num11.intValue());
        }
        Integer num12 = c39531sa.A1d;
        if (num12 != null) {
            anonymousClass182.A0Q("hide_flow_type", num12.intValue());
        }
        String str54 = c39531sa.A1y;
        if (str54 != null) {
            anonymousClass182.A0S("hide_label", str54);
        }
        List<InterfaceC39331sE> list9 = c39531sa.A2H;
        if (list9 != null) {
            C16V.A03(anonymousClass182, "hide_reasons_v2");
            for (InterfaceC39331sE interfaceC39331sE : list9) {
                if (interfaceC39331sE != null) {
                    C39321sD Eu7 = interfaceC39331sE.Eu7();
                    anonymousClass182.A0d();
                    String str55 = Eu7.A00;
                    if (str55 != null) {
                        anonymousClass182.A0S("reason", str55);
                    }
                    String str56 = Eu7.A01;
                    if (str56 != null) {
                        anonymousClass182.A0S("text", str56);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        InterfaceC39391sK interfaceC39391sK = c39531sa.A0R;
        if (interfaceC39391sK != null) {
            anonymousClass182.A0r("iab");
            C39381sJ Eug = interfaceC39391sK.Eug();
            anonymousClass182.A0d();
            InterfaceC39371sI interfaceC39371sI = Eug.A00;
            if (interfaceC39371sI != null) {
                anonymousClass182.A0r("browser_peek");
                C39361sH EuV = interfaceC39371sI.EuV();
                anonymousClass182.A0d();
                Boolean bool14 = EuV.A00;
                if (bool14 != null) {
                    anonymousClass182.A0T("should_disable", bool14.booleanValue());
                }
                anonymousClass182.A0a();
            }
            InterfaceC87603vS interfaceC87603vS = Eug.A01;
            if (interfaceC87603vS != null) {
                anonymousClass182.A0r("persistent_iab");
                C87593vR EvM = interfaceC87603vS.EvM();
                anonymousClass182.A0d();
                Boolean bool15 = EvM.A00;
                if (bool15 != null) {
                    anonymousClass182.A0T("should_disable", bool15.booleanValue());
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        C39411sM c39411sM = c39531sa.A0S;
        if (c39411sM != null) {
            anonymousClass182.A0r("iab_post_click_data");
            anonymousClass182.A0d();
            C5FV c5fv = c39411sM.A00;
            if (c5fv != null) {
                anonymousClass182.A0r("buyWithIntegrationIABPostClickDataExtension");
                C38714H3b EuW = c5fv.EuW();
                anonymousClass182.A0d();
                String str57 = EuW.A04;
                if (str57 != null) {
                    anonymousClass182.A0S("accessToken", str57);
                }
                Integer num13 = EuW.A02;
                if (num13 != null) {
                    anonymousClass182.A0Q("accessTokenTTL", num13.intValue());
                }
                String str58 = EuW.A05;
                if (str58 != null) {
                    anonymousClass182.A0S("apiKey", str58);
                }
                String str59 = EuW.A06;
                if (str59 != null) {
                    anonymousClass182.A0S("bauProductUrl", str59);
                }
                BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes = EuW.A00;
                if (buyWithIntegrationPostClickExperienceTypes != null) {
                    anonymousClass182.A0S("buyWithIntegrationPostClickExperienceType", buyWithIntegrationPostClickExperienceTypes.A00);
                }
                Long l3 = EuW.A03;
                if (l3 != null) {
                    anonymousClass182.A0R("oauthIntegrationId", l3.longValue());
                }
                String str60 = EuW.A07;
                if (str60 != null) {
                    anonymousClass182.A0S("pageName", str60);
                }
                PartnerTypes partnerTypes = EuW.A01;
                if (partnerTypes != null) {
                    anonymousClass182.A0S("partnerType", partnerTypes.A00);
                }
                anonymousClass182.A0a();
            }
            C5FW c5fw = c39411sM.A01;
            if (c5fw != null) {
                anonymousClass182.A0r("buyWithPrimeIABPostClickDataExtension");
                C38715H3c EuX = c5fw.EuX();
                anonymousClass182.A0d();
                String str61 = EuX.A03;
                if (str61 != null) {
                    anonymousClass182.A0S("accessToken", str61);
                }
                Integer num14 = EuX.A01;
                if (num14 != null) {
                    anonymousClass182.A0Q("accessTokenCreationTime", num14.intValue());
                }
                Integer num15 = EuX.A02;
                if (num15 != null) {
                    anonymousClass182.A0Q("accessTokenTTL", num15.intValue());
                }
                String str62 = EuX.A04;
                if (str62 != null) {
                    anonymousClass182.A0S("apiKey", str62);
                }
                String str63 = EuX.A05;
                if (str63 != null) {
                    anonymousClass182.A0S("bauProductUrl", str63);
                }
                IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes = EuX.A00;
                if (iGBuyWithPrimeExperienceTypes != null) {
                    anonymousClass182.A0S("buyWithPrimeExperienceType", iGBuyWithPrimeExperienceTypes.A00);
                }
                String str64 = EuX.A06;
                if (str64 != null) {
                    anonymousClass182.A0S("clientID", str64);
                }
                String str65 = EuX.A07;
                if (str65 != null) {
                    anonymousClass182.A0S("pageName", str65);
                }
                anonymousClass182.A0a();
            }
            List<IGPostClickEligibleExperienceTypes> list10 = c39411sM.A07;
            if (list10 != null) {
                C16V.A03(anonymousClass182, "eligibleExperienceTypes");
                for (IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes : list10) {
                    if (iGPostClickEligibleExperienceTypes != null) {
                        anonymousClass182.A0u(iGPostClickEligibleExperienceTypes.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            C5FX c5fx = c39411sM.A02;
            if (c5fx != null) {
                anonymousClass182.A0r("iabAutofillAdsPersonalizationPostClickDataExtension");
                C38716H3d Euf = c5fx.Euf();
                anonymousClass182.A0d();
                IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict = Euf.A00;
                if (iGAdCreationOptimizationPayloadDict != null) {
                    anonymousClass182.A0r("adCreativeOptimizationPayload");
                    IGAdCreationOptimizationPayloadDictImpl EuE = iGAdCreationOptimizationPayloadDict.EuE();
                    anonymousClass182.A0d();
                    List<IGAdCreativeOptimizationConfigByTypeDict> list11 = EuE.A00;
                    if (list11 != null) {
                        C16V.A03(anonymousClass182, "adCreativeOptimizationConfigByType");
                        for (IGAdCreativeOptimizationConfigByTypeDict iGAdCreativeOptimizationConfigByTypeDict : list11) {
                            if (iGAdCreativeOptimizationConfigByTypeDict != null) {
                                IGAdCreativeOptimizationConfigByTypeDictImpl EuF = iGAdCreativeOptimizationConfigByTypeDict.EuF();
                                anonymousClass182.A0d();
                                String str66 = EuF.A00;
                                if (str66 != null) {
                                    anonymousClass182.A0S("optimizationType", str66);
                                }
                                String str67 = EuF.A01;
                                if (str67 != null) {
                                    anonymousClass182.A0S("optionValue", str67);
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            List<H3e> list12 = c39411sM.A08;
            if (list12 != null) {
                C16V.A03(anonymousClass182, "iabPostClickDisclaimers");
                for (H3e h3e : list12) {
                    if (h3e != null) {
                        anonymousClass182.A0d();
                        List<InterfaceC43535JKv> list13 = h3e.A02;
                        if (list13 != null) {
                            C16V.A03(anonymousClass182, "disclaimerBodyRanges");
                            for (InterfaceC43535JKv interfaceC43535JKv : list13) {
                                if (interfaceC43535JKv != null) {
                                    C38717H3f Euj = interfaceC43535JKv.Euj();
                                    anonymousClass182.A0d();
                                    Integer num16 = Euj.A00;
                                    if (num16 != null) {
                                        anonymousClass182.A0Q("length", num16.intValue());
                                    }
                                    Integer num17 = Euj.A01;
                                    if (num17 != null) {
                                        anonymousClass182.A0Q("offset", num17.intValue());
                                    }
                                    String str68 = Euj.A02;
                                    if (str68 != null) {
                                        anonymousClass182.A0S("url", str68);
                                    }
                                    anonymousClass182.A0a();
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        String str69 = h3e.A01;
                        if (str69 != null) {
                            anonymousClass182.A0S("disclaimerText", str69);
                        }
                        IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes2 = h3e.A00;
                        if (iGPostClickEligibleExperienceTypes2 != null) {
                            anonymousClass182.A0S("eligibleExperienceType", iGPostClickEligibleExperienceTypes2.A00);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            Long l4 = c39411sM.A06;
            if (l4 != null) {
                anonymousClass182.A0R("impressionTime", l4.longValue());
            }
            C5FY c5fy = c39411sM.A03;
            if (c5fy != null) {
                anonymousClass182.A0r("metaCheckoutIABPostClickDataExtension");
                C38720H3i Ev9 = c5fy.Ev9();
                anonymousClass182.A0d();
                String str70 = Ev9.A00;
                if (str70 != null) {
                    anonymousClass182.A0S("metaCheckoutExperienceType", str70);
                }
                anonymousClass182.A0a();
            }
            C5FZ c5fz = c39411sM.A04;
            if (c5fz != null) {
                anonymousClass182.A0r("metaPaymentsSDKIABPostClickDataExtension");
                C38722H3k EvB = c5fz.EvB();
                anonymousClass182.A0d();
                InterfaceC43537JKx interfaceC43537JKx = EvB.A00;
                if (interfaceC43537JKx != null) {
                    anonymousClass182.A0r("checkoutSetupPayload");
                    C38725H3n EvE = interfaceC43537JKx.EvE();
                    anonymousClass182.A0d();
                    JKI jki = EvE.A00;
                    if (jki != null) {
                        anonymousClass182.A0r("availability");
                        C38721H3j EvA = jki.EvA();
                        anonymousClass182.A0d();
                        List<String> list14 = EvA.A01;
                        if (list14 != null) {
                            C16V.A03(anonymousClass182, "availabilityConditions");
                            for (String str71 : list14) {
                                if (str71 != null) {
                                    anonymousClass182.A0u(str71);
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        Boolean bool16 = EvA.A00;
                        if (bool16 != null) {
                            anonymousClass182.A0T("isAvailable", bool16.booleanValue());
                        }
                        anonymousClass182.A0a();
                    }
                    JKJ jkj = EvE.A01;
                    if (jkj != null) {
                        anonymousClass182.A0r("paymentConfig");
                        C38723H3l EvC = jkj.EvC();
                        anonymousClass182.A0d();
                        String str72 = EvC.A00;
                        if (str72 != null) {
                            anonymousClass182.A0S("paymentMode", str72);
                        }
                        List<String> list15 = EvC.A01;
                        if (list15 != null) {
                            C16V.A03(anonymousClass182, "supportedContainerTypes");
                            for (String str73 : list15) {
                                if (str73 != null) {
                                    anonymousClass182.A0u(str73);
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0a();
                    }
                    InterfaceC43536JKw interfaceC43536JKw = EvE.A02;
                    if (interfaceC43536JKw != null) {
                        anonymousClass182.A0r("receiverInfo");
                        C38724H3m EvD = interfaceC43536JKw.EvD();
                        anonymousClass182.A0d();
                        String str74 = EvD.A00;
                        if (str74 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str74);
                        }
                        String str75 = EvD.A01;
                        if (str75 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str75);
                        }
                        List<String> list16 = EvD.A02;
                        if (list16 != null) {
                            C16V.A03(anonymousClass182, "validOrigins");
                            for (String str76 : list16) {
                                if (str76 != null) {
                                    anonymousClass182.A0u(str76);
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            AnonymousClass535 anonymousClass535 = c39411sM.A05;
            if (anonymousClass535 != null) {
                anonymousClass182.A0r("promoAdsAutofillPostClickDataExtension");
                anonymousClass182.A0d();
                String str77 = anonymousClass535.A01;
                if (str77 != null) {
                    anonymousClass182.A0S("footerSubtype", str77);
                }
                Boolean bool17 = anonymousClass535.A00;
                if (bool17 != null) {
                    anonymousClass182.A0T("isAutofillEnabled", bool17.booleanValue());
                }
                List<C38731H3u> list17 = anonymousClass535.A02;
                if (list17 != null) {
                    C16V.A03(anonymousClass182, "promoCodes");
                    for (C38731H3u c38731H3u : list17) {
                        if (c38731H3u != null) {
                            anonymousClass182.A0d();
                            String str78 = c38731H3u.A00;
                            if (str78 != null) {
                                anonymousClass182.A0S("offerIDStr", str78);
                            }
                            String str79 = c38731H3u.A01;
                            if (str79 != null) {
                                anonymousClass182.A0S("promoCodeAutofillText", str79);
                            }
                            anonymousClass182.A0a();
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        String str80 = c39531sa.A1z;
        if (str80 != null) {
            anonymousClass182.A0S("iaw_wca_exclusion_targeting_rule_oc", str80);
        }
        InterfaceC104854ns interfaceC104854ns = c39531sa.A0I;
        if (interfaceC104854ns != null) {
            anonymousClass182.A0r("ig_ad_media_smart_crop_info");
            UQv EuH = interfaceC104854ns.EuH();
            anonymousClass182.A0d();
            Float f2 = EuH.A00;
            if (f2 != null) {
                anonymousClass182.A0P("bounding_box_bottom_right_x", f2.floatValue());
            }
            Float f3 = EuH.A01;
            if (f3 != null) {
                anonymousClass182.A0P("bounding_box_bottom_right_y", f3.floatValue());
            }
            Float f4 = EuH.A02;
            if (f4 != null) {
                anonymousClass182.A0P("bounding_box_top_left_x", f4.floatValue());
            }
            Float f5 = EuH.A03;
            if (f5 != null) {
                anonymousClass182.A0P("bounding_box_top_left_y", f5.floatValue());
            }
            anonymousClass182.A0a();
        }
        InterfaceC104864nt interfaceC104864nt = c39531sa.A0J;
        if (interfaceC104864nt != null) {
            anonymousClass182.A0r("ig_ad_media_text_ocr_info");
            UQw EuI = interfaceC104864nt.EuI();
            anonymousClass182.A0d();
            Float f6 = EuI.A00;
            if (f6 != null) {
                anonymousClass182.A0P("bounding_box_bottom_right_x", f6.floatValue());
            }
            Float f7 = EuI.A01;
            if (f7 != null) {
                anonymousClass182.A0P("bounding_box_bottom_right_y", f7.floatValue());
            }
            Float f8 = EuI.A02;
            if (f8 != null) {
                anonymousClass182.A0P("bounding_box_top_left_x", f8.floatValue());
            }
            Float f9 = EuI.A03;
            if (f9 != null) {
                anonymousClass182.A0P("bounding_box_top_left_y", f9.floatValue());
            }
            anonymousClass182.A0a();
        }
        AdsCTATrustInfo adsCTATrustInfo = c39531sa.A0u;
        if (adsCTATrustInfo != null) {
            anonymousClass182.A0r("ig_ad_rendering_cta_trust_info_data");
            anonymousClass182.A0d();
            AdsBizBadgeInfo adsBizBadgeInfo = adsCTATrustInfo.A00;
            if (adsBizBadgeInfo != null) {
                anonymousClass182.A0r("info_data");
                AdsBizBadgeInfoImpl F7G = adsBizBadgeInfo.F7G();
                anonymousClass182.A0d();
                AdsRatingInfo adsRatingInfo2 = F7G.A00;
                if (adsRatingInfo2 != null) {
                    anonymousClass182.A0r("rating_info");
                    C5QZ.A00(anonymousClass182, adsRatingInfo2);
                }
                anonymousClass182.A0a();
            }
            List<IGAdsTrustInfoTypeEnum> list18 = adsCTATrustInfo.A01;
            if (list18 != null) {
                C16V.A03(anonymousClass182, "info_type_list");
                for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum : list18) {
                    if (iGAdsTrustInfoTypeEnum != null) {
                        anonymousClass182.A0u(iGAdsTrustInfoTypeEnum.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        AdsTextTrustInfo adsTextTrustInfo = c39531sa.A0x;
        if (adsTextTrustInfo != null) {
            anonymousClass182.A0r("ig_ad_rendering_text_trust_info_data");
            anonymousClass182.A0d();
            AdsBizBadgeInfo adsBizBadgeInfo2 = adsTextTrustInfo.A00;
            if (adsBizBadgeInfo2 != null) {
                anonymousClass182.A0r("info_data");
                AdsBizBadgeInfoImpl F7G2 = adsBizBadgeInfo2.F7G();
                anonymousClass182.A0d();
                AdsRatingInfo adsRatingInfo3 = F7G2.A00;
                if (adsRatingInfo3 != null) {
                    anonymousClass182.A0r("rating_info");
                    C5QZ.A00(anonymousClass182, adsRatingInfo3);
                }
                anonymousClass182.A0a();
            }
            List<IGAdsTrustInfoTypeEnum> list19 = adsTextTrustInfo.A01;
            if (list19 != null) {
                C16V.A03(anonymousClass182, "info_type_list");
                for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum2 : list19) {
                    if (iGAdsTrustInfoTypeEnum2 != null) {
                        anonymousClass182.A0u(iGAdsTrustInfoTypeEnum2.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = c39531sa.A0M;
        if (iGAdsIABScreenshotDataDict != null) {
            anonymousClass182.A0r("ig_ads_iab_screenshot_data");
            IGAdsIABScreenshotDataDictImpl EuP = iGAdsIABScreenshotDataDict.EuP();
            anonymousClass182.A0d();
            Float f10 = EuP.A04;
            if (f10 != null) {
                anonymousClass182.A0P("max_secs_for_screenshot", f10.floatValue());
            }
            Float f11 = EuP.A05;
            if (f11 != null) {
                anonymousClass182.A0P("min_secs_for_screenshot", f11.floatValue());
            }
            IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = EuP.A00;
            if (iABScreenshotEffectOnUserAction != null) {
                anonymousClass182.A0S("screenshot_effect_on_user_action", iABScreenshotEffectOnUserAction.A00);
            }
            Float f12 = EuP.A06;
            if (f12 != null) {
                anonymousClass182.A0P("screenshot_effect_percent", f12.floatValue());
            }
            Float f13 = EuP.A07;
            if (f13 != null) {
                anonymousClass182.A0P("screenshot_saturation_or_opacity_percent", f13.floatValue());
            }
            IABScreenshotTransitionTime iABScreenshotTransitionTime = EuP.A01;
            if (iABScreenshotTransitionTime != null) {
                anonymousClass182.A0S("screenshot_transition_time", iABScreenshotTransitionTime.A00);
            }
            String str81 = EuP.A08;
            if (str81 != null) {
                anonymousClass182.A0S("screenshot_url", str81);
            }
            IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = EuP.A02;
            if (iGAdsIABScreenshotVariant != null) {
                anonymousClass182.A0S("screenshot_variant", iGAdsIABScreenshotVariant.A00);
            }
            Boolean bool18 = EuP.A03;
            if (bool18 != null) {
                anonymousClass182.A0T("show_loading_indicator", bool18.booleanValue());
            }
            String str82 = EuP.A09;
            if (str82 != null) {
                anonymousClass182.A0S("text_for_toast_variant", str82);
            }
            anonymousClass182.A0a();
        }
        IGCTATextVariant iGCTATextVariant = c39531sa.A0N;
        if (iGCTATextVariant != null) {
            anonymousClass182.A0r("ig_cta_text_variant_data");
            IGCTATextVariantImpl EuY = iGCTATextVariant.EuY();
            anonymousClass182.A0d();
            String str83 = EuY.A02;
            if (str83 != null) {
                anonymousClass182.A0S("cta_text_replacement", str83);
            }
            Boolean bool19 = EuY.A01;
            if (bool19 != null) {
                anonymousClass182.A0T("has_emoji", bool19.booleanValue());
            }
            String str84 = EuY.A03;
            if (str84 != null) {
                anonymousClass182.A0S("language", str84);
            }
            IGCTATextVariantSource iGCTATextVariantSource = EuY.A00;
            if (iGCTATextVariantSource != null) {
                anonymousClass182.A0S("text_source", iGCTATextVariantSource.A00);
            }
            anonymousClass182.A0a();
        }
        String str85 = c39531sa.A20;
        if (str85 != null) {
            anonymousClass182.A0S("ig_events_extracted_date", str85);
        }
        C100444f8 c100444f8 = c39531sa.A0L;
        if (c100444f8 != null) {
            anonymousClass182.A0r("ig_feed_video_watch_and_browse_info");
            anonymousClass182.A0d();
            Float f14 = c100444f8.A02;
            if (f14 != null) {
                anonymousClass182.A0P("ig_ads_feed_video_watch_and_browse_viewer_min_screen_threshold", f14.floatValue());
            }
            IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = c100444f8.A00;
            if (iGAdsFeedVideoWBViewerTypeEnum != null) {
                anonymousClass182.A0S("ig_ads_feed_video_watch_and_browse_viewer_type", iGAdsFeedVideoWBViewerTypeEnum.A00);
            }
            Boolean bool20 = c100444f8.A01;
            if (bool20 != null) {
                anonymousClass182.A0T("is_tall_video", bool20.booleanValue());
            }
            anonymousClass182.A0a();
        }
        InterfaceC104874ny interfaceC104874ny = c39531sa.A0Q;
        if (interfaceC104874ny != null) {
            anonymousClass182.A0r("ig_format_liquidity_ads_info");
            C5L8 Eue = interfaceC104874ny.Eue();
            anonymousClass182.A0d();
            IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = Eue.A00;
            if (iGFormatLiquidityUseCaseEnum != null) {
                anonymousClass182.A0S("format_liquidity_use_case", iGFormatLiquidityUseCaseEnum.A00);
            }
            anonymousClass182.A0a();
        }
        InterfaceC104884nz interfaceC104884nz = c39531sa.A0U;
        if (interfaceC104884nz != null) {
            anonymousClass182.A0r("ig_oops_survey_info");
            C38730H3t EvK = interfaceC104884nz.EvK();
            anonymousClass182.A0d();
            String str86 = EvK.A00;
            if (str86 != null) {
                anonymousClass182.A0S("category", str86);
            }
            String str87 = EvK.A01;
            if (str87 != null) {
                anonymousClass182.A0S("integration_point_id", str87);
            }
            anonymousClass182.A0a();
        }
        C1117552c c1117552c = c39531sa.A0V;
        if (c1117552c != null) {
            anonymousClass182.A0r("ig_pbia_profile_and_browse_info");
            anonymousClass182.A0d();
            IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = c1117552c.A00;
            if (iGPBIAProfileBrowseTypeEnum != null) {
                anonymousClass182.A0S("ig_pbia_profile_and_browse_type", iGPBIAProfileBrowseTypeEnum.A00);
            }
            Boolean bool21 = c1117552c.A01;
            if (bool21 != null) {
                anonymousClass182.A0T("should_render_dimmer", bool21.booleanValue());
            }
            anonymousClass182.A0a();
        }
        IGRFSurveyInfoDict iGRFSurveyInfoDict = c39531sa.A0W;
        if (iGRFSurveyInfoDict != null) {
            anonymousClass182.A0r("ig_rf_survey_info");
            IGRFSurveyInfoDictImpl EvV = iGRFSurveyInfoDict.EvV();
            anonymousClass182.A0d();
            IGRFSurveyContextDict iGRFSurveyContextDict = EvV.A00;
            if (iGRFSurveyContextDict != null) {
                anonymousClass182.A0r("feed_context");
                IGRFSurveyContextDictImpl EvT = iGRFSurveyContextDict.EvT();
                anonymousClass182.A0d();
                List<IGRFSurveyContextMappingDict> list20 = EvT.A01;
                if (list20 != null) {
                    C16V.A03(anonymousClass182, "context_data");
                    for (IGRFSurveyContextMappingDict iGRFSurveyContextMappingDict : list20) {
                        if (iGRFSurveyContextMappingDict != null) {
                            IGRFSurveyContextMappingDictImpl EvU = iGRFSurveyContextMappingDict.EvU();
                            anonymousClass182.A0d();
                            String str88 = EvU.A00;
                            if (str88 != null) {
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str88);
                            }
                            String str89 = EvU.A01;
                            if (str89 != null) {
                                anonymousClass182.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str89);
                            }
                            anonymousClass182.A0a();
                        }
                    }
                    anonymousClass182.A0Z();
                }
                String str90 = EvT.A00;
                if (str90 != null) {
                    anonymousClass182.A0S("integration_point_id", str90);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        InterfaceC104904o2 interfaceC104904o2 = c39531sa.A0Z;
        if (interfaceC104904o2 != null) {
            anonymousClass182.A0r("ig_transparency_and_control_disclaimer_data");
            C106004qE Evb = interfaceC104904o2.Evb();
            anonymousClass182.A0d();
            List<InterfaceC105994qD> list21 = Evb.A01;
            if (list21 != null) {
                C16V.A03(anonymousClass182, "disclaimers");
                for (InterfaceC105994qD interfaceC105994qD : list21) {
                    if (interfaceC105994qD != null) {
                        C105984qC EuM = interfaceC105994qD.EuM();
                        anonymousClass182.A0d();
                        String str91 = EuM.A01;
                        if (str91 != null) {
                            anonymousClass182.A0S("label", str91);
                        }
                        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = EuM.A00;
                        if (iGAdTransparencyDisclaimerPlacement != null) {
                            anonymousClass182.A0S("placement", iGAdTransparencyDisclaimerPlacement.A00);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            String str92 = Evb.A00;
            if (str92 != null) {
                anonymousClass182.A0S("genai_disclaimer_text", str92);
            }
            anonymousClass182.A0a();
        }
        C102724k9 c102724k9 = c39531sa.A0e;
        if (c102724k9 != null) {
            anonymousClass182.A0r("igtv_media_background");
            AbstractC102684k5.A00(anonymousClass182, c102724k9);
        }
        Integer num18 = c39531sa.A1e;
        if (num18 != null) {
            anonymousClass182.A0Q("imp_signature", num18.intValue());
        }
        Integer num19 = c39531sa.A1f;
        if (num19 != null) {
            anonymousClass182.A0Q("impression_signature", num19.intValue());
        }
        C38211qB c38211qB = c39531sa.A0r;
        if (c38211qB != null) {
            anonymousClass182.A0r("invalidation_rules");
            AbstractC39431sO.A00(anonymousClass182, c38211qB);
        }
        Boolean bool22 = c39531sa.A1C;
        if (bool22 != null) {
            anonymousClass182.A0T("isExternalUrlLandingPage", bool22.booleanValue());
        }
        Boolean bool23 = c39531sa.A13;
        if (bool23 != null) {
            anonymousClass182.A0T("is_app_mae_ad_exclusion_eligible", bool23.booleanValue());
        }
        Boolean bool24 = c39531sa.A14;
        if (bool24 != null) {
            anonymousClass182.A0T("is_autotranslated", bool24.booleanValue());
        }
        Boolean bool25 = c39531sa.A15;
        if (bool25 != null) {
            anonymousClass182.A0T("is_bau_ifu_eligible", bool25.booleanValue());
        }
        Boolean bool26 = c39531sa.A16;
        if (bool26 != null) {
            anonymousClass182.A0T("is_boosted", bool26.booleanValue());
        }
        Boolean bool27 = c39531sa.A17;
        if (bool27 != null) {
            anonymousClass182.A0T("is_consent_growth_ifu_eligible", bool27.booleanValue());
        }
        Boolean bool28 = c39531sa.A18;
        if (bool28 != null) {
            anonymousClass182.A0T("is_consent_growth_popup_eligible", bool28.booleanValue());
        }
        Boolean bool29 = c39531sa.A19;
        if (bool29 != null) {
            anonymousClass182.A0T("is_conversions_ad_with_upcoming_event", bool29.booleanValue());
        }
        Boolean bool30 = c39531sa.A1A;
        if (bool30 != null) {
            anonymousClass182.A0T("is_delayed_skip_ad", bool30.booleanValue());
        }
        Boolean bool31 = c39531sa.A1B;
        if (bool31 != null) {
            anonymousClass182.A0T("is_demo", bool31.booleanValue());
        }
        Boolean bool32 = c39531sa.A1D;
        if (bool32 != null) {
            anonymousClass182.A0T("is_feed_glados_control_eligible", bool32.booleanValue());
        }
        Boolean bool33 = c39531sa.A1E;
        if (bool33 != null) {
            anonymousClass182.A0T("is_form_extension_eligible", bool33.booleanValue());
        }
        Boolean bool34 = c39531sa.A1F;
        if (bool34 != null) {
            anonymousClass182.A0T("is_holdout", bool34.booleanValue());
        }
        Boolean bool35 = c39531sa.A1G;
        if (bool35 != null) {
            anonymousClass182.A0T("is_ig_events_excluded_ad", bool35.booleanValue());
        }
        Boolean bool36 = c39531sa.A1H;
        if (bool36 != null) {
            anonymousClass182.A0T("is_leadgen_native_eligible", bool36.booleanValue());
        }
        Boolean bool37 = c39531sa.A1I;
        if (bool37 != null) {
            anonymousClass182.A0T("is_luxury_vertical_ad", bool37.booleanValue());
        }
        Boolean bool38 = c39531sa.A1J;
        if (bool38 != null) {
            anonymousClass182.A0T("is_multi_ads_eligible", bool38.booleanValue());
        }
        Boolean bool39 = c39531sa.A1K;
        if (bool39 != null) {
            anonymousClass182.A0T("is_pharma_and_sensitive_vertical_ad", bool39.booleanValue());
        }
        Boolean bool40 = c39531sa.A1L;
        if (bool40 != null) {
            anonymousClass182.A0T("is_pharma_vertical_ad", bool40.booleanValue());
        }
        Boolean bool41 = c39531sa.A1M;
        if (bool41 != null) {
            anonymousClass182.A0T("is_post_click_afi_eligible", bool41.booleanValue());
        }
        Boolean bool42 = c39531sa.A1N;
        if (bool42 != null) {
            anonymousClass182.A0T("is_previewable_video_ad", bool42.booleanValue());
        }
        Boolean bool43 = c39531sa.A1O;
        if (bool43 != null) {
            anonymousClass182.A0T("is_rev_share", bool43.booleanValue());
        }
        Boolean bool44 = c39531sa.A1P;
        if (bool44 != null) {
            anonymousClass182.A0T("is_sensitive_vertical_ad", bool44.booleanValue());
        }
        Boolean bool45 = c39531sa.A1Q;
        if (bool45 != null) {
            anonymousClass182.A0T("is_shops_ifu_eligible", bool45.booleanValue());
        }
        Integer num20 = c39531sa.A1g;
        if (num20 != null) {
            anonymousClass182.A0Q("item_type", num20.intValue());
        }
        List<C38321qM> list22 = c39531sa.A2I;
        if (list22 != null) {
            C16V.A03(anonymousClass182, DialogModule.KEY_ITEMS);
            for (C38321qM c38321qM : list22) {
                if (c38321qM != null) {
                    AtomicBoolean atomicBoolean = C38321qM.A0i;
                    C38801rC.A07(anonymousClass182, c38321qM);
                }
            }
            anonymousClass182.A0Z();
        }
        String str93 = c39531sa.A21;
        if (str93 != null) {
            anonymousClass182.A0S("label", str93);
        }
        Boolean bool46 = c39531sa.A1R;
        if (bool46 != null) {
            anonymousClass182.A0T("lead_gen_allow_phone_zip_format_improvement", bool46.booleanValue());
        }
        List<AndroidLink> list23 = c39531sa.A2J;
        if (list23 != null) {
            C16V.A03(anonymousClass182, "lead_gen_android_links");
            for (AndroidLink androidLink : list23) {
                if (androidLink != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        String str94 = c39531sa.A22;
        if (str94 != null) {
            anonymousClass182.A0S("lead_gen_call_to_action_title", str94);
        }
        Boolean bool47 = c39531sa.A1S;
        if (bool47 != null) {
            anonymousClass182.A0T("lead_gen_force_full_page_context_card", bool47.booleanValue());
        }
        String str95 = c39531sa.A23;
        if (str95 != null) {
            anonymousClass182.A0S("lead_gen_form_id", str95);
        }
        List<AndroidLink> list24 = c39531sa.A2K;
        if (list24 != null) {
            C16V.A03(anonymousClass182, "lead_gen_ios_links");
            for (AndroidLink androidLink2 : list24) {
                if (androidLink2 != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink2.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool48 = c39531sa.A1T;
        if (bool48 != null) {
            anonymousClass182.A0T("lead_gen_new_experience_ineligible", bool48.booleanValue());
        }
        InterfaceC104914o3 interfaceC104914o3 = c39531sa.A0T;
        if (interfaceC104914o3 != null) {
            anonymousClass182.A0r("lead_gen_preclick_data");
            AbstractC107994ti.A00(anonymousClass182, interfaceC104914o3.Eum());
        }
        String str96 = c39531sa.A24;
        if (str96 != null) {
            anonymousClass182.A0S("link_hint_text", str96);
        }
        String str97 = c39531sa.A25;
        if (str97 != null) {
            anonymousClass182.A0S("link_text", str97);
        }
        C102724k9 c102724k92 = c39531sa.A0f;
        if (c102724k92 != null) {
            anonymousClass182.A0r("media_background");
            AbstractC102684k5.A00(anonymousClass182, c102724k92);
        }
        String str98 = c39531sa.A26;
        if (str98 != null) {
            anonymousClass182.A0S("media_id", str98);
        }
        C114605Fi c114605Fi = c39531sa.A0a;
        if (c114605Fi != null) {
            anonymousClass182.A0r("message_extension_info");
            anonymousClass182.A0d();
            String str99 = c114605Fi.A00;
            if (str99 != null) {
                anonymousClass182.A0S("action_link", str99);
            }
            String str100 = c114605Fi.A01;
            if (str100 != null) {
                anonymousClass182.A0S("message_extension_type", str100);
            }
            anonymousClass182.A0a();
        }
        C114615Fj c114615Fj = c39531sa.A0h;
        if (c114615Fj != null) {
            anonymousClass182.A0r("music_info");
            AbstractC41281IOw.A00(anonymousClass182, c114615Fj);
        }
        C51L c51l = c39531sa.A0b;
        if (c51l != null) {
            anonymousClass182.A0r("on_impressions_control");
            C51J.A00(anonymousClass182, c51l);
        }
        String str101 = c39531sa.A27;
        if (str101 != null) {
            anonymousClass182.A0S("optimization_goal_name", str101);
        }
        String str102 = c39531sa.A28;
        if (str102 != null) {
            anonymousClass182.A0S("overlay_subtitle", str102);
        }
        List<String> list25 = c39531sa.A2L;
        if (list25 != null) {
            C16V.A03(anonymousClass182, "pac_ad_media_ids");
            for (String str103 : list25) {
                if (str103 != null) {
                    anonymousClass182.A0u(str103);
                }
            }
            anonymousClass182.A0Z();
        }
        String str104 = c39531sa.A29;
        if (str104 != null) {
            anonymousClass182.A0S("page_id", str104);
        }
        String str105 = c39531sa.A2A;
        if (str105 != null) {
            anonymousClass182.A0S(AbstractC37307Gc9.A01(0, 12, 106), str105);
        }
        InterfaceC104944o7 interfaceC104944o7 = c39531sa.A0c;
        if (interfaceC104944o7 != null) {
            anonymousClass182.A0r("political_context");
            C106024qG Ey1 = interfaceC104944o7.Ey1();
            anonymousClass182.A0d();
            String str106 = Ey1.A00;
            if (str106 != null) {
                anonymousClass182.A0S("byline_text", str106);
            }
            anonymousClass182.A0a();
        }
        List<IGPostTriggerExperience> list26 = c39531sa.A2M;
        if (list26 != null) {
            C16V.A03(anonymousClass182, "post_trigger_experience_eligibilities");
            for (IGPostTriggerExperience iGPostTriggerExperience : list26) {
                if (iGPostTriggerExperience != null) {
                    anonymousClass182.A0u(iGPostTriggerExperience.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        List<PostTriggerExperienceEligibleTrigger> list27 = c39531sa.A2N;
        if (list27 != null) {
            C16V.A03(anonymousClass182, "post_trigger_experience_eligible_triggers");
            for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger : list27) {
                if (postTriggerExperienceEligibleTrigger != null) {
                    anonymousClass182.A0u(postTriggerExperienceEligibleTrigger.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        IGAdProfileProductTabDict iGAdProfileProductTabDict = c39531sa.A0K;
        if (iGAdProfileProductTabDict != null) {
            anonymousClass182.A0r("profile_product_tab_data");
            IGAdProfileProductTabDictImpl EuK = iGAdProfileProductTabDict.EuK(new C37761pD(null));
            anonymousClass182.A0d();
            IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = EuK.A00;
            if (iGAdProfileProductTabFeatureModeEnum != null) {
                anonymousClass182.A0S("feature_mode", iGAdProfileProductTabFeatureModeEnum.A00);
            }
            Boolean bool49 = EuK.A01;
            if (bool49 != null) {
                anonymousClass182.A0T("is_price_eligible", bool49.booleanValue());
            }
            Boolean bool50 = EuK.A02;
            if (bool50 != null) {
                anonymousClass182.A0T("more_products_available", bool50.booleanValue());
            }
            List<ProductDetailsProductItemDict> list28 = EuK.A03;
            if (list28 != null) {
                C16V.A03(anonymousClass182, "products");
                for (ProductDetailsProductItemDict productDetailsProductItemDict : list28) {
                    if (productDetailsProductItemDict != null) {
                        AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        C47W c47w = c39531sa.A0d;
        if (c47w != null) {
            anonymousClass182.A0r("profile_visit_ads_info");
            C104014mN Eyi = c47w.Eyi();
            anonymousClass182.A0d();
            AndroidLink androidLink3 = Eyi.A00;
            if (androidLink3 != null) {
                anonymousClass182.A0r("android_link");
                AbstractC87683va.A00(anonymousClass182, androidLink3.F53());
            }
            Integer num21 = Eyi.A01;
            if (num21 != null) {
                anonymousClass182.A0Q("secondary_cta_destination", num21.intValue());
            }
            String str107 = Eyi.A02;
            if (str107 != null) {
                anonymousClass182.A0S("secondary_cta_hint_text", str107);
            }
            String str108 = Eyi.A03;
            if (str108 != null) {
                anonymousClass182.A0S("secondary_cta_title", str108);
            }
            anonymousClass182.A0a();
        }
        C5Fk c5Fk = c39531sa.A0s;
        if (c5Fk != null) {
            anonymousClass182.A0r("reels_mid_scene_info");
            AbstractC41367ISu.A00(anonymousClass182, c5Fk);
        }
        C5Fl c5Fl = c39531sa.A0t;
        if (c5Fl != null) {
            anonymousClass182.A0r("reels_multi_ads_info");
            anonymousClass182.A0d();
            String str109 = c5Fl.A00;
            if (str109 != null) {
                anonymousClass182.A0S("ad_info_text", str109);
            }
            anonymousClass182.A0a();
        }
        InterfaceC104964oB interfaceC104964oB = c39531sa.A0Y;
        if (interfaceC104964oB != null) {
            anonymousClass182.A0r("short_video_dtd");
            C108344uL EvX = interfaceC104964oB.EvX();
            anonymousClass182.A0d();
            Integer num22 = EvX.A00;
            if (num22 != null) {
                anonymousClass182.A0Q("loop_count", num22.intValue());
            }
            anonymousClass182.A0a();
        }
        Boolean bool51 = c39531sa.A1U;
        if (bool51 != null) {
            anonymousClass182.A0T("should_fetch_preview_comments", bool51.booleanValue());
        }
        Boolean bool52 = c39531sa.A1V;
        if (bool52 != null) {
            anonymousClass182.A0T("should_show_exclusive_info_cta", bool52.booleanValue());
        }
        Boolean bool53 = c39531sa.A1W;
        if (bool53 != null) {
            anonymousClass182.A0T("should_show_secondary_cta_on_profile", bool53.booleanValue());
        }
        Boolean bool54 = c39531sa.A1X;
        if (bool54 != null) {
            anonymousClass182.A0T("show_ad_choices", bool54.booleanValue());
        }
        Boolean bool55 = c39531sa.A1Y;
        if (bool55 != null) {
            anonymousClass182.A0T("show_icon", bool55.booleanValue());
        }
        Boolean bool56 = c39531sa.A1Z;
        if (bool56 != null) {
            anonymousClass182.A0T("show_page_name_in_headline", bool56.booleanValue());
        }
        C106594rE c106594rE = c39531sa.A0g;
        if (c106594rE != null) {
            anonymousClass182.A0r("sponsored_ad_disclaimer");
            anonymousClass182.A0d();
            String str110 = c106594rE.A01;
            if (str110 != null) {
                anonymousClass182.A0S("bold_style_text", str110);
            }
            anonymousClass182.A0T("has_bold_style_text", c106594rE.A03);
            String str111 = c106594rE.A02;
            if (str111 != null) {
                anonymousClass182.A0S("label", str111);
            }
            SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType = c106594rE.A00;
            if (sponsoredAdsDisclaimerType != null) {
                anonymousClass182.A0S("label_type", sponsoredAdsDisclaimerType.A00);
            }
            anonymousClass182.A0a();
        }
        InterfaceC104984oD interfaceC104984oD = c39531sa.A0i;
        if (interfaceC104984oD != null) {
            anonymousClass182.A0r("story_dynamic_ad_flexible_tiles_info");
            H5V F0I = interfaceC104984oD.F0I();
            anonymousClass182.A0d();
            Boolean bool57 = F0I.A00;
            if (bool57 != null) {
                anonymousClass182.A0T("apply_craft", bool57.booleanValue());
            }
            String str112 = F0I.A01;
            if (str112 != null) {
                anonymousClass182.A0S("aspect_ratio", str112);
            }
            anonymousClass182.A0a();
        }
        IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData = c39531sa.A0H;
        if (iGAdCreativeStory9x16CaptionData != null) {
            anonymousClass182.A0r("systematic_caption");
            IGAdCreativeStory9x16CaptionDataImpl EuG = iGAdCreativeStory9x16CaptionData.EuG();
            anonymousClass182.A0d();
            String str113 = EuG.A08;
            if (str113 != null) {
                anonymousClass182.A0S("caption_background_color", str113);
            }
            String str114 = EuG.A09;
            if (str114 != null) {
                anonymousClass182.A0S("caption_background_color_alpha", str114);
            }
            Integer num23 = EuG.A05;
            if (num23 != null) {
                anonymousClass182.A0Q("caption_box_width_pct", num23.intValue());
            }
            Float f15 = EuG.A03;
            if (f15 != null) {
                anonymousClass182.A0P("caption_center_x_pct", f15.floatValue());
            }
            Float f16 = EuG.A04;
            if (f16 != null) {
                anonymousClass182.A0P("caption_center_y_pct", f16.floatValue());
            }
            String str115 = EuG.A0A;
            if (str115 != null) {
                anonymousClass182.A0S("caption_color", str115);
            }
            Integer num24 = EuG.A06;
            if (num24 != null) {
                anonymousClass182.A0Q("caption_font_size", num24.intValue());
            }
            CaptionTextFontStyle captionTextFontStyle = EuG.A00;
            if (captionTextFontStyle != null) {
                anonymousClass182.A0S("caption_font_style", captionTextFontStyle.A00);
            }
            Integer num25 = EuG.A07;
            if (num25 != null) {
                anonymousClass182.A0Q("caption_num_lines", num25.intValue());
            }
            Boolean bool58 = EuG.A01;
            if (bool58 != null) {
                anonymousClass182.A0T("caption_tap_area_more_present", bool58.booleanValue());
            }
            Boolean bool59 = EuG.A02;
            if (bool59 != null) {
                anonymousClass182.A0T("caption_tap_area_underline_present", bool59.booleanValue());
            }
            anonymousClass182.A0a();
        }
        C38891rO c38891rO = c39531sa.A0m;
        if (c38891rO != null) {
            anonymousClass182.A0r("testimonial_data");
            AbstractC38841rG.A00(anonymousClass182, c38891rO);
        }
        TestimonialDict testimonialDict = c39531sa.A0j;
        if (testimonialDict != null) {
            anonymousClass182.A0r("testimonial_data_v2");
            TestimonialDictImpl F2s = testimonialDict.F2s(new C37761pD(null));
            anonymousClass182.A0d();
            User user = F2s.A00;
            if (user != null) {
                anonymousClass182.A0r("author");
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            Long l5 = F2s.A01;
            if (l5 != null) {
                anonymousClass182.A0R("created_at", l5.longValue());
            }
            String str116 = F2s.A02;
            if (str116 != null) {
                anonymousClass182.A0S("media_id_for_logging", str116);
            }
            String str117 = F2s.A03;
            if (str117 != null) {
                anonymousClass182.A0S("text", str117);
            }
            anonymousClass182.A0a();
        }
        InterfaceC104994oF interfaceC104994oF = c39531sa.A0X;
        if (interfaceC104994oF != null) {
            anonymousClass182.A0r("text_overlay");
            C38732H3v EvW = interfaceC104994oF.EvW();
            anonymousClass182.A0d();
            List<JM5> list29 = EvW.A00;
            if (list29 != null) {
                C16V.A03(anonymousClass182, "native_payload_v1");
                for (JM5 jm5 : list29) {
                    if (jm5 != null) {
                        C38726H3o EvG = jm5.EvG();
                        anonymousClass182.A0d();
                        InterfaceC43557JLr interfaceC43557JLr = EvG.A00;
                        if (interfaceC43557JLr != null) {
                            anonymousClass182.A0r("coordinates");
                            C38727H3p EvF = interfaceC43557JLr.EvF();
                            anonymousClass182.A0d();
                            Integer num26 = EvF.A01;
                            if (num26 != null) {
                                anonymousClass182.A0Q("bottom_right_x_pct", num26.intValue());
                            }
                            Integer num27 = EvF.A02;
                            if (num27 != null) {
                                anonymousClass182.A0Q("bottom_right_y_pct", num27.intValue());
                            }
                            IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum = EvF.A00;
                            if (iGNativeTextOverlayTextBoxAlignmentEnum != null) {
                                anonymousClass182.A0S("box_alignment", iGNativeTextOverlayTextBoxAlignmentEnum.A00);
                            }
                            Integer num28 = EvF.A03;
                            if (num28 != null) {
                                anonymousClass182.A0Q("top_left_x_pct", num28.intValue());
                            }
                            Integer num29 = EvF.A04;
                            if (num29 != null) {
                                anonymousClass182.A0Q("top_left_y_pct", num29.intValue());
                            }
                            anonymousClass182.A0a();
                        }
                        Boolean bool60 = EvG.A03;
                        if (bool60 != null) {
                            anonymousClass182.A0T("invalidate_truncated_text", bool60.booleanValue());
                        }
                        String str118 = EvG.A04;
                        if (str118 != null) {
                            anonymousClass182.A0S("text", str118);
                        }
                        InterfaceC43572JMg interfaceC43572JMg = EvG.A01;
                        if (interfaceC43572JMg != null) {
                            anonymousClass182.A0r("text_styling");
                            H3q EvH = interfaceC43572JMg.EvH();
                            anonymousClass182.A0d();
                            IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment = EvH.A02;
                            if (iGNativeSmartTextOverlayStylingAlignment != null) {
                                anonymousClass182.A0S("alignment", iGNativeSmartTextOverlayStylingAlignment.A00);
                            }
                            String str119 = EvH.A0A;
                            if (str119 != null) {
                                anonymousClass182.A0S("background_color", str119);
                            }
                            IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape = EvH.A00;
                            if (iGNativeSmartTextOverlayBackgroundShape != null) {
                                anonymousClass182.A0S("background_shape", iGNativeSmartTextOverlayBackgroundShape.A00);
                            }
                            String str120 = EvH.A0B;
                            if (str120 != null) {
                                anonymousClass182.A0S("font_color", str120);
                            }
                            Integer num30 = EvH.A07;
                            if (num30 != null) {
                                anonymousClass182.A0Q("font_size", num30.intValue());
                            }
                            IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle = EvH.A03;
                            if (iGNativeSmartTextOverlayStylingFontStyle != null) {
                                anonymousClass182.A0S("font_style", iGNativeSmartTextOverlayStylingFontStyle.A00);
                            }
                            Float f17 = EvH.A05;
                            if (f17 != null) {
                                anonymousClass182.A0P("line_height", f17.floatValue());
                            }
                            Integer num31 = EvH.A08;
                            if (num31 != null) {
                                anonymousClass182.A0Q("max_font_size", num31.intValue());
                            }
                            Float f18 = EvH.A06;
                            if (f18 != null) {
                                anonymousClass182.A0P("max_line_height", f18.floatValue());
                            }
                            Integer num32 = EvH.A09;
                            if (num32 != null) {
                                anonymousClass182.A0Q("max_number_of_lines", num32.intValue());
                            }
                            IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum = EvH.A04;
                            if (iGNativeSmartTextOverlayTextAlignmentEnum != null) {
                                anonymousClass182.A0S("text_alignment", iGNativeSmartTextOverlayTextAlignmentEnum.A00);
                            }
                            IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum = EvH.A01;
                            if (iGNativeSmartTextOverlayFontStyleEnum != null) {
                                anonymousClass182.A0S("text_font_style", iGNativeSmartTextOverlayFontStyleEnum.A00);
                            }
                            anonymousClass182.A0a();
                        }
                        JKK jkk = EvG.A02;
                        if (jkk != null) {
                            anonymousClass182.A0r("time_stamp");
                            C38728H3r EvI = jkk.EvI();
                            anonymousClass182.A0d();
                            Integer num33 = EvI.A00;
                            if (num33 != null) {
                                anonymousClass182.A0Q("end", num33.intValue());
                            }
                            Integer num34 = EvI.A01;
                            if (num34 != null) {
                                anonymousClass182.A0Q("start", num34.intValue());
                            }
                            anonymousClass182.A0a();
                        }
                        String str121 = EvG.A05;
                        if (str121 != null) {
                            anonymousClass182.A0S("truncation_text", str121);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str122 = c39531sa.A2B;
        if (str122 != null) {
            anonymousClass182.A0S("tracking_token", str122);
        }
        C114625Fm c114625Fm = c39531sa.A0k;
        if (c114625Fm != null) {
            anonymousClass182.A0r("urp_card_transformation");
            IPT.A00(anonymousClass182, c114625Fm);
        }
        Integer num35 = c39531sa.A1h;
        if (num35 != null) {
            anonymousClass182.A0Q("validated_product_cursor", num35.intValue());
        }
        List<String> list30 = c39531sa.A2O;
        if (list30 != null) {
            C16V.A03(anonymousClass182, "view_tags");
            for (String str123 : list30) {
                if (str123 != null) {
                    anonymousClass182.A0u(str123);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
