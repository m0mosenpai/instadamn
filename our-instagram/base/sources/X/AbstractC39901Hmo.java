package X;

import java.io.IOException;

/* renamed from: X.Hmo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39901Hmo {
    public static C45139Jyf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            H37 h37 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("client_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creator_insights".equals(A0s)) {
                    h37 = AbstractC39900Hmn.parseFromJson(c16l);
                } else if ("item_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("client_context", c16l, "DirectNonCriticalMessageResponseImpl");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("item_id", c16l, "DirectNonCriticalMessageResponseImpl");
            } else {
                return new C45139Jyf(h37, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
