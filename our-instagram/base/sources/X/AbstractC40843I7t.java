package X;

import java.io.IOException;

/* renamed from: X.I7t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40843I7t {
    public static C38674GzF parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C38674GzF c38674GzF = new C38674GzF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1J(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c38674GzF.A01 = A1P;
                } else if ("author_id".equals(A0s)) {
                    c38674GzF.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c38674GzF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
