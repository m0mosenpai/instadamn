package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39596He6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39596He6[] A01;
    public static final EnumC39596He6 A02;
    public static final EnumC39596He6 A03;
    public static final EnumC39596He6 A04;
    public static final EnumC39596He6 A05;
    public static final EnumC39596He6 A06;
    public static final EnumC39596He6 A07;
    public static final EnumC39596He6 A08;

    static {
        EnumC39596He6 enumC39596He6 = new EnumC39596He6("EXTREME_UX_PROTECTION_CHECK_FAILED", 0);
        A06 = enumC39596He6;
        EnumC39596He6 enumC39596He62 = new EnumC39596He6("COIN_TOSS_FAILURE", 1);
        A02 = enumC39596He62;
        EnumC39596He6 enumC39596He63 = new EnumC39596He6("EXCEED_MAX_CONSECUTIVE_TIMES_CROSS_SESSION", 2);
        A05 = enumC39596He63;
        EnumC39596He6 enumC39596He64 = new EnumC39596He6("CONSECUTIVE_MIN_GAP", 3);
        A03 = enumC39596He64;
        EnumC39596He6 enumC39596He65 = new EnumC39596He6("SURFACE_CONFLICT", 4);
        A07 = enumC39596He65;
        EnumC39596He6 enumC39596He66 = new EnumC39596He6("EXCEED_MAX_CONSECUTIVE_TIMES", 5);
        A04 = enumC39596He66;
        EnumC39596He6 enumC39596He67 = new EnumC39596He6("SURFACE_STATE_OUT_OF_SYNC", 6);
        A08 = enumC39596He67;
        EnumC39596He6[] enumC39596He6Arr = {enumC39596He6, enumC39596He62, enumC39596He63, enumC39596He64, enumC39596He65, enumC39596He66, enumC39596He67};
        A01 = enumC39596He6Arr;
        A00 = AbstractC12190kN.A00(enumC39596He6Arr);
    }

    public static EnumC39596He6 valueOf(String str) {
        return (EnumC39596He6) Enum.valueOf(EnumC39596He6.class, str);
    }

    public static EnumC39596He6[] values() {
        return (EnumC39596He6[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return AbstractC167007dF.A0h(super.toString());
    }

    public EnumC39596He6(String str, int i) {
    }
}
