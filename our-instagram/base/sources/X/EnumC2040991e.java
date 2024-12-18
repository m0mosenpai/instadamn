package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.91e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2040991e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC2040991e[] A01;
    public static final EnumC2040991e A02;
    public static final EnumC2040991e A03;
    public static final EnumC2040991e A04;
    public static final EnumC2040991e A05;

    static {
        EnumC2040991e enumC2040991e = new EnumC2040991e("LOAD_PATTERNS_FROM_DICTIONARY_STARTED", 0);
        A05 = enumC2040991e;
        EnumC2040991e enumC2040991e2 = new EnumC2040991e("LOAD_PATTERNS_FROM_DICTIONARY_FINISHED", 1);
        A04 = enumC2040991e2;
        EnumC2040991e enumC2040991e3 = new EnumC2040991e("BUILD_DATA_STRUCTURE_STARTED", 2);
        A03 = enumC2040991e3;
        EnumC2040991e enumC2040991e4 = new EnumC2040991e("BUILD_DATA_STRUCTURE_FINISHED", 3);
        A02 = enumC2040991e4;
        EnumC2040991e[] enumC2040991eArr = {enumC2040991e, enumC2040991e2, enumC2040991e3, enumC2040991e4};
        A01 = enumC2040991eArr;
        A00 = AbstractC12190kN.A00(enumC2040991eArr);
    }

    public static EnumC2040991e valueOf(String str) {
        return (EnumC2040991e) Enum.valueOf(EnumC2040991e.class, str);
    }

    public static EnumC2040991e[] values() {
        return (EnumC2040991e[]) A01.clone();
    }

    public EnumC2040991e(String str, int i) {
    }
}
