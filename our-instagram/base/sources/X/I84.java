package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I84 {
    public static C38899HAv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38899HAv c38899HAv = new C38899HAv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("destination_row_section".equals(A0s)) {
                    c38899HAv.A00 = AbstractC40837I7n.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c38899HAv, A0s);
                }
                c16l.A0z();
            }
            return c38899HAv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
