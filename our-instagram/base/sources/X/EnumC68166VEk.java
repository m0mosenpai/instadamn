package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VEk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68166VEk {
    public static final /* synthetic */ EnumC68166VEk[] A01;
    public static final EnumC68166VEk A02;
    public final String A00;

    static {
        EnumC68166VEk enumC68166VEk = new EnumC68166VEk("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC68166VEk;
        EnumC68166VEk enumC68166VEk2 = new EnumC68166VEk("ACCOUNT_NUMBER", 1, "ACCOUNT_NUMBER");
        EnumC68166VEk enumC68166VEk3 = new EnumC68166VEk("BSB", 2, "BSB");
        EnumC68166VEk enumC68166VEk4 = new EnumC68166VEk("CARD_NUMBER", 3, "CARD_NUMBER");
        EnumC68166VEk enumC68166VEk5 = new EnumC68166VEk("CARE_OF", 4, "CARE_OF");
        EnumC68166VEk enumC68166VEk6 = new EnumC68166VEk("CITY", 5, "CITY");
        EnumC68166VEk enumC68166VEk7 = new EnumC68166VEk("CONFIRM_ACCOUNT_NUMBER", 6, "CONFIRM_ACCOUNT_NUMBER");
        EnumC68166VEk enumC68166VEk8 = new EnumC68166VEk("COUNTRY", 7, "COUNTRY");
        EnumC68166VEk enumC68166VEk9 = new EnumC68166VEk("CSC", 8, "CSC");
        EnumC68166VEk enumC68166VEk10 = new EnumC68166VEk("CURRENCY_SELECTOR", 9, "CURRENCY_SELECTOR");
        EnumC68166VEk enumC68166VEk11 = new EnumC68166VEk(PaymentDetailChangeTypes$Companion.EMAIL, 10, PaymentDetailChangeTypes$Companion.EMAIL);
        EnumC68166VEk enumC68166VEk12 = new EnumC68166VEk("EXPIRY_DATE", 11, "EXPIRY_DATE");
        EnumC68166VEk enumC68166VEk13 = new EnumC68166VEk("FIRST_NAME", 12, "FIRST_NAME");
        EnumC68166VEk enumC68166VEk14 = new EnumC68166VEk("FULL_NAME", 13, "FULL_NAME");
        EnumC68166VEk enumC68166VEk15 = new EnumC68166VEk("IBAN", 14, "IBAN");
        EnumC68166VEk enumC68166VEk16 = new EnumC68166VEk("INSTITUTION_NUMBER", 15, "INSTITUTION_NUMBER");
        EnumC68166VEk enumC68166VEk17 = new EnumC68166VEk("LAST_NAME", 16, "LAST_NAME");
        EnumC68166VEk enumC68166VEk18 = new EnumC68166VEk("NATIONAL_ID", 17, "NATIONAL_ID");
        EnumC68166VEk enumC68166VEk19 = new EnumC68166VEk("NATIONAL_ID_TYPE", 18, "NATIONAL_ID_TYPE");
        EnumC68166VEk enumC68166VEk20 = new EnumC68166VEk("NEIGHBORHOOD", 19, "NEIGHBORHOOD");
        EnumC68166VEk enumC68166VEk21 = new EnumC68166VEk(PaymentDetailChangeTypes$Companion.PHONE_NUMBER, 20, PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
        EnumC68166VEk enumC68166VEk22 = new EnumC68166VEk("PROMO_CODE", 21, "PROMO_CODE");
        EnumC68166VEk enumC68166VEk23 = new EnumC68166VEk("ROUNTING_NUMBER", 22, "ROUNTING_NUMBER");
        EnumC68166VEk enumC68166VEk24 = new EnumC68166VEk("SORT_CODE", 23, "SORT_CODE");
        EnumC68166VEk enumC68166VEk25 = new EnumC68166VEk("STATE", 24, "STATE");
        EnumC68166VEk enumC68166VEk26 = new EnumC68166VEk("STREET_1", 25, "STREET_1");
        EnumC68166VEk enumC68166VEk27 = new EnumC68166VEk("STREET_2", 26, "STREET_2");
        EnumC68166VEk[] enumC68166VEkArr = new EnumC68166VEk[31];
        System.arraycopy(new EnumC68166VEk[]{new EnumC68166VEk("SUBDISTRICT", 27, "SUBDISTRICT"), new EnumC68166VEk("TAX_ID", 28, "TAX_ID"), new EnumC68166VEk("TRANSIT_NUMBER", 29, "TRANSIT_NUMBER"), new EnumC68166VEk("ZIP", 30, "ZIP")}, AbstractC31175DnJ.A1b(new EnumC68166VEk[]{enumC68166VEk, enumC68166VEk2, enumC68166VEk3, enumC68166VEk4, enumC68166VEk5, enumC68166VEk6, enumC68166VEk7, enumC68166VEk8, enumC68166VEk9, enumC68166VEk10, enumC68166VEk11, enumC68166VEk12, enumC68166VEk13, enumC68166VEk14, enumC68166VEk15, enumC68166VEk16, enumC68166VEk17, enumC68166VEk18, enumC68166VEk19, enumC68166VEk20, enumC68166VEk21, enumC68166VEk22, enumC68166VEk23, enumC68166VEk24, enumC68166VEk25, enumC68166VEk26, enumC68166VEk27}, enumC68166VEkArr) ? 1 : 0, enumC68166VEkArr, 27, 4);
        A01 = enumC68166VEkArr;
    }

    public static EnumC68166VEk valueOf(String str) {
        return (EnumC68166VEk) Enum.valueOf(EnumC68166VEk.class, str);
    }

    public static EnumC68166VEk[] values() {
        return (EnumC68166VEk[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68166VEk(String str, int i, String str2) {
        this.A00 = str2;
    }
}
