package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61168RgU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61168RgU[] A02;
    public static final EnumC61168RgU A03;
    public static final EnumC61168RgU A04;
    public static final EnumC61168RgU A05;
    public static final EnumC61168RgU A06;
    public static final EnumC61168RgU A07;
    public static final EnumC61168RgU A08;
    public static final EnumC61168RgU A09;
    public static final EnumC61168RgU A0A;
    public static final EnumC61168RgU A0B;
    public final String A00;

    static {
        EnumC61168RgU enumC61168RgU = new EnumC61168RgU("CREDIT_CARD_NAME", 0, "cc-name");
        A09 = enumC61168RgU;
        EnumC61168RgU enumC61168RgU2 = new EnumC61168RgU("CREDIT_CARD_GIVEN_NAME", 1, "cc-given-name");
        A08 = enumC61168RgU2;
        EnumC61168RgU enumC61168RgU3 = new EnumC61168RgU("CREDIT_CARD_ADDITIONAL_NAME", 2, "cc-additional-name");
        A03 = enumC61168RgU3;
        EnumC61168RgU enumC61168RgU4 = new EnumC61168RgU("CREDIT_CARD_FAMILY_NAME", 3, "cc-family-name");
        A07 = enumC61168RgU4;
        EnumC61168RgU enumC61168RgU5 = new EnumC61168RgU("CREDIT_CARD_NUMBER", 4, "cc-number");
        A0A = enumC61168RgU5;
        EnumC61168RgU enumC61168RgU6 = new EnumC61168RgU("CREDIT_CARD_EXP", 5, "cc-exp");
        A04 = enumC61168RgU6;
        EnumC61168RgU enumC61168RgU7 = new EnumC61168RgU("CREDIT_CARD_EXP_MONTH", 6, "cc-exp-month");
        A05 = enumC61168RgU7;
        EnumC61168RgU enumC61168RgU8 = new EnumC61168RgU("CREDIT_CARD_EXP_YEAR", 7, "cc-exp-year");
        A06 = enumC61168RgU8;
        EnumC61168RgU enumC61168RgU9 = new EnumC61168RgU("CREDIT_CARD_SECURITY_CODE", 8, "cc-csc");
        A0B = enumC61168RgU9;
        EnumC61168RgU[] enumC61168RgUArr = {enumC61168RgU, enumC61168RgU2, enumC61168RgU3, enumC61168RgU4, enumC61168RgU5, enumC61168RgU6, enumC61168RgU7, enumC61168RgU8, enumC61168RgU9, new EnumC61168RgU("CREDIT_CARD_TYPE", 9, "cc-type")};
        A02 = enumC61168RgUArr;
        A01 = AbstractC12190kN.A00(enumC61168RgUArr);
    }

    public static EnumC61168RgU valueOf(String str) {
        return (EnumC61168RgU) Enum.valueOf(EnumC61168RgU.class, str);
    }

    public static EnumC61168RgU[] values() {
        return (EnumC61168RgU[]) A02.clone();
    }

    public EnumC61168RgU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
