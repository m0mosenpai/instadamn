package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39538HdA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39538HdA[] A01;
    public static final EnumC39538HdA A02;
    public static final EnumC39538HdA A03;
    public static final EnumC39538HdA A04;

    static {
        EnumC39538HdA enumC39538HdA = new EnumC39538HdA("LOADING", 0);
        A03 = enumC39538HdA;
        EnumC39538HdA enumC39538HdA2 = new EnumC39538HdA("NEEDS_RETRY", 1);
        A04 = enumC39538HdA2;
        EnumC39538HdA enumC39538HdA3 = new EnumC39538HdA("LOADED", 2);
        A02 = enumC39538HdA3;
        EnumC39538HdA[] enumC39538HdAArr = {enumC39538HdA, enumC39538HdA2, enumC39538HdA3};
        A01 = enumC39538HdAArr;
        A00 = AbstractC12190kN.A00(enumC39538HdAArr);
    }

    public static EnumC39538HdA valueOf(String str) {
        return (EnumC39538HdA) Enum.valueOf(EnumC39538HdA.class, str);
    }

    public static EnumC39538HdA[] values() {
        return (EnumC39538HdA[]) A01.clone();
    }

    public EnumC39538HdA(String str, int i) {
    }
}
