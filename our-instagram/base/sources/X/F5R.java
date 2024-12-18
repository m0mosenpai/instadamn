package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5R {
    public static C32591gj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32591gj c32591gj = new C32591gj();
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
                    c32591gj.A00 = A1P;
                } else {
                    AbstractC43669JTd.A01(c16l, c32591gj, A0q);
                }
                c16l.A0z();
            }
            return c32591gj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
