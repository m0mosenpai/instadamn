package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC64222vh {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC64222vh[] A02;
    public static final EnumC64222vh A03;
    public static final EnumC64222vh A04;
    public static final EnumC64222vh A05;
    public static final EnumC64222vh A06;
    public static final EnumC64222vh A07;
    public static final EnumC64222vh A08;
    public static final EnumC64222vh A09;
    public static final EnumC64222vh A0A;
    public final String A00;

    static {
        EnumC64222vh enumC64222vh = new EnumC64222vh("STORIES", 0, "stories");
        A09 = enumC64222vh;
        EnumC64222vh enumC64222vh2 = new EnumC64222vh("EXPLORE", 1, "explore");
        A04 = enumC64222vh2;
        EnumC64222vh enumC64222vh3 = new EnumC64222vh("FEED", 2, "feed");
        A06 = enumC64222vh3;
        EnumC64222vh enumC64222vh4 = new EnumC64222vh("CLIPS", 3, "clips");
        A03 = enumC64222vh4;
        EnumC64222vh enumC64222vh5 = new EnumC64222vh("IGTV", 4, "igtv");
        A07 = enumC64222vh5;
        EnumC64222vh enumC64222vh6 = new EnumC64222vh("EXPLORE_GRID", 5, "explore_grid");
        A05 = enumC64222vh6;
        EnumC64222vh enumC64222vh7 = new EnumC64222vh("PROFILE_FEED", 6, "profile_feed");
        A08 = enumC64222vh7;
        EnumC64222vh enumC64222vh8 = new EnumC64222vh("UNKNOWN", 7, "unknown");
        A0A = enumC64222vh8;
        EnumC64222vh[] enumC64222vhArr = {enumC64222vh, enumC64222vh2, enumC64222vh3, enumC64222vh4, enumC64222vh5, enumC64222vh6, enumC64222vh7, enumC64222vh8};
        A02 = enumC64222vhArr;
        A01 = AbstractC12190kN.A00(enumC64222vhArr);
    }

    public static EnumC64222vh valueOf(String str) {
        return (EnumC64222vh) Enum.valueOf(EnumC64222vh.class, str);
    }

    public static EnumC64222vh[] values() {
        return (EnumC64222vh[]) A02.clone();
    }

    public EnumC64222vh(String str, int i, String str2) {
        this.A00 = str2;
    }
}
