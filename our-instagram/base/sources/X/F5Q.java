package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5Q {
    public static C32411gR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32411gR c32411gR = new C32411gR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c32411gR.A01 = A0m;
                } else if ("new_title".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c32411gR.A00 = A0m2;
                } else {
                    AbstractC43669JTd.A01(c16l, c32411gR, A0q);
                }
                c16l.A0z();
            }
            return c32411gR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}