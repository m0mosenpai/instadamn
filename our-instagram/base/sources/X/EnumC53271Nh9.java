package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53271Nh9 {
    public static final HashMap A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC53271Nh9[] A05;
    public static final EnumC53271Nh9 A06;
    public static final EnumC53271Nh9 A07;
    public static final EnumC53271Nh9 A08;
    public static final EnumC53271Nh9 A09;
    public final int A00;
    public final String A01;
    public final String A02;

    public static EnumC53271Nh9 valueOf(String str) {
        return (EnumC53271Nh9) Enum.valueOf(EnumC53271Nh9.class, str);
    }

    public static EnumC53271Nh9[] values() {
        return (EnumC53271Nh9[]) A05.clone();
    }

    static {
        EnumC53271Nh9 enumC53271Nh9 = new EnumC53271Nh9("POSTS", 0, "posts_archive", 2131969858, "archive_feed");
        A07 = enumC53271Nh9;
        EnumC53271Nh9 enumC53271Nh92 = new EnumC53271Nh9("STORY", 1, "stories_archive", 2131974453, "archive_stories");
        A09 = enumC53271Nh92;
        EnumC53271Nh9 enumC53271Nh93 = new EnumC53271Nh9("LIVE", 2, "live_archive", 2131965305, "archive_live");
        A06 = enumC53271Nh93;
        EnumC53271Nh9 enumC53271Nh94 = new EnumC53271Nh9("QUICK_SNAP", 3, "quick_snap_archive", 2131971276, "archive_quick_snap");
        A08 = enumC53271Nh94;
        EnumC53271Nh9[] enumC53271Nh9Arr = {enumC53271Nh9, enumC53271Nh92, enumC53271Nh93, enumC53271Nh94};
        A05 = enumC53271Nh9Arr;
        A04 = AbstractC12190kN.A00(enumC53271Nh9Arr);
        A03 = AbstractC166987dD.A1G();
        for (EnumC53271Nh9 enumC53271Nh95 : values()) {
            A03.put(enumC53271Nh95.A01, enumC53271Nh95);
        }
    }

    public EnumC53271Nh9(String str, int i, String str2, int i2, String str3) {
        this.A01 = str2;
        this.A00 = i2;
        this.A02 = str3;
    }
}
