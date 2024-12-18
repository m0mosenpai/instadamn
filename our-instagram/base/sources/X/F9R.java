package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F9R {
    public static C34561FKv parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34561FKv c34561FKv = new C34561FKv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("one_tap_nonce".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c34561FKv.A01 = A1P;
                } else if (AbstractC31171DnF.A1Z(A0s)) {
                    c34561FKv.A00 = AbstractC31171DnF.A0S(c16l, false);
                } else if (AbstractC111324zv.A00(2623).equals(A0s)) {
                    c34561FKv.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c34561FKv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
