package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46148Kbm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46148Kbm[] A01;
    public static final EnumC46148Kbm A02;
    public static final EnumC46148Kbm A03;
    public static final EnumC46148Kbm A04;

    static {
        EnumC46148Kbm enumC46148Kbm = new EnumC46148Kbm("OK", 0);
        A03 = enumC46148Kbm;
        EnumC46148Kbm enumC46148Kbm2 = new EnumC46148Kbm("VIDEO_TOO_LONG", 1);
        A04 = enumC46148Kbm2;
        EnumC46148Kbm enumC46148Kbm3 = new EnumC46148Kbm("MUSIC_SHARING_BLOCKED", 2);
        A02 = enumC46148Kbm3;
        EnumC46148Kbm[] enumC46148KbmArr = {enumC46148Kbm, enumC46148Kbm2, enumC46148Kbm3};
        A01 = enumC46148KbmArr;
        A00 = AbstractC12190kN.A00(enumC46148KbmArr);
    }

    public static EnumC46148Kbm valueOf(String str) {
        return (EnumC46148Kbm) Enum.valueOf(EnumC46148Kbm.class, str);
    }

    public static EnumC46148Kbm[] values() {
        return (EnumC46148Kbm[]) A01.clone();
    }

    public EnumC46148Kbm(String str, int i) {
    }
}
