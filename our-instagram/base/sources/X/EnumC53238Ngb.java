package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53238Ngb {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53238Ngb[] A02;
    public static final EnumC53238Ngb A03;
    public static final EnumC53238Ngb A04;
    public static final EnumC53238Ngb A05;
    public static final EnumC53238Ngb A06;
    public static final EnumC53238Ngb A07;
    public static final EnumC53238Ngb A08;
    public static final EnumC53238Ngb A09;
    public final String A00;

    static {
        EnumC53238Ngb enumC53238Ngb = new EnumC53238Ngb("EFFECTS_TAB", 0, "effects_tab");
        A06 = enumC53238Ngb;
        EnumC53238Ngb enumC53238Ngb2 = new EnumC53238Ngb("GROUP_EFFECTS_TAB", 1, "group_effects_tab");
        A08 = enumC53238Ngb2;
        EnumC53238Ngb enumC53238Ngb3 = new EnumC53238Ngb("FILTERS_TAB", 2, "filters_tab");
        A07 = enumC53238Ngb3;
        EnumC53238Ngb enumC53238Ngb4 = new EnumC53238Ngb("SOLO_BACKGROUNDS", 3, "solo_backgrounds_tab");
        A09 = enumC53238Ngb4;
        EnumC53238Ngb enumC53238Ngb5 = new EnumC53238Ngb("AVATARS_TAB", 4, "avatars_tab");
        A03 = enumC53238Ngb5;
        EnumC53238Ngb enumC53238Ngb6 = new EnumC53238Ngb("AVATAR_FILTERS_TAB", 5, "avatar_filters_tab");
        A05 = enumC53238Ngb6;
        EnumC53238Ngb enumC53238Ngb7 = new EnumC53238Ngb("AVATAR_BACKGROUNDS_TAB", 6, "avatar_backgrounds_tab");
        A04 = enumC53238Ngb7;
        EnumC53238Ngb[] enumC53238NgbArr = {enumC53238Ngb, enumC53238Ngb2, enumC53238Ngb3, enumC53238Ngb4, enumC53238Ngb5, enumC53238Ngb6, enumC53238Ngb7, new EnumC53238Ngb("AVATAR_EXPRESSIONS_TAB", 7, "avatar_expressions_tab")};
        A02 = enumC53238NgbArr;
        A01 = AbstractC12190kN.A00(enumC53238NgbArr);
    }

    public static EnumC53238Ngb valueOf(String str) {
        return (EnumC53238Ngb) Enum.valueOf(EnumC53238Ngb.class, str);
    }

    public static EnumC53238Ngb[] values() {
        return (EnumC53238Ngb[]) A02.clone();
    }

    public EnumC53238Ngb(String str, int i, String str2) {
        this.A00 = str2;
    }
}
