package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GjA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37735GjA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC37735GjA[] A01;
    public static final EnumC37735GjA A02;
    public static final EnumC37735GjA A03;
    public static final EnumC37735GjA A04;
    public static final EnumC37735GjA A05;
    public static final EnumC37735GjA A06;
    public static final EnumC37735GjA A07;
    public static final EnumC37735GjA A08;
    public static final EnumC37735GjA A09;

    public static EnumC37735GjA valueOf(String str) {
        return (EnumC37735GjA) Enum.valueOf(EnumC37735GjA.class, str);
    }

    public static EnumC37735GjA[] values() {
        return (EnumC37735GjA[]) A01.clone();
    }

    static {
        EnumC37735GjA enumC37735GjA = new EnumC37735GjA("UNRECOGNIZED", 0);
        A09 = enumC37735GjA;
        EnumC37735GjA enumC37735GjA2 = new EnumC37735GjA("CLIPS", 1);
        A06 = enumC37735GjA2;
        EnumC37735GjA enumC37735GjA3 = new EnumC37735GjA("CAROUSEL_WITH_PHOTO_IN_FIRST_POSITION", 2);
        A04 = enumC37735GjA3;
        EnumC37735GjA enumC37735GjA4 = new EnumC37735GjA("CAROUSEL_WITH_VIDEO_IN_FIRST_POSITION", 3);
        A05 = enumC37735GjA4;
        EnumC37735GjA enumC37735GjA5 = new EnumC37735GjA("CAROUSEL_WITH_MUSIC", 4);
        A03 = enumC37735GjA5;
        EnumC37735GjA enumC37735GjA6 = new EnumC37735GjA("PHOTO_WITHOUT_MUSIC", 5);
        A07 = enumC37735GjA6;
        EnumC37735GjA enumC37735GjA7 = new EnumC37735GjA("PHOTO_WITH_MUSIC", 6);
        A08 = enumC37735GjA7;
        EnumC37735GjA enumC37735GjA8 = new EnumC37735GjA("ADS", 7);
        A02 = enumC37735GjA8;
        EnumC37735GjA[] enumC37735GjAArr = {enumC37735GjA, enumC37735GjA2, enumC37735GjA3, enumC37735GjA4, enumC37735GjA5, enumC37735GjA6, enumC37735GjA7, enumC37735GjA8};
        A01 = enumC37735GjAArr;
        A00 = AbstractC12190kN.A00(enumC37735GjAArr);
    }

    public EnumC37735GjA(String str, int i) {
    }
}
