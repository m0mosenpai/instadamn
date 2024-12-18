package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HtE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40248HtE {
    public static URH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("conversion".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("conversion_duration_pairs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            UQr parseFromJson = AbstractC39904Hmr.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("daily_budget".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "duration");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("conversion", c16l, "SimilarAdvertiserBudgetRecommendationImpl");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("duration", c16l, "SimilarAdvertiserBudgetRecommendationImpl");
                } else {
                    return new URH(arrayList, num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("daily_budget", c16l, "SimilarAdvertiserBudgetRecommendationImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
