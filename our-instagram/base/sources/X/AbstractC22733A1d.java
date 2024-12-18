package X;

import java.io.IOException;

/* renamed from: X.A1d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22733A1d {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C4OV c4ov = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("userId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("qpResponse".equals(A0s)) {
                    c4ov = C4OY.parseFromJson(c16l);
                } else if ("bloksVersionId".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("userId", c16l, "IGOnDemandFetcherData");
            } else if (c4ov != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("bloksVersionId", c16l, "IGOnDemandFetcherData");
                } else {
                    return new MUD(c4ov, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("qpResponse", c16l, "IGOnDemandFetcherData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
