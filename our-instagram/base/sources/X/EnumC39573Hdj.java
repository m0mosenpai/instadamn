package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39573Hdj {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39573Hdj[] A03;
    public static final EnumC39573Hdj A04;
    public static final EnumC39573Hdj A05;
    public static final EnumC39573Hdj A06;
    public static final EnumC39573Hdj A07;
    public final String A00;

    static {
        EnumC39573Hdj enumC39573Hdj = new EnumC39573Hdj("CART", 0, "cart");
        A04 = enumC39573Hdj;
        EnumC39573Hdj enumC39573Hdj2 = new EnumC39573Hdj("WISHLIST", 1, "wishlist");
        A07 = enumC39573Hdj2;
        EnumC39573Hdj enumC39573Hdj3 = new EnumC39573Hdj("HISTORY", 2, "history");
        A05 = enumC39573Hdj3;
        EnumC39573Hdj enumC39573Hdj4 = new EnumC39573Hdj("UNKNOWN", 3, "unknown");
        A06 = enumC39573Hdj4;
        EnumC39573Hdj[] enumC39573HdjArr = {enumC39573Hdj, enumC39573Hdj2, enumC39573Hdj3, enumC39573Hdj4};
        A03 = enumC39573HdjArr;
        A02 = AbstractC12190kN.A00(enumC39573HdjArr);
        EnumC39573Hdj[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39573Hdj enumC39573Hdj5 : values) {
            A18.put(enumC39573Hdj5.A00, enumC39573Hdj5);
        }
        A01 = A18;
    }

    public static EnumC39573Hdj valueOf(String str) {
        return (EnumC39573Hdj) Enum.valueOf(EnumC39573Hdj.class, str);
    }

    public static EnumC39573Hdj[] values() {
        return (EnumC39573Hdj[]) A03.clone();
    }

    public EnumC39573Hdj(String str, int i, String str2) {
        this.A00 = str2;
    }
}
