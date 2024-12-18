package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEJ {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEJ[] A03;
    public static final VEJ A04;
    public static final VEJ A05;
    public final int A00;
    public final EnumC68186VFe A01;

    public static VEJ valueOf(String str) {
        return (VEJ) Enum.valueOf(VEJ.class, str);
    }

    public static VEJ[] values() {
        return (VEJ[]) A03.clone();
    }

    static {
        VEJ vej = new VEJ(EnumC68186VFe.DISMISS, "OK", 0, 2131961437);
        A04 = vej;
        VEJ vej2 = new VEJ(EnumC68186VFe.DISMISS_AND_CLOSE, "OK_DISMISS_AND_CLOSE", 1, 2131961426);
        A05 = vej2;
        VEJ[] vejArr = {vej, vej2};
        A03 = vejArr;
        A02 = AbstractC12190kN.A00(vejArr);
    }

    public VEJ(EnumC68186VFe enumC68186VFe, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC68186VFe;
    }
}
