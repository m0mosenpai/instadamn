package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC58132lV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC58132lV[] A01;
    public static final EnumC58132lV A02;
    public static final EnumC58132lV A03;
    public static final EnumC58132lV A04;
    public static final EnumC58132lV A05;
    public static final EnumC58132lV A06;

    static {
        EnumC58132lV enumC58132lV = new EnumC58132lV("CENTER_OF_ANCHOR", 0);
        A04 = enumC58132lV;
        EnumC58132lV enumC58132lV2 = new EnumC58132lV("ABOVE_ANCHOR", 1);
        A02 = enumC58132lV2;
        EnumC58132lV enumC58132lV3 = new EnumC58132lV("BELOW_ANCHOR", 2);
        A03 = enumC58132lV3;
        EnumC58132lV enumC58132lV4 = new EnumC58132lV("LEFT_ANCHOR", 3);
        A05 = enumC58132lV4;
        EnumC58132lV enumC58132lV5 = new EnumC58132lV("RIGHT_ANCHOR", 4);
        A06 = enumC58132lV5;
        EnumC58132lV[] enumC58132lVArr = {enumC58132lV, enumC58132lV2, enumC58132lV3, enumC58132lV4, enumC58132lV5};
        A01 = enumC58132lVArr;
        A00 = AbstractC12190kN.A00(enumC58132lVArr);
    }

    public static EnumC58132lV valueOf(String str) {
        return (EnumC58132lV) Enum.valueOf(EnumC58132lV.class, str);
    }

    public static EnumC58132lV[] values() {
        return (EnumC58132lV[]) A01.clone();
    }

    public EnumC58132lV(String str, int i) {
    }
}
