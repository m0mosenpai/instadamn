package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hr1 {
    public static C45144Jyk parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("mes_status_for_product".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P);
                } else if ("pending_approval_requests_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "require_approval");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("pending_approval_requests_count", c16l, "PaidPartnershipLabelConfigImpl");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("require_approval", c16l, "PaidPartnershipLabelConfigImpl");
            } else {
                return new C45144Jyk(monetizationEligibilityDecision, num.intValue(), bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
