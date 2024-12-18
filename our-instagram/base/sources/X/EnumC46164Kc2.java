package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46164Kc2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46164Kc2[] A01;
    public static final EnumC46164Kc2 A02;
    public static final EnumC46164Kc2 A03;
    public static final EnumC46164Kc2 A04;
    public static final EnumC46164Kc2 A05;
    public static final EnumC46164Kc2 A06;

    static {
        EnumC46164Kc2 enumC46164Kc2 = new EnumC46164Kc2("V3_INTRODUCE_BANNER", 0);
        A04 = enumC46164Kc2;
        EnumC46164Kc2 enumC46164Kc22 = new EnumC46164Kc2("V3_SELL_BANNER", 1);
        A05 = enumC46164Kc22;
        EnumC46164Kc2 enumC46164Kc23 = new EnumC46164Kc2("V3_WARN_BANNER", 2);
        A06 = enumC46164Kc23;
        EnumC46164Kc2 enumC46164Kc24 = new EnumC46164Kc2("MEX_EB_UPSELL_BANNER", 3);
        A03 = enumC46164Kc24;
        EnumC46164Kc2 enumC46164Kc25 = new EnumC46164Kc2("MEX_EB_LOW_DISK_SPACE_BANNER", 4);
        A02 = enumC46164Kc25;
        EnumC46164Kc2[] enumC46164Kc2Arr = {enumC46164Kc2, enumC46164Kc22, enumC46164Kc23, enumC46164Kc24, enumC46164Kc25};
        A01 = enumC46164Kc2Arr;
        A00 = AbstractC12190kN.A00(enumC46164Kc2Arr);
    }

    public static EnumC46164Kc2 valueOf(String str) {
        return (EnumC46164Kc2) Enum.valueOf(EnumC46164Kc2.class, str);
    }

    public static EnumC46164Kc2[] values() {
        return (EnumC46164Kc2[]) A01.clone();
    }

    public EnumC46164Kc2(String str, int i) {
    }
}
