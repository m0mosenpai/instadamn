package X;

import java.io.IOException;

/* renamed from: X.FVw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34820FVw {
    public static ECV parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ECV ecv = new ECV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("success".equals(A0s)) {
                    ecv.A01 = c16l.A0d();
                } else if ("error_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    ecv.A00 = A1P;
                } else {
                    C55702hA.A01(c16l, ecv, A0s);
                }
                c16l.A0z();
            }
            return ecv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
