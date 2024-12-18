package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OQQ {
    public static C52090N2q parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C52090N2q c52090N2q = new C52090N2q();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("badge_setting".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c52090N2q.A00 = AbstractC109824x9.A00(A1P);
                } else {
                    C55702hA.A01(c16l, c52090N2q, A0s);
                }
                c16l.A0z();
            }
            return c52090N2q;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
