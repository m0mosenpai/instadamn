package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.Hn6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39916Hn6 {
    public static H3H parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_acquire_new_subscribers".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("mes_status_for_product".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_acquire_new_subscribers", c16l, "FanClubConfigImpl");
                throw C00O.createAndThrow();
            }
            return new H3H(monetizationEligibilityDecision, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
