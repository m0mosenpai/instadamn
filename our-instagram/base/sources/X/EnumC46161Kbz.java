package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46161Kbz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46161Kbz[] A01;
    public static final EnumC46161Kbz A02;
    public static final EnumC46161Kbz A03;
    public static final EnumC46161Kbz A04;
    public static final EnumC46161Kbz A05;

    static {
        EnumC46161Kbz enumC46161Kbz = new EnumC46161Kbz("PERMANENT", 0);
        A05 = enumC46161Kbz;
        EnumC46161Kbz enumC46161Kbz2 = new EnumC46161Kbz("NUX", 1);
        A04 = enumC46161Kbz2;
        EnumC46161Kbz enumC46161Kbz3 = new EnumC46161Kbz("INLINE_NUX", 2);
        A03 = enumC46161Kbz3;
        EnumC46161Kbz enumC46161Kbz4 = new EnumC46161Kbz("DEEP_LINK", 3);
        A02 = enumC46161Kbz4;
        EnumC46161Kbz[] enumC46161KbzArr = {enumC46161Kbz, enumC46161Kbz2, enumC46161Kbz3, enumC46161Kbz4, new EnumC46161Kbz("SAVED_COLLECTIONS", 4)};
        A01 = enumC46161KbzArr;
        A00 = AbstractC12190kN.A00(enumC46161KbzArr);
    }

    public static EnumC46161Kbz valueOf(String str) {
        return (EnumC46161Kbz) Enum.valueOf(EnumC46161Kbz.class, str);
    }

    public static EnumC46161Kbz[] values() {
        return (EnumC46161Kbz[]) A01.clone();
    }

    public EnumC46161Kbz(String str, int i) {
    }
}
