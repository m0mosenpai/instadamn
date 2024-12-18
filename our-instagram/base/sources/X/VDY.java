package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDY {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDY[] A03;
    public static final VDY A04;
    public static final VDY A05;
    public final String A00;

    public static VDY valueOf(String str) {
        return (VDY) Enum.valueOf(VDY.class, str);
    }

    public static VDY[] values() {
        return (VDY[]) A03.clone();
    }

    static {
        VDY vdy = new VDY("USER_ADDED", 0, "user_added");
        A05 = vdy;
        VDY vdy2 = new VDY("AUTOMATICALLY_ADDED", 1, "automatically_added");
        A04 = vdy2;
        VDY[] vdyArr = {vdy, vdy2};
        A03 = vdyArr;
        A02 = AbstractC12190kN.A00(vdyArr);
        VDY[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDY vdy3 : values) {
            linkedHashMap.put(vdy3.A00, vdy3);
        }
        A01 = linkedHashMap;
    }

    public VDY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
