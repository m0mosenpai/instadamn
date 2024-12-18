package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53274NhC {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53274NhC[] A04;
    public static final EnumC53274NhC A05;
    public static final EnumC53274NhC A06;
    public static final EnumC53274NhC A07;
    public static final EnumC53274NhC A08;
    public static final EnumC53274NhC A09;
    public static final EnumC53274NhC A0A;
    public static final EnumC53274NhC A0B;
    public static final EnumC53274NhC A0C;
    public static final EnumC53274NhC A0D;
    public static final EnumC53274NhC A0E;
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    static {
        EnumC53274NhC enumC53274NhC = new EnumC53274NhC(null, null, "DESCRIPTION", null, 0);
        A06 = enumC53274NhC;
        EnumC53274NhC enumC53274NhC2 = new EnumC53274NhC(null, null, "FOLLOWERS", null, 1);
        A08 = enumC53274NhC2;
        EnumC53274NhC enumC53274NhC3 = new EnumC53274NhC(2131964849, Integer.valueOf(R.drawable.instagram_star_pano_outline_24), "RATING", null, 2);
        A0D = enumC53274NhC3;
        EnumC53274NhC enumC53274NhC4 = new EnumC53274NhC(2131964848, Integer.valueOf(R.drawable.instagram_dollar_pano_outline_24), "PRICE_RANGE", null, 3);
        A0C = enumC53274NhC4;
        EnumC53274NhC enumC53274NhC5 = new EnumC53274NhC(null, null, "BUSINESS_CATEGORY", "CATEGORY", 4);
        A05 = enumC53274NhC5;
        EnumC53274NhC enumC53274NhC6 = new EnumC53274NhC(null, Integer.valueOf(R.drawable.instagram_location_pano_outline_24), "LOCATION", null, 5);
        A0A = enumC53274NhC6;
        EnumC53274NhC enumC53274NhC7 = new EnumC53274NhC(null, null, "FB_BADGE", null, 6);
        A07 = enumC53274NhC7;
        EnumC53274NhC enumC53274NhC8 = new EnumC53274NhC(null, null, "IG_BADGE", null, 7);
        A09 = enumC53274NhC8;
        EnumC53274NhC enumC53274NhC9 = new EnumC53274NhC(null, null, "PAGE_LIKES", null, 8);
        A0B = enumC53274NhC9;
        EnumC53274NhC enumC53274NhC10 = new EnumC53274NhC(null, null, "UNKNOWN", null, 9);
        A0E = enumC53274NhC10;
        EnumC53274NhC[] enumC53274NhCArr = {enumC53274NhC, enumC53274NhC2, enumC53274NhC3, enumC53274NhC4, enumC53274NhC5, enumC53274NhC6, enumC53274NhC7, enumC53274NhC8, enumC53274NhC9, enumC53274NhC10};
        A04 = enumC53274NhCArr;
        A03 = AbstractC12190kN.A00(enumC53274NhCArr);
    }

    public static EnumC53274NhC valueOf(String str) {
        return (EnumC53274NhC) Enum.valueOf(EnumC53274NhC.class, str);
    }

    public static EnumC53274NhC[] values() {
        return (EnumC53274NhC[]) A04.clone();
    }

    public EnumC53274NhC(Integer num, Integer num2, String str, String str2, int i) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = str2;
    }
}
