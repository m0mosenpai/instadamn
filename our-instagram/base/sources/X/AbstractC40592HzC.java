package X;

import java.io.IOException;

/* renamed from: X.HzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40592HzC {
    public static C29061aj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C29061aj c29061aj = new C29061aj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cta_link".equals(A0s)) {
                    c29061aj.A00 = AbstractC40583Hz3.parseFromJson(c16l);
                } else if ("invite_source".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c29061aj.A01 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c29061aj, A0s);
                }
                c16l.A0z();
            }
            return c29061aj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
