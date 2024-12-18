package X;

import java.io.IOException;

/* renamed from: X.HzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40590HzA {
    public static C1l5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1l5 c1l5 = new C1l5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1J(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c1l5.A00 = A0m;
                } else if ("reply_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c1l5.A01 = A0m2;
                } else {
                    AbstractC47856LCb.A01(c16l, c1l5, A0s);
                }
                c16l.A0z();
            }
            return c1l5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
