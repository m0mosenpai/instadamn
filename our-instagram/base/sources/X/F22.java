package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F22 {
    public static FNP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FNP fnp = new FNP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item_count".equals(A0s)) {
                    fnp.A00 = c16l.A1D();
                } else if ("range_end_item_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    fnp.A02 = A0m;
                } else if ("range_end_otid".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    fnp.A03 = A0m2;
                } else if ("range_ephemeral_view_duration_sec".equals(A0s)) {
                    fnp.A01 = c16l.A1D();
                } else if ("range_start_item_id".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    fnp.A04 = A0m3;
                } else if ("range_start_otid".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    fnp.A05 = A0m4;
                }
                c16l.A0z();
            }
            return fnp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
