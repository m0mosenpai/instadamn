package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39571Hdh {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39571Hdh[] A03;
    public static final EnumC39571Hdh A04;
    public static final EnumC39571Hdh A05;
    public static final EnumC39571Hdh A06;
    public static final EnumC39571Hdh A07;
    public final String A00;

    static {
        EnumC39571Hdh enumC39571Hdh = new EnumC39571Hdh("UNRECOGNIZED", 0, "ProductRelationType_unspecified");
        A07 = enumC39571Hdh;
        EnumC39571Hdh enumC39571Hdh2 = new EnumC39571Hdh("TAGGED_PRODUCT", 1, "tagged_product");
        A06 = enumC39571Hdh2;
        EnumC39571Hdh enumC39571Hdh3 = new EnumC39571Hdh("SAME_MERCHANT", 2, "same_merchant");
        A04 = enumC39571Hdh3;
        EnumC39571Hdh enumC39571Hdh4 = new EnumC39571Hdh("SHOP_SIMILAR", 3, "shop_similar");
        A05 = enumC39571Hdh4;
        EnumC39571Hdh[] enumC39571HdhArr = {enumC39571Hdh, enumC39571Hdh2, enumC39571Hdh3, enumC39571Hdh4};
        A03 = enumC39571HdhArr;
        A02 = AbstractC12190kN.A00(enumC39571HdhArr);
        EnumC39571Hdh[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39571Hdh enumC39571Hdh5 : values) {
            A18.put(enumC39571Hdh5.A00, enumC39571Hdh5);
        }
        A01 = A18;
    }

    public static EnumC39571Hdh valueOf(String str) {
        return (EnumC39571Hdh) Enum.valueOf(EnumC39571Hdh.class, str);
    }

    public static EnumC39571Hdh[] values() {
        return (EnumC39571Hdh[]) A03.clone();
    }

    public EnumC39571Hdh(String str, int i, String str2) {
        this.A00 = str2;
    }
}
