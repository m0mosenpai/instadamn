package X;

import java.io.IOException;

/* renamed from: X.F5i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34158F5i {
    public static C32651gp parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32651gp c32651gp = new C32651gp();
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
                    c32651gp.A00 = A1P;
                } else {
                    AbstractC43669JTd.A01(c16l, c32651gp, A0q);
                }
                c16l.A0z();
            }
            return c32651gp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}