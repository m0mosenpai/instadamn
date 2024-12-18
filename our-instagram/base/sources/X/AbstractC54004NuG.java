package X;

import java.io.IOException;

/* renamed from: X.NuG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54004NuG {
    public static C54533O7l parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54533O7l c54533O7l = new C54533O7l();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("signal_rank".equals(A0s)) {
                    c54533O7l.A00 = c16l.A1D();
                } else if ("signal_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54533O7l.A01 = A1P;
                }
                c16l.A0z();
            }
            return c54533O7l;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
