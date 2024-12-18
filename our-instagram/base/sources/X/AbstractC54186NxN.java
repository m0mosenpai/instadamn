package X;

import java.io.IOException;

/* renamed from: X.NxN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54186NxN {
    public static C152526tf parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C152526tf c152526tf = new C152526tf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("query".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c152526tf.A00 = A1P;
                } else {
                    AbstractC37930GmS.A01(c16l, c152526tf, A0s);
                }
                c16l.A0z();
            }
            return c152526tf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
