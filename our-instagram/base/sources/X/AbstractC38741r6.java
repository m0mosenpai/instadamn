package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.ReelType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38741r6 {
    public static C37771pE parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        String A1P9;
        String A1P10;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C37801pJ c37801pJ = null;
            String str = null;
            C37841pN c37841pN = null;
            Long l = null;
            C37881pR c37881pR = null;
            AdsIAWRatingInfo adsIAWRatingInfo = null;
            AdsRatingInfo adsRatingInfo = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            C37921pZ c37921pZ = null;
            C37941pb c37941pb = null;
            String str4 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            CarouselRenderingType carouselRenderingType = null;
            ArrayList arrayList = null;
            C38011pl c38011pl = null;
            Float f = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            C38041po c38041po = null;
            ArrayList arrayList2 = null;
            C38091pt c38091pt = null;
            Integer num2 = null;
            ArrayList arrayList3 = null;
            Boolean bool7 = null;
            C38111pv c38111pv = null;
            Long l2 = null;
            FanClubStoriesTeaserType fanClubStoriesTeaserType = null;
            String str5 = null;
            HallpassDetailsDictImpl hallpassDetailsDictImpl = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str6 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            HighlightReelTypeStr highlightReelTypeStr = null;
            ArrayList arrayList4 = null;
            String str7 = null;
            C38161q3 c38161q3 = null;
            Long l3 = null;
            Boolean bool14 = null;
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            ArrayList arrayList5 = null;
            String str8 = null;
            C38211qB c38211qB = null;
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
            ArrayList arrayList6 = null;
            Float f2 = null;
            Long l4 = null;
            Long l5 = null;
            Integer num3 = null;
            ArrayList arrayList7 = null;
            C38231qD c38231qD = null;
            C38271qH c38271qH = null;
            Boolean bool25 = null;
            C38321qM c38321qM = null;
            String str9 = null;
            Integer num4 = null;
            C38471qb c38471qb = null;
            String str10 = null;
            ArrayList arrayList8 = null;
            Integer num5 = null;
            Integer num6 = null;
            Long l6 = null;
            Integer num7 = null;
            C38491qd c38491qd = null;
            C38041po c38041po2 = null;
            C38521qg c38521qg = null;
            ReelType reelType = null;
            C38541qi c38541qi = null;
            C38561qk c38561qk = null;
            RingSpecImpl ringSpecImpl = null;
            Integer num8 = null;
            Integer num9 = null;
            C38591qp c38591qp = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            C38611qr c38611qr = null;
            String str11 = null;
            C38641qv c38641qv = null;
            String str12 = null;
            String str13 = null;
            Integer num10 = null;
            Integer num11 = null;
            String str14 = null;
            C38661qx c38661qx = null;
            C38681qz c38681qz = null;
            C38701r2 c38701r2 = null;
            String str15 = null;
            C38721r4 c38721r4 = null;
            Long l7 = null;
            ArrayList arrayList9 = null;
            ArrayList arrayList10 = null;
            Integer num12 = null;
            User user = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("acr_in_story".equals(A0q)) {
                    c37801pJ = I2U.parseFromJson(c16l);
                } else if ("actor_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ad4ad".equals(A0q)) {
                    c37841pN = AbstractC40712I2s.parseFromJson(c16l);
                } else if ("ad_expiry_timestamp_in_millis".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("ad_pod_rules".equals(A0q)) {
                    c37881pR = AbstractC38751r7.parseFromJson(c16l);
                } else if ("ads_iaw_rating_info".equals(A0q)) {
                    adsIAWRatingInfo = AbstractC41368ISv.parseFromJson(c16l);
                } else if ("ads_rating_and_review_info".equals(A0q)) {
                    adsRatingInfo = C5QZ.parseFromJson(c16l);
                } else if ("app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("archive_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("birthday_badge_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("bloks_netego".equals(A0q)) {
                    c37921pZ = AbstractC40715I2v.parseFromJson(c16l);
                } else if ("broadcast".equals(A0q)) {
                    c37941pb = AbstractC108524ud.parseFromJson(c16l);
                } else if ("campaign_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("can_react_with_avatar".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("can_reply".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("can_reshare".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("carousel_opt_in_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("carousel_rendering_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P10 = null;
                    } else {
                        A1P10 = c16l.A1P();
                    }
                    carouselRenderingType = (CarouselRenderingType) CarouselRenderingType.A01.get(A1P10);
                    if (carouselRenderingType == null) {
                        carouselRenderingType = CarouselRenderingType.A07;
                    }
                } else if ("carousel_transformation_cards_v2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P9 = null;
                            } else {
                                A1P9 = c16l.A1P();
                            }
                            arrayList.add(AbstractC105314ol.A00(A1P9));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_gap_rules".equals(A0q)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("client_prefetch_score".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("contains_stitched_media_blocked_by_rm".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("contains_unavailable_story".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("continue_shopping_in_story".equals(A0q)) {
                    c38041po = IR4.parseFromJson(c16l);
                } else if ("cop_render_output".equals(A0q)) {
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
                } else if ("cover_media".equals(A0q)) {
                    c38091pt = AbstractC129585tN.parseFromJson(c16l);
                } else if ("created_at".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("disabled_reply_types".equals(A0q)) {
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
                } else if ("eligible_for_hype".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("empty_story_state_data".equals(A0q)) {
                    c38111pv = AbstractC40700I2g.parseFromJson(c16l);
                } else if ("expiring_at".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("fan_club_stories_teaser_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P7 = null;
                    } else {
                        A1P7 = c16l.A1P();
                    }
                    fanClubStoriesTeaserType = (FanClubStoriesTeaserType) FanClubStoriesTeaserType.A01.get(A1P7);
                    if (fanClubStoriesTeaserType == null) {
                        fanClubStoriesTeaserType = FanClubStoriesTeaserType.A06;
                    }
                } else if ("first_item_photo_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("hallpass_data".equals(A0q)) {
                    hallpassDetailsDictImpl = AbstractC33695Euj.parseFromJson(c16l);
                } else if ("has_besties_media".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("has_candid_media".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("has_fan_club_media".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("has_more_in_lately_attribution".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("has_pride_media".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("has_video".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("hide_from_feed_unit".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("highlight_reel_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P6 = null;
                    } else {
                        A1P6 = c16l.A1P();
                    }
                    highlightReelTypeStr = (HighlightReelTypeStr) HighlightReelTypeStr.A01.get(A1P6);
                    if (highlightReelTypeStr == null) {
                        highlightReelTypeStr = HighlightReelTypeStr.A08;
                    }
                } else if ("hype_commenter_list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList4.add(A00);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("ig_ads_story_interactive_media_info_data".equals(A0q)) {
                    c38161q3 = AbstractC105324on.parseFromJson(c16l);
                } else if ("imbe_megaphone_reel_id".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("includes_lately_only_unseen_media".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("intent_aware_ads_info".equals(A0q)) {
                    intentAwareAdsInfo = ION.parseFromJson(c16l);
                } else if ("intent_aware_ads_reels".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C37771pE parseFromJson2 = parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList5.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("interaction_timestamp".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("invalidation_rules".equals(A0q)) {
                    c38211qB = AbstractC39431sO.parseFromJson(c16l);
                } else if ("is_added_to_main_grid".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                } else if ("is_ads_sensitive".equals(A0q)) {
                    bool16 = Boolean.valueOf(c16l.A0d());
                } else if ("is_archived".equals(A0q)) {
                    bool17 = Boolean.valueOf(c16l.A0d());
                } else if ("is_cacheable".equals(A0q)) {
                    bool18 = Boolean.valueOf(c16l.A0d());
                } else if ("is_converted_to_clips".equals(A0q)) {
                    bool19 = Boolean.valueOf(c16l.A0d());
                } else if ("is_cta_sticker_available".equals(A0q)) {
                    bool20 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fb_post_from_fb_story".equals(A0q)) {
                    bool21 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fit_green".equals(A0q)) {
                    bool22 = Boolean.valueOf(c16l.A0d());
                } else if ("is_nux".equals(A0q)) {
                    bool23 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pinned_highlight".equals(A0q)) {
                    bool24 = Boolean.valueOf(c16l.A0d());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList6.add(A0C);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("latest_besties_reel_media".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("latest_reel_media".equals(A0q)) {
                    l4 = Long.valueOf(c16l.A0y());
                } else if ("latest_tray_reel_media".equals(A0q)) {
                    l5 = Long.valueOf(c16l.A0y());
                } else if ("media_count".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                arrayList7.add(A1P5);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("media_preview".equals(A0q)) {
                    c38231qD = IOX.parseFromJson(c16l);
                } else if ("meta_gallery_stories_midcard".equals(A0q)) {
                    c38271qH = AbstractC40077Hq3.parseFromJson(c16l);
                } else if ("muted".equals(A0q)) {
                    bool25 = Boolean.valueOf(c16l.A0d());
                } else if ("netego_background_media".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("netego_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("next_button_index".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("owner".equals(A0q)) {
                    c38471qb = AbstractC37519Gfb.parseFromJson(c16l);
                } else if ("page_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("post_trigger_experience_eligibilities".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P4 = null;
                            } else {
                                A1P4 = c16l.A1P();
                            }
                            IGPostTriggerExperience iGPostTriggerExperience = (IGPostTriggerExperience) IGPostTriggerExperience.A01.get(A1P4);
                            if (iGPostTriggerExperience == null) {
                                iGPostTriggerExperience = IGPostTriggerExperience.A0C;
                            }
                            arrayList8.add(iGPostTriggerExperience);
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("prefetch_count".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("priority_index".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("promotion_id".equals(A0q)) {
                    l6 = Long.valueOf(c16l.A0y());
                } else if ("ranked_position".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("ranker_scores".equals(A0q)) {
                    c38491qd = AbstractC72083Lg.parseFromJson(c16l);
                } else if ("reconsideration_injected_story".equals(A0q)) {
                    c38041po2 = IR4.parseFromJson(c16l);
                } else if ("reel_toast".equals(A0q)) {
                    c38521qg = AbstractC33737EvP.parseFromJson(c16l);
                } else if ("reel_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    reelType = AbstractC40281tw.A00(A1P3);
                } else if ("research_survey".equals(A0q)) {
                    c38541qi = I2W.parseFromJson(c16l);
                } else if ("ring_glyph".equals(A0q)) {
                    c38561qk = AbstractC41346IRr.parseFromJson(c16l);
                } else if ("ring_spec".equals(A0q)) {
                    ringSpecImpl = AbstractC41276IOr.parseFromJson(c16l);
                } else if ("seen".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("seen_ranked_position".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                } else if ("share_comment_to_story".equals(A0q)) {
                    c38591qp = AbstractC40236Hsz.parseFromJson(c16l);
                } else if ("should_prefetch".equals(A0q)) {
                    bool26 = Boolean.valueOf(c16l.A0d());
                } else if ("should_treat_link_sticker_as_cta".equals(A0q)) {
                    bool27 = Boolean.valueOf(c16l.A0d());
                } else if ("show_fan_club_stories_teaser".equals(A0q)) {
                    bool28 = Boolean.valueOf(c16l.A0d());
                } else if ("show_nux_tooltip".equals(A0q)) {
                    bool29 = Boolean.valueOf(c16l.A0d());
                } else if ("simple_action".equals(A0q)) {
                    c38611qr = IRW.parseFromJson(c16l);
                } else if ("smart_reel_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("snapshot_data".equals(A0q)) {
                    c38641qv = AbstractC40252HtI.parseFromJson(c16l);
                } else if ("social_context".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("source_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("story_duration_secs".equals(A0q)) {
                    num10 = Integer.valueOf(c16l.A1D());
                } else if ("story_wedge_size".equals(A0q)) {
                    num11 = Integer.valueOf(c16l.A1D());
                } else if ("strong_id__".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("suggested_users".equals(A0q)) {
                    c38661qx = AbstractC104184mg.parseFromJson(c16l);
                } else if ("superlative_data".equals(A0q)) {
                    c38681qz = AbstractC40365HvB.parseFromJson(c16l);
                } else if ("threads_in_stories_unit_acquisition".equals(A0q)) {
                    c38701r2 = AbstractC40421HwC.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("trending_prompts_in_story".equals(A0q)) {
                    c38721r4 = HsG.parseFromJson(c16l);
                } else if ("unique_integer_reel_id".equals(A0q)) {
                    l7 = Long.valueOf(c16l.A0y());
                } else if ("unseen_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList9.add(A1P2);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("unseen_tray_skipped_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList10 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList10.add(A1P);
                            }
                        }
                    } else {
                        arrayList10 = null;
                    }
                } else if ("updated_timestamp".equals(A0q)) {
                    num12 = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("video_to_carousel_cut_secs".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList11 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList11.add(new Float(c16l.A0U()));
                        }
                    } else {
                        arrayList11 = null;
                    }
                } else if ("video_to_carousel_cut_thumbnails".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList12 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson3 = C17Y.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList12.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList12 = null;
                    }
                }
                c16l.A0z();
            }
            return new C37771pE(c37941pb, carouselRenderingType, fanClubStoriesTeaserType, hallpassDetailsDictImpl, highlightReelTypeStr, c38161q3, intentAwareAdsInfo, c38231qD, c38271qH, c38721r4, c38471qb, c38521qg, ringSpecImpl, c38591qp, c38641qv, c38681qz, c38701r2, c38321qM, c37801pJ, c38541qi, c38111pv, c38091pt, c38491qd, reelType, c38661qx, c37841pN, c37921pZ, c38041po, c38041po2, c37881pR, c38211qB, c38611qr, c38561qk, c38011pl, adsIAWRatingInfo, adsRatingInfo, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, f, f2, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, l, l2, l3, l4, l5, l6, l7, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1530
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static void A00(X.AnonymousClass182 r9, X.C37771pE r10) {
        /*
            Method dump skipped, instructions count: 5741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38741r6.A00(X.182, X.1pE):void");
    }
}
