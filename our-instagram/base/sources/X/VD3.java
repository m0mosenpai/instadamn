package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD3[] A01;
    public static final VD3 A02;
    public static final VD3 A03;
    public static final VD3 A04;
    public static final VD3 A05;
    public static final VD3 A06;

    static {
        VD3 vd3 = new VD3("NOT_STARTED", 0);
        A05 = vd3;
        VD3 vd32 = new VD3("IN_PROGRESS", 1);
        A04 = vd32;
        VD3 vd33 = new VD3("SUCCESS", 2);
        A06 = vd33;
        VD3 vd34 = new VD3("FAILED", 3);
        A03 = vd34;
        VD3 vd35 = new VD3("CANCELED", 4);
        A02 = vd35;
        VD3[] vd3Arr = {vd3, vd32, vd33, vd34, vd35};
        A01 = vd3Arr;
        A00 = AbstractC12190kN.A00(vd3Arr);
    }

    public static VD3 valueOf(String str) {
        return (VD3) Enum.valueOf(VD3.class, str);
    }

    public static VD3[] values() {
        return (VD3[]) A01.clone();
    }

    public VD3(String str, int i) {
    }
}
