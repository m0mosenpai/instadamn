package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39651Hig implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC39651Hig[] A01;
    public static final EnumC39651Hig A02;
    public static final EnumC39651Hig A03;
    public static final EnumC39651Hig A04;
    public static final EnumC39651Hig A05;
    public static final EnumC39651Hig A06;
    public static final EnumC39651Hig A07;
    public static final EnumC39651Hig A08;
    public static final EnumC39651Hig A09;
    public static final EnumC39651Hig A0A;
    public static final EnumC39651Hig A0B;
    public static final EnumC39651Hig A0C;
    public static final EnumC39651Hig A0D;
    public static final EnumC39651Hig A0E;
    public static final EnumC39651Hig A0F;
    public static final EnumC39651Hig A0G;
    public static final EnumC39651Hig A0H;
    public static final EnumC39651Hig A0I;
    public static final EnumC39651Hig A0J;
    public static final EnumC39651Hig A0K;
    public static final EnumC39651Hig A0L;
    public static final EnumC39651Hig A0M;
    public final String A00;

    static {
        EnumC39651Hig[] enumC39651HigArr = new EnumC39651Hig[299];
        EnumC39651Hig A00 = A00("AD", "ad", 0);
        EnumC39651Hig A002 = A00("ADD", "add", 1);
        EnumC39651Hig A003 = A00("ADD_CARD_BUTTON", "add_card_button", 2);
        EnumC39651Hig A004 = A00("ADD_ITEMS", "add_items", 3);
        EnumC39651Hig A005 = A00("ADD_PAYPAL_BUTTON", "add_paypal_button", 4);
        EnumC39651Hig A006 = A00("ADD_REVIEW_BUTTON", "add_review_button", 5);
        EnumC39651Hig A007 = A00("ADD_REVIEW_ICON", "add_review_icon", 6);
        EnumC39651Hig A008 = A00("ADD_SHIPPING_ADDRESS_BUTTON", "add_shipping_address_button", 7);
        EnumC39651Hig A009 = A00("ADD_SHOP_PAY_BUTTON", "add_shop_pay_button", 8);
        EnumC39651Hig A0010 = A00("ADD_TO_CART_BOTTOM_SHEET_TITLE", "add_to_cart_bottom_sheet_title", 9);
        EnumC39651Hig A0011 = A00("ADD_TO_CART_BUTTON", "add_to_cart_button", 10);
        A02 = A0011;
        EnumC39651Hig A0012 = A00("ADDRESS_LINE_1", "address_line_1", 11);
        EnumC39651Hig A0013 = A00("AMPLIFIED_PROMOTIONS_BANNER", "amplified_promotions_banner", 12);
        EnumC39651Hig A0014 = A00("ANCHOR_LINK_TAB", "anchor_link_tab", 13);
        EnumC39651Hig A0015 = A00("APM_BUTTON", "apm_button", 14);
        EnumC39651Hig A0016 = A00("APM_LOGOS", "apm_logos", 15);
        EnumC39651Hig A0017 = A00("APPROVE_BUTTON", "approve_button", 16);
        EnumC39651Hig A0018 = A00("ASK_QUESTION_CTA", "ask_question_cta", 17);
        EnumC39651Hig A0019 = A00("BACK_BUTTON", "back_button", 18);
        A03 = A0019;
        EnumC39651Hig A0020 = A00("BROWSE_BUTTON", "browse_button", 19);
        EnumC39651Hig A0021 = A00("BROWSE_OPTION", "browse_option", 20);
        EnumC39651Hig A0022 = A00("BULK_SAVE_BUTTON", "bulk_save_button", 21);
        A04 = A0022;
        EnumC39651Hig A0023 = A00("BULK_UNSAVE_BUTTON", "bulk_unsave_button", 22);
        A05 = A0023;
        System.arraycopy(new EnumC39651Hig[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A00("CALL_TO_ACTION", "call_to_action", 23), A00("CANCEL_ORDER_BUTTON", "cancel_order_button", 24), A00("CANCEL_ORDER_CONFIRM_BUTTON", "cancel_order_confirm_button", 25), A00("CANCELLATION_REASON_SELECTION", "cancellation_reason_selection", 26)}, 0, enumC39651HigArr, 0, 27);
        EnumC39651Hig A0024 = A00("CARD_BUBBLE", "card_bubble", 27);
        EnumC39651Hig A0025 = A00("CARD_NUMBER_INPUT", "card_number_input", 28);
        EnumC39651Hig A0026 = A00("CAROUSEL", "carousel", 29);
        EnumC39651Hig A0027 = A00("CAROUSEL_ITEM", "carousel_item", 30);
        EnumC39651Hig A0028 = A00("CAROUSEL_ITEM_PRODUCT_TILE", "carousel_item_product_tile", 31);
        EnumC39651Hig A0029 = A00("CAROUSEL_ITEM_PRODUCT_TILE_SAVE_BUTTON", "carousel_item_product_save_button", 32);
        EnumC39651Hig A0030 = A00("CAROUSEL_ITEM_VIEW_PRODUCT", "carousel_item_view_product", 33);
        EnumC39651Hig A0031 = A00("CART_BUTTON", "cart_button", 34);
        A06 = A0031;
        EnumC39651Hig A0032 = A00("CATEGORIES_PILL", "categories_pill", 35);
        EnumC39651Hig A0033 = A00("CHECKOUT_NOW_BUTTON", "checkout_now_button", 36);
        EnumC39651Hig A0034 = A00("CHECKOUT_OFFER_CONFIRM_BUTTON", "checkout_offer_confirm_button", 37);
        EnumC39651Hig A0035 = A00("CHECKOUT_ON_WEBSITE_BUTTON", "checkout_on_website_button", 38);
        EnumC39651Hig A0036 = A00("CLOSE_BUTTON", "close_button", 39);
        EnumC39651Hig A0037 = A00("COLLECTION_BUTTON", "collection_button", 40);
        EnumC39651Hig A0038 = A00("COLLECTION_CARD", "collection_card", 41);
        EnumC39651Hig A0039 = A00("COMMENT_BUTTON", "comment_button", 42);
        EnumC39651Hig A0040 = A00("CONTINUE_BUTTON", "continue_button", 43);
        EnumC39651Hig A0041 = A00("CONTINUE_SHOPPING_BUTTON", "continue_shopping_button", 44);
        EnumC39651Hig A0042 = A00("COPY_LINK_BUTTON", "copy_link_button", 45);
        EnumC39651Hig A0043 = A00("COPY_SHOP_URL", "copy_shop_url", 46);
        EnumC39651Hig A0044 = A00("CREATE_ALERT_BUTTON", "create_alert_button", 47);
        EnumC39651Hig A0045 = A00("CREATE_LISTING_BUTTON", "create_listing_button", 48);
        EnumC39651Hig A0046 = A00("CTA_BAR", "cta_bar", 49);
        A07 = A0046;
        System.arraycopy(new EnumC39651Hig[]{A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A00("CTA_INSTRUCTIONS", "cta_instructions", 50), A00("CUSTOMISE_SHOP", "customise_shop", 51), A00("DECLINE_BUTTON", "decline_button", 52), A00("DELETE_ALERT_BUTTON", "delete_alert_button", 53)}, 0, enumC39651HigArr, 27, 27);
        System.arraycopy(new EnumC39651Hig[]{A00("DELETE_BUTTON", "delete_button", 54), A00("DELIVERY_INFO", "delivery_info", 55), A00("DETAIL_INFO_ARROW", "detail_info_arrow", 56), A00("DISCARD_BUTTON", "discard_button", 57), A00("DONE_BUTTON", "done_button", 58), A00("EDIT", "edit", 59), A00("EDIT_BUTTON", "edit_button", 60), A00("EDIT_CART_BUTTON", "edit_cart_button", 61), A00("EMAIL_INPUT", "email_input", 62), A00("EMAIL_SIGN_UP_TOGGLE", "email_sign_up_toggle", 63), A00("EMPTY_CART", "empty_cart", 64), A00("ERROR_MESSAGE", "error_message", 65), A00("FILTER_BUTTON", "filter_button", 66), A00("FIND_YOUR_SIZE_BUTTON", "find_your_size_button", 67), A00("FIXED_PRICING_SECTION", "fixed_pricing_section", 68), A00("FIXED_PRICING_SECTION_WRAPPER", "fixed_pricing_section_wrapper", 69), A00("FLOATING_CART", "floating_cart", 70), A00("FLOATY_BANNER", "floaty_banner", 71), A00("FOLLOW_BUTTON", "follow_button", 72), A00("FOLLOW_SELLER_BUTTON", "follow_seller_button", 73), A00("FOOTER_PROMOTION", "footer_promotion", 74), A00("FULL_NAME_INPUT", "full_name_input", 75), A00("FULL_PRICING", "full_pricing", 76), A00("GET_HELP_BUTTON", "get_help_button", 77), A00("GET_NOTIFIED_BUTTON", "get_notified_button", 78), A00("GET_NOTIFIED_TOOLTIP", "get_notified_tooltip", 79), A00("GROUP_STICKER", "group_sticker", 80)}, 0, enumC39651HigArr, 54, 27);
        System.arraycopy(new EnumC39651Hig[]{A00("HAMBURGER_MENU", "hamburger_menu", 81), A00("HEADER", "header", 82), A00("HERO_CAROUSEL", "hero_carousel", 83), A00("HIDE_BUTTON", "hide_button", 84), A00("HOISTED_PDP", "hoisted_pdp", 85), A00("HOISTED_STORY", "hoisted_story", 86), A00("ICONOGRAPHY_ROW", "iconography_row", 87), A00("KEYBOARD_RETURN", "keyboard_return", 88), A00("LIGHTBOX_FOOTER", "lightbox_footer", 89), A00("LIGHTBOX_FOOTER_CTA", "lightbox_footer_cta", 90), A00("LIGHTBOX_FOOTER_MODEL_INFO", "lightbox_footer_model_info", 91), A00("LIGHTBOX_SCREEN", "lightbox_screen", 92), A00("LIGHTBOX_SCREEN_IG_HANDLE", "lightbox_screen_ig_handle", 93), A00("LIKE_BUTTON", "like_button", 94), A00("LINK_OUT_BUTTON", "link_out_button", 95), A00("LIVE_SHOPPING_VIDEO", "live_shopping_video", 96), A00("LOADING_SHIMMER", "loading_shimmer", 97), A00("MAKE_AN_OFFER_BUTTON", "make_an_offer_button", 98), A00("MAP", "map", 99), A00("MARKETPLACE_BUTTON", "marketplace_button", 100), A00("MARKETPLACE_HELP_BUTTON", "marketplace_help_button", 101), A00("MEDIA_GRID_BUTTON", "media_grid_button", 102), A00("MENTION_IN_CAPTION", "mention_in_caption", 103), A00("MENU_BUTTON", "menu_button", 104), A00("MENU_ITEM", "menu_item", 105), A00("MENU_ITEM_TOGGLE", "menu_item_toggle", 106), A00("MERCHANT_CART_SECTION", "merchant_cart_section", 107)}, 0, enumC39651HigArr, 81, 27);
        EnumC39651Hig A0047 = A00("MERCHANT_PROMOTION", "merchant_promotion", 108);
        EnumC39651Hig A0048 = A00("MESSAGE_SELLER_BUTTON", "message_seller_button", 109);
        EnumC39651Hig A0049 = A00("MINI_UGC_VIEW", "mini_ugc_view", 110);
        EnumC39651Hig A0050 = A00("MORE_OPTIONS", "more_options", 111);
        EnumC39651Hig A0051 = A00("MORE_SHARE_OPTIONS_BUTTON", "more_share_options_button", 112);
        EnumC39651Hig A0052 = A00("MULTI_PRODUCT_VARIANT_SELECTOR_CONTENT", "multi_product_variant_selector_content", 113);
        EnumC39651Hig A0053 = A00("NAVIGATION_ROW", "navigation_row", 114);
        EnumC39651Hig A0054 = A00("NEXT_BUTTON", "next_button", 115);
        EnumC39651Hig A0055 = A00("NO_BUTTON", "no_button", 116);
        EnumC39651Hig A0056 = A00("NO_RESULT", "no_result", 117);
        EnumC39651Hig A0057 = A00("NOTIFICATION_ROW", "notification_row", 118);
        EnumC39651Hig A0058 = A00("NULL", "null", 119);
        A08 = A0058;
        EnumC39651Hig A0059 = A00("NUX_TOOLTIP", "nux_tooltip", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        A09 = A0059;
        System.arraycopy(new EnumC39651Hig[]{A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0059, A00("ONSITE_CHECKOUT_BOTTOMSHEET", "onsite_checkout_bottomsheet", 121), A00("OPTIONS", "options", 122), A00("ORDER_ITEM", "order_item", 123), A00("ORDERS_AND_PAYMENTS_BUTTON", "orders_and_payments_button", 124), A00("ORDERS_BUTTON", "orders_button", 125), A00("OTHER_CARTS_PIVOT", "other_carts_pivot", 126), A00("PAY_NOW_BUTTON", "pay_now_button", StringTreeSet.MAX_SYMBOL_COUNT), A00("PAYMENT_SETTINGS_BUTTON", "payment_settings_button", 128), A00("PAYPAL_BUBBLE", "paypal_bubble", 129), A00("PHOTO", "photo", 130), A00("PHOTO_CAROUSEL", "photo_carousel", 131), A00("PINNED_PRODUCT_CARD", "pinned_product_card", 132), A00("PINNED_PRODUCT_CARD_CTA", "pinned_product_card_cta", 133), A00("PIVOT_ADD_ALL_TO_CART_CTA", "pivot_add_all_to_cart_cta", 134)}, 0, enumC39651HigArr, 108, 27);
        EnumC39651Hig A0060 = A00("PIVOT_CAROUSEL", "pivot_carousel", 135);
        EnumC39651Hig A0061 = A00("PLACE_ORDER_BUTTON", "place_order_button", 136);
        EnumC39651Hig A0062 = A00("POST", "post", 137);
        EnumC39651Hig A0063 = A00("POST_BUTTON", "post_button", 138);
        EnumC39651Hig A0064 = A00("POST_CAPTION", "post_caption", 139);
        EnumC39651Hig A0065 = A00("PRIMARY_IMAGE", "primary_image", 140);
        EnumC39651Hig A0066 = A00("PRODASH_MENU_ITEM", "prodash_menu_item", 141);
        EnumC39651Hig A0067 = A00("PRODUCT_ARTS_LABEL", "product_arts_label", 142);
        EnumC39651Hig A0068 = A00("PRODUCT_CARD", "product_card", 143);
        EnumC39651Hig A0069 = A00("PRODUCT_CUE", "product_cue", 144);
        EnumC39651Hig A0070 = A00("PRODUCT_DESCRIPTION", "product_description", 145);
        EnumC39651Hig A0071 = A00("PRODUCT_DESCRIPTION_IMAGE", "product_description_image", 146);
        EnumC39651Hig A0072 = A00("PRODUCT_FOR_YOU", "product_for_you", 147);
        EnumC39651Hig A0073 = A00("PRODUCT_FOR_YOU_PRODUCT_TILE", "product_for_you_product_tile", 148);
        EnumC39651Hig A0074 = A00("PRODUCT_FOR_YOU_SAVE_BUTTON", "product_for_you_save_button", 149);
        EnumC39651Hig A0075 = A00("PRODUCT_FOR_YOU_SEE_ALL_BUTTON", "product_for_you_see_all_button", 150);
        EnumC39651Hig A0076 = A00("PRODUCT_FOR_YOU_UNSAVE_BUTTON", "product_for_you_unsave_button", 151);
        EnumC39651Hig A0077 = A00("PRODUCT_IMAGE_LABEL", "product_image_label", 152);
        EnumC39651Hig A0078 = A00("PRODUCT_ITEM", "product_item", 153);
        A0A = A0078;
        System.arraycopy(new EnumC39651Hig[]{A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A00("PRODUCT_ITEM_COLOR_SWATCHES", "product_item_color_swatches", 154), A00("PRODUCT_ITEM_MENU", "product_item_menu", 155), A00("PRODUCT_KEYWORDS", "product_keywords", 156), A00("PRODUCT_LINK", "product_link", 157), A00("PRODUCT_NOTIFICATIONS_BUTTON", "product_notifications_button", 158), A00("PRODUCT_PRICE", "product_price", 159), A00("PRODUCT_SIZE", "product_size", 160), A00("PRODUCT_STICKER", "product_sticker", 161)}, 0, enumC39651HigArr, 135, 27);
        EnumC39651Hig A0079 = A00("PRODUCT_TAG", "product_tag", 162);
        A0B = A0079;
        System.arraycopy(new EnumC39651Hig[]{A0079, A00("PRODUCT_TITLE", "product_title", 163), A00("PROFILE_BADGE", "profile_badge", 164), A00("PROMO_CODE_INPUT", "promo_code_input", 165), A00("PROMOTION", "promotion", 166), A00("PURCHASE_PROTECTION_LINK", "purchase_protection_link", 167), A00("QUANTITY_SELECT_BUTTON", "quantity_select_button", 168), A00("QUICK_NAVIGATION_BUTTON", "quick_navigation_button", 169), A00("RANKING_INFO", "ranking_info", AbstractC62862SUj.MAX_FACTORIAL), A00("RATING_STAR", "rating_star", 171), A00("RATINGS_AND_REVIEWS_CARD", "ratings_and_reviews_card", 172), A00("RATINGS_AND_REVIEWS_COMPOSER", "ratings_and_reviews_composer", 173), A00("RECENTLY_VIEWED", "recently_viewed", 174), A00("RECENTLY_VIEWED_PRODUCT_TILE", "recently_viewed_product_tile", 175), A00("RECENTLY_VIEWED_SAVE_BUTTON", "recently_viewed_save_button", 176), A00("RECENTLY_VIEWED_SEE_ALL_BUTTON", "recently_viewed_see_all_button", 177), A00("RECENTLY_VIEWED_UNSAVE_BUTTON", "recently_viewed_unsave_button", 178), A00("RECON_ITEM", "recon_item", 179), A00("REELS_ITEM", "reels_item", 180), A00("RELATED_ITEM", "related_item", 181), A00("REMOVE_BUTTON", "remove_button", 182), A00("REMOVE_FROM_CART_BUTTON", "remove_from_cart_button", 183), A00("REMOVE_VOTE_BUTTON", "remote_vote_button", 184), A00("REPORT_BUTTON", "report_button", 185), A00("REPORT_PRODUCT_BUTTON", "report_product_button", 186), A00("REPORT_SELLER_BUTTON", "report_seller_button", 187), A00("RETURN_CONFIRM_BUTTON", "return_confirm_button", 188)}, 0, enumC39651HigArr, 162, 27);
        EnumC39651Hig A0080 = A00("RETURN_CONTINUE_BUTTON", "return_continue_button", 189);
        EnumC39651Hig A0081 = A00("RETURN_REASON_SELECTION", "return_reason_selection", 190);
        EnumC39651Hig A0082 = A00("REVIEW_MEDIA_HSCROLL", "review_media_hscroll", 191);
        EnumC39651Hig A0083 = A00("ROW", "row", 192);
        A0C = A0083;
        EnumC39651Hig A0084 = A00("SAVE_BUTTON", "save_button", 193);
        A0D = A0084;
        EnumC39651Hig A0085 = A00("SAVED_TAB", "saved_tab", 194);
        EnumC39651Hig A0086 = A00("SEARCH_BUTTON", "search_button", 195);
        EnumC39651Hig A0087 = A00("SEARCH_OPTION", "search_option", 196);
        EnumC39651Hig A0088 = A00("SECTION_EXPAND", "section_expand", 197);
        EnumC39651Hig A0089 = A00("SEE_ALL_BUTTON", "see_all_button", 198);
        A0E = A0089;
        System.arraycopy(new EnumC39651Hig[]{A0080, A0081, A0082, A0083, A0084, A0085, A0086, A0087, A0088, A0089, A00("SEE_ALL_OFFERS", "see_all_offers", 199), A00("SEE_ALL_REVIEWS_BUTTON", "see_all_reviews_button", 200), A00("SEE_ALL_SCREEN", "see_all_screen", 201), A00("SEE_ALL_SCREEN_ITEM", "see_all_screen_item", 202), A00("SEE_DETAILS_BUTTON", "see_details_button", 203), A00("SEE_LESS_BUTTON", "see_less_button", 204), A00("SEE_LISTING_BUTTON", "see_listing_button", 205), A00("SEE_MORE_BUTTON", "see_more_button", 206), A00("SELLER_BADGE", "seller_badge", 207), A00("SELLER_INFO", "seller_info", 208), A00("SELLER_LOGO_BUTTON", "seller_logo_button", 209), A00("SELLER_NAME", "seller_name", 210), A00("SELLER_SOCIAL_CONTEXT", "seller_social_context", 211), A00("SELLING_PILL", "selling_pill", 212), A00("SEND_AFFILIATE_MESSAGE", "send_affiliate_message", 213), A00("SEND_IN_MESSENGER", "send_in_messenger", 214), A00("SHARE_BUTTON", "share_button", 215)}, 0, enumC39651HigArr, 189, 27);
        System.arraycopy(new EnumC39651Hig[]{A00("SHARE_IN_GROUP_BUTTON", "share_in_group_button", 216), A00("SHARE_TO_FRIEND_IN_MESSENGER", "share_to_friend_in_messenger", 217), A00("SHARE_TO_INSTAGRAM_STORY", "share_to_instagram_story", 218), A00("SHARE_TO_MESSENGER_BUTTON", "share_to_messager_button", 219), A00("SHARE_TO_NEWSFEED_BUTTON", "share_to_newsfeed_button", 220), A00("SHARE_TO_STORY", "share_to_story", 221), A00("SHARE_TO_STORY_BUTTON", "share_to_story_button", 222), A00("SHARE_TO_WHATSAPP_BUTTON", "share_to_whatsapp_button", 223), A00(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS, "shipping_address", 224), A00("SHIPPING_ADDRESS_CHECK_BUTTON", "shipping_address_check_button", 225), A00("SHIPPING_TIMEFRAME", "shipping_timeframe", 226), A00("SHOP_ELIGIBLE_PRODUCTS", "shop_eligible_products", 227), A00("SHOP_ITEM", "shop_item", 228), A00("SHOP_PAY_BUBBLE", "shop_pay_bubble", 229), A00("SHOP_TOOLS", "shop_tools", 230), A00("SHOPPING_INDICATOR", "shopping_indicator", 231), A00("SIMILAR_ITEMS", "similar_items", 232), A00("SIMILAR_ITEMS_PRODUCT_TILE", "similar_items_product_tile", 233), A00("SIMILAR_ITEMS_SAVE_BUTTON", "similar_items_save_button", 234), A00("SIMILAR_ITEMS_SEE_ALL_BUTTON", "similar_items_see_all_button", 235), A00("SIMILAR_ITEMS_UNSAVE_BUTTON", "similar_items_unsave_button", 236), A00("SIZE_CALIBRATION", "size_calibration", 237), A00("SIZE_CHART_LINK", "size_chart_link", 238), A00("SORT_AND_FILTER_APPLY", "sort_and_filter_apply", 239), A00("SORT_AND_FILTER_BUTTON", "sort_and_filter_button", 240), A00("SORT_BY_BUTTON", "sort_by_button", 241), A00("START_ITEM_RETURN_BUTTON", "start_item_return_button", 242)}, 0, enumC39651HigArr, 216, 27);
        EnumC39651Hig A0090 = A00("START_SHOPPING_BUTTON", "start_shopping_button", 243);
        EnumC39651Hig A0091 = A00("STICKER", "sticker", 244);
        A0F = A0091;
        EnumC39651Hig A0092 = A00("STOREFRONT_ENTRY", "storefront_entry", 245);
        A0G = A0092;
        EnumC39651Hig A0093 = A00("STORY_CARD", "story_card", 246);
        EnumC39651Hig A0094 = A00("STORY_COLLECTION", "story_collection", 247);
        EnumC39651Hig A0095 = A00("SUBMIT_REVIEW_ATTRIBUTES_BUTTON", "submit_review_attributes_button", 248);
        EnumC39651Hig A0096 = A00("SUBMIT_REVIEW_BUTTON", "submit_review_button", 249);
        EnumC39651Hig A0097 = A00("SUBMIT_SIZE_INFO_BUTTON", "submit_size_info_button", C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
        EnumC39651Hig A0098 = A00("TAGGED_PRODUCT_BUBBLE", "tagged_product_bubble", 251);
        EnumC39651Hig A0099 = A00("TAGGED_SOCIAL_SIGNAL", "tagged_social_signal", 252);
        EnumC39651Hig A00100 = A00("TAGGED_TRUST_SIGNAL_BOTTOM", "tagged_trust_signal_bottom", 253);
        EnumC39651Hig A00101 = A00("TOAST", "toast", 254);
        A0H = A00101;
        EnumC39651Hig A00102 = A00("TOP_SELLING_BANNER", "top_selling_banner", 255);
        EnumC39651Hig A00103 = A00("TRACK_RETURN_LINK", "track_return_link", 256);
        EnumC39651Hig A00104 = A00("UNAVAILABLE_BUTTON", "unavailable_button", 257);
        EnumC39651Hig A00105 = A00("UNAVAILABLE_ITEMS_BANNER", "unavailable_items_banner", 258);
        EnumC39651Hig A00106 = A00("UNDO_ADD_TO_CART_BUTTON", "undo_add_to_cart_button", 259);
        EnumC39651Hig A00107 = A00("UNDO_BUTTON", "undo_button", 260);
        EnumC39651Hig A00108 = A00("UNDO_REMOVE_FROM_CART_BUTTON", "undo_remove_from_cart_button", 261);
        EnumC39651Hig A00109 = A00("UNDO_REMOVE_FROM_WISHLIST_BUTTON", "undo_remove_from_wishlist_button", 262);
        EnumC39651Hig A00110 = A00("UNDO_SAVE_FOR_LATER_FROM_CART_BUTTON", "undo_save_for_later_from_cart_button", 263);
        EnumC39651Hig A00111 = A00("UNFOLLOW_BUTTON", "unfollow_button", 264);
        EnumC39651Hig A00112 = A00("UNHIDE_BUTTON", "unhide_button", 265);
        EnumC39651Hig A00113 = A00("UNIT_TOGGLE", "unit_toggle", 266);
        EnumC39651Hig A00114 = A00("UNKNOWN", "unknown", 267);
        A0I = A00114;
        System.arraycopy(new EnumC39651Hig[]{A0090, A0091, A0092, A0093, A0094, A0095, A0096, A0097, A0098, A0099, A00100, A00101, A00102, A00103, A00104, A00105, A00106, A00107, A00108, A00109, A00110, A00111, A00112, A00113, A00114, A00("UNSAVE_BUTTON", "unsave_button", 268), A00("UPDATE_ITEM_DETAILS", "update_item_details", 269)}, 0, enumC39651HigArr, 243, 27);
        EnumC39651Hig A00115 = A00("UPDATE_QUANTITY_BUTTON", "update_quantity_button", 270);
        EnumC39651Hig A00116 = A00("VARIANT_SELECTOR", "variant_selector", 271);
        EnumC39651Hig A00117 = A00("VIDEO", MediaStreamTrack.VIDEO_TRACK_KIND, 272);
        EnumC39651Hig A00118 = A00("VIEW_AFFILIATE_MESSAGE", "view_affiliate_message", 273);
        EnumC39651Hig A00119 = A00("VIEW_BUSINESS_INFO_BUTTON", "view_business_info_button", 274);
        EnumC39651Hig A00120 = A00("VIEW_CART_BUTTON", "view_cart_button", 275);
        A0J = A00120;
        EnumC39651Hig A00121 = A00("VIEW_OFFER", "view_offer", 276);
        EnumC39651Hig A00122 = A00("VIEW_ORDERS_BUTTON", "view_orders_button", 277);
        EnumC39651Hig A00123 = A00("VIEW_PAYMENTS", "view_payments", 278);
        EnumC39651Hig A00124 = A00("VIEW_POST", "view_post", 279);
        EnumC39651Hig A00125 = A00("VIEW_PRODUCT_BUTTON", "view_product_button", 280);
        EnumC39651Hig A00126 = A00("VIEW_PRODUCTS_PILL", "view_products_pill", 281);
        EnumC39651Hig A00127 = A00("VIEW_RECEIPT_BUTTON", "view_receipt_button", 282);
        EnumC39651Hig A00128 = A00("VIEW_SHOP_BUTTON", "view_shop_button", 283);
        EnumC39651Hig A00129 = A00("VIEW_SHOPPING_ACTIVITY_BUTTON", "view_shopping_activity_button", 284);
        A0K = A00129;
        EnumC39651Hig A00130 = A00("VIEW_SIZE_INFO_BUTTON", "view_size_info_button", 285);
        EnumC39651Hig A00131 = A00("VIEW_WISHLIST_BUTTON", "view_wishlist_button", 286);
        A0L = A00131;
        EnumC39651Hig A00132 = A00("VIEW_WISHLIST_FROM_WISHLIST_TOAST_BUTTON", "view_wishlist_from_wishlist_toast_button", 287);
        EnumC39651Hig A00133 = A00("VIEW_YOUR_REVIEWS", "view_your_reviews", 288);
        EnumC39651Hig A00134 = A00("VIEWED_TAB", "viewed_tab", 289);
        EnumC39651Hig A00135 = A00("VISUAL_CATEGORIES_TILE", "visual_categories_tile", 290);
        EnumC39651Hig A00136 = A00("VISUAL_CATEGORY_NAVIGATION_CPDP", "visual_category_navigation_cpdp", 291);
        EnumC39651Hig A00137 = A00("VOTE_BUTTON", "vote_button", 292);
        EnumC39651Hig A00138 = A00("WHATSAPP_MESSAGE_SELLER_INQUIRY_BUTTON", "whatsapp_message_seller_button", 293);
        EnumC39651Hig A00139 = A00("WISHLIST_COLLECTION", "wishlist_collection", 294);
        A0M = A00139;
        System.arraycopy(new EnumC39651Hig[]{A00115, A00116, A00117, A00118, A00119, A00120, A00121, A00122, A00123, A00124, A00125, A00126, A00127, A00128, A00129, A00130, A00131, A00132, A00133, A00134, A00135, A00136, A00137, A00138, A00139, A00("WRITE_POST", "write_post", 295), A00("XOUT", "xout", 296)}, 0, enumC39651HigArr, 270, 27);
        System.arraycopy(new EnumC39651Hig[]{A00("YES_BUTTON", "yes_button", 297), A00("ZIP_CODE_INPUT", "zip_code_input", 298)}, 0, enumC39651HigArr, 297, 2);
        A01 = enumC39651HigArr;
    }

    public static EnumC39651Hig A00(String str, String str2, int i) {
        return new EnumC39651Hig(str, i, str2);
    }

    public static EnumC39651Hig valueOf(String str) {
        return (EnumC39651Hig) Enum.valueOf(EnumC39651Hig.class, str);
    }

    public static EnumC39651Hig[] values() {
        return (EnumC39651Hig[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public EnumC39651Hig(String str, int i, String str2) {
        this.A00 = str2;
    }
}
