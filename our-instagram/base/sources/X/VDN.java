package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDN {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDN[] A02;
    public static final VDN A03;
    public static final VDN A04;
    public final int A00;

    static {
        VDN vdn = new VDN("ON_MIDDLE_VALUE", 0, 0);
        A04 = vdn;
        VDN vdn2 = new VDN("ON_ALL_VALUES", 1, 1);
        A03 = vdn2;
        VDN[] vdnArr = {vdn, vdn2};
        A02 = vdnArr;
        A01 = AbstractC12190kN.A00(vdnArr);
    }

    public static VDN valueOf(String str) {
        return (VDN) Enum.valueOf(VDN.class, str);
    }

    public static VDN[] values() {
        return (VDN[]) A02.clone();
    }

    public VDN(String str, int i, int i2) {
        this.A00 = i2;
    }
}
