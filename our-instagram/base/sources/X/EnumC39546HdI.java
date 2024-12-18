package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39546HdI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39546HdI[] A01;
    public static final EnumC39546HdI A02;
    public static final EnumC39546HdI A03;
    public static final EnumC39546HdI A04;
    public static final EnumC39546HdI A05;

    static {
        EnumC39546HdI enumC39546HdI = new EnumC39546HdI("FIRST_OPTION", 0);
        A02 = enumC39546HdI;
        EnumC39546HdI enumC39546HdI2 = new EnumC39546HdI("SECOND_OPTION", 1);
        A04 = enumC39546HdI2;
        EnumC39546HdI enumC39546HdI3 = new EnumC39546HdI("THIRD_OPTION", 2);
        A05 = enumC39546HdI3;
        EnumC39546HdI enumC39546HdI4 = new EnumC39546HdI("FOURTH_OPTION", 3);
        A03 = enumC39546HdI4;
        EnumC39546HdI[] enumC39546HdIArr = {enumC39546HdI, enumC39546HdI2, enumC39546HdI3, enumC39546HdI4};
        A01 = enumC39546HdIArr;
        A00 = AbstractC12190kN.A00(enumC39546HdIArr);
    }

    public static EnumC39546HdI valueOf(String str) {
        return (EnumC39546HdI) Enum.valueOf(EnumC39546HdI.class, str);
    }

    public static EnumC39546HdI[] values() {
        return (EnumC39546HdI[]) A01.clone();
    }

    public EnumC39546HdI(String str, int i) {
    }
}
