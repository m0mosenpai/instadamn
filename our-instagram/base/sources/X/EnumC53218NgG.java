package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53218NgG {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53218NgG[] A02;
    public static final EnumC53218NgG A03;
    public static final EnumC53218NgG A04;
    public static final EnumC53218NgG A05;
    public static final EnumC53218NgG A06;
    public final int A00;

    static {
        EnumC53218NgG enumC53218NgG = new EnumC53218NgG("BASELINE", 0, 0);
        A03 = enumC53218NgG;
        EnumC53218NgG enumC53218NgG2 = new EnumC53218NgG("HIGH", 1, 1);
        A04 = enumC53218NgG2;
        EnumC53218NgG enumC53218NgG3 = new EnumC53218NgG("HIGH31", 2, 2);
        A05 = enumC53218NgG3;
        EnumC53218NgG enumC53218NgG4 = new EnumC53218NgG("MAIN", 3, 3);
        A06 = enumC53218NgG4;
        EnumC53218NgG[] enumC53218NgGArr = {enumC53218NgG, enumC53218NgG2, enumC53218NgG3, enumC53218NgG4};
        A02 = enumC53218NgGArr;
        A01 = AbstractC12190kN.A00(enumC53218NgGArr);
    }

    public static EnumC53218NgG valueOf(String str) {
        return (EnumC53218NgG) Enum.valueOf(EnumC53218NgG.class, str);
    }

    public static EnumC53218NgG[] values() {
        return (EnumC53218NgG[]) A02.clone();
    }

    public EnumC53218NgG(String str, int i, int i2) {
        this.A00 = i2;
    }
}
