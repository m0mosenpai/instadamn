package X;

import com.instagram.api.schemas.BudgetRecommendationType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hku, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39784Hku {
    public static H2T parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H34 h34 = null;
            ArrayList arrayList = null;
            H38 h38 = null;
            BudgetRecommendationType budgetRecommendationType = null;
            URH urh = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(93);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("daily_budget".equals(A0s)) {
                    h34 = AbstractC39898Hml.parseFromJson(c16l);
                } else if ("daily_budgets_for_durations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            UQp parseFromJson = AbstractC39897Hmk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("duration".equals(A0s)) {
                    h38 = AbstractC39905Hms.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    budgetRecommendationType = (BudgetRecommendationType) BudgetRecommendationType.A01.get(A1P);
                    if (budgetRecommendationType == null) {
                        budgetRecommendationType = BudgetRecommendationType.A0B;
                    }
                } else if ("similar_advertiser_budget_recommendation".equals(A0s)) {
                    urh = AbstractC40248HtE.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (budgetRecommendationType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "BudgetRecommendationImpl");
                throw C00O.createAndThrow();
            }
            return new H2T(budgetRecommendationType, h34, h38, urh, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
