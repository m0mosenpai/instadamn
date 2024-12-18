package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222919sW {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222919sW[] A03;
    public static final EnumC222919sW A04;
    public static final EnumC222919sW A05;
    public static final EnumC222919sW A06;
    public static final EnumC222919sW A07;
    public final String A00;

    static {
        EnumC222919sW enumC222919sW = new EnumC222919sW("UNKNOWN", 0, "UNKNOWN");
        A07 = enumC222919sW;
        EnumC222919sW enumC222919sW2 = new EnumC222919sW("APPROVED", 1, "APPROVED");
        A04 = enumC222919sW2;
        EnumC222919sW enumC222919sW3 = new EnumC222919sW("DENIED", 2, "DENIED");
        A05 = enumC222919sW3;
        EnumC222919sW enumC222919sW4 = new EnumC222919sW("DISMISSED", 3, "DISMISSED");
        A06 = enumC222919sW4;
        EnumC222919sW[] enumC222919sWArr = {enumC222919sW, enumC222919sW2, enumC222919sW3, enumC222919sW4, new EnumC222919sW("BACKED", 4, "BACKED")};
        A03 = enumC222919sWArr;
        A02 = AbstractC12190kN.A00(enumC222919sWArr);
        EnumC222919sW[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222919sW enumC222919sW5 : values) {
            linkedHashMap.put(enumC222919sW5.A00, enumC222919sW5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222919sW valueOf(String str) {
        return (EnumC222919sW) Enum.valueOf(EnumC222919sW.class, str);
    }

    public static EnumC222919sW[] values() {
        return (EnumC222919sW[]) A03.clone();
    }

    public EnumC222919sW(String str, int i, String str2) {
        this.A00 = str2;
    }
}
