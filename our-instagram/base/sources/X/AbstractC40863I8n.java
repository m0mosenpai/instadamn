package X;

import java.io.IOException;

/* renamed from: X.I8n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40863I8n {
    public static C31200Dnj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31200Dnj c31200Dnj = new C31200Dnj(31);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37300Gc1.A1D(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c31200Dnj.A00 = A1P;
                }
                c16l.A0z();
            }
            return c31200Dnj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
