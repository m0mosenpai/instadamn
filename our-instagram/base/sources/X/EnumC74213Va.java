package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74213Va {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC74213Va[] A01;
    public static final EnumC74213Va A02;
    public static final EnumC74213Va A03;
    public static final EnumC74213Va A04;

    static {
        EnumC74213Va enumC74213Va = new EnumC74213Va("DISABLED", 0);
        A02 = enumC74213Va;
        EnumC74213Va enumC74213Va2 = new EnumC74213Va("DISCRETE_PAGING", 1);
        A03 = enumC74213Va2;
        EnumC74213Va enumC74213Va3 = new EnumC74213Va("WHEEL_OF_FORTUNE", 2);
        A04 = enumC74213Va3;
        EnumC74213Va[] enumC74213VaArr = {enumC74213Va, enumC74213Va2, enumC74213Va3};
        A01 = enumC74213VaArr;
        A00 = AbstractC12190kN.A00(enumC74213VaArr);
    }

    public static EnumC74213Va valueOf(String str) {
        return (EnumC74213Va) Enum.valueOf(EnumC74213Va.class, str);
    }

    public static EnumC74213Va[] values() {
        return (EnumC74213Va[]) A01.clone();
    }

    public EnumC74213Va(String str, int i) {
    }
}
