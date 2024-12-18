package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39563HdZ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39563HdZ[] A03;
    public static final EnumC39563HdZ A04;
    public static final EnumC39563HdZ A05;
    public static final EnumC39563HdZ A06;
    public final String A00;

    static {
        EnumC39563HdZ enumC39563HdZ = new EnumC39563HdZ("CART", 0, "cart");
        A04 = enumC39563HdZ;
        EnumC39563HdZ enumC39563HdZ2 = new EnumC39563HdZ("MENU", 1, "menu");
        A05 = enumC39563HdZ2;
        EnumC39563HdZ enumC39563HdZ3 = new EnumC39563HdZ("UNKNOWN", 2, "unknown");
        A06 = enumC39563HdZ3;
        EnumC39563HdZ[] enumC39563HdZArr = {enumC39563HdZ, enumC39563HdZ2, enumC39563HdZ3};
        A03 = enumC39563HdZArr;
        A02 = AbstractC12190kN.A00(enumC39563HdZArr);
        EnumC39563HdZ[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39563HdZ enumC39563HdZ4 : values) {
            A18.put(enumC39563HdZ4.A00, enumC39563HdZ4);
        }
        A01 = A18;
    }

    public static EnumC39563HdZ valueOf(String str) {
        return (EnumC39563HdZ) Enum.valueOf(EnumC39563HdZ.class, str);
    }

    public static EnumC39563HdZ[] values() {
        return (EnumC39563HdZ[]) A03.clone();
    }

    public EnumC39563HdZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
