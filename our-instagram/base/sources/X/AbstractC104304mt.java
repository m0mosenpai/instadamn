package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.4mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104304mt {
    public static C104404n6 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision2 = null;
            UserMonetizationProductType userMonetizationProductType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_use_product".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("eligibility_decision".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P4);
                } else if ("has_onboarded".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("igtv_monetization_account_level_toggle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = (IGTVAccountLevelMonetizationToggleSetting) IGTVAccountLevelMonetizationToggleSetting.A01.get(A1P3);
                    if (iGTVAccountLevelMonetizationToggleSetting == null) {
                        iGTVAccountLevelMonetizationToggleSetting = IGTVAccountLevelMonetizationToggleSetting.A06;
                    }
                } else if ("mes_status_for_product".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    monetizationEligibilityDecision2 = AbstractC104324mv.A00(A1P2);
                } else if ("product_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    userMonetizationProductType = AbstractC104314mu.A00(A1P);
                } else if ("show_in_settings".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("can_use_product", "MonetizationEligibilityProductDecision");
            } else if (monetizationEligibilityDecision != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("has_onboarded", "MonetizationEligibilityProductDecision");
                } else if (monetizationEligibilityDecision2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("mes_status_for_product", "MonetizationEligibilityProductDecision");
                } else if (userMonetizationProductType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("product_type", "MonetizationEligibilityProductDecision");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("show_in_settings", "MonetizationEligibilityProductDecision");
                } else {
                    return new C104404n6(iGTVAccountLevelMonetizationToggleSetting, monetizationEligibilityDecision, monetizationEligibilityDecision2, userMonetizationProductType, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("eligibility_decision", "MonetizationEligibilityProductDecision");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
