package X;

import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.QuO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60126QuO extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OM[] c4omArr = new C4OM[216];
        C95124Py c95124Py = C95124Py.A00;
        C4OW A0i = AbstractC166987dD.A0i(c95124Py, "about_your_account_bloks_entrypoint_enabled");
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW A0L = AbstractC58320PtC.A0L();
        C94754Oe c94754Oe = C94754Oe.A00;
        System.arraycopy(new C4OM[]{A0i, A0L, AbstractC166987dD.A0i(c94754Oe, "account_category"), AbstractC58318PtA.A0O(C60092Qtq.class, "active_standalone_fundraisers", -1924765614), AbstractC166987dD.A0i(c94754Oe, "address_street"), AbstractC166987dD.A0i(c94754Oe, "ads_incentive_expiration_date"), AbstractC166987dD.A0i(c94754Oe, "ads_page_id"), AbstractC166987dD.A0i(c94754Oe, "ads_page_name"), AbstractC166987dD.A0i(c95124Py, "aggregate_promote_engagement"), AbstractC166987dD.A0i(c94894Ou, "all_media_count"), AbstractC166987dD.A0i(c94754Oe, "allow_mention_setting"), AbstractC166987dD.A0i(c94754Oe, "allow_tag_setting"), AbstractC166987dD.A0i(c94754Oe, "allowed_commenter_type"), AbstractC166987dD.A0i(c95124Py, "auto_expand_chaining"), AbstractC58318PtA.A0O(C67245Uis.class, "avatar_status", 485359480), AbstractC166987dD.A0i(c94894Ou, "besties_count"), AbstractC166987dD.A0i(c94894Ou, "break_reminder_interval"), AbstractC58318PtA.A0O(C60093Qtr.class, "broadcast_chat_preference_status", -65738996), AbstractC166987dD.A0i(c94754Oe, "business_contact_method"), AbstractC166987dD.A0i(c95124Py, "can_be_tagged_as_sponsor"), AbstractC166987dD.A0i(c95124Py, "can_boost_post"), AbstractC166987dD.A0i(c95124Py, "can_claim_page"), AbstractC166987dD.A0i(c95124Py, "can_convert_to_business"), AbstractC166987dD.A0i(c95124Py, "can_create_new_standalone_personal_fundraiser"), AbstractC166987dD.A0i(c95124Py, "can_create_sponsor_tags"), AbstractC166987dD.A0i(c95124Py, "can_crosspost_without_fb_token"), AbstractC166987dD.A0i(c95124Py, "can_follow_hashtag")}, 0, c4omArr, 0, 27);
        System.arraycopy(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "can_influencers_tag_business_products"), AbstractC166987dD.A0i(c95124Py, "can_merchant_use_shop_management"), AbstractC166987dD.A0i(c95124Py, "can_see_organic_insights"), AbstractC166987dD.A0i(c95124Py, "can_tag_products_from_merchants"), AbstractC166987dD.A0i(c95124Py, AbstractC43591JPw.A00(827)), AbstractC166987dD.A0i(c95124Py, AbstractC43591JPw.A00(828)), AbstractC166987dD.A0i(c94754Oe, "category"), AbstractC166987dD.A0i(c94754Oe, "category_id"), AbstractC166987dD.A0h(C4OO.A00(), C60096Qtu.class, "chaining_results", -2116276167), AbstractC166987dD.A0h(C4OO.A00(), C60099Qtx.class, "chaining_suggestions", 584571570), AbstractC58318PtA.A0O(C67248Uiv.class, "charity_profile_fundraiser_info", 644181710), AbstractC166987dD.A0i(c94754Oe, "city_id"), AbstractC166987dD.A0i(c94754Oe, "city_name"), AbstractC58318PtA.A0O(C60100Qty.class, "commerce_onboarding_config", 1857599728), AbstractC166987dD.A0i(c94754Oe, "contact_phone_number"), AbstractC58318PtA.A0O(C60102Qu0.class, "creator_shopping_info", -372839490), AbstractC166987dD.A0i(c94894Ou, "creators_subscribed_to_count"), AbstractC166987dD.A0i(c94754Oe, "current_catalog_id"), AbstractC58318PtA.A0O(C60103Qu1.class, "displayed_action_button_partner", 1277367908), AbstractC166987dD.A0i(c94754Oe, "displayed_action_button_type"), AbstractC166987dD.A0i(c95124Py, "eligible_for_text_app_activation_badge"), AbstractC166987dD.A0i(C94754Oe.A00(), "eligible_shopping_signup_entrypoints"), AbstractC166987dD.A0i(c95124Py, "enable_add_school_in_edit_profile"), AbstractC166987dD.A0i(c95124Py, "existing_user_age_collection_enabled"), AbstractC166987dD.A0i(c94754Oe, "external_lynx_url"), AbstractC166987dD.A0i(c94754Oe, "external_url"), AbstractC58318PtA.A0O(C67250Uix.class, "fan_club_info", 1728151777)}, 0, c4omArr, 27, 27);
        System.arraycopy(new C4OM[]{AbstractC166987dD.A0i(c94754Oe, "fb_page_call_to_action_id"), AbstractC166987dD.A0i(c94754Oe, "fbe_app_id"), AbstractC166987dD.A0i(c94754Oe, "fbe_label"), AbstractC166987dD.A0i(c94754Oe, "fbe_partner"), AbstractC166987dD.A0i(c94754Oe, "fbe_url"), AbstractC58321PtD.A0V(c94754Oe), AbstractC166987dD.A0i(c95124Py, MSV.A00(1174)), AbstractC166987dD.A0i(c95124Py, "feed_post_reshare_disabled"), AbstractC166987dD.A0i(c94894Ou, "follow_friction_type"), AbstractC166987dD.A0i(c94894Ou, "following_tag_count"), AbstractC58318PtA.A0O(C60104Qu2.class, AbstractC111324zv.A00(959), 243552682), AbstractC58318PtA.A0O(C67251Uiy.class, "group_metadata", -1104045322), AbstractC166987dD.A0i(c95124Py, "has_active_charity_business_profile_fundraiser"), AbstractC58321PtD.A0T(c95124Py), AbstractC166987dD.A0i(c95124Py, "has_biography_translation"), AbstractC166987dD.A0i(c95124Py, "has_business_presence_node"), AbstractC166987dD.A0i(c95124Py, "has_chaining"), AbstractC166987dD.A0i(c95124Py, "has_chains"), AbstractC166987dD.A0i(c95124Py, "has_collab_collections"), AbstractC166987dD.A0i(c95124Py, "has_creator_marketplace_brand_created_any_in_app_campaign"), AbstractC166987dD.A0i(c95124Py, "has_eligible_whatsapp_linking_category"), AbstractC166987dD.A0i(c95124Py, "has_exclusive_feed_content"), AbstractC166987dD.A0i(c95124Py, "has_fan_club_subscriptions"), AbstractC166987dD.A0i(c95124Py, "has_gen_ai_personas_for_profile_banner"), AbstractC166987dD.A0i(c95124Py, "has_groups"), AbstractC166987dD.A0i(c95124Py, "has_guides"), AbstractC166987dD.A0i(c95124Py, "has_highlight_reels")}, 0, c4omArr, 54, 27);
        System.arraycopy(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "has_igtv_series"), AbstractC166987dD.A0i(c95124Py, "has_music_on_profile"), AbstractC58322PtE.A0T(c95124Py), AbstractC166987dD.A0i(c95124Py, "has_placed_orders"), AbstractC166987dD.A0i(c95124Py, "has_private_collections"), AbstractC166987dD.A0i(c95124Py, "has_saved_items"), AbstractC166987dD.A0i(c95124Py, "has_videos"), AbstractC58318PtA.A0O(C60105Qu3.class, "hd_profile_pic_url_info", -1520246566), AbstractC166987dD.A0i(c95124Py, "hide_text_app_activation_badge_on_text_app"), AbstractC166987dD.A0i(c94754Oe, "home_country"), AbstractC166987dD.A0i(c94754Oe, "instagram_location_id"), AbstractC58321PtD.A0R(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "ig_text_post_app_onboarding_default_privacy"), AbstractC166987dD.A0i(c95124Py, "is_allowed_to_create_standalone_nonprofit_fundraisers"), AbstractC166987dD.A0i(c95124Py, "is_allowed_to_create_standalone_personal_fundraisers"), AbstractC166987dD.A0i(c95124Py, "is_api_user"), AbstractC166987dD.A0i(c95124Py, "is_attribute_sync_enabled"), AbstractC166987dD.A0i(c95124Py, "is_auto_highlight_enabled"), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_category_tappable"), AbstractC166987dD.A0i(c95124Py, AbstractC111324zv.A00(2600)), AbstractC166987dD.A0i(c95124Py, "is_eligible_for_diverse_owned_business_info"), AbstractC166987dD.A0i(c95124Py, "is_eligible_for_lead_center"), AbstractC166987dD.A0i(c95124Py, "is_eligible_for_product_tagging_null_state"), AbstractC166987dD.A0i(c95124Py, "is_eligible_for_smb_support_flow"), AbstractC166987dD.A0i(c95124Py, "is_eligible_to_display_diverse_owned_business_info"), AbstractC166987dD.A0i(c95124Py, "is_eligible_to_show_fb_cross_sharing_nux")}, 0, c4omArr, 81, 27);
        System.arraycopy(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "is_facebook_onboarded_charity"), AbstractC166987dD.A0i(c95124Py, "is_favorite"), AbstractC166987dD.A0i(c95124Py, "is_favorite_for_clips"), AbstractC166987dD.A0i(c95124Py, "is_favorite_for_exclusive_content"), AbstractC166987dD.A0i(c95124Py, "is_favorite_for_highlights"), AbstractC166987dD.A0i(c95124Py, "is_favorite_for_igtv"), AbstractC166987dD.A0i(c95124Py, "is_favorite_for_stories"), AbstractC166987dD.A0i(c95124Py, "is_hide_more_comment_enabled"), AbstractC166987dD.A0i(c95124Py, "is_hiding_stories_from_someone"), AbstractC166987dD.A0i(c95124Py, "is_igd_product_picker_enabled"), AbstractC166987dD.A0i(c95124Py, "is_in_canada"), AbstractC166987dD.A0i(c95124Py, "is_interest_account"), AbstractC166987dD.A0i(c95124Py, "is_memorialized"), AbstractC166987dD.A0i(c95124Py, "is_muted_words_custom_enabled"), AbstractC166987dD.A0i(c95124Py, "is_muted_words_global_enabled"), AbstractC166987dD.A0i(c95124Py, "is_muted_words_spamscam_enabled"), AbstractC166987dD.A0i(c95124Py, "is_new_to_instagram"), AbstractC166987dD.A0i(c95124Py, "is_profile_action_needed"), AbstractC166987dD.A0i(c95124Py, "is_profile_audio_call_enabled"), AbstractC166987dD.A0i(c95124Py, "is_promotions_in_profile_enabled"), AbstractC166987dD.A0i(c95124Py, "is_quiet_mode_enabled"), AbstractC166987dD.A0i(c95124Py, "is_regulated_c18"), AbstractC166987dD.A0i(c95124Py, "is_sandbox_creator_agent_enabled"), AbstractC166987dD.A0i(c95124Py, "is_secondary_account_creation"), AbstractC166987dD.A0i(c95124Py, "is_seller_features_disabled"), AbstractC166987dD.A0i(c95124Py, "is_shopping_auto_highlight_eligible"), AbstractC166987dD.A0i(c95124Py, "is_shopping_catalog_source_selection_enabled")}, 0, c4omArr, 108, 27);
        C4OW A0i2 = AbstractC166987dD.A0i(c95124Py, "is_shopping_community_content_enabled");
        C4OW A0i3 = AbstractC166987dD.A0i(c95124Py, "is_shopping_revoked_for_seller");
        C4OW A0i4 = AbstractC166987dD.A0i(c95124Py, "is_shopping_settings_enabled");
        C4OW A0i5 = AbstractC166987dD.A0i(c95124Py, "is_supervision_features_enabled");
        C4OW A0i6 = AbstractC166987dD.A0i(c95124Py, "is_whatsapp_linked");
        C4OW A0i7 = AbstractC166987dD.A0i(c94754Oe, MSV.A00(1369));
        C173847oc c173847oc = C173847oc.A00;
        System.arraycopy(new C4OM[]{A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, AbstractC166987dD.A0i(c173847oc, Location.LATITUDE), AbstractC166987dD.A0i(c94754Oe, "lead_details_app_id"), AbstractC166987dD.A0i(c94894Ou, "liked_clips_count"), AbstractC166987dD.A0i(c95124Py, "limited_interactions_enabled"), AbstractC166987dD.A0i(c94754Oe, "live_subscription_status"), AbstractC166987dD.A0i(c173847oc, "longitude"), AbstractC166987dD.A0i(c94754Oe, "merchant_checkout_style"), AbstractC166987dD.A0i(C94754Oe.A00(), "multiple_profile_picture_urls"), AbstractC166987dD.A0i(c94894Ou, "mutual_followers_count"), AbstractC166987dD.A0i(c95124Py, "my_week_enabled"), AbstractC58318PtA.A0O(C60106Qu4.class, AbstractC111324zv.A00(2744), 1768356838), AbstractC166987dD.A0i(c95124Py, "needs_to_accept_shopping_seller_onboarding_terms"), AbstractC166987dD.A0i(c94894Ou, "num_of_admined_pages"), AbstractC58318PtA.A0O(C60107Qu5.class, "opal_info", -685802354), AbstractC166987dD.A0i(c95124Py, "open_external_url_with_in_app_browser"), AbstractC166987dD.A0i(c94754Oe, "page_id"), AbstractC166987dD.A0i(c94754Oe, "page_name"), AbstractC166987dD.A0i(c94754Oe, "personal_account_ads_page_id"), AbstractC166987dD.A0i(c94754Oe, "personal_account_ads_page_name"), AbstractC58318PtA.A0O(C60108Qu6.class, "pinned_channels_info", 1975644660), AbstractC58319PtB.A0K(c94754Oe)}, 0, c4omArr, 135, 27);
        System.arraycopy(new C4OM[]{AbstractC166987dD.A0i(c94894Ou, "primary_profile_link_type"), AbstractC166987dD.A0i(c94754Oe, "profile_context"), AbstractC166987dD.A0h(C4OO.A00(), C60109Qu7.class, "profile_context_facepile_users", -153005979), AbstractC166987dD.A0h(C4OO.A00(), C60110Qu8.class, "profile_context_links_with_user_ids", 738875230), AbstractC166987dD.A0i(C94754Oe.A00(), "profile_context_mutual_follow_ids"), AbstractC58319PtB.A0Q(c94754Oe), AbstractC166987dD.A0i(C94754Oe.A00(), AbstractC111324zv.A00(2934)), AbstractC166987dD.A0i(c94894Ou, "profile_visits_count"), AbstractC166987dD.A0i(c94894Ou, "profile_visits_num_days"), AbstractC166987dD.A0i(c94754Oe, "public_email"), AbstractC166987dD.A0i(c94754Oe, "public_phone_country_code"), AbstractC166987dD.A0i(c94754Oe, "public_phone_number"), AbstractC166987dD.A0h(C4OO.A00(), C213399d0.class, "quiet_mode_pause_windows", 1392817773), AbstractC166987dD.A0h(C4OO.A00(), C60111Qu9.class, "quiet_mode_windows", 794246841), AbstractC58318PtA.A0O(C213409d1.class, "recs_from_friends", -1143979278), AbstractC166987dD.A0i(c94754Oe, "reel_auto_archive"), AbstractC166987dD.A0i(c95124Py, "remove_message_entrypoint"), AbstractC166987dD.A0i(c95124Py, "request_contact_enabled"), AbstractC166987dD.A0i(c94754Oe, "robi_feedback_source"), AbstractC166987dD.A0i(c94754Oe, "shop_management_access_state"), AbstractC166987dD.A0i(c94754Oe, "shopping_onboarding_state"), AbstractC166987dD.A0i(c94754Oe, "shopping_post_onboard_nux_type"), AbstractC166987dD.A0i(c95124Py, "should_show_category"), AbstractC166987dD.A0i(c95124Py, "should_show_public_contacts"), AbstractC166987dD.A0i(c95124Py, "show_account_transparency_details"), AbstractC166987dD.A0i(c95124Py, "show_besties_badge"), AbstractC166987dD.A0i(c95124Py, "show_conversion_edit_entry")}, 0, c4omArr, 162, 27);
        return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "show_fb_link_on_profile"), AbstractC166987dD.A0i(c95124Py, "show_fb_page_link_on_profile"), AbstractC166987dD.A0i(c95124Py, "show_ig_app_switcher_badge"), AbstractC166987dD.A0i(c95124Py, "show_insights_terms"), AbstractC58318PtA.A0O(C60112QuA.class, "show_schools_badge", -1532978641), AbstractC166987dD.A0i(c95124Py, "show_text_post_app_badge"), AbstractC166987dD.A0i(c95124Py, "show_text_post_app_switcher_badge"), AbstractC58318PtA.A0O(C60113QuB.class, "smb_delivery_partner", -1352641845), AbstractC58318PtA.A0O(C60114QuC.class, "smb_get_quote_partner", 738666233), AbstractC166987dD.A0i(c94754Oe, "state_run_media_country"), AbstractC166987dD.A0i(c94754Oe, "storefront_attribution_username"), AbstractC58318PtA.A0O(C67254Uj1.class, "supervision_info", 110961110), AbstractC166987dD.A0i(c94754Oe, "text_app_profile_pic_url"), AbstractC166987dD.A0i(c95124Py, "text_post_app_remove_mention_entrypoint"), AbstractC58318PtA.A0O(C60115QuD.class, "text_app_suggestion_card_profile_context", 1522231775), AbstractC166987dD.A0i(c94754Oe, "text_app_user_recommendation_social_context_expanded"), AbstractC58321PtD.A0S(c94894Ou), AbstractC166987dD.A0i(c94894Ou, "total_ar_effects"), AbstractC166987dD.A0i(c94894Ou, "total_clips_count"), AbstractC166987dD.A0i(c94894Ou, "total_igtv_videos"), AbstractC166987dD.A0i(c94894Ou, "total_music_count"), AbstractC166987dD.A0i(c95124Py, "transparency_product_enabled"), AbstractC166987dD.A0h(C4OO.A00(), C60125QuN.class, "upcoming_events", 879075878), AbstractC166987dD.A0i(c95124Py, "usertag_review_enabled"), AbstractC166987dD.A0i(c94894Ou, "usertags_count"), AbstractC166987dD.A0i(c94754Oe, "whatsapp_number"), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE)}, c4omArr, 0, 189, 27);
    }

    public C60126QuO(int i) {
        super(i);
    }

    public C60126QuO() {
        super(1942429874);
    }
}