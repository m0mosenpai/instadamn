package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46157Kbv {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46157Kbv[] A01;
    public static final EnumC46157Kbv A02;
    public static final EnumC46157Kbv A03;
    public static final EnumC46157Kbv A04;
    public static final EnumC46157Kbv A05;

    static {
        EnumC46157Kbv enumC46157Kbv = new EnumC46157Kbv("GENERAL", 0);
        A02 = enumC46157Kbv;
        EnumC46157Kbv enumC46157Kbv2 = new EnumC46157Kbv("LIVE", 1);
        A03 = enumC46157Kbv2;
        EnumC46157Kbv enumC46157Kbv3 = new EnumC46157Kbv("STORY", 2);
        A05 = enumC46157Kbv3;
        EnumC46157Kbv enumC46157Kbv4 = new EnumC46157Kbv("REELS", 3);
        A04 = enumC46157Kbv4;
        EnumC46157Kbv[] enumC46157KbvArr = {enumC46157Kbv, enumC46157Kbv2, enumC46157Kbv3, enumC46157Kbv4};
        A01 = enumC46157KbvArr;
        A00 = AbstractC12190kN.A00(enumC46157KbvArr);
    }

    public static EnumC46157Kbv valueOf(String str) {
        return (EnumC46157Kbv) Enum.valueOf(EnumC46157Kbv.class, str);
    }

    public static EnumC46157Kbv[] values() {
        return (EnumC46157Kbv[]) A01.clone();
    }

    public EnumC46157Kbv(String str, int i) {
    }
}
