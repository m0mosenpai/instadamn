package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xcr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72404Xcr {
    public static final /* synthetic */ EnumC72404Xcr[] A01;
    public static final EnumC72404Xcr A02;
    public final String A00;

    static {
        EnumC72404Xcr[] enumC72404XcrArr = new EnumC72404Xcr[142];
        EnumC72404Xcr A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        System.arraycopy(new EnumC72404Xcr[]{A00, A00("ACCESS_YOUR_INFORMATION", 1), A00("ACCESS_YOUR_INFORMATION_CENTRALIZED", 2), A00("ACCESS_YOUR_INFORMATION_FRAGMENTED", 3), A00("ACCOUNTS", 4), A00("ACCOUNTS_CENTER_HOME", 5), A00("ACCOUNT_OWNERSHIP_AND_CONTROL", 6), A00("ACTIVE_PORTALS", 7), A00("ACTIVITY_HIDE_ADVERTISER", 8), A00("ADS_PAYMENTS", 9), A00("ADS_SHOWN_OFF_FACEBOOK", 10), A00("ADS_SHOWN_OFF_META", 11), A00("ADS_SHOWN_OFF_META_V2", 12), A00("ADS_SOCIAL_INTERACTIONS", 13), A00("ADS_SOCIAL_INTERACTIONS_ACCOUNT_LEVEL", 14), A00("ADVERTISERS", 15), A00("AD_ACTIVITY", 16), A00("AD_CATEGORIES", 17), A00("AD_DATA_FROM_PARTNERS", 18), A00("AD_DATA_FROM_PARTNERS_FRAGMENTED", 19), A00("AD_DATA_FROM_PARTNERS_FRAGMENTED_RECONCILIATION_FLOW", 20), A00("AD_DATA_FROM_PARTNERS_USER_GRAIN", 21), A00("AD_PERSONALIZATION", 22), A00("AD_PREFERENCES", 23), A00("AD_PREFERENCES_FAQ_DOES_META_SELL_YOUR_INFO", 24), A00("AD_PREFERENCES_FAQ_WHAT_INFO_IS_USED", 25), A00("AD_PROFILE_CENTER", 26)}, 0, enumC72404XcrArr, 0, 27);
        System.arraycopy(new EnumC72404Xcr[]{A00("AD_PROFILE_CENTER_AUDIENCE_BASED_ADVERTISING", 27), A00("AD_PROFILE_CENTER_EDIT_PROFILE_INFO_FRAGEMENTED", 28), A00("AD_SETTINGS", 29), A00("AD_SETTINGS_FRAGMENTED", 30), A00("AD_TOPICS", 31), A00("AD_TOPICS_FRAGMENTED", 32), A00("AFS", 33), A00("AFS_CONTEXTUAL_ADS", 34), A00("APPS_WEBSITES_SETTINGS", 35), A00("APP_LEVEL_SAVED_LOGIN_INFO", 36), A00("AUDIENCE_BASED_ADS", 37), A00("AUDIENCE_BASED_ADVERTISING_FROM_LOGGED_OUT_3PD", 38), A00("AUTO_FOLLOW", 39), A00("AVATAR_MANAGEMENT", 40), A00("BASIC_ADS", 41), A00("BASIC_ADS_AD_TOPICS", 42), A00("BIRTHDAY", 43), A00("BUSINESS_INTEGRATIONS", 44), A00("BUSINESS_SERVICE_CENTER", 45), A00("CLEAR_SEARCH_HISTORY", 46), A00("CONNECTED_EXPERIENCES", 47), A00("CONTACT_POINT", 48), A00("COOKIE_SETTINGS", 49), A00("CROSS_POSTING", 50), A00("CUSTOM_RETENTION", 51), A00("DELETION_AND_DEACTIVATION", 52), A00("DEVICES", 53)}, 0, enumC72404XcrArr, 27, 27);
        System.arraycopy(new EnumC72404Xcr[]{A00("DIGITAL_WALLET_SHARING", 54), A00("DISCOVERABILITY_CONTROLS", 55), A00("E2EE_KEY_CHANGE_ALERTS", 56), A00("E2EE_SECURE_STORAGE", 57), A00("ENCRYPTED_NOTIFICATION_EMAILS", 58), A00("EVENTS_ACROSS_APPS", 59), A00("EXAMPLE", 60), A00("FACEBOOK_PROTECT", 61), A00("FACEBOOK_PROTECT_INVITE", 62), A00("FAMILY_CENTER", 63), A00("FBPAY_FRAGMENTED", 64), A00("FB_PAY", 65), A00("FETA_CONTACT_POINT", 66), A00("FIRST_PARTY_DATA", 67), A00("GEMSTONE", 68), A00("GRAPH_DISCOVERABILITY_CONTROL", 69), A00("IDENTITY_CONFIRMATION", 70), A00("IDENTITY_VAULT", 71), A00("IMBE", 72), A00("IM_AVATAR", 73), A00("IM_NAME", 74), A00("IM_PROFILE", 75), A00("IM_PROFILE_PHOTO", 76), A00("IM_SYNC", 77), A00("IM_USERNAME", 78), A00("INFORMATION_AND_ACTIVITY", 79), A00("INFO_FROM_YOUR_PROFILES", 80)}, 0, enumC72404XcrArr, 54, 27);
        System.arraycopy(new EnumC72404Xcr[]{A00("INSTANT_GAMES", 81), A00("LANGUAGE_AND_REGION", 82), A00("LOGIN_ACTIVITIES", 83), A00("LOGIN_ALERTS", 84), A00("MANAGE_CONTACTS", 85), A00("MANAGE_COOKIES", 86), A00("MANAGE_COOKIES_DIALOG", 87), A00("MANAGE_YOUR_INFORMATION", 88), A00("MEMORIALIZATION", 89), A00("MESSENGER_META_VERIFIED", 90), A00("META_ACCOUNT_NAME", 91), A00("META_GALLERY", 92), A00("META_PAY_NAME", 93), A00("META_PAY_WALLET", 94), A00("META_PAY_WALLET_MIGRATION", 95), A00("META_PAY_WALLET_SYNC", 96), A00("META_RECENT_EMAILS", 97), A00("META_SECURITY_CHECKUP", 98), A00("NME_GAI", 99), A00("OFF_FACEBOOK_ACTIVITY", 100), A00("OFF_FACEBOOK_ACTIVITY_BLOCKLIST_PAGE", 101), A00("OFF_FACEBOOK_ACTIVITY_CLEAR_HISTORY", 102), A00("OFF_FACEBOOK_ACTIVITY_DETAILS", 103), A00("OFF_FACEBOOK_ACTIVITY_DISCONNECT_FUTURE", 104), A00("OFF_FACEBOOK_ACTIVITY_LIST_PAGE", 105), A00("OFF_FACEBOOK_ACTIVITY_SELECT_BLOCKLIST_PAGE", 106), A00("OFF_PLATFORM_META_MARKETING", 107)}, 0, enumC72404XcrArr, 81, 27);
        System.arraycopy(new EnumC72404Xcr[]{A00("PASSKEY", 108), A00("PASSWORD_CHANGE", 109), A00("PAYMENTS", 110), A00("PERSONAL_INFO", 111), A00("PREFERRED_BUSINESSES", 112), A00("PRIVACY_CENTER", 113), A00("PRIVACY_SHORTCUTS", 114), A00("PROFILES", 115), A00("REACTIVATION", 116), A00("SAFE_BROWSING", 117), A00("SAVED_LOGIN_INFO", 118), A00("SAVED_PHONE_NUMBERS", 119), A00("SEARCH_HISTORY", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A00("SECURITY_AND_LOGIN", 121), A00("SECURITY_CHECKUP", 122), A00("SECURITY_CONTACT_POINT", 123), A00("SECURITY_EMAILS", 124), A00("SHOPPING_ACTIVITY", 125), A00("SINGLE_SIGN_ON", 126), A00("THIRD_PARTY_LINK", StringTreeSet.MAX_SYMBOL_COUNT), A00("TRANSFER_YOUR_INFORMATION", 128), A00("TWO_FACTOR", 129), A00("UNIFIED_DYI_FIELD_SELECTION", 130), A00("UNIFIED_DYI_FILE_OPTION", 131), A00("UNIFIED_DYI_HOME", 132), A00("UNIFIED_SETTINGS_OPT_IN_STATUS", 133), A00("UPGRADE_ACCOUNT", 134)}, 0, enumC72404XcrArr, 108, 27);
        System.arraycopy(new EnumC72404Xcr[]{A00("UPLOAD_CONTACTS", 135), A00("USER_LEVEL_CONSENT", 136), A00("VIEW_YOUR_INFORMATION_FRAGMENTED", 137), A00("WA_PAYMENTS", 138), A00("WEARABLES", 139), A00("YOUTH_ADS", 140), A00("YOUTH_FAMILY_SUPPORT", 141)}, 0, enumC72404XcrArr, 135, 7);
        A01 = enumC72404XcrArr;
    }

    public static EnumC72404Xcr A00(String str, int i) {
        return new EnumC72404Xcr(str, i, str);
    }

    public static EnumC72404Xcr valueOf(String str) {
        return (EnumC72404Xcr) Enum.valueOf(EnumC72404Xcr.class, str);
    }

    public static EnumC72404Xcr[] values() {
        return (EnumC72404Xcr[]) A01.clone();
    }

    public EnumC72404Xcr(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}