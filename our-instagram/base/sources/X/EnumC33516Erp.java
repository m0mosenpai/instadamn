package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Erp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33516Erp implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC33516Erp[] A01;
    public static final EnumC33516Erp A02;
    public final String A00;

    static {
        EnumC33516Erp[] enumC33516ErpArr = new EnumC33516Erp[163];
        System.arraycopy(new EnumC33516Erp[]{A00("IG_PROMOTE_PAGE_NOT_CREATED", "ig_promote_page_not_created", 0), A00("IG_PROMOTE_PAGE_NOT_CONNECTED", "ig_promote_page_not_connected", 1), A00("IG_SETTINGS_BUSINESS_TAB", "ig_settings_business_tab", 2), A00("IG_SETTINGS_SEARCH_BAR", "ig_settings_search_bar", 3), A00("IG_EDIT_PROFILE", "ig_edit_profile", 4), A00("IG_EDIT_PROFILE_LINK_CONFIRMATION", "ig_edit_profile_link_confirmation", 5), A00("IG_PERSONAL_TO_BUSINESS_CONVERSION", "ig_personal_to_business_conversion", 6), A00("IG_CLAIM_PAGE_UPSELL", "ig_claim_page_upsell", 7), A00("IG_CLAIM_LOCATION", "ig_claim_location", 8), A00("IG_SHARE_TO_FB", "ig_share_to_fb", 9), A00("IG_CROSSPOST_POST", "ig_crosspost_post", 10), A00("IG_CROSSPOST_VIDEO", "ig_crosspost_video", 11), A00("IG_CROSSPOST_PANAVISION", "ig_crosspost_panavision", 12), A00("IG_FB_BADGE", "ig_fb_badge", 13), A00("IG_SETTINGS_SHARE_TO_FB", "ig_settings_share_to_fb", 14), A00("IG_SERVICES", "ig_services", 15), A00("IG_APP_SHOPPING", "ig_app_shopping", 16), A00("PAGE_SETTINGS", "page_settings", 17), new EnumC33516Erp("PAGE_SETTINGS_LINK_CONFIRMATION", 18, "PAGE_SETTINGS_LINK_CONFIRMATION"), new EnumC33516Erp("PAGE_SETTINGS_LINK_OVERRIDE", 19, "PAGE_SETTINGS_LINK_OVERRIDE"), new EnumC33516Erp("PAGE_SETTINGS_LINK_OVERRIDE_COMET", 20, "PAGE_SETTINGS_LINK_OVERRIDE_COMET"), new EnumC33516Erp("PAGE_SETTINGS_INSTAGRAM_CONVERSION", 21, "PAGE_SETTINGS_INSTAGRAM_CONVERSION"), new EnumC33516Erp("PAGE_SETTINGS_SYNC_INFO", 22, "PAGE_SETTINGS_SYNC_INFO"), A00("PAGE_SETTINGS_COMET", "page_settings_comet", 23), A00("PAGE_SETTINGS_COMET_LINK_CONFIRMATION", "page_settings_comet_link_confirmation", 24), A00("PAYOUT_ONBOARDING", "payout_onboarding", 25), A00("PAGE_INFO", "page_info", 26)}, 0, enumC33516ErpArr, 0, 27);
        System.arraycopy(new EnumC33516Erp[]{A00("PROFILE_PLUS_SETTINGS", "profile_plus_settings", 27), A00("PROFILE_PLUS_SETTINGS_LINK_OVERRIDE", "profile_plus_settings_link_override", 28), A00("UNIFIED_INBOX", "unified_inbox", 29), A00("UNIFIED_INBOX_ALL_MESSAGES", "unified_inbox_all_messages", 30), A00("UNIFIED_INBOX_IG_DIRECT", "unified_inbox_ig_direct", 31), A00("UNIFIED_INBOX_IG_DIRECT_V2", "unified_inbox_ig_direct_v2", 32), A00("UNIFIED_INBOX_IG_COMMENTS", "unified_inbox_ig_comments", 33), A00("UNIFIED_INBOX_IG_COMMENTS_V2", "unified_inbox_ig_comments_v2", 34), A00("UNIFIED_INBOX_BOTTOMSHEET", "unified_inbox_bottomsheet", 35), new EnumC33516Erp("UNIFIED_INBOX_NUX", 36, "UNIFIED_INBOX_NUX"), new EnumC33516Erp("UNIFIED_INBOX_THREAD_LIST_UPSELL", 37, "UNIFIED_INBOX_THREAD_LIST_UPSELL"), new EnumC33516Erp("BIZWEB_CONTENT_MANAGER", 38, "BIZWEB_CONTENT_MANAGER"), new EnumC33516Erp("BIZWEB_CONTENT_MANAGER_IG_GRID_VIEW", 39, "BIZWEB_CONTENT_MANAGER_IG_GRID_VIEW"), A00("BIZWEB_CONTENT_FEED_AND_GRID", "bizweb_content_feed_and_grid", 40), A00("BIZWEB_HOME_HEADER", "bizweb_home_header", 41), A00("BIZWEB_WELCOME_TOUR", "bizweb_welcome_tour", 42), A00("BIZWEB_WELCOME_TOUR_LINK_CONFIRMATION", "bizweb_welcome_tour_link_confirmation", 43), A00("BIZWEB_ALERT_CARD", "bizweb_alert_card", 44), A00("BIZWEB_ALERT_CARD_LINK_CONFIRMATION", "bizweb_alert_card_link_confirmation", 45), A00("BIZWEB_PROGRESSIVE_ONBOARDING", "bizweb_progressive_onboarding", 46), A00("BUSINESS_PROFILE_COMPLETION_METER", "business_profile_completion_meter", 47), A00("BIZWEB_COMPOSER", "bizweb_composer", 48), A00("BIZWEB_SIMPLIFIED_COMPOSER", "bizweb_simplified_composer", 49), A00("BIZWEB_POST_COMPLETION_UPSELL", "bizweb_post_completion_upsell", 50), A00("BIZWEB_SELF_VIEW_IG_TAB", "bizweb_self_view_ig_tab", 51), A00("BIZWEB_IG_LOGIN_SIMPLIFIED_COMPOSER", "bizweb_ig_login_simplified_composer", 52), A00("BIZWEB_POST_COMPOSER_LINK_PAGE_TO_IG_AFTERPARTY", "bizweb_post_composer_link_page_to_ig_afterparty", 53)}, 0, enumC33516ErpArr, 27, 27);
        System.arraycopy(new EnumC33516Erp[]{A00("BIZWEB_BUSINESS_ACCOUNT_SETUP", "bizweb_business_account_setup", 54), A00("BIZWEB_BUSINESS_ACCOUNT_SETUP_ALL_SUGGESTIONS", "bizweb_business_account_setup_all_suggestions", 55), A00("BIZWEB_BUSINESS_ACCOUNT_SETUP_SETTINGS_BANNER", "bizweb_business_account_setup_settings_banner", 56), A00("BIZWEB_BUSINESS_ACCOUNT_SETUP_BCM_ITEM", "bizweb_business_account_setup_bcm_item", 57), A00("BIZWEB_BUSINESS_ACCOUNT_SETUP_EMAIL", "bizweb_business_account_setup_email", 58), A00("BIZWEB_SETTINGS_LINKING_MANAGEMENT", "bizweb_settings_linking_management", 59), A00("BIZWEB_SETTINGS_LINKING_MANAGEMENT_FB_LOGIN_ON_PAGE_ASSET", "bizweb_settings_linking_management_fb_login_on_page_asset", 60), A00("BIZAPP_CONFIG_QUERY", "bizapp_config_query", 61), A00("BIZAPP_WELCOME_TOUR", "bizapp_welcome_tour", 62), A00("BIZAPP_SETTINGS", "bizapp_settings", 63), A00("BIZAPP_PAGE_COMPLETION_METER", "bizapp_page_completion_meter", 64), A00("BIZAPP_HOME_LINK_CONFIRMATION", "bizapp_home_link_confirmation", 65), A00("BIZAPP_FTUX_ONBOARDING_TOOL_READINESS", "bizapp_ftux_onboarding_tool_readiness", 66), A00("BIZAPP_PROGRESSIVE_ONBOARDING", "bizapp_progressive_onboarding", 67), A00("BIZAPP_COMPOSER", "bizapp_composer", 68), A00("BIZAPP_POST_AFTER_PARTY", "bizapp_post_after_party", 69), A00("IG_GENERAL", "ig_general", 70), A00("IG_LINK_CONFIRMATION", "ig_link_confirmation", 71), A00("ADS_MANAGER_CLICK_TO_MESSAGE", "ads_manager_click_to_message", 72), A00("ADS_MANAGER_REACH_AND_FREQUENCY_PAGE_IG_SECTION", "ads_manager_reach_and_frequency_page_ig_section", 73), A00("ADS_MANAGER_IDENTITY_SECTION", "ads_manager_identity_section", 74), A00("ADS_MANAGER_PARTNERSHIP_AD_IDENTITY_SECTION", "ads_manager_partnership_ad_identity_section", 75), A00("ADS_MANAGER_GUIDED_ONBOARDING", "ads_manager_guided_onboarding", 76), A00("AMA_PAC_COMPOSER", "ama_pac_composer", 77), A00("AMA_INSTAGRAM_ACCOUNTS", "ama_instagram_accounts", 78), A00("AMA_STORIES_COMPOSER_EDITOR", "ama_stories_composer_editor", 79), A00("AMA_EDIT_POST", "ama_edit_post", 80)}, 0, enumC33516ErpArr, 54, 27);
        System.arraycopy(new EnumC33516Erp[]{A00("AMA_AD_INSTAGRAM_ACCOUNT_EDITOR", "ama_ad_instagarm_account_editor", 81), A00("AMA_IMAGE_EDITOR", "ama_image_editor", 82), A00("AMA_IMAGE_EDITOR_BOTTOM_SHEET", "ama_image_editor_bottom_sheet", 83), A00("AMA_POST_ENGAGEMENT_INSTAGRAM_TAB", "ama_post_engagement_instagram_tab", 84), A00("AMA_CLICK_TO_MESSAGE", "ama_click_to_message", 85), A00("AMA_LOGO_PICKER", "ama_logo_picker", 86), A00("PAGE_IG_UPSELL_BOTTOM_SHEET", "page_ig_upsell_bottom_sheet", 87), A00("LAX_AD_CENTER_UNIFIED_TASK_LIST", "lax_ad_center_unified_task_list", 88), A00("LAX_QUESTIONNAIRE", "lax_questionnaire", 89), A00("LAX_BOOST_POST_UNIFIED", "lax_boost_post_unified", 90), A00("LAX_BOOST_POST_NON_UNIFIED", "lax_boost_post_non_unified", 91), A00("LAX_BOOST_POST_UNIFIED_EDIT", "lax_boost_post_unified_edit", 92), A00("LAX_BOOST_POST_NON_UNIFIED_EDIT", "lax_boost_post_non_unified_edit", 93), A00("IG_SHOPPING_FBE", "ig_shopping_fbe", 94), A00("IG_SHOPPING_SHOPIFY_META_APP", "ig_shopping_shopify_meta_app", 95), A00("IG_SHOPPING_COMMERCE_MANAGER", "ig_shopping_commerce_manager", 96), A00("IG_SHOPPING_COMMERCE_MANAGER_ADD_TO_IG_CHANNEL", "ig_shopping_commerce_manager_add_to_ig_channel", 97), A00("IG_SHOPPING_COMMERCE_MANAGER_ADD_IG_ACCOUNT", "ig_shopping_commerce_manager_add_ig_account", 98), A00("IG_SHOPPING_COMMERCE_MANAGER_CHECKOUT", "ig_shopping_commerce_manager_checkout", 99), A00("IG_SHOPPING_GENERAL", "ig_shopping_general", 100), A00("SOCIAL_WIFI_SETTINGS", "social_wifi_settings", 101), A00("SOCIAL_WIFI_ONBOARDING", "social_wifi_onboarding", 102), A00("SOCIAL_WIFI_AYMT", "social_wifi_aymt", 103), new EnumC33516Erp("BUSINESS_CENTRAL_IDENTITY_CREATION", 104, "BUSINESS_CENTRAL_IDENTITY_CREATION"), A00("FBE_INCONSISTENCY_FIX_FLOW", "fbe_inconsistency_fix_flow", 105), A00("FBE_IG_BUSINESS_ONBOARDING", "fbe_ig_business_onboarding", 106), A00("AYMT_BIZAPP_GUIDANCE_CARD", "aymt_bizapp_guidance_card", 107)}, 0, enumC33516ErpArr, 81, 27);
        System.arraycopy(new EnumC33516Erp[]{A00("AYMT_INCOMPLETE_TR_NOTIFICATION", "aymt_incomplete_tr_notification", 108), A00("AYMT_LINK_CONFIRMATION_MOBILE", "aymt_link_confirmation_mobile", 109), A00("AYMT_FLYTRAP_LINK_CONFIRMATION_MOBILE", "aymt_flytrap_link_confirmation_mobile", 110), A00("LINK_IG_TO_FB_NOTIFICATION", "link_ig_to_fb_notification", 111), A00("CENTRA_SUA_ACTION", "centra_sua_action", 112), new EnumC33516Erp("INTEGRATION_TEST", 113, "INTEGRATION_TEST"), A00("EXAMPLE", "example", 114), A00("BA_AUTO_CLAIMING_WITHOUT_LINKING", "ba_auto_claiming_without_linking", 115), new EnumC33516Erp("ALERT_CARD", 116, "ALERT_CARD"), new EnumC33516Erp("WELCOME_TOUR", 117, "WELCOME_TOUR"), new EnumC33516Erp("HOME", 118, "HOME"), A00("HOME_BOTTOMSHEET", "home_bottomsheet", 119), new EnumC33516Erp("COMPOSER", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, "COMPOSER"), A00("FB_APPOINTMENTS_ONBOARDING_DEPRECATED", "fb_appointments_onboarding_deprecated", 121), A00("PAGE_INBOX_NUX_DEPRECATED", "page_inbox_nux_deprecated", 122), A00("PAGE_INBOX_IG_DIRECT_DEPRECATED", "page_inbox_ig_direct_deprecated", 123), A00("PAGE_INBOX_IG_COMMENTS_DEPRECATED", "page_inbox_ig_comments_deprecated", 124), A00("COMMERCE_MANAGER_IG_SANDBOX_ONBOARDING_FLOW_DEPRECATED", "commerce_manager_ig_sandbox_onboarding_flow_deprecated", 125), A00("CANVAS_DEPRECATED", "canvas_deprecated", 126), A00("UNKNOWN_LINK_DO_NOT_USE", "unknown_link_do_not_use", StringTreeSet.MAX_SYMBOL_COUNT), A00("UNKNOWN_RECONFIRMATION_DO_NOT_USE", "unknown_reconfirmation_do_not_use", 128), A00("UNKNOWN_LINK_OVERRIDE_DO_NOT_USE", "unknown_link_override_do_not_use", 129), A00("UNKNOWN_UNLINK_DO_NOT_USE", "unknown_unlink_do_not_use", 130), A00("UNKNOWN_X_PAGE_LINK_INSTAGRAM_ACCOUNT_OAUTH_CONTROLLER_DO_NOT_USE", "unknown_x_page_link_instagram_account_oauth_controller_do_not_use", 131), A00("UNKNOWN_GRAPHQL_PRESMA_IG_OAUTH_CONNECT_MUTATION_DO_NOT_USE", "unknown_graphql_presma_ig_oauth_connect_mutation_do_not_use", 132), A00("UNKNOWN_GRAPHQL_PAGE_UNLINK_INSTAGRAM_ACCOUNT_MUTATION_DO_NOT_USE", "unknown_graphql_page_unlink_instagram_account_mutation_do_not_use", 133), A00("UNKNOWN_GRAPHQL_FBE_INSTAGRAM_SHOP_ENTITY_DO_NOT_USE", "unknown_graphql_fbe_instagram_shop_entity_do_not_use", 134)}, 0, enumC33516ErpArr, 108, 27);
        EnumC33516Erp A00 = A00("UNKNOWN_GRAPHQL_CREATE_AND_CLAIM_INSTAGRAM_BUSINESS_PAGE_DO_NOT_USE", "unknown_graphql_create_and_claim_instagram_business_page_do_not_use", 135);
        EnumC33516Erp A002 = A00("UNKNOWN_GRAPHQL_CHANGE_INSTAGRAM_BUSINESS_PAGE_DO_NOT_USE", "unknown_graphql_change_instagram_business_page_do_not_use", 136);
        EnumC33516Erp A003 = A00("UNKNOWN_GRAPHQL_LWI_QUESTIONNAIRE_INSTAGRAM_LOGIN_URI_DO_NOT_USE", "unknown_graphql_lwi_questionnaire_instagram_login_uri_do_not_use", 137);
        EnumC33516Erp A004 = A00("UNKNOWN_GRAPHQL_IG_PRESENCE_ACCOUNT_INFO_DO_NOT_USE", "unknown_graphql_ig_presence_account_info_do_not_use", 138);
        EnumC33516Erp A005 = A00("UNKNOWN_GRAPHQL_PAGE_INSTAGRAM_LINKING_INTENT_DO_NOT_USE", "unknown_graphql_page_instagram_linking_intent_do_not_use", 139);
        EnumC33516Erp A006 = A00("UNKNOWN_IG_GRAPHQL_SWITCH_TO_BUSINESS_ACCOUNT_DO_NOT_USE", "unknown_ig_graphql_switch_to_business_account_do_not_use", 140);
        EnumC33516Erp A007 = A00("UNKNOWN_IG_GRAPHQL_MAKE_CONSISTENT_PAGE_CONNECTION_DO_NOT_USE", "unknown_ig_graphql_make_consistent_page_connection_do_not_use", 141);
        EnumC33516Erp A008 = A00("UNKNOWN_GRAPHQL_CLAIM_INSTAGRAM_BUSINESS_UNOWNED_PAGE_DO_NOT_USE", "unknown_graphql_claim_instagram_business_unowned_page_do_not_use", 142);
        EnumC33516Erp A009 = A00("UNKNOWN_GRAPHQL_PAGE_MAKE_IG_CONNECTION_CONSISTENT_DO_NOT_USE", "unknown_graphql_page_make_ig_connection_consistent_do_not_use", 143);
        EnumC33516Erp A0010 = A00("UNKNOWN_GRAPHQL_PAGE_CONNECT_INSTAGRAM_ACCOUNT_MUTATION_CALL_DO_NOT_USE", "unknown_graphql_page_connect_instagram_account_mutation_call_do_not_use", 144);
        EnumC33516Erp A0011 = A00("PAGE_IG_UNLINK_ADS_ASSOC_INTERNAL_TOOL", "page_ig_unlink_ads_assoc_internal_tool", 145);
        EnumC33516Erp A0012 = A00("TEST", "test", 146);
        EnumC33516Erp A0013 = A00("UNKNOWN", "unknown", 147);
        EnumC33516Erp A0014 = A00("BPL_LINK_DO_NOT_USE", "bpl_link_do_not_use", 148);
        EnumC33516Erp A0015 = A00("FBE_COMMERCE_FLOW", "fbe_commerce_flow", 149);
        EnumC33516Erp A0016 = A00("BIZWEB_SETTINGS", "bizweb_settings", 150);
        EnumC33516Erp A0017 = A00("BIZWEB_SETTINGS_PARTNERS", "bizweb_settings_partners", 151);
        EnumC33516Erp A0018 = A00("BUSINESS_MANAGER_SETTINGS", "business_manager_settings", 152);
        EnumC33516Erp A0019 = A00("CATALOG_MANAGER", "catalog_manager", 153);
        EnumC33516Erp A0020 = A00("IG_SHOPPING_ONBOARDING", "ig_shopping_onboarding", 154);
        EnumC33516Erp A0021 = A00("FB_SHOPPING_ONBOARDING", "fb_shopping_onboarding", 155);
        EnumC33516Erp A0022 = A00("CM_SHOPPING_ONBOARDING", "cm_shopping_onboarding", 156);
        EnumC33516Erp A0023 = A00("IG_PROFESSIONAL_SETTINGS", "ig_professional_settings", 157);
        A02 = A0023;
        System.arraycopy(new EnumC33516Erp[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A00("AP_PLUS_SETTINGS", "ap_plus_settings", 158), A00("WA_SMB_SETTINGS", "whatsapp_smb_settings", 159), A00("DEEPLINK_FROM_IG", "deeplink_from_ig", 160), A00("DEEPLINK_FROM_FB", "deeplink_from_fb", 161)}, 0, enumC33516ErpArr, 135, 27);
        System.arraycopy(new EnumC33516Erp[]{A00("FB_ADDITIONAL_PROFILE_PLUS_QP", "fb_additional_profile_plus_qp", 162)}, 0, enumC33516ErpArr, 162, 1);
        A01 = enumC33516ErpArr;
    }

    public static EnumC33516Erp A00(String str, String str2, int i) {
        return new EnumC33516Erp(str, i, str2);
    }

    public static EnumC33516Erp valueOf(String str) {
        return (EnumC33516Erp) Enum.valueOf(EnumC33516Erp.class, str);
    }

    public static EnumC33516Erp[] values() {
        return (EnumC33516Erp[]) A01.clone();
    }

    public EnumC33516Erp(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}