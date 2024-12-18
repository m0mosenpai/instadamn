package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39580Hdq {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39580Hdq[] A03;
    public static final EnumC39580Hdq A04;
    public static final EnumC39580Hdq A05;
    public static final EnumC39580Hdq A06;
    public static final EnumC39580Hdq A07;
    public static final EnumC39580Hdq A08;
    public static final EnumC39580Hdq A09;
    public static final EnumC39580Hdq A0A;
    public final String A00;

    static {
        EnumC39580Hdq enumC39580Hdq = new EnumC39580Hdq("PRODUCT", 0, "singlebrand_product");
        A07 = enumC39580Hdq;
        EnumC39580Hdq enumC39580Hdq2 = new EnumC39580Hdq("MULTI_BRAND", 1, "multibrand_product");
        A06 = enumC39580Hdq2;
        EnumC39580Hdq enumC39580Hdq3 = new EnumC39580Hdq("BRANDS_WITH_PRODUCTS", 2, "brands_with_products");
        A04 = enumC39580Hdq3;
        EnumC39580Hdq enumC39580Hdq4 = new EnumC39580Hdq("RECONSIDERATION_PRODUCTS", 3, "reconsideration_products");
        A08 = enumC39580Hdq4;
        EnumC39580Hdq enumC39580Hdq5 = new EnumC39580Hdq("TAGGED_PRODUCTS", 4, "tagged_products");
        A09 = enumC39580Hdq5;
        EnumC39580Hdq enumC39580Hdq6 = new EnumC39580Hdq("FEATURED_PRODUCTS", 5, "featured_products");
        A05 = enumC39580Hdq6;
        EnumC39580Hdq enumC39580Hdq7 = new EnumC39580Hdq("UNRECOGNIZED", 6, "ShoppingPivotItemType_unspecified");
        A0A = enumC39580Hdq7;
        EnumC39580Hdq[] enumC39580HdqArr = {enumC39580Hdq, enumC39580Hdq2, enumC39580Hdq3, enumC39580Hdq4, enumC39580Hdq5, enumC39580Hdq6, enumC39580Hdq7};
        A03 = enumC39580HdqArr;
        A02 = AbstractC12190kN.A00(enumC39580HdqArr);
        EnumC39580Hdq[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39580Hdq enumC39580Hdq8 : values) {
            A18.put(enumC39580Hdq8.A00, enumC39580Hdq8);
        }
        A01 = A18;
    }

    public static EnumC39580Hdq valueOf(String str) {
        return (EnumC39580Hdq) Enum.valueOf(EnumC39580Hdq.class, str);
    }

    public static EnumC39580Hdq[] values() {
        return (EnumC39580Hdq[]) A03.clone();
    }

    public EnumC39580Hdq(String str, int i, String str2) {
        this.A00 = str2;
    }
}
