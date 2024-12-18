package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dpz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31334Dpz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC31334Dpz[] A01;
    public static final EnumC31334Dpz A02;
    public static final EnumC31334Dpz A03;
    public static final EnumC31334Dpz A04;

    static {
        EnumC31334Dpz enumC31334Dpz = new EnumC31334Dpz("UNSHARED", 0);
        A04 = enumC31334Dpz;
        EnumC31334Dpz enumC31334Dpz2 = new EnumC31334Dpz("ALREADY_SHARED_CCP", 1);
        A02 = enumC31334Dpz2;
        EnumC31334Dpz enumC31334Dpz3 = new EnumC31334Dpz("ALREADY_SHARED_XAR", 2);
        A03 = enumC31334Dpz3;
        EnumC31334Dpz[] enumC31334DpzArr = {enumC31334Dpz, enumC31334Dpz2, enumC31334Dpz3};
        A01 = enumC31334DpzArr;
        A00 = AbstractC12190kN.A00(enumC31334DpzArr);
    }

    public static EnumC31334Dpz valueOf(String str) {
        return (EnumC31334Dpz) Enum.valueOf(EnumC31334Dpz.class, str);
    }

    public static EnumC31334Dpz[] values() {
        return (EnumC31334Dpz[]) A01.clone();
    }

    public final boolean A00() {
        if (this != A02 && this != A03) {
            return false;
        }
        return true;
    }

    public EnumC31334Dpz(String str, int i) {
    }
}
