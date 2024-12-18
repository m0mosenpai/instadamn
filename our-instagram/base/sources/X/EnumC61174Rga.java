package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rga, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61174Rga {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61174Rga[] A02;
    public static final EnumC61174Rga A03;
    public static final EnumC61174Rga A04;
    public static final EnumC61174Rga A05;
    public static final EnumC61174Rga A06;
    public static final EnumC61174Rga A07;
    public static final EnumC61174Rga A08;
    public static final EnumC61174Rga A09;
    public static final EnumC61174Rga A0A;
    public static final EnumC61174Rga A0B;
    public static final EnumC61174Rga A0C;
    public static final EnumC61174Rga A0D;
    public static final EnumC61174Rga A0E;
    public static final EnumC61174Rga A0F;
    public static final EnumC61174Rga A0G;
    public static final EnumC61174Rga A0H;
    public static final EnumC61174Rga A0I;
    public final int A00;

    static {
        EnumC61174Rga enumC61174Rga = new EnumC61174Rga("INT", 0, 0);
        A07 = enumC61174Rga;
        EnumC61174Rga enumC61174Rga2 = new EnumC61174Rga("FLOAT", 1, 1);
        A05 = enumC61174Rga2;
        EnumC61174Rga enumC61174Rga3 = new EnumC61174Rga("STRING", 2, 2);
        A0H = enumC61174Rga3;
        EnumC61174Rga enumC61174Rga4 = new EnumC61174Rga("BINARY", 3, 3);
        A03 = enumC61174Rga4;
        EnumC61174Rga enumC61174Rga5 = new EnumC61174Rga("INT_LIST", 4, 4);
        A08 = enumC61174Rga5;
        EnumC61174Rga enumC61174Rga6 = new EnumC61174Rga("FLOAT_LIST", 5, 5);
        A06 = enumC61174Rga6;
        EnumC61174Rga enumC61174Rga7 = new EnumC61174Rga("STRING_LIST", 6, 6);
        A0I = enumC61174Rga7;
        EnumC61174Rga enumC61174Rga8 = new EnumC61174Rga("BINARY_LIST", 7, 7);
        A04 = enumC61174Rga8;
        EnumC61174Rga enumC61174Rga9 = new EnumC61174Rga("MAPPED_INT", 8, 8);
        A0D = enumC61174Rga9;
        EnumC61174Rga enumC61174Rga10 = new EnumC61174Rga("MAPPED_FLOAT", 9, 9);
        A0B = enumC61174Rga10;
        EnumC61174Rga enumC61174Rga11 = new EnumC61174Rga("MAPPED_STRING", 10, 10);
        A0F = enumC61174Rga11;
        EnumC61174Rga enumC61174Rga12 = new EnumC61174Rga("MAPPED_BINARY", 11, 11);
        A09 = enumC61174Rga12;
        EnumC61174Rga enumC61174Rga13 = new EnumC61174Rga("MAPPED_INT_LIST", 12, 12);
        A0E = enumC61174Rga13;
        EnumC61174Rga enumC61174Rga14 = new EnumC61174Rga("MAPPED_FLOAT_LIST", 13, 13);
        A0C = enumC61174Rga14;
        EnumC61174Rga enumC61174Rga15 = new EnumC61174Rga("MAPPED_STRING_LIST", 14, 14);
        A0G = enumC61174Rga15;
        EnumC61174Rga enumC61174Rga16 = new EnumC61174Rga("MAPPED_BINARY_LIST", 15, 15);
        A0A = enumC61174Rga16;
        EnumC61174Rga[] enumC61174RgaArr = {enumC61174Rga, enumC61174Rga2, enumC61174Rga3, enumC61174Rga4, enumC61174Rga5, enumC61174Rga6, enumC61174Rga7, enumC61174Rga8, enumC61174Rga9, enumC61174Rga10, enumC61174Rga11, enumC61174Rga12, enumC61174Rga13, enumC61174Rga14, enumC61174Rga15, enumC61174Rga16, new EnumC61174Rga("MAPPED_INT_TO_FLOAT_MAP", 16, 16)};
        A02 = enumC61174RgaArr;
        A01 = AbstractC12190kN.A00(enumC61174RgaArr);
    }

    public static EnumC61174Rga valueOf(String str) {
        return (EnumC61174Rga) Enum.valueOf(EnumC61174Rga.class, str);
    }

    public static EnumC61174Rga[] values() {
        return (EnumC61174Rga[]) A02.clone();
    }

    public EnumC61174Rga(String str, int i, int i2) {
        this.A00 = i2;
    }
}
