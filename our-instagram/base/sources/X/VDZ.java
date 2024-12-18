package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDZ[] A02;
    public static final VDZ A03;
    public static final VDZ A04;
    public static final VDZ A05;
    public final int A00;

    static {
        VDZ vdz = new VDZ("TAGS", 0, 1);
        A05 = vdz;
        VDZ vdz2 = new VDZ("LIST", 1, 2);
        A03 = vdz2;
        VDZ vdz3 = new VDZ("RADIO_BUTTONS", 2, 3);
        A04 = vdz3;
        VDZ[] vdzArr = {vdz, vdz2, vdz3};
        A02 = vdzArr;
        A01 = AbstractC12190kN.A00(vdzArr);
    }

    public static VDZ valueOf(String str) {
        return (VDZ) Enum.valueOf(VDZ.class, str);
    }

    public static VDZ[] values() {
        return (VDZ[]) A02.clone();
    }

    public VDZ(String str, int i, int i2) {
        this.A00 = i2;
    }
}
