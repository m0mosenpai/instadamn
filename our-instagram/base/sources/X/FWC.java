package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FWC {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ED2, X.1um, X.1ul] */
    public static ED2 parseFromJson(C16L c16l) {
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
                if ("tos_version".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A00 = A1P;
                } else if ("gdpr_required".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else if ("age_required".equals(A0s)) {
                    c40791um.A01 = c16l.A0d();
                } else if ("tos_acceptance_not_required".equals(A0s)) {
                    c40791um.A03 = c16l.A0d();
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
