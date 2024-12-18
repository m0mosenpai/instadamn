package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hif, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39650Hif implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC39650Hif[] A01;
    public static final EnumC39650Hif A02;
    public static final EnumC39650Hif A03;
    public static final EnumC39650Hif A04;
    public static final EnumC39650Hif A05;
    public static final EnumC39650Hif A06;
    public static final EnumC39650Hif A07;
    public static final EnumC39650Hif A08;
    public static final EnumC39650Hif A09;
    public static final EnumC39650Hif A0A;
    public static final EnumC39650Hif A0B;
    public static final EnumC39650Hif A0C;
    public static final EnumC39650Hif A0D;
    public static final EnumC39650Hif A0E;
    public static final EnumC39650Hif A0F;
    public static final EnumC39650Hif A0G;
    public static final EnumC39650Hif A0H;
    public static final EnumC39650Hif A0I;
    public final String A00;

    static {
        EnumC39650Hif[] enumC39650HifArr = new EnumC39650Hif[136];
        EnumC39650Hif A00 = A00("ABOUT_THIS_SHOP", "about_this_shop", 0);
        EnumC39650Hif A002 = A00("AD", "ad", 1);
        EnumC39650Hif A003 = A00("ADD_TO_CART_BOTTOM_SHEET", "add_to_cart_bottom_sheet", 2);
        EnumC39650Hif A004 = A00("AFFILIATE_MESSAGE_DIALOG", "affiliate_message_dialog", 3);
        EnumC39650Hif A005 = A00("AFFILIATE_MESSAGE_SENT_ERROR_DIALOG", "affiliate_message_sent_error_dialog", 4);
        EnumC39650Hif A006 = A00("AFFILIATE_MESSAGE_SENT_SUCCESS_DIALOG", "affiliate_message_sent_success_dialog", 5);
        EnumC39650Hif A007 = A00("ANSWER", "answer", 6);
        EnumC39650Hif A008 = A00("BANNER", "banner", 7);
        EnumC39650Hif A009 = A00("BOTTOM_SHEET", "bottom_sheet", 8);
        A02 = A009;
        EnumC39650Hif A0010 = A00("BUNDLING_PIVOT", "bundling_pivot", 9);
        EnumC39650Hif A0011 = A00("BUY_AGAIN", "buy_again", 10);
        EnumC39650Hif A0012 = A00("CAROUSEL", "carousel", 11);
        EnumC39650Hif A0013 = A00("CART_CHECKOUT", "cart_checkout", 12);
        EnumC39650Hif A0014 = A00("CART_ITEM", "cart_item", 13);
        A03 = A0014;
        System.arraycopy(new EnumC39650Hif[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A00("CART_ITEMS", "cart_items", 14), A00("CART_RECOMMENDATION", "cart_recommendation", 15), A00("COLLECTION", "collection", 16), A00("COMMERCE_PROFILE", "commerce_profile", 17), A00("COMMUNITY_MEDIA", "community_media", 18), A00("COMMUNITY_QUESTIONS", "community_questions", 19), A00("CONTACT_INFO", "contact_info", 20), A00("EDIT_CART_CTA", "edit_cart_cta", 21), A00("EMAIL_SIGN_UP", "email_sign_up", 22), A00("EMPTY_CART", "empty_cart", 23), A00("EMPTY_WISHLIST", "empty_wishlist", 24), A00("ESCAPE_HATCH", "escape_hatch", 25), A00("EXPLORE_SHOPS", "explore_shops", 26)}, 0, enumC39650HifArr, 0, 27);
        EnumC39650Hif A0015 = A00("FAQ", "faq", 27);
        EnumC39650Hif A0016 = A00("FEATURED_COLLECTION", "featured_collection", 28);
        EnumC39650Hif A0017 = A00("FEATURED_PRODUCT", "featured_product", 29);
        EnumC39650Hif A0018 = A00("FINITE_PRODUCT_GRID", "finite_product_grid", 30);
        EnumC39650Hif A0019 = A00("GIFTING_PRODUCTS", "gifting_products", 31);
        EnumC39650Hif A0020 = A00("HEADER", "header", 32);
        EnumC39650Hif A0021 = A00("HERO_CAROUSEL", "hero_carousel", 33);
        EnumC39650Hif A0022 = A00("HOISTED_PDP", "hoisted_pdp", 34);
        EnumC39650Hif A0023 = A00("IN_THIS_MEDIA", "in_this_media", 35);
        EnumC39650Hif A0024 = A00("INCENTIVE_BANNER", "incentive_banner", 36);
        EnumC39650Hif A0025 = A00("INFINITE_PRODUCT_GRID", "infinite_product_grid", 37);
        EnumC39650Hif A0026 = A00("LIKED_POSTS", "liked_posts", 38);
        EnumC39650Hif A0027 = A00("LIVE_SHOPPING_VIDEOS", "live_shopping_videos", 39);
        EnumC39650Hif A0028 = A00("MARKETPLACE_MODULE", "marketplace_module", 40);
        EnumC39650Hif A0029 = A00("MENU_BOTTOMSHEET", "menu_bottomsheet", 41);
        A04 = A0029;
        EnumC39650Hif A0030 = A00("MERCHANT_INFO", "merchant_info", 42);
        EnumC39650Hif A0031 = A00("MORE_FROM_OTHER_SHOPS_PIVOT", "more_from_other_shops_pivot", 43);
        EnumC39650Hif A0032 = A00("MORE_FROM_THIS_SHOP", "more_from_this_shop", 44);
        EnumC39650Hif A0033 = A00("MORE_FROM_THIS_SHOP_PIVOT", "more_from_this_shop_pivot", 45);
        EnumC39650Hif A0034 = A00("MULTI_PRODUCT_VARIANT_SELECTOR", "multi_product_variant_selector", 46);
        EnumC39650Hif A0035 = A00("NAVIGATION_BAR", "navigation_bar", 47);
        A05 = A0035;
        EnumC39650Hif A0036 = A00("NETEGO", "netego", 48);
        EnumC39650Hif A0037 = A00("NO_RESULT", "no_result", 49);
        EnumC39650Hif A0038 = A00("NOTIFICATION_ROW", "notification_row", 50);
        A06 = A0038;
        System.arraycopy(new EnumC39650Hif[]{A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A00("OFFER_AVAILABLE_PIVOT", "offer_available_pivot", 51), A00(PaymentDetailChangeTypes$Companion.OFFERS, "offers", 52), A00("ORDER_CANCELLATION_DETAILS", "order_cancellation_details", 53)}, 0, enumC39650HifArr, 27, 27);
        EnumC39650Hif A0039 = A00("ORDER_DETAILS", "order_details", 54);
        EnumC39650Hif A0040 = A00("ORDER_LIST", "order_list", 55);
        EnumC39650Hif A0041 = A00("ORDER_SUPPORT", "order_support", 56);
        EnumC39650Hif A0042 = A00("PAGE_PRODUCTS_FOR_YOU_QP", "page_products_for_you_qp", 57);
        EnumC39650Hif A0043 = A00("PAYMENT_INFO", "payment_info", 58);
        EnumC39650Hif A0044 = A00("PDP_AFFILIATE_DETAILS", "pdp_affiliate_details", 59);
        EnumC39650Hif A0045 = A00("PHOTO", "photo", 60);
        EnumC39650Hif A0046 = A00("PILL_BAR", "pill_bar", 61);
        EnumC39650Hif A0047 = A00("PIVOTS_GLIMMER", "pivots_glimmer", 62);
        EnumC39650Hif A0048 = A00("POST", "post", 63);
        A07 = A0048;
        EnumC39650Hif A0049 = A00("PRICING", "pricing", 64);
        EnumC39650Hif A0050 = A00("PRIMARY_CTA", "primary_cta", 65);
        EnumC39650Hif A0051 = A00("PRODUCER_REQUEST", "producer_request", 66);
        EnumC39650Hif A0052 = A00("PRODUCT_ARTS_LABELS", "product_arts_labels", 67);
        EnumC39650Hif A0053 = A00("PRODUCT_ATTRIBUTES", "product_attributes", 68);
        EnumC39650Hif A0054 = A00("PRODUCT_FOR_YOU", "product_for_you", 69);
        EnumC39650Hif A0055 = A00("PRODUCT_INFORMATION", "product_info", 70);
        EnumC39650Hif A0056 = A00("PRODUCT_MATCH_POST", "product_match_post", 71);
        EnumC39650Hif A0057 = A00("PRODUCT_RETURN_DETAILS", "product_return_details", 72);
        EnumC39650Hif A0058 = A00("PRODUCT_TILE", "product_tile", 73);
        A08 = A0058;
        System.arraycopy(new EnumC39650Hif[]{A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A00("PRODUCTS_IN_SHOP", "products_in_shop", 74), A00("PROMO_CODES", "promo_codes", 75), A00("PROMOTION_BANNER", "promotion_banner", 76), A00("PURCHASE_PROTECTION_LINK", "purchase_protection_link", 77), A00("QUESTION", "question", 78), A00("QUESTIONS_AND_ANSWERS", "questions_and_answers", 79), A00("RATINGS_AND_REVIEWS", "ratings_and_reviews", 80)}, 0, enumC39650HifArr, 54, 27);
        EnumC39650Hif A0059 = A00("RECENTLY_VIEWED", "recently_viewed", 81);
        A09 = A0059;
        EnumC39650Hif A0060 = A00("RECOMMENDED_PRODUCTS", "recommended_products", 82);
        EnumC39650Hif A0061 = A00("RECOMMENDED_SHOPS", "recommended_shops", 83);
        EnumC39650Hif A0062 = A00("RECON_ITEM", "recon_item", 84);
        EnumC39650Hif A0063 = A00("RECONSIDERATION_HSCROLL", "reconsideration_hscroll", 85);
        EnumC39650Hif A0064 = A00("RECONSIDERATION_MODULE", "reconsideration_module", 86);
        A0A = A0064;
        EnumC39650Hif A0065 = A00("RECONSIDERATION_MULTI_ADS_TRAY", "reconsideration_multi_ads_tray", 87);
        EnumC39650Hif A0066 = A00("REELS_HSCROLL", "reels_hscroll", 88);
        EnumC39650Hif A0067 = A00("RELATED_ITEMS_PIVOT", "related_items_pivot", 89);
        EnumC39650Hif A0068 = A00("SAVE_TO_COLLECTION_BOTTOM_SHEET", "save_to_collection_bottom_sheet", 90);
        A0C = A0068;
        EnumC39650Hif A0069 = A00("SAVE_TOAST", "save_toast", 91);
        EnumC39650Hif A0070 = A00("SAVED_ITEMS", "saved_items", 92);
        A0B = A0070;
        EnumC39650Hif A0071 = A00("SAVED_POSTS", "saved_posts", 93);
        EnumC39650Hif A0072 = A00("SECTION", "section", 94);
        A0D = A0072;
        EnumC39650Hif A0073 = A00("SEGMENTED_TAB_NAVIGATION", "segmented_tab_navigation", 95);
        EnumC39650Hif A0074 = A00("SELECT_PAYMENT_METHOD", "select_payment_method", 96);
        EnumC39650Hif A0075 = A00("SELLER_FUNDED_PROMOTION", "seller_funded_promotion", 97);
        EnumC39650Hif A0076 = A00("SELLER_YOU_FOLLOW_STORIES", "seller_you_follow_stories", 98);
        EnumC39650Hif A0077 = A00("SERP_TAB", "serp_tab", 99);
        EnumC39650Hif A0078 = A00("SHARE_MENUS", "share_menu", 100);
        EnumC39650Hif A0079 = A00(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS, "shipping_address", 101);
        EnumC39650Hif A0080 = A00("SHIPPING_AND_RETURNS", "shipping_and_returns", 102);
        EnumC39650Hif A0081 = A00("SHIPPING_INFO", "shipping_info", 103);
        EnumC39650Hif A0082 = A00("SHOP_AND_DISCOVER_BOTTOMSHEET", "shop_and_discover_bottomsheet", 104);
        EnumC39650Hif A0083 = A00("SHOP_AT_A_GLANCE", "shop_at_a_glance", 105);
        EnumC39650Hif A0084 = A00("SHOP_MODULE", "shop_module", 106);
        EnumC39650Hif A0085 = A00("SHOP_SELECTOR", "shop_selector", 107);
        System.arraycopy(new EnumC39650Hif[]{A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081, A0082, A0083, A0084, A0085}, 0, enumC39650HifArr, 81, 27);
        A0E = A0085;
        EnumC39650Hif A0086 = A00("SHOPS_ADS_RECONSIDERATION_HUB", "shop_ads_reconsideration_hub", 108);
        EnumC39650Hif A0087 = A00("SHOPS_ADS_RECONSIDERATION_NOTIFICATION", "shop_ads_reconsideration_notification", 109);
        EnumC39650Hif A0088 = A00("SHOPS_ADS_RECONSIDERATION_QP", "shop_ads_reconsideration_qp", 110);
        EnumC39650Hif A0089 = A00("SHOPS_YOU_FOLLOW", "shops_you_follow", 111);
        EnumC39650Hif A0090 = A00("SHOPS_YOU_FOLLOW_STORIES", "shops_you_follow_stories", 112);
        EnumC39650Hif A0091 = A00("SHOWCASE", "showcase", 113);
        EnumC39650Hif A0092 = A00("SIMILAR_ITEMS", "similar_items", 114);
        EnumC39650Hif A0093 = A00("SIMILAR_PRODUCTS", "similar_products", 115);
        EnumC39650Hif A0094 = A00("SIZE_CHART", "size_chart", 116);
        EnumC39650Hif A0095 = A00("SLIM_DISCLAIMER", "slim_disclaimer", 117);
        EnumC39650Hif A0096 = A00("SOCIAL_MOST_LOVED_AUTO_PIVOT", "social_most_loved_auto_pivot", 118);
        EnumC39650Hif A0097 = A00("SOCIAL_TOP_SELLERS_AUTO_PIVOT", "social_top_sellers_auto_pivot", 119);
        EnumC39650Hif A0098 = A00("SORT_AND_FILTER", "sort_and_filter", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        EnumC39650Hif A0099 = A00("SSFY", "sale_stories_for_you", 121);
        EnumC39650Hif A00100 = A00("STICKY_CTA", "sticky_cta", 122);
        EnumC39650Hif A00101 = A00("STORY_TRAY", "story_tray", 123);
        EnumC39650Hif A00102 = A00("STORYTELLING_POST", "storytelling_post", 124);
        EnumC39650Hif A00103 = A00("TAGGED_MEDIA", "tagged_media", 125);
        A0F = A00103;
        EnumC39650Hif A00104 = A00("TAGGED_POST", "tagged_post", 126);
        A0G = A00104;
        EnumC39650Hif A00105 = A00("TAGGED_POST_MODULE", "tagged_post_module", StringTreeSet.MAX_SYMBOL_COUNT);
        EnumC39650Hif A00106 = A00("TOAST", "toast", 128);
        A0H = A00106;
        EnumC39650Hif A00107 = A00("TODAYS_PICKS", "todays_picks", 129);
        EnumC39650Hif A00108 = A00("TOP_SECTION", "top_section", 130);
        EnumC39650Hif A00109 = A00("UNKNOWN", "unknown", 131);
        A0I = A00109;
        System.arraycopy(new EnumC39650Hif[]{A0086, A0087, A0088, A0089, A0090, A0091, A0092, A0093, A0094, A0095, A0096, A0097, A0098, A0099, A00100, A00101, A00102, A00103, A00104, A00105, A00106, A00107, A00108, A00109, A00("VARIANT_BOTTOMSHEET", "variant_bottomsheet", 132), A00("VARIANT_SELECTOR_INLINE", "variant_selector_inline", 133), A00("VISUAL_SEARCH_POST", "visual_search_post", 134)}, 0, enumC39650HifArr, 108, 27);
        System.arraycopy(new EnumC39650Hif[]{A00("YOU_MAY_ALSO_LIKE", "you_may_also_like", 135)}, 0, enumC39650HifArr, 135, 1);
        A01 = enumC39650HifArr;
    }

    public static EnumC39650Hif A00(String str, String str2, int i) {
        return new EnumC39650Hif(str, i, str2);
    }

    public static EnumC39650Hif valueOf(String str) {
        return (EnumC39650Hif) Enum.valueOf(EnumC39650Hif.class, str);
    }

    public static EnumC39650Hif[] values() {
        return (EnumC39650Hif[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public EnumC39650Hif(String str, int i, String str2) {
        this.A00 = str2;
    }
}
