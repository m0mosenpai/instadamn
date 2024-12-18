package X;

/* renamed from: X.Jd2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44015Jd2 {
    public static final EnumC46982Dm A01(EnumC31648DvE enumC31648DvE) {
        int A05 = AbstractC25227BEk.A05(enumC31648DvE, 0);
        if (A05 != 1) {
            if (A05 != 3) {
                if (A05 != 0 && A05 == 4) {
                    return EnumC46982Dm.A04;
                }
                return EnumC46982Dm.A05;
            }
            return EnumC46982Dm.A07;
        }
        return EnumC46982Dm.A06;
    }

    public static final EnumC31648DvE A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return EnumC31648DvE.A08;
            }
            if (intValue == 2) {
                return EnumC31648DvE.A07;
            }
            if (intValue == 3) {
                return EnumC31648DvE.A0B;
            }
            if (intValue != 0 && intValue == 16) {
                return EnumC31648DvE.A03;
            }
        }
        return EnumC31648DvE.A06;
    }

    public static final int A00(EnumC31648DvE enumC31648DvE) {
        int ordinal = enumC31648DvE.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }
}
