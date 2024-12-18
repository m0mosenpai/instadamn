package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39540HdC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39540HdC[] A01;
    public static final EnumC39540HdC A02;
    public static final EnumC39540HdC A03;
    public static final EnumC39540HdC A04;

    static {
        EnumC39540HdC enumC39540HdC = new EnumC39540HdC("FEATURED_PRODUCTS", 0);
        A02 = enumC39540HdC;
        EnumC39540HdC enumC39540HdC2 = new EnumC39540HdC("SELLER_MANAGEMENT_AFFILIATE_CONTENT", 1);
        A03 = enumC39540HdC2;
        EnumC39540HdC enumC39540HdC3 = new EnumC39540HdC("STOREFRONT", 2);
        A04 = enumC39540HdC3;
        EnumC39540HdC[] enumC39540HdCArr = {enumC39540HdC, enumC39540HdC2, enumC39540HdC3};
        A01 = enumC39540HdCArr;
        A00 = AbstractC12190kN.A00(enumC39540HdCArr);
    }

    public static EnumC39540HdC valueOf(String str) {
        return (EnumC39540HdC) Enum.valueOf(EnumC39540HdC.class, str);
    }

    public static EnumC39540HdC[] values() {
        return (EnumC39540HdC[]) A01.clone();
    }

    public EnumC39540HdC(String str, int i) {
    }
}
