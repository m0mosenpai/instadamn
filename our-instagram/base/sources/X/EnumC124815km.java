package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC124815km {
    public static final EnumC124815km[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC124815km[] A04;
    public static final EnumC124815km A05;
    public static final EnumC124815km A06;
    public final int A00;
    public final EnumC124795kk A01;

    static {
        EnumC124815km enumC124815km = new EnumC124815km(EnumC124795kk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "UNKNOWN", 0, 0);
        A05 = enumC124815km;
        EnumC124815km enumC124815km2 = new EnumC124815km(EnumC124795kk.USER_DEFINED_PATTERNS, "USER_DEFINED_PATTERNS", 1, 1);
        A06 = enumC124815km2;
        EnumC124815km[] enumC124815kmArr = {enumC124815km, enumC124815km2, new EnumC124815km(EnumC124795kk.DM_HARMFUL_PATTERNS, "DM_HARMFUL_PATTERNS", 2, 2)};
        A04 = enumC124815kmArr;
        A03 = AbstractC12190kN.A00(enumC124815kmArr);
        A02 = values();
    }

    public static EnumC124815km valueOf(String str) {
        return (EnumC124815km) Enum.valueOf(EnumC124815km.class, str);
    }

    public static EnumC124815km[] values() {
        return (EnumC124815km[]) A04.clone();
    }

    public EnumC124815km(EnumC124795kk enumC124795kk, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC124795kk;
    }
}
