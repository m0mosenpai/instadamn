package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GjK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37745GjK {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC37745GjK[] A04;
    public static final EnumC37745GjK A05;
    public static final EnumC37745GjK A06;
    public static final EnumC37745GjK A07;
    public static final EnumC37745GjK A08;
    public static final EnumC37745GjK A09;
    public static final EnumC37745GjK A0A;
    public static final EnumC37745GjK A0B;
    public final EnumC65855TvH A00;
    public final String A01;
    public final String A02;

    static {
        EnumC65855TvH enumC65855TvH = EnumC65855TvH.A0a;
        EnumC37745GjK enumC37745GjK = new EnumC37745GjK(enumC65855TvH, "FEED", "FEED", "FeedAds", 0);
        A07 = enumC37745GjK;
        EnumC37745GjK enumC37745GjK2 = new EnumC37745GjK(EnumC65855TvH.A1D, "STORIES", "STORIES", null, 1);
        A0B = enumC37745GjK2;
        EnumC37745GjK enumC37745GjK3 = new EnumC37745GjK(EnumC65855TvH.A0F, "CLIPS", "CLIPS", null, 2);
        A05 = enumC37745GjK3;
        EnumC65855TvH enumC65855TvH2 = EnumC65855TvH.A0V;
        EnumC37745GjK enumC37745GjK4 = new EnumC37745GjK(enumC65855TvH2, "EXPLORE_GRID", "EXPLORE_GRID", null, 3);
        A06 = enumC37745GjK4;
        EnumC37745GjK enumC37745GjK5 = new EnumC37745GjK(enumC65855TvH2, "SEARCH_GRID", "SEARCH_GRID", null, 4);
        A09 = enumC37745GjK5;
        EnumC37745GjK enumC37745GjK6 = new EnumC37745GjK(EnumC65855TvH.A0z, "SHOPPING_TAB", "SHOPPING_TAB", "ShoppingHomeAds", 5);
        A0A = enumC37745GjK6;
        EnumC37745GjK enumC37745GjK7 = new EnumC37745GjK(enumC65855TvH, "INTENT_AWARE_ADS_MULTI_AD_PIVOT", "INTENT_AWARE_ADS_MULTI_AD_PIVOT", "FeedAds", 6);
        A08 = enumC37745GjK7;
        EnumC37745GjK[] enumC37745GjKArr = {enumC37745GjK, enumC37745GjK2, enumC37745GjK3, enumC37745GjK4, enumC37745GjK5, enumC37745GjK6, enumC37745GjK7};
        A04 = enumC37745GjKArr;
        A03 = AbstractC12190kN.A00(enumC37745GjKArr);
    }

    public static EnumC37745GjK valueOf(String str) {
        return (EnumC37745GjK) Enum.valueOf(EnumC37745GjK.class, str);
    }

    public static EnumC37745GjK[] values() {
        return (EnumC37745GjK[]) A04.clone();
    }

    public EnumC37745GjK(EnumC65855TvH enumC65855TvH, String str, String str2, String str3, int i) {
        this.A00 = enumC65855TvH;
        this.A02 = str2;
        this.A01 = str3;
    }
}
