package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5Z {
    public static C34111jB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34111jB c34111jB = new C34111jB();
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
                    c34111jB.A00 = A1P;
                } else if ("is_nudge_seen_dismissed".equals(A0q)) {
                    c34111jB.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34111jB, A0q);
                }
                c16l.A0z();
            }
            return c34111jB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
