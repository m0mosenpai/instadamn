package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GkA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37795GkA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC37795GkA[] A02;
    public static final EnumC37795GkA A03;
    public static final EnumC37795GkA A04;
    public static final EnumC37795GkA A05;
    public final String A00;

    static {
        EnumC37795GkA enumC37795GkA = new EnumC37795GkA("CAPPED_CHAIN", "", 0);
        A03 = enumC37795GkA;
        EnumC37795GkA enumC37795GkA2 = new EnumC37795GkA("STANDARD", "STANDARD_TOOLTIP", 1);
        A05 = enumC37795GkA2;
        EnumC37795GkA enumC37795GkA3 = new EnumC37795GkA("DEEPER_IN_FUNNEL", "DEEPER_IN_FUNNEL_TOOLTIP", 2);
        A04 = enumC37795GkA3;
        EnumC37795GkA[] enumC37795GkAArr = {enumC37795GkA, enumC37795GkA2, enumC37795GkA3};
        A02 = enumC37795GkAArr;
        A01 = AbstractC12190kN.A00(enumC37795GkAArr);
    }

    public static EnumC37795GkA valueOf(String str) {
        return (EnumC37795GkA) Enum.valueOf(EnumC37795GkA.class, str);
    }

    public static EnumC37795GkA[] values() {
        return (EnumC37795GkA[]) A02.clone();
    }

    public EnumC37795GkA(String str, String str2, int i) {
        this.A00 = str2;
    }
}
