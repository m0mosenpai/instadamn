package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VDD[] A01;
    public static final VDD A02;
    public static final VDD A03;
    public static final VDD A04;
    public static final VDD A05;
    public static final VDD A06;
    public static final VDD A07;
    public static final VDD A08;
    public static final VDD A09;
    public static final VDD A0A;
    public static final VDD A0B;
    public static final VDD A0C;
    public static final VDD A0D;

    static {
        VDD vdd = new VDD("UX_SHIPPING_ADDRESS", 0);
        A0D = vdd;
        VDD vdd2 = new VDD("UX_FULFILLMENT_OPTIONS", 1);
        A06 = vdd2;
        VDD vdd3 = new VDD("UX_PROMO_CODE", 2);
        A0B = vdd3;
        VDD vdd4 = new VDD("UX_FB_OFFER", 3);
        A05 = vdd4;
        VDD vdd5 = new VDD("UX_FB_LOYALTY", 4);
        A04 = vdd5;
        VDD vdd6 = new VDD("UX_MERCHNAT_LOYALTY", 5);
        A09 = vdd6;
        VDD vdd7 = new VDD("UX_GIFT_SECTION", 6);
        A07 = vdd7;
        VDD vdd8 = new VDD("UX_OPTIN_EMAIL_SUB", 7);
        A0A = vdd8;
        VDD vdd9 = new VDD("UX_PURCHASE_PROTECTION", 8);
        A0C = vdd9;
        VDD vdd10 = new VDD("ONE_TIME_CHECKOUT_OPTION", 9);
        A03 = vdd10;
        VDD vdd11 = new VDD("NUX_PAYMENT_RECEIVER", 10);
        A02 = vdd11;
        VDD vdd12 = new VDD("UX_INCENTIVES", 11);
        A08 = vdd12;
        VDD[] vddArr = {vdd, vdd2, vdd3, vdd4, vdd5, vdd6, vdd7, vdd8, vdd9, vdd10, vdd11, vdd12};
        A01 = vddArr;
        A00 = AbstractC12190kN.A00(vddArr);
    }

    public static VDD valueOf(String str) {
        return (VDD) Enum.valueOf(VDD.class, str);
    }

    public static VDD[] values() {
        return (VDD[]) A01.clone();
    }

    public VDD(String str, int i) {
    }
}
