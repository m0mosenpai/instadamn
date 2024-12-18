package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46155Kbt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46155Kbt[] A01;
    public static final EnumC46155Kbt A02;
    public static final EnumC46155Kbt A03;
    public static final EnumC46155Kbt A04;
    public static final EnumC46155Kbt A05;

    static {
        EnumC46155Kbt enumC46155Kbt = new EnumC46155Kbt("TOP", 0);
        A05 = enumC46155Kbt;
        EnumC46155Kbt enumC46155Kbt2 = new EnumC46155Kbt("LEFT", 1);
        A03 = enumC46155Kbt2;
        EnumC46155Kbt enumC46155Kbt3 = new EnumC46155Kbt("RIGHT", 2);
        A04 = enumC46155Kbt3;
        EnumC46155Kbt enumC46155Kbt4 = new EnumC46155Kbt("BOTTOM", 3);
        A02 = enumC46155Kbt4;
        EnumC46155Kbt[] enumC46155KbtArr = {enumC46155Kbt, enumC46155Kbt2, enumC46155Kbt3, enumC46155Kbt4};
        A01 = enumC46155KbtArr;
        A00 = AbstractC12190kN.A00(enumC46155KbtArr);
    }

    public static EnumC46155Kbt valueOf(String str) {
        return (EnumC46155Kbt) Enum.valueOf(EnumC46155Kbt.class, str);
    }

    public static EnumC46155Kbt[] values() {
        return (EnumC46155Kbt[]) A01.clone();
    }

    public EnumC46155Kbt(String str, int i) {
    }
}
