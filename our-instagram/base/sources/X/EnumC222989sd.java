package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222989sd {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222989sd[] A02;
    public static final EnumC222989sd A03;
    public static final EnumC222989sd A04;
    public static final EnumC222989sd A05;
    public static final EnumC222989sd A06;
    public static final EnumC222989sd A07;
    public static final EnumC222989sd A08;
    public static final EnumC222989sd A09;
    public static final EnumC222989sd A0A;
    public static final EnumC222989sd A0B;
    public static final EnumC222989sd A0C;
    public final int A00;

    static {
        EnumC222989sd enumC222989sd = new EnumC222989sd("YOUR_STORY", 0, 0);
        A0C = enumC222989sd;
        EnumC222989sd enumC222989sd2 = new EnumC222989sd("CLOSE_FRIENDS", 1, 1);
        A04 = enumC222989sd2;
        EnumC222989sd enumC222989sd3 = new EnumC222989sd("EXCLUSIVE_STORY", 2, 2);
        A05 = enumC222989sd3;
        EnumC222989sd enumC222989sd4 = new EnumC222989sd("GROUP_PROFILE", 3, 3);
        A06 = enumC222989sd4;
        EnumC222989sd enumC222989sd5 = new EnumC222989sd("TARGET_GROUP_PROFILE", 4, 7);
        A0B = enumC222989sd5;
        EnumC222989sd enumC222989sd6 = new EnumC222989sd("HIGHLIGHTS", 5, 7);
        A08 = enumC222989sd6;
        EnumC222989sd enumC222989sd7 = new EnumC222989sd("AUDIENCE_LISTS", 6, 9);
        A03 = enumC222989sd7;
        EnumC222989sd enumC222989sd8 = new EnumC222989sd("HALL_PASS", 7, 10);
        A07 = enumC222989sd8;
        EnumC222989sd enumC222989sd9 = new EnumC222989sd("OPAL", 8, 11);
        A0A = enumC222989sd9;
        EnumC222989sd enumC222989sd10 = new EnumC222989sd("MY_WEEK", 9, 12);
        A09 = enumC222989sd10;
        EnumC222989sd[] enumC222989sdArr = {enumC222989sd, enumC222989sd2, enumC222989sd3, enumC222989sd4, enumC222989sd5, enumC222989sd6, enumC222989sd7, enumC222989sd8, enumC222989sd9, enumC222989sd10, new EnumC222989sd("CAMPFIRE", 10, 13)};
        A02 = enumC222989sdArr;
        A01 = AbstractC12190kN.A00(enumC222989sdArr);
    }

    public static EnumC222989sd valueOf(String str) {
        return (EnumC222989sd) Enum.valueOf(EnumC222989sd.class, str);
    }

    public static EnumC222989sd[] values() {
        return (EnumC222989sd[]) A02.clone();
    }

    public EnumC222989sd(String str, int i, int i2) {
        this.A00 = i2;
    }
}
