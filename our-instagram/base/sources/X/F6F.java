package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6F {
    public static C34271jR parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34271jR c34271jR = new C34271jR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MSV.A00(1401).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c34271jR.A00 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c34271jR, A0s);
                }
                c16l.A0z();
            }
            return c34271jR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
