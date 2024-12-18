package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39545HdH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39545HdH[] A01;
    public static final EnumC39545HdH A02;
    public static final EnumC39545HdH A03;
    public static final EnumC39545HdH A04;
    public static final EnumC39545HdH A05;

    static {
        EnumC39545HdH enumC39545HdH = new EnumC39545HdH("FREE_SHIPPING", 0);
        A03 = enumC39545HdH;
        EnumC39545HdH enumC39545HdH2 = new EnumC39545HdH("DISCOUNT", 1);
        A02 = enumC39545HdH2;
        EnumC39545HdH enumC39545HdH3 = new EnumC39545HdH("RETURNS", 2);
        A04 = enumC39545HdH3;
        EnumC39545HdH enumC39545HdH4 = new EnumC39545HdH("SELLER_BADGE", 3);
        A05 = enumC39545HdH4;
        EnumC39545HdH[] enumC39545HdHArr = {enumC39545HdH, enumC39545HdH2, enumC39545HdH3, enumC39545HdH4};
        A01 = enumC39545HdHArr;
        A00 = AbstractC12190kN.A00(enumC39545HdHArr);
    }

    public static EnumC39545HdH valueOf(String str) {
        return (EnumC39545HdH) Enum.valueOf(EnumC39545HdH.class, str);
    }

    public static EnumC39545HdH[] values() {
        return (EnumC39545HdH[]) A01.clone();
    }

    public EnumC39545HdH(String str, int i) {
    }
}
