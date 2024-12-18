package X;

import java.io.IOException;

/* renamed from: X.Kng, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46847Kng {
    public static C32071E6x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sender_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "activity_status");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sender_id", c16l, "DirectThreadActivityStatus");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("activity_status", c16l, "DirectThreadActivityStatus");
            } else {
                return new C32071E6x(str, num.intValue(), 13);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
