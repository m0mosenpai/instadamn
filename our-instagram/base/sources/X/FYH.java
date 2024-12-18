package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FYH {
    public static ED4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ED4 ed4 = new ED4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("mes_status".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    ed4.A00 = A0m;
                } else if ("is_temporarily_demonetized".equals(A0s)) {
                    ed4.A03 = c16l.A0d();
                } else if (AbstractC111324zv.A00(2401).equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    ed4.A01 = A0m2;
                } else if ("has_onboarded_milestone_incentives".equals(A0s)) {
                    ed4.A02 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, ed4, A0s);
                }
                c16l.A0z();
            }
            return ed4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
