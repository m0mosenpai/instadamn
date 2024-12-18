package X;

import java.io.IOException;

/* renamed from: X.HrM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40153HrM {
    public static H4Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("post_friction_reason".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "should_show_post_friction");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("post_friction_reason", c16l, "PostFrictionInfoImpl");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("should_show_post_friction", c16l, "PostFrictionInfoImpl");
            } else {
                return new H4Z(str, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
