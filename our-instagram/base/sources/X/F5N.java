package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5N {
    public static C34681k9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34681k9 c34681k9 = new C34681k9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34681k9.A02 = A0m;
                } else if ("item_id".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34681k9.A00 = A0m2;
                } else if (AbstractC43591JPw.A00(442).equals(A0q)) {
                    c34681k9.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4766).equals(A0q)) {
                    c34681k9.A03 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34681k9, A0q);
                }
                c16l.A0z();
            }
            return c34681k9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
