package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.72l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1568372l {
    public static final Map A01;
    public static final EnumC1568372l[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC1568372l[] A04;
    public static final EnumC1568372l A05;
    public static final EnumC1568372l A06;
    public static final EnumC1568372l A07;
    public final String A00;

    static {
        EnumC1568372l enumC1568372l = new EnumC1568372l("CLEAN", 0, "clean");
        A05 = enumC1568372l;
        EnumC1568372l enumC1568372l2 = new EnumC1568372l("CONTROL", 1, "control");
        A06 = enumC1568372l2;
        EnumC1568372l enumC1568372l3 = new EnumC1568372l("FAMILIAR", 2, "familiar");
        A07 = enumC1568372l3;
        EnumC1568372l[] enumC1568372lArr = {enumC1568372l, enumC1568372l2, enumC1568372l3, new EnumC1568372l("GROUPED", 3, "grouped")};
        A04 = enumC1568372lArr;
        A03 = AbstractC12190kN.A00(enumC1568372lArr);
        EnumC1568372l[] values = values();
        A02 = values;
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC1568372l enumC1568372l4 : values) {
            linkedHashMap.put(enumC1568372l4.A00, enumC1568372l4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC1568372l valueOf(String str) {
        return (EnumC1568372l) Enum.valueOf(EnumC1568372l.class, str);
    }

    public static EnumC1568372l[] values() {
        return (EnumC1568372l[]) A04.clone();
    }

    public EnumC1568372l(String str, int i, String str2) {
        this.A00 = str2;
    }
}
