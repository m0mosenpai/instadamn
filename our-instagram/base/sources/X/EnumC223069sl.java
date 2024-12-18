package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223069sl {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC223069sl[] A06;
    public static final EnumC223069sl A07;
    public static final EnumC223069sl A08;
    public static final EnumC223069sl A09;
    public static final EnumC223069sl A0A;
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    static {
        EnumC223069sl enumC223069sl = new EnumC223069sl(null, null, null, "ENABLED", 0, true, false);
        A09 = enumC223069sl;
        EnumC223069sl enumC223069sl2 = new EnumC223069sl(C05F.A01, 2131961066, 2131961065, "VM_DISABLED", 1, false, false);
        A0A = enumC223069sl2;
        Integer num = C05F.A00;
        EnumC223069sl enumC223069sl3 = new EnumC223069sl(num, 2131961066, 2131961065, "DM_DISABLED", 2, false, false);
        A07 = enumC223069sl3;
        EnumC223069sl enumC223069sl4 = new EnumC223069sl(num, 2131961070, 2131961069, "DM_DISABLED_OUTDATED_APP_VERSION", 3, false, true);
        A08 = enumC223069sl4;
        EnumC223069sl[] enumC223069slArr = {enumC223069sl, enumC223069sl2, enumC223069sl3, enumC223069sl4};
        A06 = enumC223069slArr;
        A05 = AbstractC12190kN.A00(enumC223069slArr);
    }

    public static EnumC223069sl valueOf(String str) {
        return (EnumC223069sl) Enum.valueOf(EnumC223069sl.class, str);
    }

    public static EnumC223069sl[] values() {
        return (EnumC223069sl[]) A06.clone();
    }

    public EnumC223069sl(Integer num, Integer num2, Integer num3, String str, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = num;
        this.A04 = z2;
        this.A01 = num2;
        this.A00 = num3;
    }
}
