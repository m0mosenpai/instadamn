package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.PzW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC58659PzW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC58659PzW[] A01;
    public static final EnumC58659PzW A02;
    public static final EnumC58659PzW A03;
    public static final EnumC58659PzW A04;
    public static final EnumC58659PzW A05;
    public static final EnumC58659PzW A06;

    static {
        EnumC58659PzW enumC58659PzW = new EnumC58659PzW("ReadObject", 0);
        A06 = enumC58659PzW;
        EnumC58659PzW enumC58659PzW2 = new EnumC58659PzW("ObjectReadName", 1);
        A03 = enumC58659PzW2;
        EnumC58659PzW enumC58659PzW3 = new EnumC58659PzW("ObjectReadValue", 2);
        A04 = enumC58659PzW3;
        EnumC58659PzW enumC58659PzW4 = new EnumC58659PzW("ReadArray", 3);
        A05 = enumC58659PzW4;
        EnumC58659PzW enumC58659PzW5 = new EnumC58659PzW("ArrayReadValue", 4);
        A02 = enumC58659PzW5;
        EnumC58659PzW[] enumC58659PzWArr = {enumC58659PzW, enumC58659PzW2, enumC58659PzW3, enumC58659PzW4, enumC58659PzW5};
        A01 = enumC58659PzWArr;
        A00 = AbstractC12190kN.A00(enumC58659PzWArr);
    }

    public static EnumC58659PzW valueOf(String str) {
        return (EnumC58659PzW) Enum.valueOf(EnumC58659PzW.class, str);
    }

    public static EnumC58659PzW[] values() {
        return (EnumC58659PzW[]) A01.clone();
    }

    public EnumC58659PzW(String str, int i) {
    }
}
