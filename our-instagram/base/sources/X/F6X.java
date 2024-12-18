package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6X {
    public static C32931hH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32931hH c32931hH = new C32931hH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    c32931hH.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("theme_id".equals(A0q)) {
                    c32931hH.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("theme_info".equals(A0q)) {
                    c32931hH.A00 = AbstractC81503kK.A00(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32931hH, A0q);
                }
                c16l.A0z();
            }
            return c32931hH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
