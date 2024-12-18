package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FSL {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.EAZ, X.1um, X.1ul] */
    public static EAZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("totp_seed".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37310GcC.A01(10, 12, 109).equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A01;
            C14360o3.A0A(str);
            c40791um.A00 = new E64(str, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
