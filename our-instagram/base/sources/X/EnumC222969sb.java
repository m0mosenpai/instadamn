package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222969sb {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222969sb[] A02;
    public static final EnumC222969sb A03;
    public static final EnumC222969sb A04;
    public static final EnumC222969sb A05;
    public static final EnumC222969sb A06;
    public static final EnumC222969sb A07;
    public static final EnumC222969sb A08;
    public static final EnumC222969sb A09;
    public static final EnumC222969sb A0A;
    public final int A00;

    static {
        EnumC222969sb enumC222969sb = new EnumC222969sb("LAYOUT", 0, 0);
        A06 = enumC222969sb;
        EnumC222969sb enumC222969sb2 = new EnumC222969sb("TEMPLATER", 1, 1);
        A09 = enumC222969sb2;
        EnumC222969sb enumC222969sb3 = new EnumC222969sb("SEGMENT", 2, 2);
        A08 = enumC222969sb3;
        EnumC222969sb enumC222969sb4 = new EnumC222969sb("TRANSITION", 3, 3);
        A0A = enumC222969sb4;
        EnumC222969sb enumC222969sb5 = new EnumC222969sb("EFFECT", 4, 4);
        A03 = enumC222969sb5;
        EnumC222969sb enumC222969sb6 = new EnumC222969sb("FILTER_PREPROCESS", 5, 5);
        A05 = enumC222969sb6;
        EnumC222969sb enumC222969sb7 = new EnumC222969sb("FILTER", 6, 6);
        A04 = enumC222969sb7;
        EnumC222969sb enumC222969sb8 = new EnumC222969sb("OVERLAY", 7, 7);
        A07 = enumC222969sb8;
        EnumC222969sb[] enumC222969sbArr = {enumC222969sb, enumC222969sb2, enumC222969sb3, enumC222969sb4, enumC222969sb5, enumC222969sb6, enumC222969sb7, enumC222969sb8, new EnumC222969sb("UNKNOWN", 8, Integer.MAX_VALUE)};
        A02 = enumC222969sbArr;
        A01 = AbstractC12190kN.A00(enumC222969sbArr);
    }

    public static EnumC222969sb valueOf(String str) {
        return (EnumC222969sb) Enum.valueOf(EnumC222969sb.class, str);
    }

    public static EnumC222969sb[] values() {
        return (EnumC222969sb[]) A02.clone();
    }

    public EnumC222969sb(String str, int i, int i2) {
        this.A00 = i2;
    }
}
