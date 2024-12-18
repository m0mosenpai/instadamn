package X;

import java.io.IOException;

/* renamed from: X.F5s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34168F5s {
    public static C34451jj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34451jj c34451jj = new C34451jj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boost_access_token_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c34451jj.A00 = A1P;
                } else {
                    AbstractC47856LCb.A01(c16l, c34451jj, A0s);
                }
                c16l.A0z();
            }
            return c34451jj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
