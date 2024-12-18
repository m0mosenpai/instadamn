package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.api.schemas.ClipsCameraSurface;
import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.api.schemas.IGLiveModeratorEligibilityType;
import com.instagram.api.schemas.IGLiveModeratorStatus;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.api.schemas.IGLiveWaveStatus;
import com.instagram.api.schemas.IGUserProfileGridType;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.api.schemas.LikeVisibilityType;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.PrimaryProfileLinkType;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.api.schemas.ShoppingOnboardingState;
import com.instagram.api.schemas.TextAppMessagingPrototypeEligibility;
import com.instagram.api.schemas.TextAppOnlineStatusVisibilitySetting;
import com.instagram.api.schemas.XDTIGAIAgentBannerType;
import com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38861rJ {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.17O] */
    public static C17O parseFromJson(C16L c16l) {
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
        String A1P11;
        String A1P12;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("about_your_account_bloks_entrypoint_enabled".equals(A0q)) {
                    obj.A1G = Boolean.valueOf(c16l.A0d());
                } else {
                    String str = null;
                    ArrayList arrayList = null;
                    String str2 = null;
                    ArrayList arrayList2 = null;
                    String str3 = null;
                    ArrayList arrayList3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    String str13 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    String str17 = null;
                    String str18 = null;
                    ArrayList arrayList4 = null;
                    String str19 = null;
                    ArrayList arrayList5 = null;
                    String str20 = null;
                    String str21 = null;
                    String str22 = null;
                    String str23 = null;
                    String str24 = null;
                    String str25 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    String str26 = null;
                    String str27 = null;
                    String str28 = null;
                    String str29 = null;
                    String str30 = null;
                    String str31 = null;
                    String str32 = null;
                    String str33 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    String str34 = null;
                    String str35 = null;
                    String str36 = null;
                    String str37 = null;
                    String str38 = null;
                    String str39 = null;
                    String str40 = null;
                    String str41 = null;
                    String str42 = null;
                    String str43 = null;
                    String str44 = null;
                    String str45 = null;
                    String str46 = null;
                    String str47 = null;
                    String str48 = null;
                    String str49 = null;
                    String str50 = null;
                    String str51 = null;
                    String str52 = null;
                    String str53 = null;
                    String str54 = null;
                    String str55 = null;
                    String str56 = null;
                    String str57 = null;
                    String str58 = null;
                    String str59 = null;
                    String str60 = null;
                    String str61 = null;
                    String str62 = null;
                    String str63 = null;
                    String str64 = null;
                    String str65 = null;
                    String str66 = null;
                    String str67 = null;
                    String str68 = null;
                    String str69 = null;
                    ArrayList arrayList11 = null;
                    String str70 = null;
                    String str71 = null;
                    String str72 = null;
                    String str73 = null;
                    String str74 = null;
                    String str75 = null;
                    String str76 = null;
                    String str77 = null;
                    String str78 = null;
                    String str79 = null;
                    String str80 = null;
                    String str81 = null;
                    String str82 = null;
                    String str83 = null;
                    String str84 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    String str85 = null;
                    String str86 = null;
                    String str87 = null;
                    String str88 = null;
                    ArrayList arrayList14 = null;
                    String str89 = null;
                    String str90 = null;
                    String str91 = null;
                    ArrayList arrayList15 = null;
                    ArrayList arrayList16 = null;
                    ArrayList arrayList17 = null;
                    String str92 = null;
                    ArrayList arrayList18 = null;
                    ArrayList arrayList19 = null;
                    ArrayList arrayList20 = null;
                    ArrayList arrayList21 = null;
                    ArrayList arrayList22 = null;
                    String str93 = null;
                    String str94 = null;
                    String str95 = null;
                    String str96 = null;
                    ArrayList arrayList23 = null;
                    String str97 = null;
                    String str98 = null;
                    String str99 = null;
                    String str100 = null;
                    String str101 = null;
                    String str102 = null;
                    String str103 = null;
                    String str104 = null;
                    String str105 = null;
                    String str106 = null;
                    String str107 = null;
                    String str108 = null;
                    String str109 = null;
                    String str110 = null;
                    ArrayList arrayList24 = null;
                    String str111 = null;
                    String str112 = null;
                    String str113 = null;
                    String str114 = null;
                    String str115 = null;
                    String str116 = null;
                    String str117 = null;
                    String str118 = null;
                    String str119 = null;
                    String str120 = null;
                    String str121 = null;
                    String str122 = null;
                    ArrayList arrayList25 = null;
                    String str123 = null;
                    String str124 = null;
                    String str125 = null;
                    if ("account_badges".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        obj.A7q = arrayList;
                    } else if ("account_category".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        obj.A6A = str2;
                    } else if ("account_type".equals(A0q)) {
                        obj.A5U = Integer.valueOf(c16l.A1D());
                    } else if ("account_warning".equals(A0q)) {
                        obj.A0f = C52X.parseFromJson(c16l);
                    } else if ("acr_count".equals(A0q)) {
                        obj.A5V = Integer.valueOf(c16l.A1D());
                    } else if ("active_standalone_fundraisers".equals(A0q)) {
                        obj.A05 = AbstractC81713kg.parseFromJson(c16l);
                    } else if ("additional_business_addresses".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                E8I parseFromJson = AbstractC33768Evu.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        obj.A7h = arrayList2;
                    } else if ("address_editing_config".equals(A0q)) {
                        obj.A10 = C5JL.parseFromJson(c16l);
                    } else if ("address_street".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        obj.A6B = str3;
                    } else if ("adjusted_banners_order".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                E84 parseFromJson2 = AbstractC33732EvK.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList3.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A7i = arrayList3;
                    } else if ("ads_incentive_expiration_date".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        obj.A6C = str4;
                    } else if ("ads_page_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        obj.A6D = str5;
                    } else if ("ads_page_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        obj.A6E = str6;
                    } else if ("ai_agent_banner_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        XDTIGAIAgentBannerType xDTIGAIAgentBannerType = (XDTIGAIAgentBannerType) XDTIGAIAgentBannerType.A01.get(str7);
                        if (xDTIGAIAgentBannerType == null) {
                            xDTIGAIAgentBannerType = XDTIGAIAgentBannerType.A08;
                        }
                        obj.A13 = xDTIGAIAgentBannerType;
                    } else if ("ai_agent_can_participate_in_audio_call".equals(A0q)) {
                        obj.A1H = Boolean.valueOf(c16l.A0d());
                    } else if ("ai_agent_can_participate_in_video_call".equals(A0q)) {
                        obj.A1I = Boolean.valueOf(c16l.A0d());
                    } else if ("ai_agent_is_admin".equals(A0q)) {
                        obj.A1J = Boolean.valueOf(c16l.A0d());
                    } else if ("ai_agent_owner_fbid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        obj.A6F = str8;
                    } else if ("ai_agent_owner_igid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str9 = c16l.A1P();
                        }
                        obj.A6G = str9;
                    } else if ("ai_agent_owner_username".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str10 = c16l.A1P();
                        }
                        obj.A6H = str10;
                    } else if ("ai_agent_persona_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str11 = c16l.A1P();
                        }
                        obj.A6I = str11;
                    } else if ("ai_agent_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str12 = c16l.A1P();
                        }
                        obj.A0R = AnonymousClass565.A00(str12);
                    } else if ("ai_agent_visibility_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str13 = c16l.A1P();
                        }
                        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus = (IGAIAgentVisibilityStatus) IGAIAgentVisibilityStatus.A01.get(str13);
                        if (iGAIAgentVisibilityStatus == null) {
                            iGAIAgentVisibilityStatus = IGAIAgentVisibilityStatus.A06;
                        }
                        obj.A0S = iGAIAgentVisibilityStatus;
                    } else if ("ai_creator_agent_owner_igid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str14 = c16l.A1P();
                        }
                        obj.A6J = str14;
                    } else if ("all_media_count".equals(A0q)) {
                        obj.A5W = Integer.valueOf(c16l.A1D());
                    } else if ("allow_automatic_previews_setting".equals(A0q)) {
                        obj.A1K = Boolean.valueOf(c16l.A0d());
                    } else if ("allow_contacts_sync".equals(A0q)) {
                        obj.A1L = Boolean.valueOf(c16l.A0d());
                    } else if ("allow_mention_setting".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str15 = c16l.A1P();
                        }
                        obj.A6K = str15;
                    } else if ("allow_tag_setting".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str16 = c16l.A1P();
                        }
                        obj.A6L = str16;
                    } else if ("allowed_commenter_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str17 = c16l.A1P();
                        }
                        CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(str17);
                        if (commentAudienceControlType == null) {
                            commentAudienceControlType = CommentAudienceControlType.A08;
                        }
                        obj.A0F = commentAudienceControlType;
                    } else if ("approval_request_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str18 = c16l.A1P();
                        }
                        obj.A0A = AbstractC46584KjN.A00(str18);
                    } else if ("audio_go_dark_events".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                H2K parseFromJson3 = AbstractC39755HkR.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList4.add(parseFromJson3);
                                }
                            }
                        }
                        obj.A7j = arrayList4;
                    } else if ("authenticity_type".equals(A0q)) {
                        obj.A5X = Integer.valueOf(c16l.A1D());
                    } else if ("auto_expand_chaining".equals(A0q)) {
                        obj.A1M = Boolean.valueOf(c16l.A0d());
                    } else if ("avatar_status".equals(A0q)) {
                        obj.A06 = AbstractC81743kk.parseFromJson(c16l);
                    } else if ("badge_count".equals(A0q)) {
                        obj.A5Y = Integer.valueOf(c16l.A1D());
                    } else if ("bc_approved_partner_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str19 = c16l.A1P();
                        }
                        obj.A0B = AbstractC46584KjN.A00(str19);
                    } else if ("besties_count".equals(A0q)) {
                        obj.A5Z = Integer.valueOf(c16l.A1D());
                    } else if ("bio_interests".equals(A0q)) {
                        obj.A07 = AbstractC33665EuF.parseFromJson(c16l);
                    } else if ("bio_links".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C81863l6 parseFromJson4 = AbstractC81853l4.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList5.add(parseFromJson4);
                                }
                            }
                        }
                        obj.A7k = arrayList5;
                    } else if ("biography".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str20 = c16l.A1P();
                        }
                        obj.A6M = str20;
                    } else if ("biography_with_entities".equals(A0q)) {
                        obj.A0z = AbstractC81753kn.parseFromJson(c16l);
                    } else if ("birthday_today_visibility_for_viewer".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str21 = c16l.A1P();
                        }
                        BirthdayVisibilityForViewer birthdayVisibilityForViewer = (BirthdayVisibilityForViewer) BirthdayVisibilityForViewer.A01.get(str21);
                        if (birthdayVisibilityForViewer == null) {
                            birthdayVisibilityForViewer = BirthdayVisibilityForViewer.A05;
                        }
                        obj.A08 = birthdayVisibilityForViewer;
                    } else if ("biz_user_inbox_state".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str22 = c16l.A1P();
                        }
                        obj.A09 = AbstractC81043jY.A00(str22);
                    } else if ("break_reminder_interval".equals(A0q)) {
                        obj.A5a = Integer.valueOf(c16l.A1D());
                    } else if ("broadcast_chat_preference_status".equals(A0q)) {
                        obj.A0d = AnonymousClass449.parseFromJson(c16l);
                    } else if ("business_contact_method".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str23 = c16l.A1P();
                        }
                        obj.A6N = str23;
                    } else if ("can_be_share_to_friends_story_distributor".equals(A0q)) {
                        obj.A1N = Boolean.valueOf(c16l.A0d());
                    } else if ("can_be_tagged_as_sponsor".equals(A0q)) {
                        obj.A1O = Boolean.valueOf(c16l.A0d());
                    } else if ("can_boost_post".equals(A0q)) {
                        obj.A1P = Boolean.valueOf(c16l.A0d());
                    } else if ("can_claim_page".equals(A0q)) {
                        obj.A1Q = Boolean.valueOf(c16l.A0d());
                    } else if ("can_coauthor_posts".equals(A0q)) {
                        obj.A1R = Boolean.valueOf(c16l.A0d());
                    } else if ("can_coauthor_posts_with_music".equals(A0q)) {
                        obj.A1S = Boolean.valueOf(c16l.A0d());
                    } else if ("can_convert_to_business".equals(A0q)) {
                        obj.A1T = Boolean.valueOf(c16l.A0d());
                    } else if ("can_create_new_standalone_personal_fundraiser".equals(A0q)) {
                        obj.A1U = Boolean.valueOf(c16l.A0d());
                    } else if ("can_create_sponsor_tags".equals(A0q)) {
                        obj.A1V = Boolean.valueOf(c16l.A0d());
                    } else if ("can_crosspost_without_fb_token".equals(A0q)) {
                        obj.A1W = Boolean.valueOf(c16l.A0d());
                    } else if ("can_generate_nametag".equals(A0q)) {
                        obj.A1X = Boolean.valueOf(c16l.A0d());
                    } else if ("can_influencers_tag_business_products".equals(A0q)) {
                        obj.A1Y = Boolean.valueOf(c16l.A0d());
                    } else if ("can_merchant_use_shop_management".equals(A0q)) {
                        obj.A1Z = Boolean.valueOf(c16l.A0d());
                    } else if ("can_see_organic_insights".equals(A0q)) {
                        obj.A1a = Boolean.valueOf(c16l.A0d());
                    } else if ("can_see_primary_country_in_settings".equals(A0q)) {
                        obj.A1b = Boolean.valueOf(c16l.A0d());
                    } else if ("can_see_quiet_post_attribution".equals(A0q)) {
                        obj.A1c = Boolean.valueOf(c16l.A0d());
                    } else if ("can_see_unified_xposting_setting".equals(A0q)) {
                        obj.A1d = Boolean.valueOf(c16l.A0d());
                    } else if ("can_tag_products_from_merchants".equals(A0q)) {
                        obj.A1e = Boolean.valueOf(c16l.A0d());
                    } else if ("can_use_branded_content_discovery_as_brand".equals(A0q)) {
                        obj.A1f = Boolean.valueOf(c16l.A0d());
                    } else if ("can_use_branded_content_discovery_as_creator".equals(A0q)) {
                        obj.A1g = Boolean.valueOf(c16l.A0d());
                    } else if ("can_use_paid_partnership_messaging_as_creator".equals(A0q)) {
                        obj.A1h = Boolean.valueOf(c16l.A0d());
                    } else if ("category".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str24 = c16l.A1P();
                        }
                        obj.A6O = str24;
                    } else if ("category_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str25 = c16l.A1P();
                        }
                        obj.A6P = str25;
                    } else if ("chaining_info".equals(A0q)) {
                        obj.A0C = C43N.parseFromJson(c16l);
                    } else if ("chaining_suggestions".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator = User.CREATOR;
                                User A00 = AbstractC38851rI.A00(c16l, false);
                                if (A00 != null) {
                                    arrayList6.add(A00);
                                }
                            }
                        }
                        obj.A7r = arrayList6;
                    } else if ("chaining_upsell_cards".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList7 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C66632UQj parseFromJson5 = VO4.parseFromJson(c16l);
                                if (parseFromJson5 != null) {
                                    arrayList7.add(parseFromJson5);
                                }
                            }
                        }
                        obj.A7l = arrayList7;
                    } else if ("channels_info".equals(A0q)) {
                        obj.A0D = AbstractC115065Ib.parseFromJson(c16l);
                    } else if ("charity_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str26 = c16l.A1P();
                        }
                        obj.A6Q = str26;
                    } else if ("charity_profile_fundraiser_info".equals(A0q)) {
                        obj.A19 = C44C.parseFromJson(c16l);
                    } else if ("city_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str27 = c16l.A1P();
                        }
                        obj.A6R = str27;
                    } else if ("city_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str28 = c16l.A1P();
                        }
                        obj.A6S = str28;
                    } else if ("closeness_score".equals(A0q)) {
                        obj.A5P = new Float(c16l.A0U());
                    } else if ("commerce_onboarding_config".equals(A0q)) {
                        obj.A0G = AbstractC104154md.parseFromJson(c16l);
                    } else if ("contact_phone_number".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str29 = c16l.A1P();
                        }
                        obj.A6T = str29;
                    } else if ("context_line".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str30 = c16l.A1P();
                        }
                        obj.A6U = str30;
                    } else if ("creator_info".equals(A0q)) {
                        obj.A0H = AbstractC223916w.parseFromJson(c16l);
                    } else if ("creator_shopping_info".equals(A0q)) {
                        obj.A1A = AbstractC81783kr.parseFromJson(c16l);
                    } else if ("creators_subscribed_to_count".equals(A0q)) {
                        obj.A5b = Integer.valueOf(c16l.A1D());
                    } else if ("current_catalog_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str31 = c16l.A1P();
                        }
                        obj.A6V = str31;
                    } else if ("daily_time_limit".equals(A0q)) {
                        obj.A5c = Integer.valueOf(c16l.A1D());
                    } else if ("default_e2ee_thread".equals(A0q)) {
                        obj.A1i = Boolean.valueOf(c16l.A0d());
                    } else if ("default_e2ee_thread_one_to_one".equals(A0q)) {
                        obj.A1j = Boolean.valueOf(c16l.A0d());
                    } else if ("default_media_kit_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str32 = c16l.A1P();
                        }
                        obj.A6W = str32;
                    } else if ("disabled_sharing_products_to_guides".equals(A0q)) {
                        obj.A1k = Boolean.valueOf(c16l.A0d());
                    } else if ("displayed_action_button_partner".equals(A0q)) {
                        obj.A00 = AbstractC111174ze.parseFromJson(c16l);
                    } else if ("displayed_action_button_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str33 = c16l.A1P();
                        }
                        obj.A0m = AbstractC81793ku.A00(str33);
                    } else if ("eligible_catalog_management_entrypoints".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList8 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P12 = c16l.A1P()) != null) {
                                    arrayList8.add(A1P12);
                                }
                            }
                        }
                        obj.A7s = arrayList8;
                    } else if ("eligible_for_text_app_activation_badge".equals(A0q)) {
                        obj.A1l = Boolean.valueOf(c16l.A0d());
                    } else if ("eligible_shopping_formats".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList9 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P11 = c16l.A1P()) != null) {
                                    arrayList9.add(A1P11);
                                }
                            }
                        }
                        obj.A7t = arrayList9;
                    } else if ("eligible_shopping_signup_entrypoints".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList10 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P10 = c16l.A1P()) != null) {
                                    arrayList10.add(A1P10);
                                }
                            }
                        }
                        obj.A7u = arrayList10;
                    } else if ("enable_add_school_in_edit_profile".equals(A0q)) {
                        obj.A1m = Boolean.valueOf(c16l.A0d());
                    } else if ("existing_user_age_collection_enabled".equals(A0q)) {
                        obj.A1n = Boolean.valueOf(c16l.A0d());
                    } else if ("expiring_discount".equals(A0q)) {
                        obj.A1B = IA8.parseFromJson(c16l);
                    } else if ("external_lynx_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str34 = c16l.A1P();
                        }
                        obj.A6X = str34;
                    } else if ("external_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str35 = c16l.A1P();
                        }
                        obj.A6Y = str35;
                    } else if ("extra_display_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str36 = c16l.A1P();
                        }
                        obj.A6Z = str36;
                    } else if ("fan_club_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str37 = c16l.A1P();
                        }
                        obj.A6a = str37;
                    } else if ("fan_club_info".equals(A0q)) {
                        obj.A0K = AbstractC223816t.parseFromJson(c16l);
                    } else if ("fan_club_status_sync_info".equals(A0q)) {
                        obj.A0L = AbstractC81963lG.parseFromJson(c16l);
                    } else if ("fb_page_call_to_action_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str38 = c16l.A1P();
                        }
                        obj.A6b = str38;
                    } else if ("fb_page_call_to_action_ix_app_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str39 = c16l.A1P();
                        }
                        obj.A6c = str39;
                    } else if ("fb_page_call_to_action_ix_label_bundle".equals(A0q)) {
                        obj.A0J = IO3.parseFromJson(c16l);
                    } else if ("fb_page_call_to_action_ix_partner".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str40 = c16l.A1P();
                        }
                        obj.A6d = str40;
                    } else if ("fb_page_call_to_action_ix_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str41 = c16l.A1P();
                        }
                        obj.A6e = str41;
                    } else if ("fb_page_call_to_action_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str42 = c16l.A1P();
                        }
                        obj.A6f = str42;
                    } else if ("fbe_app_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str43 = c16l.A1P();
                        }
                        obj.A6g = str43;
                    } else if ("fbe_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str44 = c16l.A1P();
                        }
                        obj.A6h = str44;
                    } else if ("fbe_partner".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str45 = c16l.A1P();
                        }
                        obj.A6i = str45;
                    } else if ("fbe_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str46 = c16l.A1P();
                        }
                        obj.A6j = str46;
                    } else if ("fbid_v2".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str47 = c16l.A1P();
                        }
                        obj.A6k = str47;
                    } else if ("fbpay_experience_enabled".equals(A0q)) {
                        obj.A1o = Boolean.valueOf(c16l.A0d());
                    } else if ("feed_post_reshare_disabled".equals(A0q)) {
                        obj.A1p = Boolean.valueOf(c16l.A0d());
                    } else if ("follow".equals(A0q)) {
                        obj.A1q = Boolean.valueOf(c16l.A0d());
                    } else if ("follow_friction_type".equals(A0q)) {
                        obj.A5d = Integer.valueOf(c16l.A1D());
                    } else if ("follow_status".equals(A0q)) {
                        obj.A1r = Boolean.valueOf(c16l.A0d());
                    } else if ("follow_status_enum".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str48 = c16l.A1P();
                        }
                        obj.A1C = AbstractC38871rK.A00(str48);
                    } else if ("followed_by".equals(A0q)) {
                        obj.A1s = Boolean.valueOf(c16l.A0d());
                    } else if ("follower_count".equals(A0q)) {
                        obj.A5e = Integer.valueOf(c16l.A1D());
                    } else if ("following_count".equals(A0q)) {
                        obj.A5f = Integer.valueOf(c16l.A1D());
                    } else if ("following_tag_count".equals(A0q)) {
                        obj.A5g = Integer.valueOf(c16l.A1D());
                    } else if ("friendship_status".equals(A0q)) {
                        obj.A1E = AbstractC38881rL.parseFromJson(c16l);
                    } else if ("full_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str49 = c16l.A1P();
                        }
                        obj.A6l = str49;
                    } else if ("gating".equals(A0q)) {
                        obj.A0M = IOB.parseFromJson(c16l);
                    } else if ("gen_ai_personas_for_profile_banner".equals(A0q)) {
                        obj.A0N = AbstractC39940HnV.parseFromJson(c16l);
                    } else if ("group_metadata".equals(A0q)) {
                        obj.A0O = VOO.parseFromJson(c16l);
                    } else if ("group_profile_theme".equals(A0q)) {
                        obj.A0k = Hs8.parseFromJson(c16l);
                    } else if ("group_profiles_notice_enabled".equals(A0q)) {
                        obj.A1t = Boolean.valueOf(c16l.A0d());
                    } else if ("growth_friction_info".equals(A0q)) {
                        obj.A0P = AnonymousClass439.parseFromJson(c16l);
                    } else if ("guardian_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str50 = c16l.A1P();
                        }
                        obj.A6m = str50;
                    } else if ("guides_notice_enabled".equals(A0q)) {
                        obj.A1u = Boolean.valueOf(c16l.A0d());
                    } else if ("has_acrs".equals(A0q)) {
                        obj.A1v = Boolean.valueOf(c16l.A0d());
                    } else if ("has_active_charity_business_profile_fundraiser".equals(A0q)) {
                        obj.A1w = Boolean.valueOf(c16l.A0d());
                    } else if ("has_anonymous_profile_picture".equals(A0q)) {
                        obj.A1x = Boolean.valueOf(c16l.A0d());
                    } else if ("has_biography_translation".equals(A0q)) {
                        obj.A1y = Boolean.valueOf(c16l.A0d());
                    } else if ("has_business_presence_node".equals(A0q)) {
                        obj.A1z = Boolean.valueOf(c16l.A0d());
                    } else if ("has_chaining".equals(A0q)) {
                        obj.A20 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_chains".equals(A0q)) {
                        obj.A21 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_collab_collections".equals(A0q)) {
                        obj.A22 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_connected_digital_wallets".equals(A0q)) {
                        obj.A23 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_cutover_thread".equals(A0q)) {
                        obj.A24 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_disallowed_media_notes_reshare".equals(A0q)) {
                        obj.A25 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_eligible_whatsapp_linking_category".equals(A0q)) {
                        obj.A26 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_embodiment".equals(A0q)) {
                        obj.A27 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_encrypted_backup".equals(A0q)) {
                        obj.A28 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_ever_owned_public_collections".equals(A0q)) {
                        obj.A29 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_ever_selected_topics".equals(A0q)) {
                        obj.A2A = Boolean.valueOf(c16l.A0d());
                    } else if ("has_exclusive_feed_content".equals(A0q)) {
                        obj.A2B = Boolean.valueOf(c16l.A0d());
                    } else if ("has_fan_club_subscriptions".equals(A0q)) {
                        obj.A2C = Boolean.valueOf(c16l.A0d());
                    } else if ("has_gen_ai_personas_for_profile_banner".equals(A0q)) {
                        obj.A2D = Boolean.valueOf(c16l.A0d());
                    } else if ("has_groups".equals(A0q)) {
                        obj.A2E = Boolean.valueOf(c16l.A0d());
                    } else if ("has_highlight_reels".equals(A0q)) {
                        obj.A2F = Boolean.valueOf(c16l.A0d());
                    } else if ("has_ig_profile".equals(A0q)) {
                        obj.A2G = Boolean.valueOf(c16l.A0d());
                    } else if ("has_igtv_series".equals(A0q)) {
                        obj.A2H = Boolean.valueOf(c16l.A0d());
                    } else if ("has_instamadillo_cutover_thread".equals(A0q)) {
                        obj.A2I = Boolean.valueOf(c16l.A0d());
                    } else if ("has_interop_enabled".equals(A0q)) {
                        obj.A2J = Boolean.valueOf(c16l.A0d());
                    } else if ("has_legacy_bb_pending_profile_picture_update".equals(A0q)) {
                        obj.A2K = Boolean.valueOf(c16l.A0d());
                    } else if ("has_music_on_profile".equals(A0q)) {
                        obj.A2L = Boolean.valueOf(c16l.A0d());
                    } else if ("has_mv4b_pending_profile_picture_update".equals(A0q)) {
                        obj.A2M = Boolean.valueOf(c16l.A0d());
                    } else if ("has_nme_badge".equals(A0q)) {
                        obj.A2N = Boolean.valueOf(c16l.A0d());
                    } else if ("has_onboarded_to_text_post_app".equals(A0q)) {
                        obj.A2O = Boolean.valueOf(c16l.A0d());
                    } else if ("has_opt_eligible_shop".equals(A0q)) {
                        obj.A2P = Boolean.valueOf(c16l.A0d());
                    } else if ("has_other_sessions".equals(A0q)) {
                        obj.A2Q = Boolean.valueOf(c16l.A0d());
                    } else if ("has_password".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str51 = c16l.A1P();
                        }
                        HasPasswordState hasPasswordState = (HasPasswordState) HasPasswordState.A01.get(str51);
                        if (hasPasswordState == null) {
                            hasPasswordState = HasPasswordState.A06;
                        }
                        obj.A0Q = hasPasswordState;
                    } else if ("has_phone_number".equals(A0q)) {
                        obj.A2R = Boolean.valueOf(c16l.A0d());
                    } else if ("has_placed_orders".equals(A0q)) {
                        obj.A2S = Boolean.valueOf(c16l.A0d());
                    } else if ("has_primary_country_in_feed".equals(A0q)) {
                        obj.A2T = Boolean.valueOf(c16l.A0d());
                    } else if ("has_primary_country_in_profile".equals(A0q)) {
                        obj.A2U = Boolean.valueOf(c16l.A0d());
                    } else if ("has_private_collections".equals(A0q)) {
                        obj.A2V = Boolean.valueOf(c16l.A0d());
                    } else if ("has_profile_pic".equals(A0q)) {
                        obj.A2W = Boolean.valueOf(c16l.A0d());
                    } else if ("has_public_collections".equals(A0q)) {
                        obj.A2X = Boolean.valueOf(c16l.A0d());
                    } else if ("has_recommend_accounts".equals(A0q)) {
                        obj.A2Y = Boolean.valueOf(c16l.A0d());
                    } else if ("has_reposts".equals(A0q)) {
                        obj.A2Z = Boolean.valueOf(c16l.A0d());
                    } else if ("has_saved_items".equals(A0q)) {
                        obj.A2a = Boolean.valueOf(c16l.A0d());
                    } else if ("has_story_archive".equals(A0q)) {
                        obj.A2b = Boolean.valueOf(c16l.A0d());
                    } else if ("has_text_app_media".equals(A0q)) {
                        obj.A2c = Boolean.valueOf(c16l.A0d());
                    } else if ("has_text_app_posts".equals(A0q)) {
                        obj.A2d = Boolean.valueOf(c16l.A0d());
                    } else if ("has_text_app_replies".equals(A0q)) {
                        obj.A2e = Boolean.valueOf(c16l.A0d());
                    } else if ("has_text_app_reposts".equals(A0q)) {
                        obj.A2f = Boolean.valueOf(c16l.A0d());
                    } else if ("has_user_ever_set_break".equals(A0q)) {
                        obj.A2g = Boolean.valueOf(c16l.A0d());
                    } else if ("has_videos".equals(A0q)) {
                        obj.A2h = Boolean.valueOf(c16l.A0d());
                    } else if ("has_views_fetching".equals(A0q)) {
                        obj.A2i = Boolean.valueOf(c16l.A0d());
                    } else if ("hd_profile_pic_url_info".equals(A0q)) {
                        obj.A0j = AbstractC82053lR.parseFromJson(c16l);
                    } else if ("hide_like_and_view_counts".equals(A0q)) {
                        obj.A2j = Boolean.valueOf(c16l.A0d());
                    } else if ("hide_text_app_activation_badge_on_text_app".equals(A0q)) {
                        obj.A2k = Boolean.valueOf(c16l.A0d());
                    } else if ("highlights_tray_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str52 = c16l.A1P();
                        }
                        obj.A0X = AbstractC81803kw.A00(str52);
                    } else if ("home_country".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str53 = c16l.A1P();
                        }
                        obj.A6n = str53;
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str54 = c16l.A1P();
                        }
                        obj.A6o = str54;
                    } else if ("ig_profile_pic_url".equals(A0q)) {
                        obj.A15 = AbstractC222616c.A00(c16l);
                    } else if ("ig_text_post_app_onboarding_default_privacy".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str55 = c16l.A1P();
                        }
                        XDTTextPostAppAccountPrivacyOptions xDTTextPostAppAccountPrivacyOptions = (XDTTextPostAppAccountPrivacyOptions) XDTTextPostAppAccountPrivacyOptions.A01.get(str55);
                        if (xDTTextPostAppAccountPrivacyOptions == null) {
                            xDTTextPostAppAccountPrivacyOptions = XDTTextPostAppAccountPrivacyOptions.A05;
                        }
                        obj.A14 = xDTTextPostAppAccountPrivacyOptions;
                    } else if ("instagram_location_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str56 = c16l.A1P();
                        }
                        obj.A6p = str56;
                    } else if ("interop_messaging_user_fbid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str57 = c16l.A1P();
                        }
                        obj.A6q = str57;
                    } else if ("interop_user_type".equals(A0q)) {
                        obj.A5h = Integer.valueOf(c16l.A1D());
                    } else if ("is_active".equals(A0q)) {
                        obj.A2l = Boolean.valueOf(c16l.A0d());
                    } else if ("is_active_on_text_post_app".equals(A0q)) {
                        obj.A2m = Boolean.valueOf(c16l.A0d());
                    } else if ("is_active_online".equals(A0q)) {
                        obj.A2n = Boolean.valueOf(c16l.A0d());
                    } else if ("is_ad_rater".equals(A0q)) {
                        obj.A2o = Boolean.valueOf(c16l.A0d());
                    } else if ("is_aggregated_time_tracking_enabled".equals(A0q)) {
                        obj.A2p = Boolean.valueOf(c16l.A0d());
                    } else if ("is_allowed_to_create_standalone_nonprofit_fundraisers".equals(A0q)) {
                        obj.A2q = Boolean.valueOf(c16l.A0d());
                    } else if ("is_allowed_to_create_standalone_personal_fundraisers".equals(A0q)) {
                        obj.A2r = Boolean.valueOf(c16l.A0d());
                    } else if ("is_api_user".equals(A0q)) {
                        obj.A2s = Boolean.valueOf(c16l.A0d());
                    } else if ("is_approved".equals(A0q)) {
                        obj.A2t = Boolean.valueOf(c16l.A0d());
                    } else if ("is_armadillo_message_request_eligible".equals(A0q)) {
                        obj.A2u = Boolean.valueOf(c16l.A0d());
                    } else if ("is_auto_confirm_enabled_for_all_reciprocal_follow_requests".equals(A0q)) {
                        obj.A2v = Boolean.valueOf(c16l.A0d());
                    } else if ("is_auto_highlight_enabled".equals(A0q)) {
                        obj.A2w = Boolean.valueOf(c16l.A0d());
                    } else if ("is_avatar_mentionable".equals(A0q)) {
                        obj.A2x = Boolean.valueOf(c16l.A0d());
                    } else if ("is_business".equals(A0q)) {
                        obj.A2y = Boolean.valueOf(c16l.A0d());
                    } else if ("is_call_to_action_enabled".equals(A0q)) {
                        obj.A2z = Boolean.valueOf(c16l.A0d());
                    } else if ("is_call_to_action_enabled_by_surface".equals(A0q)) {
                        obj.A0a = AbstractC33710Euy.parseFromJson(c16l);
                    } else if ("is_category_tappable".equals(A0q)) {
                        obj.A30 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_connected".equals(A0q)) {
                        obj.A31 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_creator_agent_enabled".equals(A0q)) {
                        obj.A32 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_collabs".equals(A0q)) {
                        obj.A33 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_diverse_owned_business_info".equals(A0q)) {
                        obj.A34 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_igd_stacks".equals(A0q)) {
                        obj.A35 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_lead_center".equals(A0q)) {
                        obj.A36 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_enhanced_link_sheet".equals(A0q)) {
                        obj.A37 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_enhanced_link_sheet_consumption".equals(A0q)) {
                        obj.A38 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_label".equals(A0q)) {
                        obj.A39 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_links_in_reels".equals(A0q)) {
                        obj.A3A = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_multiple_addresses_consumption".equals(A0q)) {
                        obj.A3B = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_multiple_addresses_creation".equals(A0q)) {
                        obj.A3C = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_meta_verified_related_accounts".equals(A0q)) {
                        obj.A3D = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_product_tagging_null_state".equals(A0q)) {
                        obj.A3E = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_request_message".equals(A0q)) {
                        obj.A3F = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_rp_safety_notice".equals(A0q)) {
                        obj.A3G = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_seo_indexing".equals(A0q)) {
                        obj.A3H = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_for_smb_support_flow".equals(A0q)) {
                        obj.A3I = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_to_display_diverse_owned_business_info".equals(A0q)) {
                        obj.A3J = Boolean.valueOf(c16l.A0d());
                    } else if ("is_eligible_to_show_fb_cross_sharing_nux".equals(A0q)) {
                        obj.A3K = Boolean.valueOf(c16l.A0d());
                    } else if ("is_embeds_disabled".equals(A0q)) {
                        obj.A3L = Boolean.valueOf(c16l.A0d());
                    } else if ("is_epd".equals(A0q)) {
                        obj.A3M = Boolean.valueOf(c16l.A0d());
                    } else if ("is_f_and_f".equals(A0q)) {
                        obj.A3N = Boolean.valueOf(c16l.A0d());
                    } else if ("is_facebook_friend".equals(A0q)) {
                        obj.A3O = Boolean.valueOf(c16l.A0d());
                    } else if ("is_facebook_onboarded_charity".equals(A0q)) {
                        obj.A3P = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite".equals(A0q)) {
                        obj.A3Q = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite_for_ar_effects".equals(A0q)) {
                        obj.A3R = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite_for_clips".equals(A0q)) {
                        obj.A3S = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite_for_exclusive_content".equals(A0q)) {
                        obj.A3T = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite_for_igtv".equals(A0q)) {
                        obj.A3U = Boolean.valueOf(c16l.A0d());
                    } else if ("is_favorite_for_stories".equals(A0q)) {
                        obj.A3V = Boolean.valueOf(c16l.A0d());
                    } else if ("is_follow_restricted".equals(A0q)) {
                        obj.A3W = Boolean.valueOf(c16l.A0d());
                    } else if ("is_following_current_user".equals(A0q)) {
                        obj.A3X = Boolean.valueOf(c16l.A0d());
                    } else if ("is_fundraiser_instagram_agreed".equals(A0q)) {
                        obj.A3Y = Boolean.valueOf(c16l.A0d());
                    } else if ("is_group_xac_calling_eligible".equals(A0q)) {
                        obj.A3Z = Boolean.valueOf(c16l.A0d());
                    } else if ("is_groups_xac_eligible".equals(A0q)) {
                        obj.A3a = Boolean.valueOf(c16l.A0d());
                    } else if ("is_hidden_words_setting_link_to_ig_enabled".equals(A0q)) {
                        obj.A3b = Boolean.valueOf(c16l.A0d());
                    } else if ("is_hide_more_comment_enabled".equals(A0q)) {
                        obj.A3c = Boolean.valueOf(c16l.A0d());
                    } else if ("is_hiding_stories_from_someone".equals(A0q)) {
                        obj.A3d = Boolean.valueOf(c16l.A0d());
                    } else if ("is_high_risk_sharesheet_recipient".equals(A0q)) {
                        obj.A3e = Boolean.valueOf(c16l.A0d());
                    } else if ("is_igd_product_picker_enabled".equals(A0q)) {
                        obj.A3f = Boolean.valueOf(c16l.A0d());
                    } else if ("is_in_canada".equals(A0q)) {
                        obj.A3g = Boolean.valueOf(c16l.A0d());
                    } else if ("is_interest_account".equals(A0q)) {
                        obj.A3h = Boolean.valueOf(c16l.A0d());
                    } else if ("is_interop_eligible".equals(A0q)) {
                        obj.A3i = Boolean.valueOf(c16l.A0d());
                    } else if ("is_memorialized".equals(A0q)) {
                        obj.A3j = Boolean.valueOf(c16l.A0d());
                    } else if ("is_mentionable".equals(A0q)) {
                        obj.A3k = Boolean.valueOf(c16l.A0d());
                    } else if ("is_meta_ai_bot".equals(A0q)) {
                        obj.A3l = Boolean.valueOf(c16l.A0d());
                    } else if ("is_meta_verified_related_accounts_display_enabled".equals(A0q)) {
                        obj.A3m = Boolean.valueOf(c16l.A0d());
                    } else if ("is_muted_words_custom_enabled".equals(A0q)) {
                        obj.A3n = Boolean.valueOf(c16l.A0d());
                    } else if ("is_muted_words_global_enabled".equals(A0q)) {
                        obj.A3o = Boolean.valueOf(c16l.A0d());
                    } else if ("is_muted_words_spamscam_enabled".equals(A0q)) {
                        obj.A3p = Boolean.valueOf(c16l.A0d());
                    } else if ("is_mv4b_application_matured_for_profile_edit".equals(A0q)) {
                        obj.A3q = Boolean.valueOf(c16l.A0d());
                    } else if ("is_mv4b_biz_asset_profile_locked".equals(A0q)) {
                        obj.A3r = Boolean.valueOf(c16l.A0d());
                    } else if ("is_mv4b_max_profile_edit_reached".equals(A0q)) {
                        obj.A3s = Boolean.valueOf(c16l.A0d());
                    } else if ("is_new".equals(A0q)) {
                        obj.A3t = Boolean.valueOf(c16l.A0d());
                    } else if ("is_new_story_viewer".equals(A0q)) {
                        obj.A3u = Boolean.valueOf(c16l.A0d());
                    } else if ("is_new_to_instagram".equals(A0q)) {
                        obj.A3v = Boolean.valueOf(c16l.A0d());
                    } else if ("is_new_to_instagram_30d".equals(A0q)) {
                        obj.A3w = Boolean.valueOf(c16l.A0d());
                    } else if ("is_open_to_collab".equals(A0q)) {
                        obj.A3x = Boolean.valueOf(c16l.A0d());
                    } else if ("is_oregon_custom_gender_consented".equals(A0q)) {
                        obj.A3y = Boolean.valueOf(c16l.A0d());
                    } else if ("is_p2m_eligible_show_payout".equals(A0q)) {
                        obj.A3z = Boolean.valueOf(c16l.A0d());
                    } else if ("is_parenting_account".equals(A0q)) {
                        obj.A40 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_possible_bad_actor".equals(A0q)) {
                        obj.A0i = AbstractC101414h3.parseFromJson(c16l);
                    } else if ("is_possible_scammer".equals(A0q)) {
                        obj.A41 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_private".equals(A0q)) {
                        obj.A42 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_professional_account".equals(A0q)) {
                        obj.A43 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_profile_action_needed".equals(A0q)) {
                        obj.A44 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_profile_audio_call_enabled".equals(A0q)) {
                        obj.A45 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_profile_broadcast_sharing_enabled".equals(A0q)) {
                        obj.A46 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_profile_picture_expansion_enabled".equals(A0q)) {
                        obj.A47 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_promotions_in_profile_enabled".equals(A0q)) {
                        obj.A48 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_quiet_mode_enabled".equals(A0q)) {
                        obj.A49 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_reels_interest_pivot_eligible".equals(A0q)) {
                        obj.A4A = Boolean.valueOf(c16l.A0d());
                    } else if ("is_regulated_c18".equals(A0q)) {
                        obj.A4B = Boolean.valueOf(c16l.A0d());
                    } else if ("is_regulated_news_in_viewer_location".equals(A0q)) {
                        obj.A4C = Boolean.valueOf(c16l.A0d());
                    } else if ("is_remix_setting_enabled_for_posts".equals(A0q)) {
                        obj.A4D = Boolean.valueOf(c16l.A0d());
                    } else if ("is_remix_setting_enabled_for_reels".equals(A0q)) {
                        obj.A4E = Boolean.valueOf(c16l.A0d());
                    } else if ("is_sandbox_creator_agent_enabled".equals(A0q)) {
                        obj.A4F = Boolean.valueOf(c16l.A0d());
                    } else if ("is_secondary_account_creation".equals(A0q)) {
                        obj.A4G = Boolean.valueOf(c16l.A0d());
                    } else if ("is_seller_features_disabled".equals(A0q)) {
                        obj.A4H = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shared_account".equals(A0q)) {
                        obj.A4I = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shop_ads_recon_eligible".equals(A0q)) {
                        obj.A4J = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shopping_auto_highlight_eligible".equals(A0q)) {
                        obj.A4K = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shopping_catalog_source_selection_enabled".equals(A0q)) {
                        obj.A4L = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shopping_community_content_enabled".equals(A0q)) {
                        obj.A4M = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shopping_revoked_for_seller".equals(A0q)) {
                        obj.A4N = Boolean.valueOf(c16l.A0d());
                    } else if ("is_shopping_settings_enabled".equals(A0q)) {
                        obj.A4O = Boolean.valueOf(c16l.A0d());
                    } else if ("is_showing_birthday_selfie".equals(A0q)) {
                        obj.A4P = Boolean.valueOf(c16l.A0d());
                    } else if ("is_sponsor_enabled_for_branded_content_crossposting_to_fb".equals(A0q)) {
                        obj.A4Q = Boolean.valueOf(c16l.A0d());
                    } else if ("is_spotify_account_linked".equals(A0q)) {
                        obj.A4R = Boolean.valueOf(c16l.A0d());
                    } else if ("is_stories_teaser_muted".equals(A0q)) {
                        obj.A4S = Boolean.valueOf(c16l.A0d());
                    } else if ("is_supervised_user".equals(A0q)) {
                        obj.A4T = Boolean.valueOf(c16l.A0d());
                    } else if ("is_supervision_enabled".equals(A0q)) {
                        obj.A4U = Boolean.valueOf(c16l.A0d());
                    } else if ("is_supervision_features_enabled".equals(A0q)) {
                        obj.A4V = Boolean.valueOf(c16l.A0d());
                    } else if ("is_taggable".equals(A0q)) {
                        obj.A4W = Boolean.valueOf(c16l.A0d());
                    } else if ("is_threads_only_user".equals(A0q)) {
                        obj.A4X = Boolean.valueOf(c16l.A0d());
                    } else if ("is_tooltip_disabled_param".equals(A0q)) {
                        obj.A4Y = Boolean.valueOf(c16l.A0d());
                    } else if ("is_unpublished".equals(A0q)) {
                        obj.A4Z = Boolean.valueOf(c16l.A0d());
                    } else if ("is_using_unified_inbox_for_direct".equals(A0q)) {
                        obj.A4a = Boolean.valueOf(c16l.A0d());
                    } else if ("is_verified".equals(A0q)) {
                        obj.A4b = Boolean.valueOf(c16l.A0d());
                    } else if ("is_verified_search_boosted".equals(A0q)) {
                        obj.A4c = Boolean.valueOf(c16l.A0d());
                    } else if ("is_whatsapp_linked".equals(A0q)) {
                        obj.A4d = Boolean.valueOf(c16l.A0d());
                    } else if ("last_activity_at_ms".equals(A0q)) {
                        obj.A5i = Integer.valueOf(c16l.A1D());
                    } else if ("last_follow_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str58 = c16l.A1P();
                        }
                        obj.A1D = AbstractC38871rK.A00(str58);
                    } else if ("last_seen_timezone".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str59 = c16l.A1P();
                        }
                        obj.A6r = str59;
                    } else if ("latest_besties_reel_media".equals(A0q)) {
                        obj.A66 = Long.valueOf(c16l.A0y());
                    } else if ("latest_fanclub_reel_media".equals(A0q)) {
                        obj.A67 = Long.valueOf(c16l.A0y());
                    } else if ("latest_reel_media".equals(A0q)) {
                        obj.A68 = Long.valueOf(c16l.A0y());
                    } else if (Location.LATITUDE.equals(A0q)) {
                        obj.A5Q = new Float(c16l.A0U());
                    } else if ("lead_details_app_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str60 = c16l.A1P();
                        }
                        obj.A6s = str60;
                    } else if ("liked_clips_count".equals(A0q)) {
                        obj.A5j = Integer.valueOf(c16l.A1D());
                    } else if ("likes_visibility_setting".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str61 = c16l.A1P();
                        }
                        LikeVisibilityType likeVisibilityType = (LikeVisibilityType) LikeVisibilityType.A01.get(str61);
                        if (likeVisibilityType == null) {
                            likeVisibilityType = LikeVisibilityType.A07;
                        }
                        obj.A0b = likeVisibilityType;
                    } else if ("limited_interactions_enabled".equals(A0q)) {
                        obj.A4e = Boolean.valueOf(c16l.A0d());
                    } else if ("linked_fb_info".equals(A0q)) {
                        obj.A0I = AbstractC81813kz.parseFromJson(c16l);
                    } else if ("live_broadcast_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str62 = c16l.A1P();
                        }
                        obj.A6t = str62;
                    } else if ("live_broadcast_visibility".equals(A0q)) {
                        obj.A5k = Integer.valueOf(c16l.A1D());
                    } else if ("live_moderator_eligibility".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str63 = c16l.A1P();
                        }
                        IGLiveModeratorEligibilityType iGLiveModeratorEligibilityType = (IGLiveModeratorEligibilityType) IGLiveModeratorEligibilityType.A01.get(str63);
                        if (iGLiveModeratorEligibilityType == null) {
                            iGLiveModeratorEligibilityType = IGLiveModeratorEligibilityType.A06;
                        }
                        obj.A0T = iGLiveModeratorEligibilityType;
                    } else if ("live_moderator_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str64 = c16l.A1P();
                        }
                        IGLiveModeratorStatus iGLiveModeratorStatus = (IGLiveModeratorStatus) IGLiveModeratorStatus.A01.get(str64);
                        if (iGLiveModeratorStatus == null) {
                            iGLiveModeratorStatus = IGLiveModeratorStatus.A08;
                        }
                        obj.A0U = iGLiveModeratorStatus;
                    } else if ("live_subscription_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str65 = c16l.A1P();
                        }
                        IGLiveNotificationPreference iGLiveNotificationPreference = (IGLiveNotificationPreference) IGLiveNotificationPreference.A01.get(str65);
                        if (iGLiveNotificationPreference == null) {
                            iGLiveNotificationPreference = IGLiveNotificationPreference.A07;
                        }
                        obj.A0V = iGLiveNotificationPreference;
                    } else if ("live_waterfall_logging_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str66 = c16l.A1P();
                        }
                        obj.A6u = str66;
                    } else if ("live_wave_status".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str67 = c16l.A1P();
                        }
                        IGLiveWaveStatus iGLiveWaveStatus = (IGLiveWaveStatus) IGLiveWaveStatus.A01.get(str67);
                        if (iGLiveWaveStatus == null) {
                            iGLiveWaveStatus = IGLiveWaveStatus.A05;
                        }
                        obj.A0W = iGLiveWaveStatus;
                    } else if ("live_with_eligibility".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str68 = c16l.A1P();
                        }
                        obj.A6v = str68;
                    } else if ("longitude".equals(A0q)) {
                        obj.A5R = new Float(c16l.A0U());
                    } else if ("media_count".equals(A0q)) {
                        obj.A5l = Integer.valueOf(c16l.A1D());
                    } else if ("merchant_checkout_style".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str69 = c16l.A1P();
                        }
                        MerchantCheckoutStyle merchantCheckoutStyle = (MerchantCheckoutStyle) MerchantCheckoutStyle.A01.get(str69);
                        if (merchantCheckoutStyle == null) {
                            merchantCheckoutStyle = MerchantCheckoutStyle.A07;
                        }
                        obj.A0c = merchantCheckoutStyle;
                    } else if ("meta_verified_related_accounts_count".equals(A0q)) {
                        obj.A5m = Integer.valueOf(c16l.A1D());
                    } else if ("meta_verified_related_accounts_info".equals(A0q)) {
                        obj.A11 = AbstractC40441HwW.parseFromJson(c16l);
                    } else if ("multiple_profile_picture_urls".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList11 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P9 = c16l.A1P()) != null) {
                                    arrayList11.add(A1P9);
                                }
                            }
                        }
                        obj.A7v = arrayList11;
                    } else if ("mutual_followers_count".equals(A0q)) {
                        obj.A5n = Integer.valueOf(c16l.A1D());
                    } else if ("my_week_enabled".equals(A0q)) {
                        obj.A4f = Boolean.valueOf(c16l.A0d());
                    } else if ("nametag".equals(A0q)) {
                        obj.A0p = AbstractC222516b.parseFromJson(c16l);
                    } else if ("needs_to_accept_shopping_seller_onboarding_terms".equals(A0q)) {
                        obj.A4g = Boolean.valueOf(c16l.A0d());
                    } else if ("num_of_admined_pages".equals(A0q)) {
                        obj.A5o = Integer.valueOf(c16l.A1D());
                    } else if ("num_visible_storefront_products".equals(A0q)) {
                        obj.A5p = Integer.valueOf(c16l.A1D());
                    } else if ("on_direct_blacklist".equals(A0q)) {
                        obj.A4h = Boolean.valueOf(c16l.A0d());
                    } else if ("opal_info".equals(A0q)) {
                        obj.A0e = AbstractC109964xQ.parseFromJson(c16l);
                    } else if ("open_external_url_with_in_app_browser".equals(A0q)) {
                        obj.A4i = Boolean.valueOf(c16l.A0d());
                    } else if ("other_follow_list_social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str70 = c16l.A1P();
                        }
                        obj.A6w = str70;
                    } else if ("overlap_score".equals(A0q)) {
                        obj.A5S = new Float(c16l.A0U());
                    } else if ("paa_score".equals(A0q)) {
                        obj.A5T = new Float(c16l.A0U());
                    } else if ("page_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str71 = c16l.A1P();
                        }
                        obj.A6x = str71;
                    } else if ("page_id_for_new_suma_biz_account".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str72 = c16l.A1P();
                        }
                        obj.A6y = str72;
                    } else if ("page_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str73 = c16l.A1P();
                        }
                        obj.A6z = str73;
                    } else if ("pbia_page_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str74 = c16l.A1P();
                        }
                        obj.A70 = str74;
                    } else if ("permission".equals(A0q)) {
                        obj.A4j = Boolean.valueOf(c16l.A0d());
                    } else if ("personal_account_ads_page_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str75 = c16l.A1P();
                        }
                        obj.A71 = str75;
                    } else if ("personal_account_ads_page_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str76 = c16l.A1P();
                        }
                        obj.A72 = str76;
                    } else if ("personalized_clips_camera_surface".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str77 = c16l.A1P();
                        }
                        ClipsCameraSurface clipsCameraSurface = (ClipsCameraSurface) ClipsCameraSurface.A01.get(str77);
                        if (clipsCameraSurface == null) {
                            clipsCameraSurface = ClipsCameraSurface.A05;
                        }
                        obj.A0E = clipsCameraSurface;
                    } else if ("pinned_channels_info".equals(A0q)) {
                        obj.A0g = AbstractC81163jl.parseFromJson(c16l);
                    } else if ("pk".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str78 = c16l.A1P();
                        }
                        obj.A73 = str78;
                    } else if ("pk_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str79 = c16l.A1P();
                        }
                        obj.A74 = str79;
                    } else if ("primary_profile_link_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str80 = c16l.A1P();
                        }
                        PrimaryProfileLinkType primaryProfileLinkType = (PrimaryProfileLinkType) PrimaryProfileLinkType.A01.get(str80);
                        if (primaryProfileLinkType == null) {
                            primaryProfileLinkType = PrimaryProfileLinkType.A08;
                        }
                        obj.A0h = primaryProfileLinkType;
                    } else if ("producer_country".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str81 = c16l.A1P();
                        }
                        obj.A75 = str81;
                    } else if ("profile_chaining_secondary_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str82 = c16l.A1P();
                        }
                        obj.A76 = str82;
                    } else if ("profile_chaining_social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str83 = c16l.A1P();
                        }
                        obj.A77 = str83;
                    } else if ("profile_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str84 = c16l.A1P();
                        }
                        obj.A78 = str84;
                    } else if ("profile_context_facepile_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList12 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                User A002 = AbstractC38851rI.A00(c16l, false);
                                if (A002 != null) {
                                    arrayList12.add(A002);
                                }
                            }
                        }
                        obj.A7w = arrayList12;
                    } else if ("profile_context_links_with_user_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList13 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C82263ln parseFromJson6 = AbstractC82233lk.parseFromJson(c16l);
                                if (parseFromJson6 != null) {
                                    arrayList13.add(parseFromJson6);
                                }
                            }
                        }
                        obj.A7m = arrayList13;
                    } else if ("profile_follow_request_social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str85 = c16l.A1P();
                        }
                        obj.A79 = str85;
                    } else if ("profile_grid_display_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str86 = c16l.A1P();
                        }
                        IGUserProfileGridType iGUserProfileGridType = (IGUserProfileGridType) IGUserProfileGridType.A01.get(str86);
                        if (iGUserProfileGridType == null) {
                            iGUserProfileGridType = IGUserProfileGridType.A06;
                        }
                        obj.A0Y = iGUserProfileGridType;
                    } else if ("profile_note_info".equals(A0q)) {
                        obj.A1F = FCF.parseFromJson(c16l);
                    } else if ("profile_pic_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str87 = c16l.A1P();
                        }
                        obj.A7A = str87;
                    } else if ("profile_pic_url".equals(A0q)) {
                        obj.A16 = AbstractC222616c.A00(c16l);
                    } else if ("profile_pic_url_hd".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str88 = c16l.A1P();
                        }
                        obj.A7B = str88;
                    } else if ("profile_visits_count".equals(A0q)) {
                        obj.A5q = Integer.valueOf(c16l.A1D());
                    } else if ("profile_visits_num_days".equals(A0q)) {
                        obj.A5r = Integer.valueOf(c16l.A1D());
                    } else if ("pronouns".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList14 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P8 = c16l.A1P()) != null) {
                                    arrayList14.add(A1P8);
                                }
                            }
                        }
                        obj.A7x = arrayList14;
                    } else if ("public_email".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str89 = c16l.A1P();
                        }
                        obj.A7C = str89;
                    } else if ("public_option_first".equals(A0q)) {
                        obj.A4k = Boolean.valueOf(c16l.A0d());
                    } else if ("public_phone_country_code".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str90 = c16l.A1P();
                        }
                        obj.A7D = str90;
                    } else if ("public_phone_number".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str91 = c16l.A1P();
                        }
                        obj.A7E = str91;
                    } else if ("quiet_mode_pause_windows".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList15 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C106834rk parseFromJson7 = AbstractC106824rj.parseFromJson(c16l);
                                if (parseFromJson7 != null) {
                                    arrayList15.add(parseFromJson7);
                                }
                            }
                        }
                        obj.A7n = arrayList15;
                    } else if ("quiet_mode_windows".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList16 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C43J parseFromJson8 = C43I.parseFromJson(c16l);
                                if (parseFromJson8 != null) {
                                    arrayList16.add(parseFromJson8);
                                }
                            }
                        }
                        obj.A7o = arrayList16;
                    } else if ("recommend_accounts".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList17 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator3 = User.CREATOR;
                                User A003 = AbstractC38851rI.A00(c16l, false);
                                if (A003 != null) {
                                    arrayList17.add(A003);
                                }
                            }
                        }
                        obj.A7y = arrayList17;
                    } else if ("reel_auto_archive".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str92 = c16l.A1P();
                        }
                        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr = (ReelAutoArchiveSettingStr) ReelAutoArchiveSettingStr.A01.get(str92);
                        if (reelAutoArchiveSettingStr == null) {
                            reelAutoArchiveSettingStr = ReelAutoArchiveSettingStr.A06;
                        }
                        obj.A0l = reelAutoArchiveSettingStr;
                    } else if ("reel_besties_media_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList18 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P7 = c16l.A1P()) != null) {
                                    arrayList18.add(A1P7);
                                }
                            }
                        }
                        obj.A7z = arrayList18;
                    } else if ("reel_media_seen_timestamp".equals(A0q)) {
                        obj.A69 = Long.valueOf(c16l.A0y());
                    } else if ("reel_muted".equals(A0q)) {
                        obj.A4l = Boolean.valueOf(c16l.A0d());
                    } else if ("reel_seen_media_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList19 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                    arrayList19.add(A1P6);
                                }
                            }
                        }
                        obj.A80 = arrayList19;
                    } else if ("regulated_news_in_locations".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList20 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                    arrayList20.add(A1P5);
                                }
                            }
                        }
                        obj.A81 = arrayList20;
                    } else if ("relevant_news_regulation_locations".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList21 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                    arrayList21.add(A1P4);
                                }
                            }
                        }
                        obj.A82 = arrayList21;
                    } else if ("remove_message_entrypoint".equals(A0q)) {
                        obj.A4m = Boolean.valueOf(c16l.A0d());
                    } else if ("request_contact_enabled".equals(A0q)) {
                        obj.A4n = Boolean.valueOf(c16l.A0d());
                    } else if ("require_unknown_contact_review".equals(A0q)) {
                        obj.A4o = Boolean.valueOf(c16l.A0d());
                    } else if ("reshare_xpost_deny_reasons_for_user".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList22 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                    arrayList22.add(A1P3);
                                }
                            }
                        }
                        obj.A83 = arrayList22;
                    } else if ("restaurant_menu_page_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str93 = c16l.A1P();
                        }
                        obj.A7F = str93;
                    } else if ("restriction_type".equals(A0q)) {
                        obj.A5s = Integer.valueOf(c16l.A1D());
                    } else if ("robi_feedback_source".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str94 = c16l.A1P();
                        }
                        obj.A7G = str94;
                    } else if ("saved_guides_notice_enabled".equals(A0q)) {
                        obj.A4p = Boolean.valueOf(c16l.A0d());
                    } else if ("search_secondary_subtitle".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str95 = c16l.A1P();
                        }
                        obj.A7H = str95;
                    } else if ("search_serp_type".equals(A0q)) {
                        obj.A5t = Integer.valueOf(c16l.A1D());
                    } else if ("search_social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str96 = c16l.A1P();
                        }
                        obj.A7I = str96;
                    } else if ("search_social_context_facepiles".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList23 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    arrayList23.add(A1P2);
                                }
                            }
                        }
                        obj.A84 = arrayList23;
                    } else if ("search_social_context_snippet_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str97 = c16l.A1P();
                        }
                        obj.A7J = str97;
                    } else if ("search_subtitle".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str98 = c16l.A1P();
                        }
                        obj.A7K = str98;
                    } else if ("seller_shoppable_feed_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str99 = c16l.A1P();
                        }
                        obj.A0o = AbstractC223416o.A00(str99);
                    } else if ("service_shop_merchant_entrypoint_app_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str100 = c16l.A1P();
                        }
                        obj.A7L = str100;
                    } else if ("session_flush_nonce".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str101 = c16l.A1P();
                        }
                        obj.A7M = str101;
                    } else if ("setting_bundles".equals(A0q)) {
                        obj.A12 = AbstractC33770Evw.parseFromJson(c16l);
                    } else if ("shop_management_access_state".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str102 = c16l.A1P();
                        }
                        ShopManagementAccessState shopManagementAccessState = (ShopManagementAccessState) ShopManagementAccessState.A01.get(str102);
                        if (shopManagementAccessState == null) {
                            shopManagementAccessState = ShopManagementAccessState.A08;
                        }
                        obj.A0q = shopManagementAccessState;
                    } else if ("shopping_onboarding_state".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str103 = c16l.A1P();
                        }
                        ShoppingOnboardingState shoppingOnboardingState = (ShoppingOnboardingState) ShoppingOnboardingState.A01.get(str103);
                        if (shoppingOnboardingState == null) {
                            shoppingOnboardingState = ShoppingOnboardingState.A0C;
                        }
                        obj.A0r = shoppingOnboardingState;
                    } else if ("shopping_post_onboard_nux_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str104 = c16l.A1P();
                        }
                        obj.A7N = str104;
                    } else if ("shopping_search_subtitle".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str105 = c16l.A1P();
                        }
                        obj.A7O = str105;
                    } else if ("shops_entry_point_product_image".equals(A0q)) {
                        obj.A17 = AbstractC222616c.A00(c16l);
                    } else if ("short_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str106 = c16l.A1P();
                        }
                        obj.A7P = str106;
                    } else if ("should_show_category".equals(A0q)) {
                        obj.A4q = Boolean.valueOf(c16l.A0d());
                    } else if ("should_show_public_contacts".equals(A0q)) {
                        obj.A4r = Boolean.valueOf(c16l.A0d());
                    } else if ("should_update_live_broadcast_id_on_merge".equals(A0q)) {
                        obj.A4s = Boolean.valueOf(c16l.A0d());
                    } else if ("show_account_transparency_details".equals(A0q)) {
                        obj.A4t = Boolean.valueOf(c16l.A0d());
                    } else if ("show_aggregate_promote_engagement_nux".equals(A0q)) {
                        obj.A4u = Boolean.valueOf(c16l.A0d());
                    } else if ("show_all_highlights_as_selected_in_management_screen".equals(A0q)) {
                        obj.A4v = Boolean.valueOf(c16l.A0d());
                    } else if ("show_besties_badge".equals(A0q)) {
                        obj.A4w = Boolean.valueOf(c16l.A0d());
                    } else if ("show_business_conversion_icon".equals(A0q)) {
                        obj.A4x = Boolean.valueOf(c16l.A0d());
                    } else if ("show_conversion_edit_entry".equals(A0q)) {
                        obj.A4y = Boolean.valueOf(c16l.A0d());
                    } else if ("show_fb_link_on_profile".equals(A0q)) {
                        obj.A4z = Boolean.valueOf(c16l.A0d());
                    } else if ("show_fb_page_link_on_profile".equals(A0q)) {
                        obj.A50 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_ig_app_switcher_badge".equals(A0q)) {
                        obj.A51 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_insights_terms".equals(A0q)) {
                        obj.A52 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_leave_feedback".equals(A0q)) {
                        obj.A53 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_privacy_screen".equals(A0q)) {
                        obj.A54 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_schools_badge".equals(A0q)) {
                        obj.A0n = AbstractC128545rN.parseFromJson(c16l);
                    } else if ("show_see_restaurant_menu_cta".equals(A0q)) {
                        obj.A55 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_shoppable_feed".equals(A0q)) {
                        obj.A56 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_teen_education_banner".equals(A0q)) {
                        obj.A57 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_text_post_app_badge".equals(A0q)) {
                        obj.A58 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_text_post_app_switcher_badge".equals(A0q)) {
                        obj.A59 = Boolean.valueOf(c16l.A0d());
                    } else if ("silent_tag_mention_dialog".equals(A0q)) {
                        obj.A5A = Boolean.valueOf(c16l.A0d());
                    } else if ("similar_user_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str107 = c16l.A1P();
                        }
                        obj.A7Q = str107;
                    } else if ("smb_delivery_partner".equals(A0q)) {
                        obj.A01 = AbstractC111174ze.parseFromJson(c16l);
                    } else if ("smb_donation_partner".equals(A0q)) {
                        obj.A02 = AbstractC111174ze.parseFromJson(c16l);
                    } else if ("smb_get_quote_partner".equals(A0q)) {
                        obj.A03 = AbstractC111174ze.parseFromJson(c16l);
                    } else if ("smb_support_partner".equals(A0q)) {
                        obj.A04 = AbstractC111174ze.parseFromJson(c16l);
                    } else if ("sms_two_factor_enabled".equals(A0q)) {
                        obj.A5B = Boolean.valueOf(c16l.A0d());
                    } else if ("social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str108 = c16l.A1P();
                        }
                        obj.A7R = str108;
                    } else if ("spam_follower_setting_enabled".equals(A0q)) {
                        obj.A5C = Boolean.valueOf(c16l.A0d());
                    } else if ("standalone_fundraiser_info".equals(A0q)) {
                        obj.A0s = AbstractC40258HtO.parseFromJson(c16l);
                    } else if ("state_run_media_country".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str109 = c16l.A1P();
                        }
                        obj.A7S = str109;
                    } else if ("storefront_attribution_username".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str110 = c16l.A1P();
                        }
                        obj.A7T = str110;
                    } else if ("story_reel_media_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList24 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList24.add(A1P);
                                }
                            }
                        }
                        obj.A85 = arrayList24;
                    } else if ("streaks_count".equals(A0q)) {
                        obj.A5u = Integer.valueOf(c16l.A1D());
                    } else if ("strong_id__".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str111 = c16l.A1P();
                        }
                        obj.A7U = str111;
                    } else if ("supervision_info".equals(A0q)) {
                        obj.A0t = AbstractC223516q.parseFromJson(c16l);
                    } else if ("supports_e2ee_spamd_storage".equals(A0q)) {
                        obj.A5D = Boolean.valueOf(c16l.A0d());
                    } else if ("text_app_aysf_vertical_type".equals(A0q)) {
                        obj.A5v = Integer.valueOf(c16l.A1D());
                    } else if ("text_app_favorite_user_notification_setting".equals(A0q)) {
                        obj.A0w = AbstractC40400Hvn.parseFromJson(c16l);
                    } else if ("text_app_has_disabled_private_replies".equals(A0q)) {
                        obj.A5E = Boolean.valueOf(c16l.A0d());
                    } else if ("text_app_last_visited_time".equals(A0q)) {
                        obj.A5w = Integer.valueOf(c16l.A1D());
                    } else if ("text_app_media_reuse_enabled".equals(A0q)) {
                        obj.A5F = Boolean.valueOf(c16l.A0d());
                    } else if ("text_app_messaging_prototype_is_eligible".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str112 = c16l.A1P();
                        }
                        TextAppMessagingPrototypeEligibility textAppMessagingPrototypeEligibility = (TextAppMessagingPrototypeEligibility) TextAppMessagingPrototypeEligibility.A01.get(str112);
                        if (textAppMessagingPrototypeEligibility == null) {
                            textAppMessagingPrototypeEligibility = TextAppMessagingPrototypeEligibility.A05;
                        }
                        obj.A0u = textAppMessagingPrototypeEligibility;
                    } else if ("text_app_online_status_visibility_setting".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str113 = c16l.A1P();
                        }
                        TextAppOnlineStatusVisibilitySetting textAppOnlineStatusVisibilitySetting = (TextAppOnlineStatusVisibilitySetting) TextAppOnlineStatusVisibilitySetting.A01.get(str113);
                        if (textAppOnlineStatusVisibilitySetting == null) {
                            textAppOnlineStatusVisibilitySetting = TextAppOnlineStatusVisibilitySetting.A0A;
                        }
                        obj.A0v = textAppOnlineStatusVisibilitySetting;
                    } else if ("text_app_profile_pic_url".equals(A0q)) {
                        obj.A18 = AbstractC222616c.A00(c16l);
                    } else if ("text_app_suggestion_card_profile_context".equals(A0q)) {
                        obj.A0x = C53l.parseFromJson(c16l);
                    } else if ("text_app_user_recommendation_social_context_expanded".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str114 = c16l.A1P();
                        }
                        obj.A7V = str114;
                    } else if ("text_post_app_badge_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str115 = c16l.A1P();
                        }
                        obj.A7W = str115;
                    } else if ("text_post_app_fediverse_enabled_time".equals(A0q)) {
                        obj.A5x = Integer.valueOf(c16l.A1D());
                    } else if ("text_post_app_fediverse_user_info".equals(A0q)) {
                        obj.A0y = AbstractC40408Hvv.parseFromJson(c16l);
                    } else if ("text_post_app_has_consented_in_eu".equals(A0q)) {
                        obj.A5G = Boolean.valueOf(c16l.A0d());
                    } else if ("text_post_app_has_fediverse_enabled".equals(A0q)) {
                        obj.A5H = Boolean.valueOf(c16l.A0d());
                    } else if ("text_post_app_has_max_posts_pinned_to_profile".equals(A0q)) {
                        obj.A5I = Boolean.valueOf(c16l.A0d());
                    } else if ("text_post_app_joiner_number_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str116 = c16l.A1P();
                        }
                        obj.A7X = str116;
                    } else if ("text_post_app_remove_mention_entrypoint".equals(A0q)) {
                        obj.A5J = Boolean.valueOf(c16l.A0d());
                    } else if ("text_post_app_show_follower_import_screen_on_login".equals(A0q)) {
                        obj.A5K = Boolean.valueOf(c16l.A0d());
                    } else if ("text_post_app_take_a_break_setting".equals(A0q)) {
                        obj.A5y = Integer.valueOf(c16l.A1D());
                    } else if ("text_post_new_post_count".equals(A0q)) {
                        obj.A5z = Integer.valueOf(c16l.A1D());
                    } else if ("third_party_downloads_enabled".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str117 = c16l.A1P();
                        }
                        IGUserThirdPartyDownloads iGUserThirdPartyDownloads = (IGUserThirdPartyDownloads) IGUserThirdPartyDownloads.A01.get(str117);
                        if (iGUserThirdPartyDownloads == null) {
                            iGUserThirdPartyDownloads = IGUserThirdPartyDownloads.A07;
                        }
                        obj.A0Z = iGUserThirdPartyDownloads;
                    } else if ("threads_profile_glyph_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str118 = c16l.A1P();
                        }
                        obj.A7Y = str118;
                    } else if ("threads_profile_switcher_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str119 = c16l.A1P();
                        }
                        obj.A7Z = str119;
                    } else if ("total_ar_effects".equals(A0q)) {
                        obj.A60 = Integer.valueOf(c16l.A1D());
                    } else if ("total_clips_count".equals(A0q)) {
                        obj.A61 = Integer.valueOf(c16l.A1D());
                    } else if ("total_igtv_videos".equals(A0q)) {
                        obj.A62 = Integer.valueOf(c16l.A1D());
                    } else if ("total_music_count".equals(A0q)) {
                        obj.A63 = Integer.valueOf(c16l.A1D());
                    } else if ("translated_biography".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str120 = c16l.A1P();
                        }
                        obj.A7a = str120;
                    } else if ("transparency_label".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str121 = c16l.A1P();
                        }
                        obj.A7b = str121;
                    } else if ("transparency_product".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str122 = c16l.A1P();
                        }
                        obj.A7c = str122;
                    } else if ("transparency_product_enabled".equals(A0q)) {
                        obj.A5L = Boolean.valueOf(c16l.A0d());
                    } else if ("trial_clips_enabled".equals(A0q)) {
                        obj.A5M = Boolean.valueOf(c16l.A0d());
                    } else if ("unseen_count".equals(A0q)) {
                        obj.A64 = Integer.valueOf(c16l.A1D());
                    } else if ("upcoming_events".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList25 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                UpcomingEventImpl parseFromJson9 = IT3.parseFromJson(c16l);
                                if (parseFromJson9 != null) {
                                    arrayList25.add(parseFromJson9);
                                }
                            }
                        }
                        obj.A7p = arrayList25;
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str123 = c16l.A1P();
                        }
                        obj.A7d = str123;
                    } else if (AbstractC31186DnV.A01(31, 8, 86).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str124 = c16l.A1P();
                        }
                        obj.A7e = str124;
                    } else if ("usertag_review_enabled".equals(A0q)) {
                        obj.A5N = Boolean.valueOf(c16l.A0d());
                    } else if ("wa_addressable".equals(A0q)) {
                        obj.A5O = Boolean.valueOf(c16l.A0d());
                    } else if ("wa_eligibility".equals(A0q)) {
                        obj.A65 = Integer.valueOf(c16l.A1D());
                    } else if ("whatsapp_number".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str125 = c16l.A1P();
                        }
                        obj.A7f = str125;
                    } else if (ServerW3CShippingAddressConstants.POSTAL_CODE.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A7g = str;
                    }
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 2322
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static void A00(X.AnonymousClass182 r6, X.C17O r7) {
        /*
            Method dump skipped, instructions count: 9540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38861rJ.A00(X.182, X.17O):void");
    }
}
