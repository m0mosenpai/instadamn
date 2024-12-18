package X;

import com.instagram.api.schemas.FanClubStatusSyncInfo;
import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;

/* renamed from: X.6rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151186rL {
    public static final FanClubStatusSyncInfo A00(FanClubStatusSyncInfo fanClubStatusSyncInfo, Boolean bool, Boolean bool2) {
        if (!AbstractC16960so.A1R(bool, bool2, null).isEmpty()) {
            if (fanClubStatusSyncInfo == null) {
                fanClubStatusSyncInfo = new FanClubStatusSyncInfoImpl(null, false, false);
            }
            FanClubStatusSyncInfoImpl EtR = fanClubStatusSyncInfo.EtR();
            boolean z = EtR.A01;
            boolean z2 = EtR.A02;
            Long l = EtR.A00;
            if (bool != null) {
                z = bool.booleanValue();
            }
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            return new FanClubStatusSyncInfoImpl(l, z, z2);
        }
        if (fanClubStatusSyncInfo != null) {
            return fanClubStatusSyncInfo.EtR();
        }
        return null;
    }
}
