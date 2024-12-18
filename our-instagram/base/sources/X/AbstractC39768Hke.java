package X;

import com.instagram.api.schemas.BillingWizardName;
import java.io.IOException;

/* renamed from: X.Hke, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39768Hke {
    public static MUW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            BillingWizardName billingWizardName = null;
            H2O h2o = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("wizard_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    billingWizardName = (BillingWizardName) BillingWizardName.A01.get(A1P);
                    if (billingWizardName == null) {
                        billingWizardName = BillingWizardName.A21;
                    }
                } else if ("wizard_props".equals(A0s)) {
                    h2o = AbstractC39769Hkf.parseFromJson(c16l);
                } else if ("wizard_props_json".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_label", c16l, "BillingInfoAction");
                throw C00O.createAndThrow();
            }
            return new MUW(h2o, billingWizardName, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
