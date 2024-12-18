package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC206089Ap {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC206089Ap[] A04;
    public static final EnumC206089Ap A05;
    public static final EnumC206089Ap A06;
    public static final EnumC206089Ap A07;
    public static final EnumC206089Ap A08;
    public static final EnumC206089Ap A09;
    public static final EnumC206089Ap A0A;
    public static final EnumC206089Ap A0B;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        EnumC206089Ap enumC206089Ap = new EnumC206089Ap("SUNDAY", 0, 0, 1, "SUNDAY");
        A08 = enumC206089Ap;
        EnumC206089Ap enumC206089Ap2 = new EnumC206089Ap("MONDAY", 1, 1, 2, "MONDAY");
        A06 = enumC206089Ap2;
        EnumC206089Ap enumC206089Ap3 = new EnumC206089Ap("TUESDAY", 2, 2, 3, "TUESDAY");
        A0A = enumC206089Ap3;
        EnumC206089Ap enumC206089Ap4 = new EnumC206089Ap("WEDNESDAY", 3, 3, 4, "WEDNESDAY");
        A0B = enumC206089Ap4;
        EnumC206089Ap enumC206089Ap5 = new EnumC206089Ap("THURSDAY", 4, 4, 5, "THURSDAY");
        A09 = enumC206089Ap5;
        EnumC206089Ap enumC206089Ap6 = new EnumC206089Ap("FRIDAY", 5, 5, 6, "FRIDAY");
        A05 = enumC206089Ap6;
        EnumC206089Ap enumC206089Ap7 = new EnumC206089Ap("SATURDAY", 6, 6, 7, "SATURDAY");
        A07 = enumC206089Ap7;
        EnumC206089Ap[] enumC206089ApArr = {enumC206089Ap, enumC206089Ap2, enumC206089Ap3, enumC206089Ap4, enumC206089Ap5, enumC206089Ap6, enumC206089Ap7};
        A04 = enumC206089ApArr;
        A03 = AbstractC12190kN.A00(enumC206089ApArr);
    }

    public static EnumC206089Ap valueOf(String str) {
        return (EnumC206089Ap) Enum.valueOf(EnumC206089Ap.class, str);
    }

    public static EnumC206089Ap[] values() {
        return (EnumC206089Ap[]) A04.clone();
    }

    public EnumC206089Ap(String str, int i, int i2, int i3, String str2) {
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = i3;
    }
}
