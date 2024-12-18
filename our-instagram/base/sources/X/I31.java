package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I31 {
    public static C38814H7e parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IgFundedIncentive igFundedIncentive = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "incentive_details")) {
                    igFundedIncentive = AbstractC40723I3d.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (igFundedIncentive == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("incentive_details", c16l, "IncentiveRichDestination");
                throw C00O.createAndThrow();
            }
            return new C38814H7e(igFundedIncentive);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
