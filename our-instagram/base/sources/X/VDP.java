package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDP {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDP[] A03;
    public static final VDP A04;
    public final String A00;

    public static VDP valueOf(String str) {
        return (VDP) Enum.valueOf(VDP.class, str);
    }

    public static VDP[] values() {
        return (VDP[]) A03.clone();
    }

    static {
        VDP vdp = new VDP("USER_ADDED", 0, "user_added");
        A04 = vdp;
        VDP[] vdpArr = {vdp, new VDP("AUTOMATICALLY_ADDED", 1, "automatically_added")};
        A03 = vdpArr;
        A02 = AbstractC12190kN.A00(vdpArr);
        VDP[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDP vdp2 : values) {
            linkedHashMap.put(vdp2.A00, vdp2);
        }
        A01 = linkedHashMap;
    }

    public VDP(String str, int i, String str2) {
        this.A00 = str2;
    }
}
