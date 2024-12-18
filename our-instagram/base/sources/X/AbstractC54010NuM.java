package X;

import java.io.IOException;

/* renamed from: X.NuM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54010NuM {
    public static C54539O7r parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54539O7r c54539O7r = new C54539O7r();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("signal_rank".equals(A0s)) {
                    c54539O7r.A00 = c16l.A1D();
                } else if ("signal_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54539O7r.A01 = A1P;
                }
                c16l.A0z();
            }
            return c54539O7r;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
