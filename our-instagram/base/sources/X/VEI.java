package X;

import com.instagram.api.schemas.XIGIGBoostDestination;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEI {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEI[] A03;
    public static final VEI A04;
    public final XIGIGBoostDestination A00;
    public final String A01;

    static {
        VEI vei = new VEI(XIGIGBoostDestination.A0B, "PROFILE", "profile", 0);
        A04 = vei;
        VEI[] veiArr = {vei, new VEI(XIGIGBoostDestination.A0E, "WEBSITE", "website", 1)};
        A03 = veiArr;
        A02 = AbstractC12190kN.A00(veiArr);
    }

    public static VEI valueOf(String str) {
        return (VEI) Enum.valueOf(VEI.class, str);
    }

    public static VEI[] values() {
        return (VEI[]) A03.clone();
    }

    public VEI(XIGIGBoostDestination xIGIGBoostDestination, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = xIGIGBoostDestination;
    }
}
