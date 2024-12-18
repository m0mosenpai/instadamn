package X;

import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xdb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72431Xdb implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC72431Xdb[] A01;
    public static final EnumC72431Xdb A02;
    public static final EnumC72431Xdb A03;
    public static final EnumC72431Xdb A04;
    public final String A00;

    static {
        EnumC72431Xdb A00 = A00("APPLE_IAP", "apple_iap", 0);
        EnumC72431Xdb A002 = A00("CREDIT_CARD", "credit_card", 1);
        A02 = A002;
        EnumC72431Xdb A003 = A00("PAYPAL_BA", "paypal_ba", 2);
        A04 = A003;
        EnumC72431Xdb A004 = A00("PAYPAL_TOKEN", "paypal_token", 3);
        EnumC72431Xdb A005 = A00("PAYPAL_PAYOUT", "paypal_payout", 4);
        EnumC72431Xdb A006 = A00("PAYONEER", "payoneer", 5);
        EnumC72431Xdb A007 = A00("STORED_CREDIT", "stored_credit", 6);
        EnumC72431Xdb A008 = A00("FACEBOOK_PAY", "facebook_pay", 7);
        EnumC72431Xdb A009 = A00("META_PAY", "meta_pay", 8);
        EnumC72431Xdb A0010 = A00("ADS_STORED_BALANCE", "ads_stored_balance", 9);
        EnumC72431Xdb A0011 = A00("NEW_BUSINESS_STORED_BALANCE", "new_business_store_balance", 10);
        EnumC72431Xdb A0012 = A00("EXTENDED_CREDIT", "extended_credit", 11);
        EnumC72431Xdb A0013 = A00("NEW_EXTENDED_CREDIT", "new_extended_credit", 12);
        EnumC72431Xdb A0014 = A00("FB_TOKEN", "fb_token", 13);
        EnumC72431Xdb A0015 = A00("UPI", "upi", 14);
        EnumC72431Xdb A0016 = A00("EXTERNAL_UPI", "external_upi", 15);
        EnumC72431Xdb A0017 = A00("DIRECT_DEBIT", "direct_debit", 16);
        EnumC72431Xdb A0018 = A00("EXTERNAL_WALLET", "external_wallet", 17);
        EnumC72431Xdb A0019 = A00("STORED_VALUE", "stored_value", 18);
        EnumC72431Xdb A0020 = A00("NET_BANKING", "net_banking", 19);
        EnumC72431Xdb A0021 = A00("ALT_PAY", "alt_pay", 20);
        EnumC72431Xdb A0022 = A00("GIFTCARD", "giftcard", 21);
        EnumC72431Xdb A0023 = A00("GIFTCARD_BALANCE", "giftcard_balance", 22);
        EnumC72431Xdb A0024 = A00("AFFIRM", "affirm", 23);
        EnumC72431Xdb A0025 = A00("DUMMY", "dummy", 24);
        A03 = A0025;
        EnumC72431Xdb A0026 = A00("WA_EXTERNAL_WALLET", "wa_external_wallet", 25);
        EnumC72431Xdb A0027 = A00("NEW_CREDIT_CARD", "new_credit_card", 26);
        EnumC72431Xdb A0028 = A00("NEW_PAYPAL_BA", "new_paypal_ba", 27);
        EnumC72431Xdb A0029 = A00("NEW_EXTERNAL_WALLET", "new_external_wallet", 28);
        EnumC72431Xdb A0030 = A00("NEW_WA_EXTERNAL_WALLET", "wa_new_external_wallet", 29);
        EnumC72431Xdb A0031 = A00("NEW_CREDENTIAL_NUX", "new_credential_nux", 30);
        EnumC72431Xdb A0032 = A00("NETWORK_TOKEN", "network_token", 31);
        EnumC72431Xdb A0033 = A00("SHOP_PAY", "shop_pay", 32);
        EnumC72431Xdb A0034 = A00("NEW_SHOP_PAY", "new_shop_pay", 33);
        EnumC72431Xdb A0035 = A00("NEW_PAYPAL_CHECKOUT", "new_paypal_checkout", 34);
        EnumC72431Xdb A0036 = A00("NEW_PAYPAL_BNPL_CHECKOUT", "new_paypal_bnpl_checkout", 35);
        EnumC72431Xdb A0037 = A00("EXTERNAL_CREDENTIAL", "external_credential", 36);
        EnumC72431Xdb A0038 = A00("QR_CODE", "qr_code", 37);
        EnumC72431Xdb A0039 = A00("CREDIT_CARD_DINERSCLUB", "credit_card_dinersclub", 38);
        EnumC72431Xdb A0040 = A00("CREDIT_CARD_AMERICANEXPRESS", "credit_card_americanexpress", 39);
        EnumC72431Xdb A0041 = A00("CREDIT_CARD_DISCOVER", "credit_card_discover", 40);
        EnumC72431Xdb A0042 = A00("CREDIT_CARD_ELO", "credit_card_elo", 41);
        EnumC72431Xdb A0043 = A00("CREDIT_CARD_INTERAC", "credit_card_interac", 42);
        EnumC72431Xdb A0044 = A00("CREDIT_CARD_JCB", "credit_card_jcb", 43);
        EnumC72431Xdb A0045 = A00("CREDIT_CARD_MASTERCARD", "credit_card_mastercard", 44);
        EnumC72431Xdb A0046 = A00("CREDIT_CARD_PIN_ONLY", "credit_card_pin_only", 45);
        EnumC72431Xdb A0047 = A00("CREDIT_CARD_CUP", "credit_card_cup", 46);
        EnumC72431Xdb A0048 = A00("CREDIT_CARD_VISA", "credit_card_visa", 47);
        EnumC72431Xdb A0049 = A00("CREDIT_CARD_RUPAY", "credit_card_rupay", 48);
        EnumC72431Xdb A0050 = A00("CREDIT_CARD_MAESTRO", "credit_card_maestro", 49);
        EnumC72431Xdb A0051 = A00("INCENTIVE_FUNDING", "incentive_funding", 50);
        EnumC72431Xdb A0052 = A00(PriceTableAnnotation$Companion.OFFER, "offer", 51);
        EnumC72431Xdb A0053 = A00("REWARD", "reward", 52);
        EnumC72431Xdb A0054 = A00("INCENTIVE_NMOR_OMNIPE_MIGRATION", "incentive_nmor_omnipe_migration", 53);
        EnumC72431Xdb A0055 = A00("META_DUMMY", "meta_dummy", 54);
        EnumC72431Xdb A0056 = A00("VIRTUAL_CARD_KLARNA_BNPL", "virtual_card_klarna_bnpl", 55);
        EnumC72431Xdb A0057 = A00("HPP_PAYMENT_LINK", "hpp_payment_link", 56);
        EnumC72431Xdb[] enumC72431XdbArr = new EnumC72431Xdb[57];
        System.arraycopy(new EnumC72431Xdb[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, 0, enumC72431XdbArr, 0, 27);
        System.arraycopy(new EnumC72431Xdb[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054}, 0, enumC72431XdbArr, 27, 27);
        System.arraycopy(new EnumC72431Xdb[]{A0055, A0056, A0057}, 0, enumC72431XdbArr, 54, 3);
        A01 = enumC72431XdbArr;
    }

    public static EnumC72431Xdb A00(String str, String str2, int i) {
        return new EnumC72431Xdb(str, i, str2);
    }

    public static EnumC72431Xdb valueOf(String str) {
        return (EnumC72431Xdb) Enum.valueOf(EnumC72431Xdb.class, str);
    }

    public static EnumC72431Xdb[] values() {
        return (EnumC72431Xdb[]) A01.clone();
    }

    public EnumC72431Xdb(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
