package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC168547fo {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC168547fo[] A03;
    public static final EnumC168547fo A04;
    public static final EnumC168547fo A05;
    public static final EnumC168547fo A06;
    public final int A00;

    static {
        EnumC168547fo enumC168547fo = new EnumC168547fo("PRODUCTION", 0, 0);
        A06 = enumC168547fo;
        EnumC168547fo enumC168547fo2 = new EnumC168547fo("AUTHOR_LINE", 1, 1);
        A04 = enumC168547fo2;
        EnumC168547fo enumC168547fo3 = new EnumC168547fo("BOTTOM_ACTION_LINE", 2, 2);
        A05 = enumC168547fo3;
        EnumC168547fo[] enumC168547foArr = {enumC168547fo, enumC168547fo2, enumC168547fo3};
        A03 = enumC168547foArr;
        A02 = AbstractC12190kN.A00(enumC168547foArr);
        EnumC168547fo[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC168547fo enumC168547fo4 : values) {
            linkedHashMap.put(Integer.valueOf(enumC168547fo4.A00), enumC168547fo4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC168547fo valueOf(String str) {
        return (EnumC168547fo) Enum.valueOf(EnumC168547fo.class, str);
    }

    public static EnumC168547fo[] values() {
        return (EnumC168547fo[]) A03.clone();
    }

    public EnumC168547fo(String str, int i, int i2) {
        this.A00 = i2;
    }
}
