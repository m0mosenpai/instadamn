package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.4mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104334mx {
    public static C104384n4 parseFromJson(C16L c16l) {
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
            C104364n2 c104364n2 = null;
            CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct = null;
            H3H h3h = null;
            HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            C45144Jyk c45144Jyk = null;
            C9BH c9bh = null;
            UserMonetizationProductType userMonetizationProductType = null;
            C38688GzT c38688GzT = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("branded_content_config".equals(A0q)) {
                    c104364n2 = AbstractC104354n1.parseFromJson(c16l);
                } else if ("can_use_product".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    canUseCreatorMonetizationProduct = (CanUseCreatorMonetizationProduct) CanUseCreatorMonetizationProduct.A01.get(A1P4);
                    if (canUseCreatorMonetizationProduct == null) {
                        canUseCreatorMonetizationProduct = CanUseCreatorMonetizationProduct.A06;
                    }
                } else if ("fan_club_config".equals(A0q)) {
                    h3h = AbstractC39916Hn6.parseFromJson(c16l);
                } else if ("has_onboarded".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    hasOnboardedCreatorMonetizationProduct = (HasOnboardedCreatorMonetizationProduct) HasOnboardedCreatorMonetizationProduct.A01.get(A1P3);
                    if (hasOnboardedCreatorMonetizationProduct == null) {
                        hasOnboardedCreatorMonetizationProduct = HasOnboardedCreatorMonetizationProduct.A05;
                    }
                } else if ("is_eligible_to_onboard".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("mes_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P2);
                } else if ("paid_partnership_label_config".equals(A0q)) {
                    c45144Jyk = Hr1.parseFromJson(c16l);
                } else if ("product_config".equals(A0q)) {
                    c9bh = AbstractC104344n0.parseFromJson(c16l);
                } else if ("product_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    userMonetizationProductType = AbstractC104314mu.A00(A1P);
                } else if ("revshare_config".equals(A0q)) {
                    c38688GzT = AbstractC40215Hse.parseFromJson(c16l);
                } else if ("show_in_settings".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (canUseCreatorMonetizationProduct == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("can_use_product", "ProductGatingDecision");
            } else if (hasOnboardedCreatorMonetizationProduct != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_eligible_to_onboard", "ProductGatingDecision");
                } else if (userMonetizationProductType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("product_type", "ProductGatingDecision");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("show_in_settings", "ProductGatingDecision");
                } else {
                    return new C104384n4(c9bh, c38688GzT, c104364n2, canUseCreatorMonetizationProduct, h3h, hasOnboardedCreatorMonetizationProduct, monetizationEligibilityDecision, c45144Jyk, userMonetizationProductType, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("has_onboarded", "ProductGatingDecision");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
