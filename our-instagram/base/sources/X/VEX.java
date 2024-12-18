package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEX {
    public static final /* synthetic */ EnumEntries A06;
    public static final /* synthetic */ VEX[] A07;
    public static final VEX A08;
    public static final VEX A09;
    public static final VEX A0A;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04 = 2;
    public final VEP A05;

    public VEX(VEP vep, String str, int i, int i2, int i3, int i4, int i5) {
        this.A05 = vep;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A03 = i5;
    }

    static {
        VEP vep = VEP.A0B;
        VEX vex = new VEX(vep, "PRIMARY_BUTTON", 0, 7, 35, 9, 10);
        A08 = vex;
        VEX vex2 = new VEX(VEP.A0C, "PRIMARY_BUTTON_EMPHASIZED", 1, 7, 35, 9, 10);
        A09 = vex2;
        VEX vex3 = new VEX(vep, "SECONDARY_BUTTON", 2, 29, 29, 4, 4);
        A0A = vex3;
        VEX[] vexArr = {vex, vex2, vex3, new VEX(vep, "SECONDARY_SOLID_BUTTON", 3, 0, 35, 47, 11)};
        A07 = vexArr;
        A06 = AbstractC12190kN.A00(vexArr);
    }

    public static VEX valueOf(String str) {
        return (VEX) Enum.valueOf(VEX.class, str);
    }

    public static VEX[] values() {
        return (VEX[]) A07.clone();
    }
}
