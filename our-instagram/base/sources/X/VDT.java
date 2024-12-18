package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDT[] A02;
    public static final VDT A03;
    public static final VDT A04;
    public static final VDT A05;
    public final int A00;

    public static VDT valueOf(String str) {
        return (VDT) Enum.valueOf(VDT.class, str);
    }

    public static VDT[] values() {
        return (VDT[]) A02.clone();
    }

    static {
        VDT vdt = new VDT("Audio", 0, 1);
        A03 = vdt;
        VDT vdt2 = new VDT("Video", 1, 2);
        A05 = vdt2;
        VDT vdt3 = new VDT("Mixed", 2, 3);
        A04 = vdt3;
        VDT[] vdtArr = {vdt, vdt2, vdt3};
        A02 = vdtArr;
        A01 = AbstractC12190kN.A00(vdtArr);
    }

    public VDT(String str, int i, int i2) {
        this.A00 = i2;
    }
}
