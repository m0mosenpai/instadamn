package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.Hse, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40215Hse {
    public static C38688GzT parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting2 = null;
            IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("igtv_monetization_account_level_toggle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting = AbstractC37304Gc5.A0A(A1P4);
                } else if ("mes_status_for_product".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    monetizationEligibilityDecision = AbstractC104324mv.A00(A1P3);
                } else if ("profile_ads_toggle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting2 = AbstractC37304Gc5.A0A(A1P2);
                } else if ("reels_overlay_ads_toggle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGTVAccountLevelMonetizationToggleSetting3 = AbstractC37304Gc5.A0A(A1P);
                }
                c16l.A0z();
            }
            return new C38688GzT(4, iGTVAccountLevelMonetizationToggleSetting, iGTVAccountLevelMonetizationToggleSetting2, iGTVAccountLevelMonetizationToggleSetting3, monetizationEligibilityDecision);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
