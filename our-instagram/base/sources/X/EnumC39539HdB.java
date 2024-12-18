package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39539HdB {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39539HdB[] A01;
    public static final EnumC39539HdB A02;
    public static final EnumC39539HdB A03;
    public static final EnumC39539HdB A04;

    static {
        EnumC39539HdB enumC39539HdB = new EnumC39539HdB("LOADING", 0);
        A04 = enumC39539HdB;
        EnumC39539HdB enumC39539HdB2 = new EnumC39539HdB("LOADED", 1);
        A03 = enumC39539HdB2;
        EnumC39539HdB enumC39539HdB3 = new EnumC39539HdB("FAILED", 2);
        A02 = enumC39539HdB3;
        EnumC39539HdB[] enumC39539HdBArr = {enumC39539HdB, enumC39539HdB2, enumC39539HdB3};
        A01 = enumC39539HdBArr;
        A00 = AbstractC12190kN.A00(enumC39539HdBArr);
    }

    public static EnumC39539HdB valueOf(String str) {
        return (EnumC39539HdB) Enum.valueOf(EnumC39539HdB.class, str);
    }

    public static EnumC39539HdB[] values() {
        return (EnumC39539HdB[]) A01.clone();
    }

    public EnumC39539HdB(String str, int i) {
    }
}
