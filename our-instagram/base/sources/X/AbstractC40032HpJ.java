package X;

import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40032HpJ {
    public static Map A00(IntentAwareAdsFormatInfo intentAwareAdsFormatInfo) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (intentAwareAdsFormatInfo.B7y() != null) {
            IntentAwareAdsFormatType B7y = intentAwareAdsFormatInfo.B7y();
            if (B7y != null) {
                str = B7y.A00;
            } else {
                str = null;
            }
            A1I.put("format", str);
        }
        if (intentAwareAdsFormatInfo.getTitle() != null) {
            AbstractC37300Gc1.A17(intentAwareAdsFormatInfo.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
