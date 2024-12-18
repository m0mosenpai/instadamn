package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IP7 {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9O, X.1um, X.1ul] */
    public static H9O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("amount_raised".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("charity".equals(A0s)) {
                    c40791um.A02 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("donations".equals(A0s)) {
                    c40791um.A01 = I5G.parseFromJson(c16l);
                } else if ("fundraiser_id".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A03;
            c40791um.A00 = new C38765H5f(c40791um.A01, c40791um.A02, str, c40791um.A04);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
