package X;

import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xcv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72408Xcv {
    public static final /* synthetic */ EnumC72408Xcv[] A01;
    public static final EnumC72408Xcv A02;
    public static final EnumC72408Xcv A03;
    public static final EnumC72408Xcv A04;
    public static final EnumC72408Xcv A05;
    public static final EnumC72408Xcv A06;
    public static final EnumC72408Xcv A07;
    public static final EnumC72408Xcv A08;
    public static final EnumC72408Xcv A09;
    public final String A00;

    static {
        EnumC72408Xcv A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A09 = A00;
        EnumC72408Xcv A002 = A00("ADS_STORED_BALANCE", 1);
        EnumC72408Xcv A003 = A00("AFFIRM", 2);
        EnumC72408Xcv A004 = A00("ALT_PAY", 3);
        EnumC72408Xcv A005 = A00("APPLE_IAP", 4);
        EnumC72408Xcv A006 = A00("APPLE_PAY", 5);
        EnumC72408Xcv A007 = A00("CREDIT_CARD", 6);
        A02 = A007;
        EnumC72408Xcv A008 = A00("CREDIT_CARD_AMERICANEXPRESS", 7);
        EnumC72408Xcv A009 = A00("CREDIT_CARD_CUP", 8);
        EnumC72408Xcv A0010 = A00("CREDIT_CARD_DINERSCLUB", 9);
        EnumC72408Xcv A0011 = A00("CREDIT_CARD_DISCOVER", 10);
        EnumC72408Xcv A0012 = A00("CREDIT_CARD_ELO", 11);
        EnumC72408Xcv A0013 = A00("CREDIT_CARD_INTERAC", 12);
        EnumC72408Xcv A0014 = A00("CREDIT_CARD_JCB", 13);
        EnumC72408Xcv A0015 = A00("CREDIT_CARD_MAESTRO", 14);
        EnumC72408Xcv A0016 = A00("CREDIT_CARD_MASTERCARD", 15);
        EnumC72408Xcv A0017 = A00("CREDIT_CARD_PIN_ONLY", 16);
        EnumC72408Xcv A0018 = A00("CREDIT_CARD_RUPAY", 17);
        EnumC72408Xcv A0019 = A00("CREDIT_CARD_VISA", 18);
        EnumC72408Xcv A0020 = A00("DEBIT_CARD_PAYOUT", 19);
        EnumC72408Xcv A0021 = A00("DIRECT_DEBIT", 20);
        A03 = A0021;
        EnumC72408Xcv A0022 = A00("DUMMY", 21);
        EnumC72408Xcv A0023 = A00("EARNINGS_PAYOUT", 22);
        EnumC72408Xcv A0024 = A00("EXTENDED_CREDIT", 23);
        EnumC72408Xcv A0025 = A00("EXTERNAL_CREDENTIAL", 24);
        EnumC72408Xcv A0026 = A00("EXTERNAL_UPI", 25);
        EnumC72408Xcv A0027 = A00("EXTERNAL_WALLET", 26);
        EnumC72408Xcv A0028 = A00("FACEBOOK_PAY", 27);
        EnumC72408Xcv A0029 = A00("FB_TOKEN", 28);
        EnumC72408Xcv A0030 = A00("GIFTCARD", 29);
        EnumC72408Xcv A0031 = A00("GIFTCARD_BALANCE", 30);
        EnumC72408Xcv A0032 = A00("GOOGLE_PAY", 31);
        EnumC72408Xcv A0033 = A00("HPP_PAYMENT_LINK", 32);
        EnumC72408Xcv A0034 = A00("INCENTIVE_FUNDING", 33);
        EnumC72408Xcv A0035 = A00("INCENTIVE_MOR_OMNIPE_MIGRATION", 34);
        EnumC72408Xcv A0036 = A00("INCENTIVE_NMOR_OMNIPE_MIGRATION", 35);
        EnumC72408Xcv A0037 = A00("META_DUMMY", 36);
        EnumC72408Xcv A0038 = A00("META_PAY", 37);
        EnumC72408Xcv A0039 = A00("META_REWARD_DONATION", 38);
        EnumC72408Xcv A0040 = A00("MOCK_OPAQUE_REDIRECT_LPM", 39);
        EnumC72408Xcv A0041 = A00("MOMO", 40);
        EnumC72408Xcv A0042 = A00("NETWORK_TOKEN", 41);
        EnumC72408Xcv A0043 = A00("NET_BANKING", 42);
        EnumC72408Xcv A0044 = A00("NET_BANKING_BUALUANG", 43);
        EnumC72408Xcv A0045 = A00("NET_BANKING_KMA", 44);
        EnumC72408Xcv A0046 = A00("NET_BANKING_KRUNGTHAI_NEXT", 45);
        EnumC72408Xcv A0047 = A00("NET_BANKING_K_PLUS", 46);
        EnumC72408Xcv A0048 = A00("NET_BANKING_SCB", 47);
        EnumC72408Xcv A0049 = A00("NEW_BUSINESS_STORED_BALANCE", 48);
        EnumC72408Xcv A0050 = A00("NEW_CREDENTIAL_NUX", 49);
        EnumC72408Xcv A0051 = A00("NEW_CREDIT_CARD", 50);
        A04 = A0051;
        EnumC72408Xcv A0052 = A00("NEW_EXTENDED_CREDIT", 51);
        EnumC72408Xcv A0053 = A00("NEW_EXTERNAL_WALLET", 52);
        EnumC72408Xcv A0054 = A00("NEW_PAYPAL_BA", 53);
        A05 = A0054;
        EnumC72408Xcv A0055 = A00("NEW_PAYPAL_BNPL_CHECKOUT", 54);
        EnumC72408Xcv A0056 = A00("NEW_PAYPAL_CHECKOUT", 55);
        EnumC72408Xcv A0057 = A00("NEW_SHOP_PAY", 56);
        A06 = A0057;
        EnumC72408Xcv A0058 = A00("NEW_WA_EXTERNAL_WALLET", 57);
        EnumC72408Xcv A0059 = A00(PriceTableAnnotation$Companion.OFFER, 58);
        EnumC72408Xcv A0060 = A00("PAYONEER", 59);
        EnumC72408Xcv A0061 = A00("PAYOUT_CONSUMER_EARNING", 60);
        EnumC72408Xcv A0062 = A00("PAYPAL_BA", 61);
        A07 = A0062;
        EnumC72408Xcv A0063 = A00("PAYPAL_PAYOUT", 62);
        EnumC72408Xcv A0064 = A00("PAYPAL_TOKEN", 63);
        EnumC72408Xcv A0065 = A00("PAY_ON_DELIVERY", 64);
        EnumC72408Xcv A0066 = A00("PIX", 65);
        EnumC72408Xcv A0067 = A00("PIX_KEY", 66);
        EnumC72408Xcv A0068 = A00("QR_CODE", 67);
        EnumC72408Xcv A0069 = A00("REWARD", 68);
        EnumC72408Xcv A0070 = A00("SHOPIFY_BNPL", 69);
        EnumC72408Xcv A0071 = A00("SHOPIFY_OTC", 70);
        EnumC72408Xcv A0072 = A00("SHOP_PAY", 71);
        A08 = A0072;
        EnumC72408Xcv A0073 = A00("SOFORT", 72);
        EnumC72408Xcv A0074 = A00("STORED_CREDIT", 73);
        EnumC72408Xcv A0075 = A00("STORED_VALUE", 74);
        EnumC72408Xcv A0076 = A00("UPI", 75);
        EnumC72408Xcv A0077 = A00("VIRTUAL_CARD_KLARNA_BNPL", 76);
        EnumC72408Xcv A0078 = A00("WA_EXTERNAL_WALLET", 77);
        EnumC72408Xcv[] enumC72408XcvArr = new EnumC72408Xcv[78];
        System.arraycopy(new EnumC72408Xcv[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, 0, enumC72408XcvArr, 0, 27);
        System.arraycopy(new EnumC72408Xcv[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054}, 0, enumC72408XcvArr, 27, 27);
        System.arraycopy(new EnumC72408Xcv[]{A0055, A0056, A0057, A0058, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078}, 0, enumC72408XcvArr, 54, 24);
        A01 = enumC72408XcvArr;
    }

    public static EnumC72408Xcv A00(String str, int i) {
        return new EnumC72408Xcv(str, i, str);
    }

    public static EnumC72408Xcv valueOf(String str) {
        return (EnumC72408Xcv) Enum.valueOf(EnumC72408Xcv.class, str);
    }

    public static EnumC72408Xcv[] values() {
        return (EnumC72408Xcv[]) A01.clone();
    }

    public EnumC72408Xcv(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
