package X;

import java.io.IOException;

/* renamed from: X.NqU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53778NqU {
    public static C124545kG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("new_followers".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("non_close_friends".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else {
                    bool3 = AbstractC37303Gc4.A0K(c16l, bool3, A0s, "non_followers");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("new_followers", c16l, "LimitedInteractionsCategoriesConfigImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("non_followers", c16l, "LimitedInteractionsCategoriesConfigImpl");
                } else {
                    return new C124545kG(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("non_close_friends", c16l, "LimitedInteractionsCategoriesConfigImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
