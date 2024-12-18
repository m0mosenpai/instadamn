package X;

import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Ho6 {
    public static Map A00(IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict) {
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGAdsIABScreenshotDataDict.BQ3() != null) {
            A1I.put("max_secs_for_screenshot", AbstractC166997dE.A0f(iGAdsIABScreenshotDataDict.BQ3()));
        }
        if (iGAdsIABScreenshotDataDict.BTx() != null) {
            A1I.put("min_secs_for_screenshot", AbstractC166997dE.A0f(iGAdsIABScreenshotDataDict.BTx()));
        }
        String str3 = null;
        if (iGAdsIABScreenshotDataDict.Bqq() != null) {
            IABScreenshotEffectOnUserAction Bqq = iGAdsIABScreenshotDataDict.Bqq();
            if (Bqq != null) {
                str2 = Bqq.A00;
            } else {
                str2 = null;
            }
            A1I.put("screenshot_effect_on_user_action", str2);
        }
        if (iGAdsIABScreenshotDataDict.Bqr() != null) {
            A1I.put("screenshot_effect_percent", AbstractC166997dE.A0f(iGAdsIABScreenshotDataDict.Bqr()));
        }
        if (iGAdsIABScreenshotDataDict.Bqs() != null) {
            A1I.put("screenshot_saturation_or_opacity_percent", AbstractC166997dE.A0f(iGAdsIABScreenshotDataDict.Bqs()));
        }
        if (iGAdsIABScreenshotDataDict.Bqt() != null) {
            IABScreenshotTransitionTime Bqt = iGAdsIABScreenshotDataDict.Bqt();
            if (Bqt != null) {
                str = Bqt.A00;
            } else {
                str = null;
            }
            A1I.put("screenshot_transition_time", str);
        }
        if (iGAdsIABScreenshotDataDict.Bqu() != null) {
            A1I.put("screenshot_url", iGAdsIABScreenshotDataDict.Bqu());
        }
        if (iGAdsIABScreenshotDataDict.Bqv() != null) {
            IGAdsIABScreenshotVariant Bqv = iGAdsIABScreenshotDataDict.Bqv();
            if (Bqv != null) {
                str3 = Bqv.A00;
            }
            A1I.put("screenshot_variant", str3);
        }
        if (iGAdsIABScreenshotDataDict.Bwb() != null) {
            A1I.put("show_loading_indicator", iGAdsIABScreenshotDataDict.Bwb());
        }
        if (iGAdsIABScreenshotDataDict.C6H() != null) {
            A1I.put("text_for_toast_variant", iGAdsIABScreenshotDataDict.C6H());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
