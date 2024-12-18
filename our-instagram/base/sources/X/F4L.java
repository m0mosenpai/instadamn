package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4L {
    public static C51753Mtc parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C50679MYx c50679MYx = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(3835);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("context".equals(A0s)) {
                    c50679MYx = F4K.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "InstamadilloActionLog");
                throw C00O.createAndThrow();
            }
            return new C51753Mtc(c50679MYx, num.intValue(), 15);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
