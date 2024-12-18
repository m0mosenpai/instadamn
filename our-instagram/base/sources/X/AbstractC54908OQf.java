package X;

import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.IOException;

/* renamed from: X.OQf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54908OQf {
    public static ExistingStandaloneFundraiserForFeedModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fundraiser_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("beneficiary_short_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("full_formatted_goal_amount_str".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("fundraiser_id", c16l, "ExistingStandaloneFundraiserForFeedModel");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("formatted_goal_amount", c16l, "ExistingStandaloneFundraiserForFeedModel");
                } else {
                    return new ExistingStandaloneFundraiserForFeedModel(str, str2, str3, str4);
                }
            } else {
                AbstractC166997dE.A1V("beneficiary_short_name", c16l, "ExistingStandaloneFundraiserForFeedModel");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("fundraiser_id", existingStandaloneFundraiserForFeedModel.A03);
        anonymousClass182.A0S("beneficiary_short_name", existingStandaloneFundraiserForFeedModel.A00);
        anonymousClass182.A0S("formatted_goal_amount", existingStandaloneFundraiserForFeedModel.A01);
        String str = existingStandaloneFundraiserForFeedModel.A02;
        if (str != null) {
            anonymousClass182.A0S("full_formatted_goal_amount_str", str);
        }
        anonymousClass182.A0a();
    }
}
