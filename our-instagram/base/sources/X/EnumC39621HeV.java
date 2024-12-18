package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39621HeV {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39621HeV[] A02;
    public static final EnumC39621HeV A03;
    public static final EnumC39621HeV A04;
    public static final EnumC39621HeV A05;
    public static final EnumC39621HeV A06;
    public static final EnumC39621HeV A07;
    public static final EnumC39621HeV A08;
    public static final EnumC39621HeV A09;
    public static final EnumC39621HeV A0A;
    public static final EnumC39621HeV A0B;
    public static final EnumC39621HeV A0C;
    public static final EnumC39621HeV A0D;
    public static final EnumC39621HeV A0E;
    public final String A00;

    static {
        EnumC39621HeV enumC39621HeV = new EnumC39621HeV("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET");
        A0E = enumC39621HeV;
        EnumC39621HeV enumC39621HeV2 = new EnumC39621HeV("IAB_META_CHECKOUT_SDK", 1, "IAB_META_CHECKOUT_SDK");
        A08 = enumC39621HeV2;
        EnumC39621HeV enumC39621HeV3 = new EnumC39621HeV("IAB_META_CHECKOUT_SCA", 2, "IAB_META_CHECKOUT_SCA");
        A07 = enumC39621HeV3;
        EnumC39621HeV enumC39621HeV4 = new EnumC39621HeV("IAB_META_CHECKOUT_FIRMLY", 3, "IAB_META_CHECKOUT_FIRMLY");
        A05 = enumC39621HeV4;
        EnumC39621HeV enumC39621HeV5 = new EnumC39621HeV("IAB_STICKY_UTM_PARAMS", 4, "IAB_STICKY_UTM_PARAMS");
        A0C = enumC39621HeV5;
        EnumC39621HeV enumC39621HeV6 = new EnumC39621HeV("IAB_META_CHECKOUT_METAPAYMENTS_SDK", 5, "IAB_META_CHECKOUT_METAPAYMENTS_SDK");
        A06 = enumC39621HeV6;
        EnumC39621HeV enumC39621HeV7 = new EnumC39621HeV("IAB_WATCH_AND_BROWSE_WEB_TO_WA", 6, "IAB_WATCH_AND_BROWSE_WEB_TO_WA");
        A0D = enumC39621HeV7;
        EnumC39621HeV enumC39621HeV8 = new EnumC39621HeV("IAB_NO_ADS_CONTEXT", 7, "IAB_NO_ADS_CONTEXT");
        A09 = enumC39621HeV8;
        EnumC39621HeV enumC39621HeV9 = new EnumC39621HeV("IAB_AUTOFILL_ADS_PERSONALIZATION", 8, "IAB_AUTOFILL_ADS_PERSONALIZATION");
        A03 = enumC39621HeV9;
        EnumC39621HeV enumC39621HeV10 = new EnumC39621HeV("IAB_PAYPAL_CHECKOUT", 9, "IAB_PAYPAL_CHECKOUT");
        A0A = enumC39621HeV10;
        EnumC39621HeV enumC39621HeV11 = new EnumC39621HeV("IAB_BUY_WITH_PRIME", 10, "IAB_BUY_WITH_PRIME");
        A04 = enumC39621HeV11;
        EnumC39621HeV enumC39621HeV12 = new EnumC39621HeV("IAB_SHOPS", 11, "IAB_SHOPS");
        A0B = enumC39621HeV12;
        EnumC39621HeV[] enumC39621HeVArr = {enumC39621HeV, enumC39621HeV2, enumC39621HeV3, enumC39621HeV4, enumC39621HeV5, enumC39621HeV6, enumC39621HeV7, enumC39621HeV8, enumC39621HeV9, enumC39621HeV10, enumC39621HeV11, enumC39621HeV12};
        A02 = enumC39621HeVArr;
        A01 = AbstractC12190kN.A00(enumC39621HeVArr);
    }

    public static EnumC39621HeV valueOf(String str) {
        return (EnumC39621HeV) Enum.valueOf(EnumC39621HeV.class, str);
    }

    public static EnumC39621HeV[] values() {
        return (EnumC39621HeV[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39621HeV(String str, int i, String str2) {
        this.A00 = str2;
    }
}
