package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2O5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2O5 implements InterfaceC02530Ab {
    public static final /* synthetic */ C2O5[] A01;
    public static final C2O5 A02;
    public static final C2O5 A03;
    public static final C2O5 A04;
    public static final C2O5 A05;
    public static final C2O5 A06;
    public static final C2O5 A07;
    public static final C2O5 A08;
    public static final C2O5 A09;
    public static final C2O5 A0A;
    public static final C2O5 A0B;
    public static final C2O5 A0C;
    public static final C2O5 A0D;
    public static final C2O5 A0E;
    public static final C2O5 A0F;
    public static final C2O5 A0G;
    public static final C2O5 A0H;
    public static final C2O5 A0I;
    public static final C2O5 A0J;
    public static final C2O5 A0K;
    public final String A00;

    static {
        C2O5[] c2o5Arr = new C2O5[199];
        C2O5 c2o5 = new C2O5("PAYMENT_SETTINGS", 0, "payment_settings");
        C2O5 c2o52 = new C2O5("PAYOUTHUB_MSC", 1, "payouthub_msc");
        A0I = c2o52;
        C2O5 c2o53 = new C2O5("IG_PAYMENT_SETTINGS", 2, "ig_payment_settings");
        C2O5 c2o54 = new C2O5("UNKNOWN", 3, "unknown");
        A0K = c2o54;
        C2O5 c2o55 = new C2O5("CAL_SETTING", 4, "cal_setting");
        C2O5 c2o56 = new C2O5("MP_PAYMENT_SETTINGS", 5, "mp_payment_settings");
        C2O5 c2o57 = new C2O5("FBPAY_HUB", 6, "fbpay_hub");
        A03 = c2o57;
        C2O5 c2o58 = new C2O5("META_PAY_WALLET", 7, "meta_pay_wallet");
        C2O5 c2o59 = new C2O5("META_PAY_VAULT", 8, "meta_pay_vault");
        C2O5 c2o510 = new C2O5("ECP", 9, "ecp");
        A02 = c2o510;
        C2O5 c2o511 = new C2O5("DIGITAL_CODE", 10, "digital_code");
        C2O5 c2o512 = new C2O5(PriceTableAnnotation$Companion.OFFER, 11, "offer");
        C2O5 c2o513 = new C2O5("LOYALTY", 12, "loyalty");
        C2O5 c2o514 = new C2O5("MERCHANT_LOYALTY", 13, "merchant_loyalty");
        C2O5 c2o515 = new C2O5("MERCHANT_ONBOARDING", 14, "MERCHANT_ONBOARDING");
        C2O5 c2o516 = new C2O5("MENU", 15, "menu");
        C2O5 c2o517 = new C2O5("IAP_ALL_PRODUCTS", 16, "iap_all_products");
        A07 = c2o517;
        C2O5 c2o518 = new C2O5("IAP_INSTANT_GAME", 17, "iap_instant_game");
        C2O5 c2o519 = new C2O5("IAP_FAN_FUNDING", 18, "iap_fan_funding");
        C2O5 c2o520 = new C2O5("IAP_GAME_TIPPING", 19, "iap_game_tipping");
        C2O5 c2o521 = new C2O5("IAP_GROUP_SUBSCRIPTION", 20, "iap_group_subscription");
        C2O5 c2o522 = new C2O5("IAP_INSTAGRAM_P2A", 21, "iap_instagram_p2a");
        C2O5 c2o523 = new C2O5("IAP_INSTAGRAM_USERPAY_BADGES", 22, "iap_instagram_userpay_badges");
        A0B = c2o523;
        C2O5 c2o524 = new C2O5("IAP_PAID_ONLINE_EVENT", 23, "iap_paid_online_event");
        C2O5 c2o525 = new C2O5("IAP_SUPER_MEET_AND_GREET", 24, "iap_super_meet_and_greet");
        C2O5 c2o526 = new C2O5("IAP_SUPER_VIRTUAL_GIFT", 25, "iap_super_virtual_gift");
        C2O5 c2o527 = new C2O5("IAP_INSTAGRAM_FAN_SUBS", 26, "iap_instagram_fan_subs");
        System.arraycopy(new C2O5[]{c2o5, c2o52, c2o53, c2o54, c2o55, c2o56, c2o57, c2o58, c2o59, c2o510, c2o511, c2o512, c2o513, c2o514, c2o515, c2o516, c2o517, c2o518, c2o519, c2o520, c2o521, c2o522, c2o523, c2o524, c2o525, c2o526, c2o527}, 0, c2o5Arr, 0, 27);
        A0A = c2o527;
        C2O5 c2o528 = new C2O5("IAP_AVATAR_CONTENT", 27, "iap_avatar_content");
        A08 = c2o528;
        C2O5 c2o529 = new C2O5("IAP_NFT", 28, "iap_nft");
        A0D = c2o529;
        C2O5 c2o530 = new C2O5("IAP_NON_CONSUMABLE_VIDEO", 29, "iap_non_consumable_video");
        C2O5 c2o531 = new C2O5("IAP_GAMES_SUBSCRIPTION", 30, "iap_games_subscription");
        C2O5 c2o532 = new C2O5("IAP_HORIZON_PURCHASES", 31, "iap_horizon_purchases");
        C2O5 c2o533 = new C2O5("IAP_WA_BUSINESS_SUBS", 32, "iap_wa_business_subscription");
        C2O5 c2o534 = new C2O5("IAP_WA_PAID_CHANNEL", 33, "iap_wa_paid_channel");
        C2O5 c2o535 = new C2O5("IAP_ADS_BILLING", 34, "iap_ads_billing");
        C2O5 c2o536 = new C2O5("IAP_INSTAGRAM_CONTENT_APPRECIATION", 35, "iap_instagram_content_appreciation");
        A09 = c2o536;
        C2O5 c2o537 = new C2O5("IAP_META_GEM", 36, "iap_meta_gem");
        C2O5 c2o538 = new C2O5("IAP_MV_PAID_TOKEN", 37, "iap_mv_paid_token");
        C2O5 c2o539 = new C2O5("IAP_NME_SUBSCRIPTION", 38, "iap_nme_subscription");
        A0E = c2o539;
        C2O5 c2o540 = new C2O5("IAP_WA_BUSINESS_CREDIT", 39, "iap_wa_business_credit");
        C2O5 c2o541 = new C2O5("IAP_AFS_SUBSCRIPTION", 40, "iap_afs_subscription");
        A06 = c2o541;
        C2O5 c2o542 = new C2O5("IAP_MV4B", 41, "iap_mv4b");
        A0C = c2o542;
        System.arraycopy(new C2O5[]{c2o528, c2o529, c2o530, c2o531, c2o532, c2o533, c2o534, c2o535, c2o536, c2o537, c2o538, c2o539, c2o540, c2o541, c2o542, new C2O5("IAP_DCP_DEMO", 42, "iap_dcp_demo"), new C2O5("IAP_AI_PREMIUM", 43, "iap_ai_premium"), new C2O5("IAP_CREATOR_STOREFRONT", 44, "iap_creator_storefront"), new C2O5("FB_BROWSER_PAYMENT", 45, "fb_browser_payment"), new C2O5("MOR_NONE", 46, "mor_none"), new C2O5("MOR_ADS_CONSENT", 47, "mor_ads_consent"), new C2O5("MOR_ADS_CONSENT_AFA", 48, "mor_ads_consent_afa"), new C2O5("MOR_ADS_AFA", 49, "mor_ads_afa"), new C2O5("MOR_WA_PAID_MESSAGING", 50, "mor_wa_paid_messaging"), new C2O5("MOR_WA_PAID_MESSAGING_AUTH", 51, "mor_wa_paid_messaging_auth"), new C2O5("MOR_BIZ_MESSAGING", 52, "mor_biz_messaging"), new C2O5("MOR_WHATSAPP_SMB", 53, "mor_whatsapp_smb")}, 0, c2o5Arr, 27, 27);
        System.arraycopy(new C2O5[]{new C2O5("MOR_WHATSAPP_SMB_TOPUP", 54, "mor_whatsapp_smb_topup"), new C2O5("MOR_ADS_INVOICE", 55, "mor_ads_invoice"), new C2O5("MOR_ADS_AUTH", 56, "mor_ads_auth"), new C2O5("MOR_ADS_RISK_3DS_AUTHENTICATION", 57, "mor_ads_risk_3ds_authentication"), new C2O5("MOR_ADS_BUSINESS", 58, "mor_ads_business"), new C2O5("MOR_ADS_STORED_BALANCE", 59, "mor_ads_stored_balance"), new C2O5("MOR_DONATIONS", 60, "mor_donations"), new C2O5("MOR_DONATIONS_CAUSE_FOR_CHARITIES", 61, "mor_donations_cause_for_charities"), new C2O5("MOR_DONATIONS_MATCHING_CONFIRMATION", 62, "mor_donations_matching_confirmation"), new C2O5("MOR_DONATIONS_MATCHING_PLEDGE", 63, "mor_donations_matching_pledge"), new C2O5("MOR_OCULUS_CV1", 64, "mor_oculus_cv1"), new C2O5("MOR_OCULUS_LAUNCH_V1", 65, "mor_oculus_launch_v1"), new C2O5("MOR_OCULUS_LAUNCH_V2", 66, "mor_oculus_launch_v2"), new C2O5("MOR_OCULUS_SUBSCRIPTION", 67, "mor_oculus_subscription"), new C2O5("MOR_OZONE", 68, "mor_ozone"), new C2O5("MOR_OPEN_GRAPH_PRODUCT", 69, "mor_open_graph_product"), new C2O5("MOR_MESSENGER_COMMERCE", 70, "mor_messenger_commerce"), new C2O5("MOR_P2P_TRANSFER", 71, "mor_p2p_transfer"), new C2O5("MOR_GIFTS", 72, "mor_gifts"), new C2O5("MOR_BILL", 73, "mor_bill"), new C2O5("MOR_AIRMAIL", 74, "mor_airmail"), new C2O5("MOR_EVENT_TICKETING", 75, "mor_event_ticketing"), new C2O5("MOR_WORKPLACE_USAGE", 76, "mor_workplace_usage"), new C2O5("MOR_FACEBOOK_SHOP", 77, "mor_facebook_shop"), new C2O5("MOR_FAN_FUNDING", 78, "mor_fan_funding"), new C2O5("MOR_VOICES", 79, "mor_voices"), new C2O5("MOR_GAME_TIPPING_TOKEN", 80, "mor_game_tipping_token")}, 0, c2o5Arr, 54, 27);
        System.arraycopy(new C2O5[]{new C2O5("MOR_INSTANT_GAMES", 81, "mor_instant_games"), new C2O5("MOR_GAMES_SUBSCRIPTION", 82, "mor_games_subscription"), new C2O5("MOR_ALT_APP_STORES", 83, "mor_alt_app_stores"), new C2O5("MOR_GROUP_SUBSCRIPTION", 84, "mor_group_subscription"), new C2O5("MOR_PAID_ONLINE_EVENT", 85, "mor_paid_online_event"), new C2O5("MOR_SUPER_MEET_AND_GREET", 86, "mor_super_meet_and_greet"), new C2O5("MOR_SUPER_VIRTUAL_GIFT", 87, "mor_super_virtual_gift"), new C2O5("MOR_NON_CONSUMABLE_VIDEO", 88, "mor_non_consumable_video"), new C2O5("MOR_AFS_SUBSCRIPTION", 89, "mor_afs_subscription"), new C2O5("MOR_PAYOUT_DEV", 90, "mor_payout_dev"), new C2O5("MOR_PAYOUT_CHARITY", 91, "mor_payout_charity"), new C2O5("MOR_PAYOUT_ADNET", 92, "mor_payout_adnet"), new C2O5("MOR_PAYOUT_OCU", 93, "mor_payout_ocu"), new C2O5("MOR_PAYOUT_DCP", 94, "mor_payout_dcp"), new C2O5("MOR_PAYOUT_AUTOPAY", 95, "mor_payout_autopay"), new C2O5("MOR_PAYOUT_MISCAP", 96, "mor_payout_miscap"), new C2O5("MOR_PAYOUT_CONTENT", 97, "mor_payout_content"), new C2O5("MOR_REPAYMENT", 98, "mor_repayment"), new C2O5("MOR_THIRD_PARTY_APP_STORES_IAP", 99, "mor_third_party_app_stores_iap"), new C2O5("MOR_CP_RETURN_LABEL", 100, "mor_cp_return_label"), new C2O5("MOR_WHATSAPP_P2P", 101, "mor_whatsapp_p2p"), new C2O5("MOR_NME_SUBSCRIPTION", 102, "mor_nme_subscription"), new C2O5("MOR_MV4B", 103, "mor_mv4b"), new C2O5("MOR_AI_PREMIUM", 104, "mor_ai_premium"), new C2O5("MOR_BILLING_OMEGA_INVOICE", 105, "mor_billing_omega_invoice"), new C2O5("NMOR_UNKNOWN", 106, "nmor_unknown"), new C2O5("NMOR_NONE", 107, "nmor_none")}, 0, c2o5Arr, 81, 27);
        C2O5 c2o543 = new C2O5("NMOR_PAGES_COMMERCE", 108, "nmor_pages_commerce");
        C2O5 c2o544 = new C2O5("NMOR_COMPONENT_FLOW", 109, "nmor_component_flow");
        C2O5 c2o545 = new C2O5("NMOR_BUSINESS_PLATFORM_COMMERCE", 110, "nmor_business_platform_commerce");
        C2O5 c2o546 = new C2O5("NMOR_SYNCHRONOUS_COMPONENT_FLOW", 111, "nmor_synchronous_component_flow");
        C2O5 c2o547 = new C2O5("NMOR_EVENT_TICKETING", 112, "nmor_event_ticketing");
        C2O5 c2o548 = new C2O5("NMOR_MARKETPLACE_TICKETING", 113, "nmor_marketplace_ticketing");
        C2O5 c2o549 = new C2O5("NMOR_PLATFORM_SELF_SERVE", 114, "nmor_platform_self_serve");
        C2O5 c2o550 = new C2O5("NMOR_MESSENGER_PLATFORM", 115, "nmor_messenger_platform");
        C2O5 c2o551 = new C2O5("NMOR_TIP_JAR", 116, "nmor_tip_jar");
        C2O5 c2o552 = new C2O5("NMOR_INSTANT_EXPERIENCES", 117, "nmor_instant_experiences");
        C2O5 c2o553 = new C2O5("NMOR_CHECKOUT_EXPERIENCES", 118, "nmor_checkout_experiences");
        A0H = c2o553;
        System.arraycopy(new C2O5[]{c2o543, c2o544, c2o545, c2o546, c2o547, c2o548, c2o549, c2o550, c2o551, c2o552, c2o553, new C2O5("NMOR_C2C_CHECKOUT_EXPERIENCES", 119, "nmor_c2c_checkout_experiences"), new C2O5("NMOR_BUY_ON_FACEBOOK", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, "nmor_buy_on_facebook"), new C2O5("NMOR_DONATION_P4P", 121, "nmor_donation_p4p"), new C2O5("NMOR_DONATION_P4C", 122, "nmor_donation_p4c"), new C2O5("NMOR_DONATION_CIELO", 123, "nmor_donation_cielo"), new C2O5("NMOR_NETWORK_TOKEN_NOTIF", 124, "nmor_network_token_notif"), new C2O5("NMOR_WHATSAPP_P2P", 125, "nmor_whatsapp_p2p"), new C2O5("NMOR_P2P", 126, "nmor_p2p"), new C2O5("NMOR_MESSENGER_P2P", StringTreeSet.MAX_SYMBOL_COUNT, "nmor_messenger_p2p"), new C2O5("NMOR_MOBILE_TOP_UP", 128, "nmor_mobile_top_up"), new C2O5("NMOR_MFS", 129, "nmor_mfs"), new C2O5("NMOR_SHIPPING_LABEL_DEPRECATED", 130, "nmor_shipping_label"), new C2O5("NMOR_PAGES_SOLUTION_DEPRECATED", 131, "nmor_pages_solution"), new C2O5("NMOR_BLACKBAUD_RWR_DONATION", 132, "nmor_blackbaud_rwr_donation"), new C2O5("NMOR_MARKETPLACE_SHIPPING", 133, "nmor_marketplace_shipping"), new C2O5("NMOR_DUMMY", 134, "nmor_dummy")}, 0, c2o5Arr, 108, 27);
        C2O5 c2o554 = new C2O5("NMOR_PPGF_DONATION", 135, "nmor_ppgf_donation");
        C2O5 c2o555 = new C2O5("NMOR_ADVERTISER_SUBSCRIPTION", 136, "nmor_advertiser_subscription");
        C2O5 c2o556 = new C2O5("NMOR_WHATSAPP_P2M", 137, "nmor_whatsapp_p2m");
        C2O5 c2o557 = new C2O5("WHATSAPP_P2M_LITE", 138, "whatsapp_p2m_lite");
        C2O5 c2o558 = new C2O5("MESSENGER_P2M", 139, "messenger_p2m");
        C2O5 c2o559 = new C2O5("NMOR_MOVIE_TICKETING", 140, "nmor_movie_ticketing");
        C2O5 c2o560 = new C2O5("NMOR_MESSAGING_COMMERCE", 141, "nmor_messaging_commerce");
        C2O5 c2o561 = new C2O5("NMOR_LIBRA", 142, "nmor_libra");
        C2O5 c2o562 = new C2O5("NMOR_SERVICES", 143, "nmor_services");
        C2O5 c2o563 = new C2O5("NMOR_FB_SHOP_ADS", 144, "nmor_shop_ads_fb");
        C2O5 c2o564 = new C2O5("IN_APP_WEBVIEWER_PURCHASE", 145, "in_app_webviewer_purchase");
        C2O5 c2o565 = new C2O5("IG_NMOR_DONATION_P4P", 146, "ig_nmor_donation_p4p");
        C2O5 c2o566 = new C2O5("IG_NMOR_P2B", 147, "ig_nmor_p2b");
        C2O5 c2o567 = new C2O5("IG_NMOR_SHOPPING", 148, "ig_nmor_shopping");
        A0F = c2o567;
        C2O5 c2o568 = new C2O5("IG_NMOR_SHOPPING_ONBOARDING", 149, "ig_nmor_shopping_onboarding");
        C2O5 c2o569 = new C2O5("IG_NMOR_SHOP_ADS", 150, "nmor_shop_ads_ig");
        C2O5 c2o570 = new C2O5("IG_MOR_DONATIONS", 151, "ig_mor_donations");
        C2O5 c2o571 = new C2O5("IAB_AUTOFILL", 152, "iab_autofill");
        C2O5 c2o572 = new C2O5("IAB_AUTOFILL_MIGRATION", 153, "iab_autofill_migration");
        A04 = c2o572;
        C2O5 c2o573 = new C2O5("IAB_AUTOFILL_CROSS_APP", 154, "iab_autofill_cross_app");
        C2O5 c2o574 = new C2O5("IAB_AUTOFILL_CROSS_APP_MIGRATION", 155, "iab_autofill_cross_app_migration");
        C2O5 c2o575 = new C2O5("IAB_AUTOFILL_BINDING_UPDATER", 156, "iab_autofill_binding_updater");
        C2O5 c2o576 = new C2O5("IAB_AUTOFILL_SILENT_BINDING", 157, "iab_autofill_silent_binding");
        C2O5 c2o577 = new C2O5("IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", 158, "iab_autofill_unbound_card_trusted_device_chain");
        A05 = c2o577;
        System.arraycopy(new C2O5[]{c2o554, c2o555, c2o556, c2o557, c2o558, c2o559, c2o560, c2o561, c2o562, c2o563, c2o564, c2o565, c2o566, c2o567, c2o568, c2o569, c2o570, c2o571, c2o572, c2o573, c2o574, c2o575, c2o576, c2o577, new C2O5("CONNECT_VIA_IAW", 159, "connect_via_iaw"), new C2O5("NMOR_OFFSITE_SHOPPING", 160, "nmor_offsite_shopping"), new C2O5("META_CHECKOUT_SDK", 161, "meta_checkout_sdk")}, 0, c2o5Arr, 135, 27);
        System.arraycopy(new C2O5[]{new C2O5("FBPAY_CARD_TOKENIZATION", 162, "fbpay_card_tokenization"), new C2O5("CONTACTLESS_PAYMENT", 163, "contactless_payment"), new C2O5("NMOR_INSTAGRAM_P2B", 164, "nmor_instagram_p2b"), new C2O5("DUMMY_FIRST_PARTY_V2", 165, "dummy_first_party_v2"), new C2O5("DUMMY_THIRD_PARTY_V2", 166, "dummy_third_party_v2"), new C2O5("SOFT_DESCRIPTOR_AUTH", 167, "soft_descriptor_auth"), new C2O5("AD_PUBLISHER", 168, "ad_publisher"), new C2O5("ADS_MANAGER", 169, "ads_manager"), new C2O5("SIGMA", AbstractC62862SUj.MAX_FACTORIAL, "sigma"), new C2O5("FRAUD_CHECK", 171, "fraud_check"), new C2O5("SHOPIFY_API", 172, "shopify_api"), new C2O5("PAYMENTS_API_UNKNOWN_PRODUCT", 173, "payments_api_unknown_product"), new C2O5("FINANCIAL_SERVICES", 174, "financial_services"), new C2O5("INSTAGRAM_P2M", 175, "instagram_p2m"), new C2O5("DIGITAL_COLLECTIBLES", 176, "digital_collectibles"), new C2O5("IG_DIGITAL_COLLECTIBLES", 177, "ig_digital_collectibles"), new C2O5("FB_DIGITAL_COLLECTIBLES", 178, "fb_digital_collectibles"), new C2O5("IG_MINTING", 179, "ig_minting"), new C2O5("FB_MINTING", 180, "fb_minting"), new C2O5("IG_DIGITAL_COLLECTIBLES_PAYMENTS", 181, "ig_digital_collectibles_payments"), new C2O5("FB_DIGITAL_COLLECTIBLES_PAYMENTS", 182, "fb_digital_collectibles_payments"), new C2O5("BILLING", 183, "billing"), new C2O5("BILLING_HUB", 184, "billing_hub"), new C2O5("BILLING_WIZARD", 185, "billing_wizard"), new C2O5("CREATORS_AS_MARKETER_AFFILIATE", 186, "cam_affiliate"), new C2O5("CREATOR_MARKETPLACE", 187, "creator marketplace"), new C2O5("META_REWARD", 188, "meta_reward")}, 0, c2o5Arr, 162, 27);
        C2O5 c2o578 = new C2O5("REWARDS_CENTER", 189, "rewards_center");
        C2O5 c2o579 = new C2O5("PAYOUT_CONSUMER", 190, "payout_consumer");
        C2O5 c2o580 = new C2O5("LITE_CHECKOUT", 191, "lite_checkout");
        A0G = c2o580;
        C2O5 c2o581 = new C2O5("MESSENGER_BUSINESS_MESSAGING_API", 192, "messenger_business_messaging_api");
        C2O5 c2o582 = new C2O5("AURORA", 193, "aurora");
        C2O5 c2o583 = new C2O5("CARRIER_MONETIZATION", 194, "carrier_monetization");
        C2O5 c2o584 = new C2O5("AGE_VERIFICATION_CCV", 195, "age_verification_ccv");
        C2O5 c2o585 = new C2O5("TRUST_BINDING", 196, "trust_binding");
        A0J = c2o585;
        System.arraycopy(new C2O5[]{c2o578, c2o579, c2o580, c2o581, c2o582, c2o583, c2o584, c2o585, new C2O5("TRUST_PROFILE", 197, "trust_profile"), new C2O5("OFFSITE_ACCT_LINKING_PAYPAL", 198, "offsite_acct_linking_paypal")}, 0, c2o5Arr, 189, 10);
        A01 = c2o5Arr;
    }

    public static C2O5 valueOf(String str) {
        return (C2O5) Enum.valueOf(C2O5.class, str);
    }

    public static C2O5[] values() {
        return (C2O5[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public C2O5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
