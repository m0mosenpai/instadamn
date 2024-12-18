package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132895zE {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC132895zE[] A03;
    public static final EnumC132895zE A04;
    public static final EnumC132895zE A05;
    public final String A00;

    static {
        EnumC132895zE enumC132895zE = new EnumC132895zE("MAJOR", 0, "major_unit");
        A04 = enumC132895zE;
        EnumC132895zE enumC132895zE2 = new EnumC132895zE("MINOR", 1, "minor_unit");
        A05 = enumC132895zE2;
        EnumC132895zE[] enumC132895zEArr = {enumC132895zE, enumC132895zE2};
        A03 = enumC132895zEArr;
        A02 = AbstractC12190kN.A00(enumC132895zEArr);
        EnumC132895zE[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC132895zE enumC132895zE3 : values) {
            linkedHashMap.put(enumC132895zE3.A00, enumC132895zE3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC132895zE valueOf(String str) {
        return (EnumC132895zE) Enum.valueOf(EnumC132895zE.class, str);
    }

    public static EnumC132895zE[] values() {
        return (EnumC132895zE[]) A03.clone();
    }

    public EnumC132895zE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
