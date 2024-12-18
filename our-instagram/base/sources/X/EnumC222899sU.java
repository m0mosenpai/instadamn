package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222899sU {
    public static final Map A01;
    public static final EnumC222899sU[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC222899sU[] A04;
    public static final EnumC222899sU A05;
    public static final EnumC222899sU A06;
    public static final EnumC222899sU A07;
    public final String A00;

    static {
        EnumC222899sU enumC222899sU = new EnumC222899sU("GONE", 0, "gone");
        A06 = enumC222899sU;
        EnumC222899sU enumC222899sU2 = new EnumC222899sU("FIRST", 1, "first");
        A05 = enumC222899sU2;
        EnumC222899sU enumC222899sU3 = new EnumC222899sU("LAST", 2, "last");
        A07 = enumC222899sU3;
        EnumC222899sU[] enumC222899sUArr = {enumC222899sU, enumC222899sU2, enumC222899sU3};
        A04 = enumC222899sUArr;
        A03 = AbstractC12190kN.A00(enumC222899sUArr);
        EnumC222899sU[] values = values();
        A02 = values;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222899sU enumC222899sU4 : values) {
            linkedHashMap.put(enumC222899sU4.A00, enumC222899sU4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222899sU valueOf(String str) {
        return (EnumC222899sU) Enum.valueOf(EnumC222899sU.class, str);
    }

    public static EnumC222899sU[] values() {
        return (EnumC222899sU[]) A04.clone();
    }

    public EnumC222899sU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
