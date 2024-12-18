package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FXA {
    public static EC1 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            EC1 ec1 = new EC1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile_to_share_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    ec1.A00 = A1P;
                } else {
                    C55702hA.A01(c16l, ec1, A0s);
                }
                c16l.A0z();
            }
            return ec1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
