package X;

import java.io.IOException;

/* renamed from: X.F5d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34153F5d {
    public static C35691lp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35691lp c35691lp = new C35691lp();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("folder_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35691lp.A00 = A0m;
                } else if ("folder_name".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35691lp.A01 = A0m2;
                } else {
                    AbstractC43669JTd.A01(c16l, c35691lp, A0s);
                }
                c16l.A0z();
            }
            return c35691lp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
