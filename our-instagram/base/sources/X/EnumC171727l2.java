package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7l2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC171727l2 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC171727l2[] A03;
    public static final EnumC171727l2 A04;
    public static final EnumC171727l2 A05;
    public final String A00;

    static {
        EnumC171727l2 enumC171727l2 = new EnumC171727l2("HORIZONTAL", 0, "HORIZONTAL");
        A04 = enumC171727l2;
        EnumC171727l2 enumC171727l22 = new EnumC171727l2("VERTICAL", 1, "VERTICAL");
        A05 = enumC171727l22;
        EnumC171727l2[] enumC171727l2Arr = {enumC171727l2, enumC171727l22};
        A03 = enumC171727l2Arr;
        A02 = AbstractC12190kN.A00(enumC171727l2Arr);
        EnumC171727l2[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC171727l2 enumC171727l23 : values) {
            linkedHashMap.put(enumC171727l23.A00, enumC171727l23);
        }
        A01 = linkedHashMap;
    }

    public static EnumC171727l2 valueOf(String str) {
        return (EnumC171727l2) Enum.valueOf(EnumC171727l2.class, str);
    }

    public static EnumC171727l2[] values() {
        return (EnumC171727l2[]) A03.clone();
    }

    public EnumC171727l2(String str, int i, String str2) {
        this.A00 = str2;
    }
}
