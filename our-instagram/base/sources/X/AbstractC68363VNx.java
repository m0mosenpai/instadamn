package X;

import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VNx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68363VNx {
    public static Map A00(AdvantageAudienceData advantageAudienceData) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (advantageAudienceData.AaJ() != null) {
            XFBTargetingAutomationAdvantageAudienceStatus AaJ = advantageAudienceData.AaJ();
            if (AaJ != null) {
                str = AaJ.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("advantage_audience_status", str);
        }
        if (advantageAudienceData.BTn() != null) {
            linkedHashMap.put("min_age_constraint", advantageAudienceData.BTn());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
