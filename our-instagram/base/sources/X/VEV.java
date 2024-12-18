package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEV {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ VEV[] A05;
    public static final VEV A06;
    public static final VEV A07;
    public static final VEV A08;
    public static final VEV A09;
    public static final VEV A0A;
    public final int A00;
    public final int A02;
    public final int A01 = 11;
    public final int A03 = 4;

    static {
        VEV vev = new VEV("DEFAULT_CELL", 0, 2, 11);
        A0A = vev;
        VEV vev2 = new VEV("ACCORDION_CELL", 1, 4, 11);
        A06 = vev2;
        VEV vev3 = new VEV("ACCORDION_HOVERED_CELL", 2, 11, 11);
        A08 = vev3;
        VEV vev4 = new VEV("ACCORDION_HEADER_CELL", 3, 4, 4);
        A07 = vev4;
        VEV vev5 = new VEV("ACCORDION_PUX_CELL", 4, 4, 4);
        A09 = vev5;
        VEV[] vevArr = {vev, vev2, vev3, vev4, vev5};
        A05 = vevArr;
        A04 = AbstractC12190kN.A00(vevArr);
    }

    public VEV(String str, int i, int i2, int i3) {
        this.A00 = i2;
        this.A02 = i3;
    }

    public static VEV valueOf(String str) {
        return (VEV) Enum.valueOf(VEV.class, str);
    }

    public static VEV[] values() {
        return (VEV[]) A05.clone();
    }
}
