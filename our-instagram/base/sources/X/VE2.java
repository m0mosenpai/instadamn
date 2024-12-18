package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE2 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE2[] A03;
    public static final VE2 A04;
    public static final VE2 A05;
    public static final VE2 A06;
    public static final VE2 A07;
    public static final VE2 A08;
    public static final VE2 A09;
    public static final VE2 A0A;
    public final String A00;

    public static VE2 valueOf(String str) {
        return (VE2) Enum.valueOf(VE2.class, str);
    }

    public static VE2[] values() {
        return (VE2[]) A03.clone();
    }

    static {
        VE2 ve2 = new VE2("CRUNCHY", 0, "crunchy");
        A04 = ve2;
        VE2 ve22 = new VE2("DREAMY", 1, "dreamy");
        A05 = ve22;
        VE2 ve23 = new VE2("RADIO", 2, "radio");
        A06 = ve23;
        VE2 ve24 = new VE2("SLOWED", 3, "slowed");
        A07 = ve24;
        VE2 ve25 = new VE2("SPED_UP", 4, "sped_up");
        A08 = ve25;
        VE2 ve26 = new VE2("VINYL", 5, "vinyl");
        A0A = ve26;
        VE2 ve27 = new VE2("UNKNOWN", 6, "unknown");
        A09 = ve27;
        VE2[] ve2Arr = {ve2, ve22, ve23, ve24, ve25, ve26, ve27};
        A03 = ve2Arr;
        A02 = AbstractC12190kN.A00(ve2Arr);
        VE2[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE2 ve28 : values) {
            linkedHashMap.put(ve28.A00, ve28);
        }
        A01 = linkedHashMap;
    }

    public VE2(String str, int i, String str2) {
        this.A00 = str2;
    }
}
