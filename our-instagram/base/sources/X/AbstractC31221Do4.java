package X;

import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Do4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31221Do4 {
    public static Map A00(FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowContentPreview();
        A1I.put("should_show_content_preview", Boolean.valueOf(fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowContentPreview()));
        fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowSocialContext();
        A1I.put("should_show_social_context", Boolean.valueOf(fanClubFanConsiderationPageFeatureEligibilityResponse.getShouldShowSocialContext()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
