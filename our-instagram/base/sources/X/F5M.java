package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5M {
    public static C31811fP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31811fP c31811fP = new C31811fP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    c31811fP.A00 = AbstractC83623o5.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c31811fP, A0q);
                }
                c16l.A0z();
            }
            return c31811fP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
