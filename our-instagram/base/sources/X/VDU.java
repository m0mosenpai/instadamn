package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDU {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDU[] A03;
    public static final VDU A04;
    public static final VDU A05;
    public final String A00;

    static {
        VDU vdu = new VDU("TEST", 0, "TEST");
        A05 = vdu;
        VDU vdu2 = new VDU("LIVE", 1, "LIVE");
        A04 = vdu2;
        VDU[] vduArr = {vdu, vdu2};
        A03 = vduArr;
        A02 = AbstractC12190kN.A00(vduArr);
        VDU[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDU vdu3 : values) {
            linkedHashMap.put(vdu3.A00, vdu3);
        }
        A01 = linkedHashMap;
    }

    public static VDU valueOf(String str) {
        return (VDU) Enum.valueOf(VDU.class, str);
    }

    public static VDU[] values() {
        return (VDU[]) A03.clone();
    }

    public VDU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
