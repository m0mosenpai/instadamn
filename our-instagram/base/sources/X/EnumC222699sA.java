package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222699sA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222699sA[] A01;
    public static final EnumC222699sA A02;
    public static final EnumC222699sA A03;
    public static final EnumC222699sA A04;

    static {
        EnumC222699sA enumC222699sA = new EnumC222699sA("USER_INITIAL", 0);
        A04 = enumC222699sA;
        EnumC222699sA enumC222699sA2 = new EnumC222699sA("USER_EDITED", 1);
        A03 = enumC222699sA2;
        EnumC222699sA enumC222699sA3 = new EnumC222699sA("SUGGESTED", 2);
        A02 = enumC222699sA3;
        EnumC222699sA[] enumC222699sAArr = {enumC222699sA, enumC222699sA2, enumC222699sA3};
        A01 = enumC222699sAArr;
        A00 = AbstractC12190kN.A00(enumC222699sAArr);
    }

    public static EnumC222699sA valueOf(String str) {
        return (EnumC222699sA) Enum.valueOf(EnumC222699sA.class, str);
    }

    public static EnumC222699sA[] values() {
        return (EnumC222699sA[]) A01.clone();
    }

    public EnumC222699sA(String str, int i) {
    }
}
