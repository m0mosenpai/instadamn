package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VCt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VCt[] A01;
    public static final VCt A02;
    public static final VCt A03;
    public static final VCt A04;

    static {
        VCt vCt = new VCt("IDLE", 0);
        A04 = vCt;
        VCt vCt2 = new VCt("DRAGGING", 1);
        A03 = vCt2;
        VCt vCt3 = new VCt("COASTING", 2);
        A02 = vCt3;
        VCt[] vCtArr = {vCt, vCt2, vCt3};
        A01 = vCtArr;
        A00 = AbstractC12190kN.A00(vCtArr);
    }

    public static VCt valueOf(String str) {
        return (VCt) Enum.valueOf(VCt.class, str);
    }

    public static VCt[] values() {
        return (VCt[]) A01.clone();
    }

    public VCt(String str, int i) {
    }
}
