package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hde, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39568Hde {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39568Hde[] A03;
    public static final EnumC39568Hde A04;
    public static final EnumC39568Hde A05;
    public static final EnumC39568Hde A06;
    public final String A00;

    static {
        EnumC39568Hde enumC39568Hde = new EnumC39568Hde("SAVED", 0, "saved");
        A05 = enumC39568Hde;
        EnumC39568Hde enumC39568Hde2 = new EnumC39568Hde("PURCHASED", 1, "purchased");
        A04 = enumC39568Hde2;
        EnumC39568Hde enumC39568Hde3 = new EnumC39568Hde("UNKNOWN", 2, "unknown");
        A06 = enumC39568Hde3;
        EnumC39568Hde[] enumC39568HdeArr = {enumC39568Hde, enumC39568Hde2, enumC39568Hde3};
        A03 = enumC39568HdeArr;
        A02 = AbstractC12190kN.A00(enumC39568HdeArr);
        EnumC39568Hde[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39568Hde enumC39568Hde4 : values) {
            A18.put(enumC39568Hde4.A00, enumC39568Hde4);
        }
        A01 = A18;
    }

    public static EnumC39568Hde valueOf(String str) {
        return (EnumC39568Hde) Enum.valueOf(EnumC39568Hde.class, str);
    }

    public static EnumC39568Hde[] values() {
        return (EnumC39568Hde[]) A03.clone();
    }

    public EnumC39568Hde(String str, int i, String str2) {
        this.A00 = str2;
    }
}
