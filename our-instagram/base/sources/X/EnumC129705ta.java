package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC129705ta {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC129705ta[] A02;
    public static final EnumC129705ta A03;
    public static final EnumC129705ta A04;
    public static final EnumC129705ta A05;
    public static final EnumC129705ta A06;
    public static final EnumC129705ta A07;
    public static final EnumC129705ta A08;
    public static final EnumC129705ta A09;
    public static final EnumC129705ta A0A;
    public static final EnumC129705ta A0B;
    public final int A00;

    static {
        EnumC129705ta enumC129705ta = new EnumC129705ta("INT", 0, 0);
        A06 = enumC129705ta;
        EnumC129705ta enumC129705ta2 = new EnumC129705ta("DOUBLE", 1, 1);
        A05 = enumC129705ta2;
        EnumC129705ta enumC129705ta3 = new EnumC129705ta("STRING", 2, 2);
        A0B = enumC129705ta3;
        EnumC129705ta enumC129705ta4 = new EnumC129705ta("BOOLEAN", 3, 3);
        A03 = enumC129705ta4;
        EnumC129705ta enumC129705ta5 = new EnumC129705ta("LIST_INT", 4, 4);
        A09 = enumC129705ta5;
        EnumC129705ta enumC129705ta6 = new EnumC129705ta("LIST_DOUBLE", 5, 5);
        A08 = enumC129705ta6;
        EnumC129705ta enumC129705ta7 = new EnumC129705ta("LIST_STRING", 6, 6);
        A0A = enumC129705ta7;
        EnumC129705ta enumC129705ta8 = new EnumC129705ta("LIST_BOOLEAN", 7, 7);
        A07 = enumC129705ta8;
        EnumC129705ta enumC129705ta9 = new EnumC129705ta("BYTE_ARRAY", 8, 8);
        A04 = enumC129705ta9;
        EnumC129705ta[] enumC129705taArr = {enumC129705ta, enumC129705ta2, enumC129705ta3, enumC129705ta4, enumC129705ta5, enumC129705ta6, enumC129705ta7, enumC129705ta8, enumC129705ta9};
        A02 = enumC129705taArr;
        A01 = AbstractC12190kN.A00(enumC129705taArr);
    }

    public static EnumC129705ta valueOf(String str) {
        return (EnumC129705ta) Enum.valueOf(EnumC129705ta.class, str);
    }

    public static EnumC129705ta[] values() {
        return (EnumC129705ta[]) A02.clone();
    }

    public EnumC129705ta(String str, int i, int i2) {
        this.A00 = i2;
    }
}
