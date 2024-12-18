package X;

import com.instagram.api.schemas.FanClubStatusSyncInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37378GdK {
    public static Map A00(FanClubStatusSyncInfo fanClubStatusSyncInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        fanClubStatusSyncInfo.B1B();
        A1I.put("eligible_to_subscribe", Boolean.valueOf(fanClubStatusSyncInfo.B1B()));
        fanClubStatusSyncInfo.C3R();
        A1I.put("subscribed", Boolean.valueOf(fanClubStatusSyncInfo.C3R()));
        if (fanClubStatusSyncInfo.C3S() != null) {
            A1I.put(AbstractC111324zv.A00(3189), fanClubStatusSyncInfo.C3S());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
