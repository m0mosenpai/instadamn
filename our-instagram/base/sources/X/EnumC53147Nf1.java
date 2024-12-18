package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53147Nf1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53147Nf1[] A01;
    public static final EnumC53147Nf1 A02;
    public static final EnumC53147Nf1 A03;
    public static final EnumC53147Nf1 A04;

    static {
        EnumC53147Nf1 enumC53147Nf1 = new EnumC53147Nf1("INIT", 0);
        A03 = enumC53147Nf1;
        EnumC53147Nf1 enumC53147Nf12 = new EnumC53147Nf1("ZERO_BALANCE", 1);
        A04 = enumC53147Nf12;
        EnumC53147Nf1 enumC53147Nf13 = new EnumC53147Nf1("DATA_BALANCE", 2);
        A02 = enumC53147Nf13;
        EnumC53147Nf1[] enumC53147Nf1Arr = {enumC53147Nf1, enumC53147Nf12, enumC53147Nf13};
        A01 = enumC53147Nf1Arr;
        A00 = AbstractC12190kN.A00(enumC53147Nf1Arr);
    }

    public static EnumC53147Nf1 valueOf(String str) {
        return (EnumC53147Nf1) Enum.valueOf(EnumC53147Nf1.class, str);
    }

    public static EnumC53147Nf1[] values() {
        return (EnumC53147Nf1[]) A01.clone();
    }

    public EnumC53147Nf1(String str, int i) {
    }
}
