package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53269Nh7 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53269Nh7[] A04;
    public static final EnumC53269Nh7 A05;
    public static final EnumC53269Nh7 A06;
    public static final EnumC53269Nh7 A07;
    public static final EnumC53269Nh7 A08;
    public final int A00;
    public final EnumC151036r4 A01;
    public final EnumC151036r4 A02;

    static {
        EnumC151036r4 enumC151036r4 = EnumC151036r4.A0D;
        EnumC53269Nh7 enumC53269Nh7 = new EnumC53269Nh7(enumC151036r4, enumC151036r4, "SELECTED_PRIMARY", 0, 0);
        A05 = enumC53269Nh7;
        EnumC151036r4 enumC151036r42 = EnumC151036r4.A0F;
        EnumC53269Nh7 enumC53269Nh72 = new EnumC53269Nh7(enumC151036r42, enumC151036r4, "SELECTED_SECONDARY", 1, 1);
        A06 = enumC53269Nh72;
        EnumC53269Nh7 enumC53269Nh73 = new EnumC53269Nh7(enumC151036r4, EnumC151036r4.A0C, "TOGGLED_DEFAULT_ON_BLACK", 2, 2);
        A07 = enumC53269Nh73;
        EnumC53269Nh7 enumC53269Nh74 = new EnumC53269Nh7(enumC151036r4, enumC151036r42, "TOGGLED_SECONDARY", 3, 3);
        A08 = enumC53269Nh74;
        EnumC53269Nh7[] enumC53269Nh7Arr = {enumC53269Nh7, enumC53269Nh72, enumC53269Nh73, enumC53269Nh74};
        A04 = enumC53269Nh7Arr;
        A03 = AbstractC12190kN.A00(enumC53269Nh7Arr);
    }

    public static EnumC53269Nh7 valueOf(String str) {
        return (EnumC53269Nh7) Enum.valueOf(EnumC53269Nh7.class, str);
    }

    public static EnumC53269Nh7[] values() {
        return (EnumC53269Nh7[]) A04.clone();
    }

    public EnumC53269Nh7(EnumC151036r4 enumC151036r4, EnumC151036r4 enumC151036r42, String str, int i, int i2) {
        this.A01 = enumC151036r4;
        this.A02 = enumC151036r42;
        this.A00 = i2;
    }
}
