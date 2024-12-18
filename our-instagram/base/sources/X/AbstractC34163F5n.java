package X;

import java.io.IOException;

/* renamed from: X.F5n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34163F5n {
    public static C32771h1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32771h1 c32771h1 = new C32771h1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    c32771h1.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("folder".equals(A0q)) {
                    c32771h1.A00 = c16l.A1D();
                } else if (AbstractC111324zv.A00(865).equals(A0q)) {
                    c32771h1.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32771h1, A0q);
                }
                c16l.A0z();
            }
            return c32771h1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
