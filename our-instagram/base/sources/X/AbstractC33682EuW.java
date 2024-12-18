package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.EuW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33682EuW {
    public static C26127BhE parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            UserMonetizationProductType userMonetizationProductType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_use_product".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("has_onboarded".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_eligible_to_set_up".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
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
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_use_product", c16l, "CreatorToolsGatingInfoImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("info", c16l, "CreatorToolsGatingInfoImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_eligible_to_set_up", c16l, "CreatorToolsGatingInfoImpl");
                } else if (userMonetizationProductType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_type", c16l, "CreatorToolsGatingInfoImpl");
                } else {
                    return new C26127BhE(userMonetizationProductType, str, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_onboarded", c16l, "CreatorToolsGatingInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
