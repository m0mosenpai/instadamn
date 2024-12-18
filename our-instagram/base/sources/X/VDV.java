package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDV {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDV[] A03;
    public static final VDV A04;
    public static final VDV A05;
    public final String A00;

    static {
        VDV vdv = new VDV("FINAL", 0, "FINAL");
        A05 = vdv;
        VDV vdv2 = new VDV("ESTIMATED", 1, "ESTIMATED");
        A04 = vdv2;
        VDV[] vdvArr = {vdv, vdv2, new VDV("UNKNOWN", 2, "UNKNOWN")};
        A03 = vdvArr;
        A02 = AbstractC12190kN.A00(vdvArr);
        VDV[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDV vdv3 : values) {
            linkedHashMap.put(vdv3.A00, vdv3);
        }
        A01 = linkedHashMap;
    }

    public static VDV valueOf(String str) {
        return (VDV) Enum.valueOf(VDV.class, str);
    }

    public static VDV[] values() {
        return (VDV[]) A03.clone();
    }

    public VDV(String str, int i, String str2) {
        this.A00 = str2;
    }
}
