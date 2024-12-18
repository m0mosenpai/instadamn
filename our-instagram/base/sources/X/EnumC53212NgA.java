package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53212NgA {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53212NgA[] A03;
    public static final EnumC53212NgA A04;
    public static final EnumC53212NgA A05;
    public final String A00;

    static {
        EnumC53212NgA enumC53212NgA = new EnumC53212NgA("ON", 0, "always_save");
        A05 = enumC53212NgA;
        EnumC53212NgA enumC53212NgA2 = new EnumC53212NgA("OFF", 1, "always_ask");
        A04 = enumC53212NgA2;
        EnumC53212NgA[] enumC53212NgAArr = {enumC53212NgA, enumC53212NgA2, new EnumC53212NgA("UNSET", 2, "")};
        A03 = enumC53212NgAArr;
        A02 = AbstractC12190kN.A00(enumC53212NgAArr);
        EnumC53212NgA[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53212NgA enumC53212NgA3 : values) {
            A18.put(enumC53212NgA3.A00, enumC53212NgA3);
        }
        A01 = A18;
    }

    public static EnumC53212NgA valueOf(String str) {
        return (EnumC53212NgA) Enum.valueOf(EnumC53212NgA.class, str);
    }

    public static EnumC53212NgA[] values() {
        return (EnumC53212NgA[]) A03.clone();
    }

    public EnumC53212NgA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
