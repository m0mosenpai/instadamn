package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC201298vD {
    public static final EnumC201298vD[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC201298vD[] A03;
    public static final EnumC201298vD A04;
    public static final EnumC201298vD A05;
    public final int A00;

    static {
        EnumC201298vD enumC201298vD = new EnumC201298vD("PROD", 0, 0);
        A04 = enumC201298vD;
        EnumC201298vD enumC201298vD2 = new EnumC201298vD("PROD_AND_DEV", 1, 1);
        A05 = enumC201298vD2;
        EnumC201298vD[] enumC201298vDArr = {enumC201298vD, enumC201298vD2, new EnumC201298vD("PROD_DEV_AND_AWAITING_DELETION", 2, 2)};
        A03 = enumC201298vDArr;
        A02 = AbstractC12190kN.A00(enumC201298vDArr);
        A01 = values();
    }

    public static EnumC201298vD valueOf(String str) {
        return (EnumC201298vD) Enum.valueOf(EnumC201298vD.class, str);
    }

    public static EnumC201298vD[] values() {
        return (EnumC201298vD[]) A03.clone();
    }

    public EnumC201298vD(String str, int i, int i2) {
        this.A00 = i2;
    }
}
