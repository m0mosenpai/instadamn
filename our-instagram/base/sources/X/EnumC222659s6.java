package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222659s6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222659s6[] A01;
    public static final EnumC222659s6 A02;
    public static final EnumC222659s6 A03;

    static {
        EnumC222659s6 enumC222659s6 = new EnumC222659s6("FXAccountItemEligibilityEligible", 0);
        A02 = enumC222659s6;
        EnumC222659s6 enumC222659s62 = new EnumC222659s6("FXAccountItemEligibilityIneligible", 1);
        A03 = enumC222659s62;
        EnumC222659s6[] enumC222659s6Arr = {enumC222659s6, enumC222659s62, new EnumC222659s6("FXAccountItemEligibilityNoData", 2)};
        A01 = enumC222659s6Arr;
        A00 = AbstractC12190kN.A00(enumC222659s6Arr);
    }

    public static EnumC222659s6 valueOf(String str) {
        return (EnumC222659s6) Enum.valueOf(EnumC222659s6.class, str);
    }

    public static EnumC222659s6[] values() {
        return (EnumC222659s6[]) A01.clone();
    }

    public EnumC222659s6(String str, int i) {
    }
}
