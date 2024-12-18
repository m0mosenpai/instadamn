package X;

import java.io.IOException;

/* renamed from: X.I7v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40845I7v {
    public static C38671GzC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38671GzC c38671GzC = new C38671GzC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1J(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c38671GzC.A02 = A0m;
                } else if ("author_id".equals(A0s)) {
                    c38671GzC.A00 = c16l.A0y();
                } else if ("pinned_content_token".equals(A0s)) {
                    c38671GzC.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    c38671GzC.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("pinned_content".equals(A0s)) {
                    c38671GzC.A01 = I83.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c38671GzC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
