package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDL {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VDL[] A03;
    public static final VDL A04;
    public final String A00;

    static {
        VDL vdl = new VDL("SPARKLE", 0, "sparkle");
        A04 = vdl;
        VDL[] vdlArr = {vdl, new VDL(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE)};
        A03 = vdlArr;
        A02 = AbstractC12190kN.A00(vdlArr);
        VDL[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VDL vdl2 : values) {
            linkedHashMap.put(vdl2.A00, vdl2);
        }
        A01 = linkedHashMap;
    }

    public static VDL valueOf(String str) {
        return (VDL) Enum.valueOf(VDL.class, str);
    }

    public static VDL[] values() {
        return (VDL[]) A03.clone();
    }

    public VDL(String str, int i, String str2) {
        this.A00 = str2;
    }
}
