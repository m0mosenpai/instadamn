package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDO {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDO[] A03;
    public static final VDO A04;
    public final String A00;

    static {
        VDO vdo = new VDO("GRID_TEMPLATE", 0, "grid_template");
        A04 = vdo;
        VDO[] vdoArr = {vdo, new VDO("LIST_TEMPLATE", 1, "list_template")};
        A03 = vdoArr;
        A02 = AbstractC12190kN.A00(vdoArr);
        VDO[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDO vdo2 : values) {
            linkedHashMap.put(vdo2.A00, vdo2);
        }
        A01 = linkedHashMap;
    }

    public static VDO valueOf(String str) {
        return (VDO) Enum.valueOf(VDO.class, str);
    }

    public static VDO[] values() {
        return (VDO[]) A03.clone();
    }

    public VDO(String str, int i, String str2) {
        this.A00 = str2;
    }
}
