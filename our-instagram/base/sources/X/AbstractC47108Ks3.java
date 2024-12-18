package X;

import java.io.IOException;

/* renamed from: X.Ks3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47108Ks3 {
    public static C47462Kxr parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C47462Kxr c47462Kxr = new C47462Kxr();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("msg".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c47462Kxr.A00 = A1P;
                }
                c16l.A0z();
            }
            return c47462Kxr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
