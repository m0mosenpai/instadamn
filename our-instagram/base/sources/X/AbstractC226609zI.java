package X;

import java.io.IOException;

/* renamed from: X.9zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226609zI {
    public static C211859aC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C211859aC c211859aC = new C211859aC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("index".equals(A0s)) {
                    c211859aC.A00 = c16l.A1D();
                } else if ("hint_word".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c211859aC.A01 = A0m;
                } else if ("word".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c211859aC.A02 = A0m2;
                } else if ("is_editable".equals(A0s)) {
                    c211859aC.A03 = c16l.A0d();
                } else if ("is_visible".equals(A0s)) {
                    c211859aC.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c211859aC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
