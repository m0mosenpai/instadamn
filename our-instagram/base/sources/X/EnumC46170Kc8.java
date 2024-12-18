package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46170Kc8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46170Kc8[] A01;
    public static final EnumC46170Kc8 A02;
    public static final EnumC46170Kc8 A03;
    public static final EnumC46170Kc8 A04;
    public static final EnumC46170Kc8 A05;
    public static final EnumC46170Kc8 A06;
    public static final EnumC46170Kc8 A07;

    static {
        EnumC46170Kc8 enumC46170Kc8 = new EnumC46170Kc8("AVATAR_EDIT", 0);
        A03 = enumC46170Kc8;
        EnumC46170Kc8 enumC46170Kc82 = new EnumC46170Kc8("AI_TRY_AGAIN", 1);
        A02 = enumC46170Kc82;
        EnumC46170Kc8 enumC46170Kc83 = new EnumC46170Kc8("CUTOUT_STICKER_SEE_MORE", 2);
        A04 = enumC46170Kc83;
        EnumC46170Kc8 enumC46170Kc84 = new EnumC46170Kc8("GIPHY_STICKER_SEE_MORE", 3);
        A06 = enumC46170Kc84;
        EnumC46170Kc8 enumC46170Kc85 = new EnumC46170Kc8("FAVORITE_STICKER_SEE_MORE", 4);
        A05 = enumC46170Kc85;
        EnumC46170Kc8 enumC46170Kc86 = new EnumC46170Kc8("RECENT_STICKER_SEE_MORE", 5);
        A07 = enumC46170Kc86;
        EnumC46170Kc8[] enumC46170Kc8Arr = {enumC46170Kc8, enumC46170Kc82, enumC46170Kc83, enumC46170Kc84, enumC46170Kc85, enumC46170Kc86};
        A01 = enumC46170Kc8Arr;
        A00 = AbstractC12190kN.A00(enumC46170Kc8Arr);
    }

    public static EnumC46170Kc8 valueOf(String str) {
        return (EnumC46170Kc8) Enum.valueOf(EnumC46170Kc8.class, str);
    }

    public static EnumC46170Kc8[] values() {
        return (EnumC46170Kc8[]) A01.clone();
    }

    public EnumC46170Kc8(String str, int i) {
    }
}
