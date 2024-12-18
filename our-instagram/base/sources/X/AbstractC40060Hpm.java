package X;

import java.io.IOException;

/* renamed from: X.Hpm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40060Hpm {
    public static H49 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("num_earned_achievements".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("show_achievements".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else {
                    bool2 = AbstractC37303Gc4.A0K(c16l, bool2, A0s, "show_challenges_toast");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("show_achievements", c16l, "MediaAchievementsInfo");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("show_challenges_toast", c16l, "MediaAchievementsInfo");
            } else {
                return new H49(num, bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
