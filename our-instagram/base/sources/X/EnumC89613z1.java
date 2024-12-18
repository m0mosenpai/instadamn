package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC89613z1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC89613z1[] A01;
    public static final EnumC89613z1 A02;
    public static final EnumC89613z1 A03;
    public static final EnumC89613z1 A04;
    public static final EnumC89613z1 A05;
    public static final EnumC89613z1 A06;
    public static final EnumC89613z1 A07;
    public static final EnumC89613z1 A08;

    static {
        EnumC89613z1 enumC89613z1 = new EnumC89613z1("SECONDS", 0);
        A06 = enumC89613z1;
        EnumC89613z1 enumC89613z12 = new EnumC89613z1("MINUTES", 1);
        A04 = enumC89613z12;
        EnumC89613z1 enumC89613z13 = new EnumC89613z1("HOURS", 2);
        A03 = enumC89613z13;
        EnumC89613z1 enumC89613z14 = new EnumC89613z1("DAYS", 3);
        A02 = enumC89613z14;
        EnumC89613z1 enumC89613z15 = new EnumC89613z1("WEEKS", 4);
        A07 = enumC89613z15;
        EnumC89613z1 enumC89613z16 = new EnumC89613z1("MONTHS", 5);
        A05 = enumC89613z16;
        EnumC89613z1 enumC89613z17 = new EnumC89613z1("YEARS", 6);
        A08 = enumC89613z17;
        EnumC89613z1[] enumC89613z1Arr = {enumC89613z1, enumC89613z12, enumC89613z13, enumC89613z14, enumC89613z15, enumC89613z16, enumC89613z17};
        A01 = enumC89613z1Arr;
        A00 = AbstractC12190kN.A00(enumC89613z1Arr);
    }

    public static EnumC89613z1 valueOf(String str) {
        return (EnumC89613z1) Enum.valueOf(EnumC89613z1.class, str);
    }

    public static EnumC89613z1[] values() {
        return (EnumC89613z1[]) A01.clone();
    }

    public EnumC89613z1(String str, int i) {
    }
}
