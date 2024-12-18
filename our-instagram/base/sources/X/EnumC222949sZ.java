package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222949sZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222949sZ[] A02;
    public static final EnumC222949sZ A03;
    public static final EnumC222949sZ A04;
    public static final EnumC222949sZ A05;
    public static final EnumC222949sZ A06;
    public static final EnumC222949sZ A07;
    public static final EnumC222949sZ A08;
    public final boolean A00;

    static {
        EnumC222949sZ enumC222949sZ = new EnumC222949sZ("ENTER", 0, true);
        A04 = enumC222949sZ;
        EnumC222949sZ enumC222949sZ2 = new EnumC222949sZ("EXIT", 1, false);
        A05 = enumC222949sZ2;
        EnumC222949sZ enumC222949sZ3 = new EnumC222949sZ("RESET", 2, true);
        A08 = enumC222949sZ3;
        EnumC222949sZ enumC222949sZ4 = new EnumC222949sZ("CANCEL", 3, false);
        A03 = enumC222949sZ4;
        EnumC222949sZ enumC222949sZ5 = new EnumC222949sZ("PREVIEW_SIZE_CHANGED", 4, true);
        A07 = enumC222949sZ5;
        EnumC222949sZ enumC222949sZ6 = new EnumC222949sZ("ON_TAP_QUICK_EDIT", 5, true);
        A06 = enumC222949sZ6;
        EnumC222949sZ[] enumC222949sZArr = {enumC222949sZ, enumC222949sZ2, enumC222949sZ3, enumC222949sZ4, enumC222949sZ5, enumC222949sZ6};
        A02 = enumC222949sZArr;
        A01 = AbstractC12190kN.A00(enumC222949sZArr);
    }

    public static EnumC222949sZ valueOf(String str) {
        return (EnumC222949sZ) Enum.valueOf(EnumC222949sZ.class, str);
    }

    public static EnumC222949sZ[] values() {
        return (EnumC222949sZ[]) A02.clone();
    }

    public EnumC222949sZ(String str, int i, boolean z) {
        this.A00 = z;
    }
}
