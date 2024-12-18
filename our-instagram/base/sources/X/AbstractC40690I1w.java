package X;

import java.io.IOException;

/* renamed from: X.I1w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40690I1w {
    public static C38595Gxy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "internal_message")) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("internal_message", c16l, "LeadGenError");
                throw C00O.createAndThrow();
            }
            return new C38595Gxy(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
