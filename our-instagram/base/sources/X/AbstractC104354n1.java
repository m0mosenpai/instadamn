package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.4n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104354n1 {
    public static C104364n2 parseFromJson(C16L c16l) {
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
            Boolean bool4 = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("has_selected_creator_interests".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("has_user_onboarded_for_payouts".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_new_brand_available_in_wishlist".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_partnership_messaging_eligible".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("mes_status_for_product".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P);
                }
                c16l.A0z();
            }
            return new C104364n2(monetizationEligibilityDecision, bool, bool2, bool3, bool4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
