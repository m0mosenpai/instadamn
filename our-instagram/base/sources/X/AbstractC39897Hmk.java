package X;

import java.io.IOException;

/* renamed from: X.Hmk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39897Hmk {
    public static UQp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("daily_budget".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("duration".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("guidance".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("daily_budget", c16l, "DailyBudgetDurationPairImpl");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("duration", c16l, "DailyBudgetDurationPairImpl");
            } else {
                return new UQp(num.intValue(), num2.intValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
