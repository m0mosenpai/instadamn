package X;

import java.io.IOException;

/* renamed from: X.F6c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34178F6c {
    public static C34151jF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34151jF c34151jF = new C34151jF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34151jF.A01 = A0m;
                } else if ("message_id".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34151jF.A00 = A0m2;
                } else {
                    AbstractC43669JTd.A01(c16l, c34151jF, A0q);
                }
                c16l.A0z();
            }
            return c34151jF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
