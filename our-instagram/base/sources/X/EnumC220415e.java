package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.15e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC220415e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC220415e[] A01;
    public static final EnumC220415e A02;
    public static final EnumC220415e A03;
    public static final EnumC220415e A04;

    static {
        EnumC220415e enumC220415e = new EnumC220415e("NORMAL", 0);
        A03 = enumC220415e;
        EnumC220415e enumC220415e2 = new EnumC220415e("UI", 1);
        A04 = enumC220415e2;
        EnumC220415e enumC220415e3 = new EnumC220415e("IMMEDIATE", 2);
        A02 = enumC220415e3;
        EnumC220415e[] enumC220415eArr = {enumC220415e, enumC220415e2, enumC220415e3};
        A01 = enumC220415eArr;
        A00 = AbstractC12190kN.A00(enumC220415eArr);
    }

    public static EnumC220415e valueOf(String str) {
        return (EnumC220415e) Enum.valueOf(EnumC220415e.class, str);
    }

    public static EnumC220415e[] values() {
        return (EnumC220415e[]) A01.clone();
    }

    public EnumC220415e(String str, int i) {
    }
}
