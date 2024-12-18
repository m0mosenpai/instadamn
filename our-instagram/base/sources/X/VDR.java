package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDR {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDR[] A02;
    public static final VDR A03;
    public static final VDR A04;
    public final int A00;

    static {
        VDR vdr = new VDR("CUSTOM_LIST_ITEM", 0, 0);
        A03 = vdr;
        VDR vdr2 = new VDR("IGDS_LIST_ITEM", 1, 1);
        A04 = vdr2;
        VDR[] vdrArr = {vdr, vdr2};
        A02 = vdrArr;
        A01 = AbstractC12190kN.A00(vdrArr);
    }

    public static VDR valueOf(String str) {
        return (VDR) Enum.valueOf(VDR.class, str);
    }

    public static VDR[] values() {
        return (VDR[]) A02.clone();
    }

    public VDR(String str, int i, int i2) {
        this.A00 = i2;
    }
}
