package X;

import java.io.IOException;

/* renamed from: X.F5u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34170F5u {
    public static C35301lC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35301lC c35301lC = new C35301lC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(36).equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35301lC.A00 = A0m;
                } else if ("reshare_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35301lC.A01 = A0m2;
                } else {
                    AbstractC47856LCb.A01(c16l, c35301lC, A0s);
                }
                c16l.A0z();
            }
            return c35301lC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
