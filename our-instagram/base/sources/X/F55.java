package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F55 {
    public static C34510FIw parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34510FIw c34510FIw = new C34510FIw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("context_line".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c34510FIw.A01 = A1P;
                } else if ("item_info".equals(A0s)) {
                    c34510FIw.A00 = F5C.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c34510FIw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
