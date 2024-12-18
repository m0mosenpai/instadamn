package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD0[] A01;
    public static final VD0 A02;
    public static final VD0 A03;
    public static final VD0 A04;
    public static final VD0 A05;

    static {
        VD0 vd0 = new VD0("ALL_BORDERED_ALL_ROUNDED", 0);
        A02 = vd0;
        VD0 vd02 = new VD0("ALL_BORDERED_TOP_ROUNDED", 1);
        A03 = vd02;
        VD0 vd03 = new VD0("NO_TOP_BORDER_NONE_ROUNDED", 2);
        A05 = vd03;
        VD0 vd04 = new VD0("NO_TOP_BORDER_BOTTOM_ROUNDED", 3);
        A04 = vd04;
        VD0[] vd0Arr = {vd0, vd02, vd03, vd04};
        A01 = vd0Arr;
        A00 = AbstractC12190kN.A00(vd0Arr);
    }

    public static VD0 valueOf(String str) {
        return (VD0) Enum.valueOf(VD0.class, str);
    }

    public static VD0[] values() {
        return (VD0[]) A01.clone();
    }

    public VD0(String str, int i) {
    }
}
