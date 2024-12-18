package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.ShoppingOnboardingState;
import java.io.IOException;

/* renamed from: X.16W, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16W {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.16X, java.lang.Object] */
    public static C16X parseFromJson(C16L c16l) {
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
                if ("account_type".equals(A0q)) {
                    obj.A0C = C16Z.A00(c16l.A1D());
                } else {
                    Boolean bool = null;
                    Integer num = null;
                    String str = null;
                    Boolean valueOf = null;
                    Boolean valueOf2 = null;
                    Boolean valueOf3 = null;
                    Boolean valueOf4 = null;
                    Boolean valueOf5 = null;
                    Boolean valueOf6 = null;
                    Boolean valueOf7 = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    Integer num2 = null;
                    Integer num3 = null;
                    String str6 = null;
                    Boolean valueOf8 = null;
                    Boolean valueOf9 = null;
                    String str7 = null;
                    Long l = null;
                    Integer num4 = null;
                    Boolean valueOf10 = null;
                    Boolean valueOf11 = null;
                    Boolean valueOf12 = null;
                    Boolean valueOf13 = null;
                    Boolean valueOf14 = null;
                    Boolean valueOf15 = null;
                    Boolean valueOf16 = null;
                    String str8 = null;
                    Integer num5 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    String str13 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    Integer num6 = null;
                    String str17 = null;
                    String str18 = null;
                    Boolean valueOf17 = null;
                    String str19 = null;
                    String str20 = null;
                    Boolean valueOf18 = null;
                    Integer num7 = null;
                    Boolean valueOf19 = null;
                    Integer num8 = null;
                    Boolean valueOf20 = null;
                    Boolean valueOf21 = null;
                    Boolean valueOf22 = null;
                    Boolean valueOf23 = null;
                    Boolean valueOf24 = null;
                    Boolean valueOf25 = null;
                    Boolean valueOf26 = null;
                    Integer num9 = null;
                    Boolean valueOf27 = null;
                    Boolean valueOf28 = null;
                    Integer num10 = null;
                    if ("besties_count".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0h = num;
                    } else if ("biography".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str = c16l.A1P();
                        }
                        obj.A0r = str;
                    } else if ("blocking".equals(A0q)) {
                        C16R A11 = c16l.A11();
                        if (A11 == C16R.A0K || A11 == C16R.A0F) {
                            valueOf = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0N = valueOf;
                    } else if ("blocking_reel".equals(A0q)) {
                        C16R A112 = c16l.A11();
                        if (A112 == C16R.A0K || A112 == C16R.A0F) {
                            valueOf2 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0O = valueOf2;
                    } else if ("can_be_tagged_as_sponsor".equals(A0q)) {
                        C16R A113 = c16l.A11();
                        if (A113 == C16R.A0K || A113 == C16R.A0F) {
                            valueOf3 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0D = valueOf3;
                    } else if ("can_boost_post".equals(A0q)) {
                        C16R A114 = c16l.A11();
                        if (A114 == C16R.A0K || A114 == C16R.A0F) {
                            valueOf4 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0E = valueOf4;
                    } else if ("can_create_sponsor_tags".equals(A0q)) {
                        C16R A115 = c16l.A11();
                        if (A115 == C16R.A0K || A115 == C16R.A0F) {
                            valueOf5 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0F = valueOf5;
                    } else if ("can_generate_nametag".equals(A0q)) {
                        C16R A116 = c16l.A11();
                        if (A116 == C16R.A0K || A116 == C16R.A0F) {
                            valueOf6 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0G = valueOf6;
                    } else if ("can_see_organic_insights".equals(A0q)) {
                        C16R A117 = c16l.A11();
                        if (A117 == C16R.A0K || A117 == C16R.A0F) {
                            valueOf7 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0H = valueOf7;
                    } else if ("current_product_catalog_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str2 = c16l.A1P();
                        }
                        obj.A0t = str2;
                    } else if ("external_url".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str3 = c16l.A1P();
                        }
                        obj.A0u = str3;
                    } else if ("fb_page_call_to_action_ix_url".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str4 = c16l.A1P();
                        }
                        obj.A0v = str4;
                    } else if ("fb_page_call_to_action_ix_label_bundle".equals(A0q)) {
                        obj.A01 = IO3.parseFromJson(c16l);
                    } else if ("follow_status".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str5 = c16l.A1P();
                        }
                        obj.A0w = str5;
                    } else if ("follower_count".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num2 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0i = num2;
                    } else if ("following_count".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num3 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0j = num3;
                    } else if ("full_name".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str6 = c16l.A1P();
                        }
                        obj.A0x = str6;
                    } else if ("has_anonymous_profile_pic".equals(A0q)) {
                        C16R A118 = c16l.A11();
                        if (A118 == C16R.A0K || A118 == C16R.A0F) {
                            valueOf8 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0I = valueOf8;
                    } else if ("has_fan_club_subscriptions".equals(A0q)) {
                        C16R A119 = c16l.A11();
                        if (A119 == C16R.A0K || A119 == C16R.A0F) {
                            valueOf9 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0J = valueOf9;
                    } else if ("hd_profile_pic_info".equals(A0q)) {
                        obj.A0B = C17Y.parseFromJson(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str7 = c16l.A1P();
                        }
                        obj.A0y = str7;
                    } else if ("interop_messaging_user_fbid".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l = Long.valueOf(c16l.A0y());
                        }
                        obj.A0q = l;
                    } else if ("interop_user_type".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num4 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0k = num4;
                    } else if ("is_facebook_friend".equals(A0q)) {
                        C16R A1110 = c16l.A11();
                        if (A1110 == C16R.A0K || A1110 == C16R.A0F) {
                            valueOf10 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0R = valueOf10;
                    } else if ("is_interop_eligible".equals(A0q)) {
                        C16R A1111 = c16l.A11();
                        if (A1111 == C16R.A0K || A1111 == C16R.A0F) {
                            valueOf11 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0V = valueOf11;
                    } else if ("is_business".equals(A0q)) {
                        C16R A1112 = c16l.A11();
                        if (A1112 == C16R.A0K || A1112 == C16R.A0F) {
                            valueOf12 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0P = valueOf12;
                    } else if ("is_call_to_action_enabled".equals(A0q)) {
                        C16R A1113 = c16l.A11();
                        if (A1113 == C16R.A0K || A1113 == C16R.A0F) {
                            valueOf13 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0Q = valueOf13;
                    } else if ("is_call_to_action_enabled_by_surface".equals(A0q)) {
                        obj.A03 = AbstractC33710Euy.parseFromJson(c16l);
                    } else if ("is_interest_account".equals(A0q)) {
                        C16R A1114 = c16l.A11();
                        if (A1114 == C16R.A0K || A1114 == C16R.A0F) {
                            valueOf14 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0U = valueOf14;
                    } else if ("is_mentionable".equals(A0q)) {
                        C16R A1115 = c16l.A11();
                        if (A1115 == C16R.A0K || A1115 == C16R.A0F) {
                            valueOf15 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0W = valueOf15;
                    } else if ("is_verified".equals(A0q)) {
                        C16R A1116 = c16l.A11();
                        if (A1116 == C16R.A0K || A1116 == C16R.A0F) {
                            valueOf16 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0c = valueOf16;
                    } else if ("last_follow_status".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str8 = c16l.A1P();
                        }
                        obj.A0z = str8;
                    } else if ("media_count".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num5 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0l = num5;
                    } else if ("nametag_config".equals(A0q)) {
                        obj.A07 = AbstractC222516b.parseFromJson(c16l);
                    } else if ("page_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str9 = c16l.A1P();
                        }
                        obj.A10 = str9;
                    } else if ("page_name".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str10 = c16l.A1P();
                        }
                        obj.A11 = str10;
                    } else if ("privacy_status".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str11 = c16l.A1P();
                        }
                        obj.A12 = str11;
                    } else if ("profile_pic_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str12 = c16l.A1P();
                        }
                        obj.A13 = str12;
                    } else if ("profile_pic_url".equals(A0q)) {
                        obj.A0A = AbstractC222616c.A00(c16l);
                    } else if ("reel_auto_archive".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str13 = c16l.A1P();
                        }
                        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr = (ReelAutoArchiveSettingStr) ReelAutoArchiveSettingStr.A01.get(str13);
                        if (reelAutoArchiveSettingStr == null) {
                            reelAutoArchiveSettingStr = ReelAutoArchiveSettingStr.A06;
                        }
                        obj.A05 = reelAutoArchiveSettingStr;
                    } else if ("search_social_context".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str14 = c16l.A1P();
                        }
                        obj.A15 = str14;
                    } else if ("search_subtitle".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str15 = c16l.A1P();
                        }
                        obj.A16 = str15;
                    } else if ("search_secondary_subtitle".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str16 = c16l.A1P();
                        }
                        obj.A14 = str16;
                    } else if ("search_serp_type".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num6 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0n = num6;
                    } else if ("shopping_onboarding_state".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str17 = c16l.A1P();
                        }
                        ShoppingOnboardingState shoppingOnboardingState = (ShoppingOnboardingState) ShoppingOnboardingState.A01.get(str17);
                        if (shoppingOnboardingState == null) {
                            shoppingOnboardingState = ShoppingOnboardingState.A0C;
                        }
                        obj.A08 = shoppingOnboardingState;
                    } else if (AbstractC31186DnV.A01(31, 8, 86).equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str18 = c16l.A1P();
                        }
                        obj.A17 = str18;
                    } else if ("usertag_review_enabled".equals(A0q)) {
                        C16R A1117 = c16l.A11();
                        if (A1117 == C16R.A0K || A1117 == C16R.A0F) {
                            valueOf17 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0b = valueOf17;
                    } else if ("seller_shoppable_feed_type".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str19 = c16l.A1P();
                        }
                        obj.A06 = AbstractC223416o.A00(str19);
                    } else if ("context_line".equals(A0q)) {
                        if (c16l.A11() == C16R.A0J) {
                            str20 = c16l.A1P();
                        }
                        obj.A0s = str20;
                    } else if ("wa_addressable".equals(A0q)) {
                        C16R A1118 = c16l.A11();
                        if (A1118 == C16R.A0K || A1118 == C16R.A0F) {
                            valueOf18 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0d = valueOf18;
                    } else if ("armadillo_eligibility".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num7 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0g = num7;
                    } else if ("is_armadillo_message_request_eligible".equals(A0q)) {
                        C16R A1119 = c16l.A11();
                        if (A1119 == C16R.A0K || A1119 == C16R.A0F) {
                            valueOf19 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0L = valueOf19;
                    } else if ("restriction_type".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num8 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0m = num8;
                    } else if ("is_groups_xac_eligible".equals(A0q)) {
                        C16R A1120 = c16l.A11();
                        if (A1120 == C16R.A0K || A1120 == C16R.A0F) {
                            valueOf20 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0T = valueOf20;
                    } else if ("is_muted_words_global_enabled".equals(A0q)) {
                        C16R A1121 = c16l.A11();
                        if (A1121 == C16R.A0K || A1121 == C16R.A0F) {
                            valueOf21 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0Z = valueOf21;
                    } else if ("is_muted_words_custom_enabled".equals(A0q)) {
                        C16R A1122 = c16l.A11();
                        if (A1122 == C16R.A0K || A1122 == C16R.A0F) {
                            valueOf22 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0Y = valueOf22;
                    } else if ("is_muted_words_spamscam_enabled".equals(A0q)) {
                        C16R A1123 = c16l.A11();
                        if (A1123 == C16R.A0K || A1123 == C16R.A0F) {
                            valueOf23 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0a = valueOf23;
                    } else if ("supervision_info".equals(A0q)) {
                        obj.A09 = AbstractC223516q.parseFromJson(c16l);
                    } else if ("is_following_current_user".equals(A0q)) {
                        C16R A1124 = c16l.A11();
                        if (A1124 == C16R.A0K || A1124 == C16R.A0F) {
                            valueOf24 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0S = valueOf24;
                    } else if ("fan_club_info".equals(A0q)) {
                        obj.A02 = AbstractC223816t.parseFromJson(c16l);
                    } else if ("creator_info, mapping = EXACT".equals(A0q)) {
                        obj.A00 = AbstractC223916w.parseFromJson(c16l);
                    } else if ("is_threads_only_user".equals(A0q)) {
                        C16R A1125 = c16l.A11();
                        if (A1125 == C16R.A0K || A1125 == C16R.A0F) {
                            valueOf25 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0M = valueOf25;
                    } else if ("has_onboarded_to_text_post_app".equals(A0q)) {
                        C16R A1126 = c16l.A11();
                        if (A1126 == C16R.A0K || A1126 == C16R.A0F) {
                            valueOf26 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0K = valueOf26;
                    } else if ("text_post_app_take_a_break_setting".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num9 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0p = num9;
                    } else if ("is_meta_ai_bot".equals(A0q)) {
                        C16R A1127 = c16l.A11();
                        if (A1127 == C16R.A0K || A1127 == C16R.A0F) {
                            valueOf27 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0X = valueOf27;
                    } else if ("opal_info, mapping = EXACT".equals(A0q)) {
                        obj.A04 = AbstractC109964xQ.parseFromJson(c16l);
                    } else if ("text_post_app_has_fediverse_enabled".equals(A0q)) {
                        C16R A1128 = c16l.A11();
                        if (A1128 == C16R.A0K || A1128 == C16R.A0F) {
                            valueOf28 = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0f = valueOf28;
                    } else if ("text_post_app_fediverse_enabled_time".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num10 = Integer.valueOf(c16l.A1D());
                        }
                        obj.A0o = num10;
                    } else if ("text_app_media_reuse_enabled".equals(A0q)) {
                        C16R A1129 = c16l.A11();
                        if (A1129 == C16R.A0K || A1129 == C16R.A0F) {
                            bool = Boolean.valueOf(c16l.A0d());
                        }
                        obj.A0e = bool;
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

    public static void A00(AnonymousClass182 anonymousClass182, C16X c16x) {
        anonymousClass182.A0d();
        EnumC222416a enumC222416a = c16x.A0C;
        if (enumC222416a != null) {
            anonymousClass182.A0Q("account_type", enumC222416a.A00);
        }
        Integer num = c16x.A0h;
        if (num != null) {
            anonymousClass182.A0Q("besties_count", num.intValue());
        }
        String str = c16x.A0r;
        if (str != null) {
            anonymousClass182.A0S("biography", str);
        }
        Boolean bool = c16x.A0N;
        if (bool != null) {
            anonymousClass182.A0T("blocking", bool.booleanValue());
        }
        Boolean bool2 = c16x.A0O;
        if (bool2 != null) {
            anonymousClass182.A0T("blocking_reel", bool2.booleanValue());
        }
        Boolean bool3 = c16x.A0D;
        if (bool3 != null) {
            anonymousClass182.A0T("can_be_tagged_as_sponsor", bool3.booleanValue());
        }
        Boolean bool4 = c16x.A0E;
        if (bool4 != null) {
            anonymousClass182.A0T("can_boost_post", bool4.booleanValue());
        }
        Boolean bool5 = c16x.A0F;
        if (bool5 != null) {
            anonymousClass182.A0T("can_create_sponsor_tags", bool5.booleanValue());
        }
        Boolean bool6 = c16x.A0G;
        if (bool6 != null) {
            anonymousClass182.A0T("can_generate_nametag", bool6.booleanValue());
        }
        Boolean bool7 = c16x.A0H;
        if (bool7 != null) {
            anonymousClass182.A0T("can_see_organic_insights", bool7.booleanValue());
        }
        String str2 = c16x.A0t;
        if (str2 != null) {
            anonymousClass182.A0S("current_product_catalog_id", str2);
        }
        String str3 = c16x.A0u;
        if (str3 != null) {
            anonymousClass182.A0S("external_url", str3);
        }
        String str4 = c16x.A0v;
        if (str4 != null) {
            anonymousClass182.A0S("fb_page_call_to_action_ix_url", str4);
        }
        if (c16x.A01 != null) {
            anonymousClass182.A0r("fb_page_call_to_action_ix_label_bundle");
            IO3.A00(anonymousClass182, c16x.A01);
        }
        String str5 = c16x.A0w;
        if (str5 != null) {
            anonymousClass182.A0S("follow_status", str5);
        }
        Integer num2 = c16x.A0i;
        if (num2 != null) {
            anonymousClass182.A0Q("follower_count", num2.intValue());
        }
        Integer num3 = c16x.A0j;
        if (num3 != null) {
            anonymousClass182.A0Q("following_count", num3.intValue());
        }
        String str6 = c16x.A0x;
        if (str6 != null) {
            anonymousClass182.A0S("full_name", str6);
        }
        Boolean bool8 = c16x.A0I;
        if (bool8 != null) {
            anonymousClass182.A0T("has_anonymous_profile_pic", bool8.booleanValue());
        }
        Boolean bool9 = c16x.A0J;
        if (bool9 != null) {
            anonymousClass182.A0T("has_fan_club_subscriptions", bool9.booleanValue());
        }
        if (c16x.A0B != null) {
            anonymousClass182.A0r("hd_profile_pic_info");
            C17Y.A00(anonymousClass182, c16x.A0B);
        }
        String str7 = c16x.A0y;
        if (str7 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7);
        }
        Long l = c16x.A0q;
        if (l != null) {
            anonymousClass182.A0R("interop_messaging_user_fbid", l.longValue());
        }
        Integer num4 = c16x.A0k;
        if (num4 != null) {
            anonymousClass182.A0Q("interop_user_type", num4.intValue());
        }
        Boolean bool10 = c16x.A0R;
        if (bool10 != null) {
            anonymousClass182.A0T("is_facebook_friend", bool10.booleanValue());
        }
        Boolean bool11 = c16x.A0V;
        if (bool11 != null) {
            anonymousClass182.A0T("is_interop_eligible", bool11.booleanValue());
        }
        Boolean bool12 = c16x.A0P;
        if (bool12 != null) {
            anonymousClass182.A0T("is_business", bool12.booleanValue());
        }
        Boolean bool13 = c16x.A0Q;
        if (bool13 != null) {
            anonymousClass182.A0T("is_call_to_action_enabled", bool13.booleanValue());
        }
        if (c16x.A03 != null) {
            anonymousClass182.A0r("is_call_to_action_enabled_by_surface");
            C5F3 c5f3 = c16x.A03;
            anonymousClass182.A0d();
            anonymousClass182.A0T("stories", c5f3.A00);
            anonymousClass182.A0a();
        }
        Boolean bool14 = c16x.A0U;
        if (bool14 != null) {
            anonymousClass182.A0T("is_interest_account", bool14.booleanValue());
        }
        Boolean bool15 = c16x.A0W;
        if (bool15 != null) {
            anonymousClass182.A0T("is_mentionable", bool15.booleanValue());
        }
        Boolean bool16 = c16x.A0c;
        if (bool16 != null) {
            anonymousClass182.A0T("is_verified", bool16.booleanValue());
        }
        String str8 = c16x.A0z;
        if (str8 != null) {
            anonymousClass182.A0S("last_follow_status", str8);
        }
        Integer num5 = c16x.A0l;
        if (num5 != null) {
            anonymousClass182.A0Q("media_count", num5.intValue());
        }
        if (c16x.A07 != null) {
            anonymousClass182.A0r("nametag_config");
            AbstractC222516b.A00(anonymousClass182, c16x.A07);
        }
        String str9 = c16x.A10;
        if (str9 != null) {
            anonymousClass182.A0S("page_id", str9);
        }
        String str10 = c16x.A11;
        if (str10 != null) {
            anonymousClass182.A0S("page_name", str10);
        }
        String str11 = c16x.A12;
        if (str11 != null) {
            anonymousClass182.A0S("privacy_status", str11);
        }
        String str12 = c16x.A13;
        if (str12 != null) {
            anonymousClass182.A0S("profile_pic_id", str12);
        }
        if (c16x.A0A != null) {
            anonymousClass182.A0r("profile_pic_url");
            AbstractC222616c.A01(anonymousClass182, c16x.A0A);
        }
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr = c16x.A05;
        if (reelAutoArchiveSettingStr != null) {
            anonymousClass182.A0S("reel_auto_archive", reelAutoArchiveSettingStr.A00);
        }
        String str13 = c16x.A15;
        if (str13 != null) {
            anonymousClass182.A0S("search_social_context", str13);
        }
        String str14 = c16x.A16;
        if (str14 != null) {
            anonymousClass182.A0S("search_subtitle", str14);
        }
        String str15 = c16x.A14;
        if (str15 != null) {
            anonymousClass182.A0S("search_secondary_subtitle", str15);
        }
        Integer num6 = c16x.A0n;
        if (num6 != null) {
            anonymousClass182.A0Q("search_serp_type", num6.intValue());
        }
        ShoppingOnboardingState shoppingOnboardingState = c16x.A08;
        if (shoppingOnboardingState != null) {
            anonymousClass182.A0S("shopping_onboarding_state", shoppingOnboardingState.A00);
        }
        String str16 = c16x.A17;
        if (str16 != null) {
            anonymousClass182.A0S(AbstractC31186DnV.A01(31, 8, 86), str16);
        }
        Boolean bool17 = c16x.A0b;
        if (bool17 != null) {
            anonymousClass182.A0T("usertag_review_enabled", bool17.booleanValue());
        }
        SellerShoppableFeedType sellerShoppableFeedType = c16x.A06;
        if (sellerShoppableFeedType != null) {
            anonymousClass182.A0S("seller_shoppable_feed_type", sellerShoppableFeedType.A00);
        }
        String str17 = c16x.A0s;
        if (str17 != null) {
            anonymousClass182.A0S("context_line", str17);
        }
        Boolean bool18 = c16x.A0d;
        if (bool18 != null) {
            anonymousClass182.A0T("wa_addressable", bool18.booleanValue());
        }
        Integer num7 = c16x.A0g;
        if (num7 != null) {
            anonymousClass182.A0Q("armadillo_eligibility", num7.intValue());
        }
        Boolean bool19 = c16x.A0L;
        if (bool19 != null) {
            anonymousClass182.A0T("is_armadillo_message_request_eligible", bool19.booleanValue());
        }
        Integer num8 = c16x.A0m;
        if (num8 != null) {
            anonymousClass182.A0Q("restriction_type", num8.intValue());
        }
        Boolean bool20 = c16x.A0T;
        if (bool20 != null) {
            anonymousClass182.A0T("is_groups_xac_eligible", bool20.booleanValue());
        }
        Boolean bool21 = c16x.A0Z;
        if (bool21 != null) {
            anonymousClass182.A0T("is_muted_words_global_enabled", bool21.booleanValue());
        }
        Boolean bool22 = c16x.A0Y;
        if (bool22 != null) {
            anonymousClass182.A0T("is_muted_words_custom_enabled", bool22.booleanValue());
        }
        Boolean bool23 = c16x.A0a;
        if (bool23 != null) {
            anonymousClass182.A0T("is_muted_words_spamscam_enabled", bool23.booleanValue());
        }
        if (c16x.A09 != null) {
            anonymousClass182.A0r("supervision_info");
            AbstractC223516q.A00(anonymousClass182, c16x.A09);
        }
        Boolean bool24 = c16x.A0S;
        if (bool24 != null) {
            anonymousClass182.A0T("is_following_current_user", bool24.booleanValue());
        }
        if (c16x.A02 != null) {
            anonymousClass182.A0r("fan_club_info");
            AbstractC223816t.A00(anonymousClass182, c16x.A02);
        }
        if (c16x.A00 != null) {
            anonymousClass182.A0r("creator_info, mapping = EXACT");
            AbstractC223916w.A00(anonymousClass182, c16x.A00);
        }
        Boolean bool25 = c16x.A0M;
        if (bool25 != null) {
            anonymousClass182.A0T("is_threads_only_user", bool25.booleanValue());
        }
        Boolean bool26 = c16x.A0K;
        if (bool26 != null) {
            anonymousClass182.A0T("has_onboarded_to_text_post_app", bool26.booleanValue());
        }
        Integer num9 = c16x.A0p;
        if (num9 != null) {
            anonymousClass182.A0Q("text_post_app_take_a_break_setting", num9.intValue());
        }
        Boolean bool27 = c16x.A0X;
        if (bool27 != null) {
            anonymousClass182.A0T("is_meta_ai_bot", bool27.booleanValue());
        }
        if (c16x.A04 != null) {
            anonymousClass182.A0r("opal_info, mapping = EXACT");
            AbstractC109964xQ.A00(anonymousClass182, c16x.A04);
        }
        Boolean bool28 = c16x.A0f;
        if (bool28 != null) {
            anonymousClass182.A0T("text_post_app_has_fediverse_enabled", bool28.booleanValue());
        }
        Integer num10 = c16x.A0o;
        if (num10 != null) {
            anonymousClass182.A0Q("text_post_app_fediverse_enabled_time", num10.intValue());
        }
        Boolean bool29 = c16x.A0e;
        if (bool29 != null) {
            anonymousClass182.A0T("text_app_media_reuse_enabled", bool29.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
