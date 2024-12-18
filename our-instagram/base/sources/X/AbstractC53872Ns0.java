package X;

import java.io.IOException;

/* renamed from: X.Ns0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53872Ns0 {
    public static C51587Mqf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51587Mqf c51587Mqf = new C51587Mqf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("iso3_language_code".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c51587Mqf.A01 = A0m;
                } else if ("display_name".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c51587Mqf.A00 = A0m2;
                }
                c16l.A0z();
            }
            return c51587Mqf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
