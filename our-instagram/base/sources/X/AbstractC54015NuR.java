package X;

import java.io.IOException;

/* renamed from: X.NuR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54015NuR {
    public static C54643OBu parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54643OBu c54643OBu = new C54643OBu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_checked_by_default".equals(A0s)) {
                    c54643OBu.A02 = c16l.A0d();
                } else if ("is_required".equals(A0s)) {
                    c54643OBu.A03 = c16l.A0d();
                } else if ("token_key".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54643OBu.A01 = A1P;
                } else if ("checkbox_body".equals(A0s)) {
                    c54643OBu.A00 = AbstractC54014NuQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c54643OBu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
