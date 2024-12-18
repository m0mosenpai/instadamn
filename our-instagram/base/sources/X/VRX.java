package X;

import com.instagram.api.schemas.AdGeoLocationType;

/* loaded from: classes11.dex */
public abstract class VRX {
    public static final AdGeoLocationType A00(AdGeoLocationType adGeoLocationType) {
        int A05 = AbstractC25227BEk.A05(adGeoLocationType, 0);
        if (A05 != 2) {
            if (A05 != 3) {
                if (A05 != 4) {
                    if (A05 != 5) {
                        if (A05 != 14) {
                            return AdGeoLocationType.A07;
                        }
                        return AdGeoLocationType.A0E;
                    }
                    return AdGeoLocationType.A0L;
                }
                return AdGeoLocationType.A04;
            }
            return AdGeoLocationType.A0G;
        }
        return AdGeoLocationType.A05;
    }
}
