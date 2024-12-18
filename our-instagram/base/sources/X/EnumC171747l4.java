package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC171747l4 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC171747l4[] A03;
    public static final EnumC171747l4 A04;
    public final String A00 = "GREEN_SCREEN";

    static {
        EnumC171747l4 enumC171747l4 = new EnumC171747l4();
        A04 = enumC171747l4;
        EnumC171747l4[] enumC171747l4Arr = {enumC171747l4};
        A03 = enumC171747l4Arr;
        A02 = AbstractC12190kN.A00(enumC171747l4Arr);
        EnumC171747l4[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC171747l4 enumC171747l42 : values) {
            linkedHashMap.put(enumC171747l42.A00, enumC171747l42);
        }
        A01 = linkedHashMap;
    }

    public static EnumC171747l4 valueOf(String str) {
        return (EnumC171747l4) Enum.valueOf(EnumC171747l4.class, str);
    }

    public static EnumC171747l4[] values() {
        return (EnumC171747l4[]) A03.clone();
    }
}
