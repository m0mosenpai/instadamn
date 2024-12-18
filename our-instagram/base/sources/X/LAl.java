package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class LAl {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.K7r, X.1ul] */
    public static K7r parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item".equals(A0s)) {
                    c40791um.A00 = AbstractC111024zE.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C45006Jvw(c40791um.A00);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
