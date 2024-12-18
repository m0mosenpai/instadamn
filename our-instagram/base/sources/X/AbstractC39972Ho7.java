package X;

import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import java.io.IOException;

/* renamed from: X.Ho7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39972Ho7 {
    public static IGAdsIABScreenshotDataDictImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = null;
            Float f3 = null;
            Float f4 = null;
            IABScreenshotTransitionTime iABScreenshotTransitionTime = null;
            String str = null;
            IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = null;
            Boolean bool = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("max_secs_for_screenshot".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("min_secs_for_screenshot".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("screenshot_effect_on_user_action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    iABScreenshotEffectOnUserAction = (IABScreenshotEffectOnUserAction) IABScreenshotEffectOnUserAction.A01.get(A1P3);
                    if (iABScreenshotEffectOnUserAction == null) {
                        iABScreenshotEffectOnUserAction = IABScreenshotEffectOnUserAction.A07;
                    }
                } else if ("screenshot_effect_percent".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("screenshot_saturation_or_opacity_percent".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                } else if ("screenshot_transition_time".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iABScreenshotTransitionTime = (IABScreenshotTransitionTime) IABScreenshotTransitionTime.A01.get(A1P2);
                    if (iABScreenshotTransitionTime == null) {
                        iABScreenshotTransitionTime = IABScreenshotTransitionTime.A06;
                    }
                } else if ("screenshot_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("screenshot_variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsIABScreenshotVariant = (IGAdsIABScreenshotVariant) IGAdsIABScreenshotVariant.A01.get(A1P);
                    if (iGAdsIABScreenshotVariant == null) {
                        iGAdsIABScreenshotVariant = IGAdsIABScreenshotVariant.A08;
                    }
                } else if ("show_loading_indicator".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("text_for_toast_variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new IGAdsIABScreenshotDataDictImpl(iABScreenshotEffectOnUserAction, iABScreenshotTransitionTime, iGAdsIABScreenshotVariant, bool, f, f2, f3, f4, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
