package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEL {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEL[] A03;
    public static final VEL A04;
    public static final VEL A05;
    public static final VEL A06;
    public final int A00;
    public final String A01;

    static {
        VEL vel = new VEL("IG_AR_ADS", 0, 81207509, "ig_ar_ads");
        A04 = vel;
        VEL vel2 = new VEL("IG_AR_DYNAMIC_ADS", 1, 81214649, "ig_ar_dynamic_ads");
        A05 = vel2;
        VEL vel3 = new VEL("MIX_AND_MATCH", 2, 81209280, "mix_and_match");
        A06 = vel3;
        VEL[] velArr = {vel, vel2, vel3, new VEL("FB_AR_DYNAMIC_ADS", 3, 81201291, "fb_ar_dynamic_ads")};
        A03 = velArr;
        A02 = AbstractC12190kN.A00(velArr);
    }

    public static VEL valueOf(String str) {
        return (VEL) Enum.valueOf(VEL.class, str);
    }

    public static VEL[] values() {
        return (VEL[]) A03.clone();
    }

    public VEL(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}
