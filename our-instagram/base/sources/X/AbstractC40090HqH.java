package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.PartnerProgramOnboardingSteps;
import java.io.IOException;

/* renamed from: X.HqH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40090HqH {
    public static H4J parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            PartnerProgramOnboardingSteps partnerProgramOnboardingSteps = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (OptSvcAnalyticsStore.LOGGING_KEY_STEP.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    partnerProgramOnboardingSteps = (PartnerProgramOnboardingSteps) PartnerProgramOnboardingSteps.A01.get(A1P);
                    if (partnerProgramOnboardingSteps == null) {
                        partnerProgramOnboardingSteps = PartnerProgramOnboardingSteps.A0P;
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("index", c16l, "MonetizationProductOnboardingNextStepInfoImpl");
            } else if (partnerProgramOnboardingSteps == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(OptSvcAnalyticsStore.LOGGING_KEY_STEP, c16l, "MonetizationProductOnboardingNextStepInfoImpl");
            } else {
                return new H4J(partnerProgramOnboardingSteps, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
