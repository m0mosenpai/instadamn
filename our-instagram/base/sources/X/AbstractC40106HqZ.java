package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.HqZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40106HqZ {
    public static C51792Muw parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UserMonetizationProductType userMonetizationProductType = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_level_monetization_toggle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = AbstractC37304Gc5.A0A(A1P2);
                } else if ("product_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    userMonetizationProductType = AbstractC104314mu.A00(A1P);
                }
                c16l.A0z();
            }
            if (userMonetizationProductType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("product_type", c16l, "NonRevshareConfig");
                throw C00O.createAndThrow();
            }
            return new C51792Muw(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
