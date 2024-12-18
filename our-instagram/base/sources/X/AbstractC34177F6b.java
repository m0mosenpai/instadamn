package X;

import java.io.IOException;

/* renamed from: X.F6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34177F6b {
    public static C35651ll parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35651ll c35651ll = new C35651ll();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35651ll.A03 = A0m;
                } else if ("client_context".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35651ll.A00 = A0m2;
                } else if ("creator_id".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c35651ll.A01 = A0m3;
                } else if ("prompt_id".equals(A0q)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c35651ll.A02 = A0m4;
                } else {
                    AbstractC43669JTd.A01(c16l, c35651ll, A0q);
                }
                c16l.A0z();
            }
            return c35651ll;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
