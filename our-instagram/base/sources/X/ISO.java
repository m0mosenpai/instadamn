package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class ISO {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HAl, X.1um, X.1ul] */
    public static C38889HAl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("error".equals(A0s)) {
                    c40791um.A01 = I6T.parseFromJson(c16l);
                } else if ("response_content".equals(A0s)) {
                    c40791um.A02 = FBX.parseFromJson(c16l);
                } else if ("permission_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A03 = A1P;
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c40791um.A00 = C38321qM.A00(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
