package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDX {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDX[] A02;
    public static final VDX A03;
    public static final VDX A04;
    public static final VDX A05;
    public final int A00;

    static {
        VDX vdx = new VDX(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A03 = vdx;
        VDX vdx2 = new VDX("VERIFIED", 1, 1);
        A05 = vdx2;
        VDX vdx3 = new VDX("STAR", 2, 2);
        A04 = vdx3;
        VDX[] vdxArr = {vdx, vdx2, vdx3};
        A02 = vdxArr;
        A01 = AbstractC12190kN.A00(vdxArr);
    }

    public static VDX valueOf(String str) {
        return (VDX) Enum.valueOf(VDX.class, str);
    }

    public static VDX[] values() {
        return (VDX[]) A02.clone();
    }

    public VDX(String str, int i, int i2) {
        this.A00 = i2;
    }
}
