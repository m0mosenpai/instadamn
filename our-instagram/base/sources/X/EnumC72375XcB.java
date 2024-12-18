package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72375XcB {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72375XcB[] A02;
    public static final EnumC72375XcB A03;
    public static final EnumC72375XcB A04;
    public static final EnumC72375XcB A05;
    public static final EnumC72375XcB A06;
    public static final EnumC72375XcB A07;
    public static final EnumC72375XcB A08;
    public static final EnumC72375XcB A09;
    public static final EnumC72375XcB A0A;
    public final String A00;

    static {
        EnumC72375XcB enumC72375XcB = new EnumC72375XcB("TAG_SETTINGS", 0, "tag_settings");
        A09 = enumC72375XcB;
        EnumC72375XcB enumC72375XcB2 = new EnumC72375XcB("REMIX_SETTINGS", 1, "remix_settings");
        A08 = enumC72375XcB2;
        EnumC72375XcB enumC72375XcB3 = new EnumC72375XcB("DIRECT_MESSAGE_SETTINGS", 2, "dm_settings");
        A06 = enumC72375XcB3;
        EnumC72375XcB enumC72375XcB4 = new EnumC72375XcB("UNLIKED_YOUR_ACTIVITY", 3, "unliked_your_activity");
        A0A = enumC72375XcB4;
        EnumC72375XcB enumC72375XcB5 = new EnumC72375XcB("BULK_DELETE_YOUR_ACTIVITY", 4, "bulk_delete_your_activity");
        A03 = enumC72375XcB5;
        EnumC72375XcB enumC72375XcB6 = new EnumC72375XcB("CUSTOM_COMMENT_FILTER", 5, "custom_comment_filter");
        A05 = enumC72375XcB6;
        EnumC72375XcB enumC72375XcB7 = new EnumC72375XcB("CONTACT_POINT_UPDATE", 6, "contact_point_update");
        A04 = enumC72375XcB7;
        EnumC72375XcB enumC72375XcB8 = new EnumC72375XcB("LIKE_VISIBILITY_SETTING", 7, "like_visibility_setting");
        A07 = enumC72375XcB8;
        EnumC72375XcB[] enumC72375XcBArr = {enumC72375XcB, enumC72375XcB2, enumC72375XcB3, enumC72375XcB4, enumC72375XcB5, enumC72375XcB6, enumC72375XcB7, enumC72375XcB8};
        A02 = enumC72375XcBArr;
        A01 = AbstractC12190kN.A00(enumC72375XcBArr);
    }

    public static EnumC72375XcB valueOf(String str) {
        return (EnumC72375XcB) Enum.valueOf(EnumC72375XcB.class, str);
    }

    public static EnumC72375XcB[] values() {
        return (EnumC72375XcB[]) A02.clone();
    }

    public EnumC72375XcB(String str, int i, String str2) {
        this.A00 = str2;
    }
}
