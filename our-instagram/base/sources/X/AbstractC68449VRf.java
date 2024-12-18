package X;

import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68449VRf {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VoH, java.lang.Object] */
    public static C69494VoH parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("fb_user_id".equals(A0s)) {
                    obj.A0P = AbstractC167017dG.A0m(c16l);
                } else if ("page_id".equals(A0s)) {
                    obj.A0T = AbstractC167017dG.A0m(c16l);
                } else if ("page_name".equals(A0s)) {
                    obj.A0U = AbstractC167017dG.A0m(c16l);
                } else if ("page_profile_pic_uri".equals(A0s)) {
                    obj.A0G = AbstractC222616c.A00(c16l);
                } else if ("media_product_type".equals(A0s)) {
                    obj.A0S = AbstractC167017dG.A0m(c16l);
                } else if ("ad_account_id".equals(A0s)) {
                    obj.A0M = AbstractC167017dG.A0m(c16l);
                } else if ("business_vertical".equals(A0s)) {
                    obj.A0N = AbstractC167017dG.A0m(c16l);
                } else if ("currency".equals(A0s)) {
                    obj.A0O = AbstractC167017dG.A0m(c16l);
                } else if ("currency_offset".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("daily_budget_options_with_offset".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    }
                    obj.A0a = arrayList;
                } else if ("daily_budget_packages_with_offset".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    }
                    obj.A0b = arrayList;
                } else if ("default_duration_in_days".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("default_daily_budget_with_offset".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("is_political_ads_eligible".equals(A0s)) {
                    obj.A0m = c16l.A0d();
                } else if ("should_show_political_ads_restriction_ux".equals(A0s)) {
                    obj.A0L = AbstractC166997dE.A0d(c16l);
                } else if ("political_ads_by_line_text".equals(A0s)) {
                    obj.A0V = AbstractC167017dG.A0m(c16l);
                } else if ("linked_igtv_video_id".equals(A0s)) {
                    obj.A0R = AbstractC167017dG.A0m(c16l);
                } else if ("last_promotion_audience_id".equals(A0s)) {
                    obj.A0Q = AbstractC167017dG.A0m(c16l);
                } else if ("is_political_ads_name_change_2019_eligible".equals(A0s)) {
                    obj.A0n = c16l.A0d();
                } else if ("is_story_post".equals(A0s)) {
                    obj.A0p = c16l.A0d();
                } else if ("is_iabp".equals(A0s)) {
                    obj.A0j = c16l.A0d();
                } else if ("can_run_ig_backed_ads".equals(A0s)) {
                    obj.A0k = c16l.A0d();
                } else if ("should_show_regulated_categories_flow".equals(A0s)) {
                    obj.A0i = c16l.A0d();
                } else if ("has_created_lead_ad".equals(A0s)) {
                    obj.A0f = c16l.A0d();
                } else if ("is_call_center_available".equals(A0s)) {
                    obj.A0J = AbstractC166997dE.A0d(c16l);
                } else if ("has_advertised".equals(A0s)) {
                    obj.A0I = AbstractC166997dE.A0d(c16l);
                } else if ("is_eligible_for_meta_verified_upsell".equals(A0s)) {
                    obj.A0K = AbstractC166997dE.A0d(c16l);
                } else if ("destination".equals(A0s)) {
                    obj.A0C = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("recommended_destination".equals(A0s)) {
                    obj.A0E = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("messaging_tool_selected".equals(A0s)) {
                    obj.A0D = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("selected_lead_ads_cta".equals(A0s)) {
                    obj.A0A = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("selected_messaging_cta".equals(A0s)) {
                    obj.A0B = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("selected_lead_form".equals(A0s)) {
                    obj.A0H = AbstractC40689I1v.parseFromJson(c16l);
                } else if ("destination_recommendation_reason".equals(A0s)) {
                    DestinationRecommendationReason destinationRecommendationReason = (DestinationRecommendationReason) DestinationRecommendationReason.A01.get(AbstractC167017dG.A0m(c16l));
                    if (destinationRecommendationReason == null) {
                        destinationRecommendationReason = DestinationRecommendationReason.A0K;
                    }
                    obj.A07 = destinationRecommendationReason;
                } else if ("call_to_action".equals(A0s)) {
                    obj.A09 = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("website_url".equals(A0s)) {
                    obj.A0X = AbstractC167017dG.A0m(c16l);
                } else if ("display_url".equals(A0s)) {
                    obj.A0F = AbstractC222616c.A00(c16l);
                } else {
                    if (!"is_media_eligible_for_story_placement".equals(A0s)) {
                        if ("is_media_eligible_for_explore_placement".equals(A0s)) {
                            obj.A0l = c16l.A0d();
                        } else if ("is_boost_again".equals(A0s)) {
                            obj.A0g = c16l.A0d();
                        } else if ("instagram_positions".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() == C16R.A0G) {
                                        A1P5 = null;
                                    } else {
                                        A1P5 = c16l.A1P();
                                    }
                                    arrayList2.add(AbstractC68362VNw.A00(A1P5));
                                }
                                arrayList = arrayList2;
                            }
                            obj.A0d = arrayList;
                        } else if ("message_extensions".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                ArrayList arrayList3 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() == C16R.A0G) {
                                        A1P4 = null;
                                    } else {
                                        A1P4 = c16l.A1P();
                                    }
                                    AdsMessageExtensionType adsMessageExtensionType = (AdsMessageExtensionType) AdsMessageExtensionType.A01.get(A1P4);
                                    if (adsMessageExtensionType == null) {
                                        adsMessageExtensionType = AdsMessageExtensionType.A07;
                                    }
                                    arrayList3.add(adsMessageExtensionType);
                                }
                                arrayList = arrayList3;
                            }
                            obj.A0e = arrayList;
                        } else if ("eligible_objectives".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                ArrayList arrayList4 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() == C16R.A0G) {
                                        A1P3 = null;
                                    } else {
                                        A1P3 = c16l.A1P();
                                    }
                                    arrayList4.add(VPS.A00(A1P3));
                                }
                                arrayList = arrayList4;
                            }
                            obj.A0c = arrayList;
                        } else if (!"has_opted_out_of_secondary_cta".equals(A0s)) {
                            if ("profile_visit_secondary_cta_info".equals(A0s)) {
                                obj.A03 = AbstractC68386VOu.parseFromJson(c16l);
                            } else if ("profile_website_url".equals(A0s)) {
                                obj.A0W = AbstractC167017dG.A0m(c16l);
                            } else if ("boosting_status".equals(A0s)) {
                                obj.A05 = BoostedActionStatus.valueOf(c16l.A1Q());
                            } else if ("additional_eligible_publisher_platforms".equals(A0s)) {
                                if (c16l.A11() == C16R.A0C) {
                                    ArrayList arrayList5 = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        if (c16l.A11() == C16R.A0G) {
                                            A1P2 = null;
                                        } else {
                                            A1P2 = c16l.A1P();
                                        }
                                        PublisherPlatform publisherPlatform = (PublisherPlatform) PublisherPlatform.A01.get(A1P2);
                                        if (publisherPlatform == null) {
                                            publisherPlatform = PublisherPlatform.A05;
                                        }
                                        arrayList5.add(publisherPlatform);
                                    }
                                    arrayList = arrayList5;
                                }
                                obj.A0Y = arrayList;
                            } else if ("additional_publisher_platforms_user_selected".equals(A0s)) {
                                if (c16l.A11() == C16R.A0C) {
                                    ArrayList arrayList6 = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        if (c16l.A11() == C16R.A0G) {
                                            A1P = null;
                                        } else {
                                            A1P = c16l.A1P();
                                        }
                                        PublisherPlatform publisherPlatform2 = (PublisherPlatform) PublisherPlatform.A01.get(A1P);
                                        if (publisherPlatform2 == null) {
                                            publisherPlatform2 = PublisherPlatform.A05;
                                        }
                                        arrayList6.add(publisherPlatform2);
                                    }
                                    arrayList = arrayList6;
                                }
                                obj.A0Z = arrayList;
                            } else if ("link_sticker_info".equals(A0s)) {
                                obj.A08 = AbstractC68368VOc.parseFromJson(c16l);
                            } else if (AbstractC111324zv.A00(2596).equals(A0s)) {
                                obj.A0h = c16l.A0d();
                            } else if (AbstractC111324zv.A00(458).equals(A0s)) {
                                obj.A0o = c16l.A0d();
                            } else if ("dsa_data".equals(A0s)) {
                                obj.A04 = VOD.parseFromJson(c16l);
                            } else if ("sbg_engagement_eligibility_and_dynamic_content".equals(A0s)) {
                                obj.A06 = VOC.parseFromJson(c16l);
                            }
                        }
                    }
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
