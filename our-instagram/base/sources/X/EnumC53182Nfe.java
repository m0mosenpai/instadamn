package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53182Nfe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53182Nfe[] A01;
    public static final EnumC53182Nfe A02;
    public static final EnumC53182Nfe A03;
    public static final EnumC53182Nfe A04;
    public static final EnumC53182Nfe A05;
    public static final EnumC53182Nfe A06;
    public static final EnumC53182Nfe A07;
    public static final EnumC53182Nfe A08;
    public static final EnumC53182Nfe A09;

    static {
        EnumC53182Nfe enumC53182Nfe = new EnumC53182Nfe("CLASS_CAST_ERROR", 0);
        A02 = enumC53182Nfe;
        EnumC53182Nfe enumC53182Nfe2 = new EnumC53182Nfe("LOAD_LIVE_EDITOR_NOT_ENABLED", 1);
        A03 = enumC53182Nfe2;
        EnumC53182Nfe enumC53182Nfe3 = new EnumC53182Nfe("NETWORK_TYPE_NOT_SUPPORTED", 2);
        A05 = enumC53182Nfe3;
        EnumC53182Nfe enumC53182Nfe4 = new EnumC53182Nfe("PREFETCH_NOT_ENABLED", 3);
        A06 = enumC53182Nfe4;
        EnumC53182Nfe enumC53182Nfe5 = new EnumC53182Nfe("LOW_MEMORY_ERROR", 4);
        A04 = enumC53182Nfe5;
        EnumC53182Nfe enumC53182Nfe6 = new EnumC53182Nfe("SUCCESS", 5);
        A07 = enumC53182Nfe6;
        EnumC53182Nfe enumC53182Nfe7 = new EnumC53182Nfe("TIMEOUT", 6);
        A08 = enumC53182Nfe7;
        EnumC53182Nfe enumC53182Nfe8 = new EnumC53182Nfe("UNKNOWN_ERROR", 7);
        A09 = enumC53182Nfe8;
        EnumC53182Nfe[] enumC53182NfeArr = {enumC53182Nfe, enumC53182Nfe2, enumC53182Nfe3, enumC53182Nfe4, enumC53182Nfe5, enumC53182Nfe6, enumC53182Nfe7, enumC53182Nfe8};
        A01 = enumC53182NfeArr;
        A00 = AbstractC12190kN.A00(enumC53182NfeArr);
    }

    public static EnumC53182Nfe valueOf(String str) {
        return (EnumC53182Nfe) Enum.valueOf(EnumC53182Nfe.class, str);
    }

    public static EnumC53182Nfe[] values() {
        return (EnumC53182Nfe[]) A01.clone();
    }

    public EnumC53182Nfe(String str, int i) {
    }
}
