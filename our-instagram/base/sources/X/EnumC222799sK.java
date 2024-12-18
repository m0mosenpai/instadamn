package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222799sK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222799sK[] A01;
    public static final EnumC222799sK A02;
    public static final EnumC222799sK A03;
    public static final EnumC222799sK A04;
    public static final EnumC222799sK A05;
    public static final EnumC222799sK A06;
    public static final EnumC222799sK A07;
    public static final EnumC222799sK A08;
    public static final EnumC222799sK A09;
    public static final EnumC222799sK A0A;

    static {
        EnumC222799sK enumC222799sK = new EnumC222799sK("EXTRACTING_BITMAP", 0);
        A03 = enumC222799sK;
        EnumC222799sK enumC222799sK2 = new EnumC222799sK("PROCESSING_BITMAP", 1);
        A09 = enumC222799sK2;
        EnumC222799sK enumC222799sK3 = new EnumC222799sK("CONCEPT_MAP_READY", 2);
        A02 = enumC222799sK3;
        EnumC222799sK enumC222799sK4 = new EnumC222799sK("INPUT_TENSOR_READY", 3);
        A04 = enumC222799sK4;
        EnumC222799sK enumC222799sK5 = new EnumC222799sK("OUTPUT_TENSOR_READY", 4);
        A06 = enumC222799sK5;
        EnumC222799sK enumC222799sK6 = new EnumC222799sK("PREPARING_INPUT_TENSOR", 5);
        A08 = enumC222799sK6;
        EnumC222799sK enumC222799sK7 = new EnumC222799sK("LOADING_MODEL", 6);
        A05 = enumC222799sK7;
        EnumC222799sK enumC222799sK8 = new EnumC222799sK("UNABLE_TO_LOAD_MODEL", 7);
        A0A = enumC222799sK8;
        EnumC222799sK enumC222799sK9 = new EnumC222799sK("PREDICTION_FAILED", 8);
        A07 = enumC222799sK9;
        EnumC222799sK[] enumC222799sKArr = {enumC222799sK, enumC222799sK2, enumC222799sK3, enumC222799sK4, enumC222799sK5, enumC222799sK6, enumC222799sK7, enumC222799sK8, enumC222799sK9};
        A01 = enumC222799sKArr;
        A00 = AbstractC12190kN.A00(enumC222799sKArr);
    }

    public static EnumC222799sK valueOf(String str) {
        return (EnumC222799sK) Enum.valueOf(EnumC222799sK.class, str);
    }

    public static EnumC222799sK[] values() {
        return (EnumC222799sK[]) A01.clone();
    }

    public EnumC222799sK(String str, int i) {
    }
}
