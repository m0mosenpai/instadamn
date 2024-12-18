package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RhZ {
    public static final /* synthetic */ RhZ[] A01;
    public static final RhZ A02;
    public final String A00;

    static {
        RhZ A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        RhZ A002 = A00("ADS_AI_AGENT", 1);
        RhZ A003 = A00("CALL_ADS", 2);
        RhZ A004 = A00("CART_ALERTS", 3);
        RhZ A005 = A00("CONTEXTUAL_METADATA", 4);
        RhZ A006 = A00("CTM_ADS", 5);
        RhZ A007 = A00("CTWA_ADS", 6);
        RhZ A008 = A00("DF_TEST", 7);
        RhZ A009 = A00("DONATIONS", 8);
        RhZ A0010 = A00("EXTENSION_TEMPLATE", 9);
        RhZ A0011 = A00("FB_BLOKS_EXPERIMENT", 10);
        RhZ A0012 = A00("FB_METADATA", 11);
        RhZ A0013 = A00("FB_PIXEL_COMPATIBILITY", 12);
        RhZ A0014 = A00("FB_PRODUCT_RECOMMENDER", 13);
        RhZ A0015 = A00("FB_PRODUCT_RECOMMENDER_EXT", 14);
        RhZ A0016 = A00("FB_PROMO_ADS", 15);
        RhZ A0017 = A00("FINDS_ADS_DEEP_DISCOVERY", 16);
        RhZ A0018 = A00("GENAI_REVIEW_SUMMARY", 17);
        RhZ A0019 = A00("GEN_AI_REVIEWS_SUMMARY", 18);
        RhZ A0020 = A00("HEADER_EXPERIMENT", 19);
        RhZ A0021 = A00("IAB_PLAYGROUND", 20);
        RhZ A0022 = A00("IAB_TABS_REMINDERS_FOOTER_EXTENSION", 21);
        RhZ A0023 = A00("IG_BLOKS_EXPERIMENT", 22);
        RhZ A0024 = A00("IG_BUSINESS_AI_AGENT", 23);
        RhZ A0025 = A00("IG_CTD_EXTENSION", 24);
        RhZ A0026 = A00("IG_CTWA_EXTENSION", 25);
        RhZ A0027 = A00("LEAD_FORM_ADS", 26);
        RhZ[] rhZArr = new RhZ[53];
        System.arraycopy(new RhZ[]{A00("MESSENGER_MARKETING_MESSAGES_OPT_IN", 27), A00("METADATA", 28), A00("META_REWARDS", 29), A00("OFFSITE_NONPROFIT_ADS", 30), A00("OMNI_LAE_ADS", 31), A00("OMNI_PROMO_ADS", 32), A00("OMNI_REMINDER_ADS", 33), A00("PAYPAL_OFFER", 34), A00("PIXEL_COMPATIBILITY", 35), A00("POST_EXIT_SURVEY", 36), A00("PREFERENCE_SIGNAL", 37), A00("PRE_EXIT_ALERT", 38), A00("PRICE_HISTORY", 39), A00("PRICE_HISTORY_EXT", 40), A00("PRODUCT_EXTENSION", 41), A00("PRODUCT_RECOMMENDER", 42), A00("PROMO_ADS", 43), A00("PURCHASE_REMINDER", 44), A00("RATINGS_REVIEWS", 45), A00("REMINDER_ADS", 46), A00("SHOP_ADS", 47), A00("SUSTAINABLE_ADS", 48), A00("TEST", 49), A00("TEST_PLAYGROUND", 50), A00("UGC", 51), A00("WEB_TO_MESSENGER_ADS", 52)}, AbstractC31175DnJ.A1b(new RhZ[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, rhZArr) ? 1 : 0, rhZArr, 27, 26);
        A01 = rhZArr;
    }

    public static RhZ A00(String str, int i) {
        return new RhZ(str, i, str);
    }

    public static RhZ valueOf(String str) {
        return (RhZ) Enum.valueOf(RhZ.class, str);
    }

    public static RhZ[] values() {
        return (RhZ[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RhZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
