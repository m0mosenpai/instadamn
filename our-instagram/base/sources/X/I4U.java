package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4U {
    public static ProductOnboardingNextStepInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductOnboardingNextStepInfo productOnboardingNextStepInfo = new ProductOnboardingNextStepInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("index".equals(A0s)) {
                    productOnboardingNextStepInfo.A00 = c16l.A1D();
                } else if (OptSvcAnalyticsStore.LOGGING_KEY_STEP.equals(A0s)) {
                    productOnboardingNextStepInfo.A02 = AbstractC167017dG.A0m(c16l);
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A0s)) {
                    productOnboardingNextStepInfo.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return productOnboardingNextStepInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
