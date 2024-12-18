package X;

import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hso, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40225Hso {
    public static Map A00(ScheduledLiveDiscountInfo scheduledLiveDiscountInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (scheduledLiveDiscountInfo.AyH() != null) {
            A1I.put("discount_id", scheduledLiveDiscountInfo.AyH());
        }
        if (scheduledLiveDiscountInfo.CQH() != null) {
            A1I.put("is_auto_tagged", scheduledLiveDiscountInfo.CQH());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
