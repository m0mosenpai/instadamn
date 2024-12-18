package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5O {
    public static C29161at parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C29161at c29161at = new C29161at();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c29161at.A00 = A1P;
                } else if ("is_adding".equals(A0q)) {
                    c29161at.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c29161at, A0q);
                }
                c16l.A0z();
            }
            return c29161at;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
