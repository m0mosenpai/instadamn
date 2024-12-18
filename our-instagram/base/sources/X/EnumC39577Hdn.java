package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39577Hdn {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39577Hdn[] A03;
    public static final EnumC39577Hdn A04;
    public static final EnumC39577Hdn A05;
    public static final EnumC39577Hdn A06;
    public static final EnumC39577Hdn A07;
    public static final EnumC39577Hdn A08;
    public static final EnumC39577Hdn A09;
    public final String A00;

    static {
        EnumC39577Hdn enumC39577Hdn = new EnumC39577Hdn("CIRCLE", 0, "circle");
        A04 = enumC39577Hdn;
        EnumC39577Hdn enumC39577Hdn2 = new EnumC39577Hdn("GRAYED_OUT_CIRCLE", 1, "grayed_out_circle");
        A05 = enumC39577Hdn2;
        EnumC39577Hdn enumC39577Hdn3 = new EnumC39577Hdn("SQUARE", 2, "square");
        A08 = enumC39577Hdn3;
        EnumC39577Hdn enumC39577Hdn4 = new EnumC39577Hdn("GRAYED_OUT_SQUARE", 3, "grayed_out_square");
        A06 = enumC39577Hdn4;
        EnumC39577Hdn enumC39577Hdn5 = new EnumC39577Hdn("GRAYED_OUT_SQUARE_WITH_LINE", 4, "grayed_out_square_with_line");
        A07 = enumC39577Hdn5;
        EnumC39577Hdn enumC39577Hdn6 = new EnumC39577Hdn("UNKNOWN", 5, "unknown");
        A09 = enumC39577Hdn6;
        EnumC39577Hdn[] enumC39577HdnArr = {enumC39577Hdn, enumC39577Hdn2, enumC39577Hdn3, enumC39577Hdn4, enumC39577Hdn5, enumC39577Hdn6};
        A03 = enumC39577HdnArr;
        A02 = AbstractC12190kN.A00(enumC39577HdnArr);
        EnumC39577Hdn[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39577Hdn enumC39577Hdn7 : values) {
            A18.put(enumC39577Hdn7.A00, enumC39577Hdn7);
        }
        A01 = A18;
    }

    public static EnumC39577Hdn valueOf(String str) {
        return (EnumC39577Hdn) Enum.valueOf(EnumC39577Hdn.class, str);
    }

    public static EnumC39577Hdn[] values() {
        return (EnumC39577Hdn[]) A03.clone();
    }

    public EnumC39577Hdn(String str, int i, String str2) {
        this.A00 = str2;
    }
}
