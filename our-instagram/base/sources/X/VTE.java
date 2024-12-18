package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;

/* loaded from: classes11.dex */
public abstract class VTE {
    public static final long A00(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf) {
        String Bay;
        Long A0k;
        if (iGCTMessagingAdsInfoDictIntf != null && (Bay = iGCTMessagingAdsInfoDictIntf.Bay()) != null && (A0k = AbstractC003100w.A0k(10, Bay)) != null) {
            return A0k.longValue();
        }
        return -1L;
    }
}
