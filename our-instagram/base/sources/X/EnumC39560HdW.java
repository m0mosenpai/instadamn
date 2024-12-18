package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39560HdW {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39560HdW[] A03;
    public static final EnumC39560HdW A04;
    public static final EnumC39560HdW A05;
    public final String A00;

    static {
        EnumC39560HdW enumC39560HdW = new EnumC39560HdW("HALF_HEIGHT", 0, "half_height");
        A05 = enumC39560HdW;
        EnumC39560HdW enumC39560HdW2 = new EnumC39560HdW("FULL_HEIGHT", 1, "full_height");
        A04 = enumC39560HdW2;
        EnumC39560HdW[] enumC39560HdWArr = {enumC39560HdW, enumC39560HdW2, new EnumC39560HdW("UNRECOGNIZED", 2, "unrecognized")};
        A03 = enumC39560HdWArr;
        A02 = AbstractC12190kN.A00(enumC39560HdWArr);
        EnumC39560HdW[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39560HdW enumC39560HdW3 : values) {
            A18.put(enumC39560HdW3.A00, enumC39560HdW3);
        }
        A01 = A18;
    }

    public static EnumC39560HdW valueOf(String str) {
        return (EnumC39560HdW) Enum.valueOf(EnumC39560HdW.class, str);
    }

    public static EnumC39560HdW[] values() {
        return (EnumC39560HdW[]) A03.clone();
    }

    public EnumC39560HdW(String str, int i, String str2) {
        this.A00 = str2;
    }
}
