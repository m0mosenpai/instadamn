package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD2[] A01;
    public static final VD2 A02;
    public static final VD2 A03;
    public static final VD2 A04;
    public static final VD2 A05;
    public static final VD2 A06;

    static {
        VD2 vd2 = new VD2("UNKNOWN__DO_NOT_USE", 0);
        A06 = vd2;
        VD2 vd22 = new VD2("FULL_SCREEN", 1);
        A02 = vd22;
        VD2 vd23 = new VD2("FULL_SHEET", 2);
        A03 = vd23;
        VD2 vd24 = new VD2("HALF_SHEET", 3);
        A04 = vd24;
        VD2 vd25 = new VD2("PEEK", 4);
        A05 = vd25;
        VD2[] vd2Arr = {vd2, vd22, vd23, vd24, vd25};
        A01 = vd2Arr;
        A00 = AbstractC12190kN.A00(vd2Arr);
    }

    public static VD2 valueOf(String str) {
        return (VD2) Enum.valueOf(VD2.class, str);
    }

    public static VD2[] values() {
        return (VD2[]) A01.clone();
    }

    public VD2(String str, int i) {
    }
}
