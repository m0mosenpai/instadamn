package X;

import java.io.IOException;

/* renamed from: X.I7y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40848I7y {
    public static C45116Jxl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45116Jxl c45116Jxl = new C45116Jxl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_id".equals(A0s)) {
                    c45116Jxl.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1J(A0s)) {
                    c45116Jxl.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("pagination_token".equals(A0s)) {
                    c45116Jxl.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c45116Jxl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
