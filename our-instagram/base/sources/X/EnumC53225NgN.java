package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53225NgN {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53225NgN[] A03;
    public static final EnumC53225NgN A04;
    public static final EnumC53225NgN A05;
    public static final EnumC53225NgN A06;
    public final String A00;

    static {
        EnumC53225NgN enumC53225NgN = new EnumC53225NgN("ELIGIBLE", 0, "ELIGIBLE");
        A05 = enumC53225NgN;
        EnumC53225NgN enumC53225NgN2 = new EnumC53225NgN("BUSINESS_ACCOUNT", 1, "BUSINESS_ACCOUNT");
        A04 = enumC53225NgN2;
        EnumC53225NgN enumC53225NgN3 = new EnumC53225NgN("UNLAUNCHED_COUNTRY", 2, "UNLAUNCHED_COUNTRY");
        A06 = enumC53225NgN3;
        EnumC53225NgN[] enumC53225NgNArr = {enumC53225NgN, enumC53225NgN2, enumC53225NgN3};
        A03 = enumC53225NgNArr;
        A02 = AbstractC12190kN.A00(enumC53225NgNArr);
        EnumC53225NgN[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53225NgN enumC53225NgN4 : values) {
            A18.put(enumC53225NgN4.A00, enumC53225NgN4);
        }
        A01 = A18;
    }

    public static EnumC53225NgN valueOf(String str) {
        return (EnumC53225NgN) Enum.valueOf(EnumC53225NgN.class, str);
    }

    public static EnumC53225NgN[] values() {
        return (EnumC53225NgN[]) A03.clone();
    }

    public EnumC53225NgN(String str, int i, String str2) {
        this.A00 = str2;
    }
}
