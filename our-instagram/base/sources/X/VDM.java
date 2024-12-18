package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDM {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDM[] A02;
    public static final VDM A03;
    public static final VDM A04;
    public final int A00;

    static {
        VDM vdm = new VDM("CHUNKY", 0, 0);
        A03 = vdm;
        VDM vdm2 = new VDM("SLIM", 1, 1);
        A04 = vdm2;
        VDM[] vdmArr = {vdm, vdm2};
        A02 = vdmArr;
        A01 = AbstractC12190kN.A00(vdmArr);
    }

    public static VDM valueOf(String str) {
        return (VDM) Enum.valueOf(VDM.class, str);
    }

    public static VDM[] values() {
        return (VDM[]) A02.clone();
    }

    public VDM(String str, int i, int i2) {
        this.A00 = i2;
    }
}
