package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nff, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53183Nff {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53183Nff[] A01;
    public static final EnumC53183Nff A02;
    public static final EnumC53183Nff A03;
    public static final EnumC53183Nff A04;
    public static final EnumC53183Nff A05;
    public static final EnumC53183Nff A06;
    public static final EnumC53183Nff A07;
    public static final EnumC53183Nff A08;
    public static final EnumC53183Nff A09;

    static {
        EnumC53183Nff enumC53183Nff = new EnumC53183Nff("BACK", 0);
        A02 = enumC53183Nff;
        EnumC53183Nff enumC53183Nff2 = new EnumC53183Nff("NEXT", 1);
        A08 = enumC53183Nff2;
        EnumC53183Nff enumC53183Nff3 = new EnumC53183Nff("CHECK", 2);
        A05 = enumC53183Nff3;
        EnumC53183Nff enumC53183Nff4 = new EnumC53183Nff("CANCEL", 3);
        A04 = enumC53183Nff4;
        EnumC53183Nff enumC53183Nff5 = new EnumC53183Nff("FINISH", 4);
        A06 = enumC53183Nff5;
        EnumC53183Nff enumC53183Nff6 = new EnumC53183Nff("GONE", 5);
        A07 = enumC53183Nff6;
        EnumC53183Nff enumC53183Nff7 = new EnumC53183Nff("SIMPLE_CHECK", 6);
        A09 = enumC53183Nff7;
        EnumC53183Nff enumC53183Nff8 = new EnumC53183Nff("BACK_CARROT", 7);
        A03 = enumC53183Nff8;
        EnumC53183Nff[] enumC53183NffArr = {enumC53183Nff, enumC53183Nff2, enumC53183Nff3, enumC53183Nff4, enumC53183Nff5, enumC53183Nff6, enumC53183Nff7, enumC53183Nff8};
        A01 = enumC53183NffArr;
        A00 = AbstractC12190kN.A00(enumC53183NffArr);
    }

    public static EnumC53183Nff valueOf(String str) {
        return (EnumC53183Nff) Enum.valueOf(EnumC53183Nff.class, str);
    }

    public static EnumC53183Nff[] values() {
        return (EnumC53183Nff[]) A01.clone();
    }

    public EnumC53183Nff(String str, int i) {
    }
}
