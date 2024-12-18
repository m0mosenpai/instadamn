package X;

import java.io.IOException;

/* renamed from: X.I0u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40662I0u {
    public static ICC parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ICC icc = new ICC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!AbstractC37300Gc1.A1H(A0s) && !AbstractC37300Gc1.A1G(A0s)) {
                    if ("uri".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        icc.A00 = A1P;
                    }
                } else {
                    c16l.A1D();
                }
                c16l.A0z();
            }
            return icc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
