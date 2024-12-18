package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6Y {
    public static C32531gd parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32531gd c32531gd = new C32531gd();
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
                    c32531gd.A00 = A1P;
                } else {
                    AbstractC43669JTd.A01(c16l, c32531gd, A0q);
                }
                c16l.A0z();
            }
            return c32531gd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
