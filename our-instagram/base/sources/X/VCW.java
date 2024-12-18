package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VCW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VCW[] A01;
    public static final VCW A02;

    static {
        VCW vcw = new VCW("DISCLAIMER_PUX", 0);
        A02 = vcw;
        VCW[] vcwArr = {vcw, new VCW("DISCLAIMER_NUX", 1)};
        A01 = vcwArr;
        A00 = AbstractC12190kN.A00(vcwArr);
    }

    public static VCW valueOf(String str) {
        return (VCW) Enum.valueOf(VCW.class, str);
    }

    public static VCW[] values() {
        return (VCW[]) A01.clone();
    }

    public VCW(String str, int i) {
    }
}
