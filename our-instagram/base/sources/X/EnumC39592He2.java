package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39592He2 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39592He2[] A03;
    public static final EnumC39592He2 A04;
    public static final EnumC39592He2 A05;
    public static final EnumC39592He2 A06;
    public static final EnumC39592He2 A07;
    public static final EnumC39592He2 A08;
    public static final EnumC39592He2 A09;
    public final Integer A00;
    public final String A01;

    static {
        Integer num = C05F.A01;
        EnumC39592He2 enumC39592He2 = new EnumC39592He2(num, "DEFAULT_CHAINING", "discover/chaining_experience_feed/", 0);
        A05 = enumC39592He2;
        EnumC39592He2 enumC39592He22 = new EnumC39592He2(num, "NUDGE_CHAINING", "mental_well_being/chaining_experience_ifr_feed/", 1);
        A07 = enumC39592He22;
        EnumC39592He2 enumC39592He23 = new EnumC39592He2(num, "RESHARE_CHAINING", "discover/direct_reshare_chaining_feed/", 2);
        A08 = enumC39592He23;
        EnumC39592He2 enumC39592He24 = new EnumC39592He2(num, "SHOPPING_SEARCH_CHAINING", "discover/shopping_search_chaining_experience/", 3);
        A09 = enumC39592He24;
        EnumC39592He2 enumC39592He25 = new EnumC39592He2(C05F.A0N, "INTERNAL_PRODUCT_PIVOTS_FEED_CHAINING", "discover/chaining_experience_feed_with_fixed_results_internal_only/", 4);
        A06 = enumC39592He25;
        EnumC39592He2 enumC39592He26 = new EnumC39592He2(num, "CLIPS_SHOWCASE_CHAINING", "clips/rifu_showcase/", 5);
        A04 = enumC39592He26;
        EnumC39592He2[] enumC39592He2Arr = {enumC39592He2, enumC39592He22, enumC39592He23, enumC39592He24, enumC39592He25, enumC39592He26};
        A03 = enumC39592He2Arr;
        A02 = AbstractC12190kN.A00(enumC39592He2Arr);
    }

    public static EnumC39592He2 valueOf(String str) {
        return (EnumC39592He2) Enum.valueOf(EnumC39592He2.class, str);
    }

    public static EnumC39592He2[] values() {
        return (EnumC39592He2[]) A03.clone();
    }

    public EnumC39592He2(Integer num, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = num;
    }
}
