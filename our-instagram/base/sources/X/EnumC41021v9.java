package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC41021v9 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC41021v9[] A03;
    public static final EnumC41021v9 A04;
    public static final EnumC41021v9 A05;
    public static final EnumC41021v9 A06;
    public static final EnumC41021v9 A07;
    public static final EnumC41021v9 A08;
    public final int A00;

    static {
        EnumC41021v9 enumC41021v9 = new EnumC41021v9("UNKNOWN", 0, 0);
        A08 = enumC41021v9;
        EnumC41021v9 enumC41021v92 = new EnumC41021v9("MULTIPLE_CHOICE", 1, 1);
        A06 = enumC41021v92;
        EnumC41021v9 enumC41021v93 = new EnumC41021v9("SHORT_ANSWER", 2, 2);
        A07 = enumC41021v93;
        EnumC41021v9 enumC41021v94 = new EnumC41021v9("CONTACT_INFO", 3, 3);
        A04 = enumC41021v94;
        EnumC41021v9 enumC41021v95 = new EnumC41021v9("GENERIC_OFFSITE", 4, 4);
        A05 = enumC41021v95;
        EnumC41021v9[] enumC41021v9Arr = {enumC41021v9, enumC41021v92, enumC41021v93, enumC41021v94, enumC41021v95};
        A03 = enumC41021v9Arr;
        C020508b A00 = AbstractC12190kN.A00(enumC41021v9Arr);
        A02 = A00;
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A00, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (Object obj : A00) {
            linkedHashMap.put(Integer.valueOf(((EnumC41021v9) obj).A00), obj);
        }
        A01 = linkedHashMap;
    }

    public static EnumC41021v9 valueOf(String str) {
        return (EnumC41021v9) Enum.valueOf(EnumC41021v9.class, str);
    }

    public static EnumC41021v9[] values() {
        return (EnumC41021v9[]) A03.clone();
    }

    public EnumC41021v9(String str, int i, int i2) {
        this.A00 = i2;
    }
}
