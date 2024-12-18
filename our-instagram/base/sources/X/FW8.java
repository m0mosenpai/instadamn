package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FW8 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDG, X.1um, X.1ul] */
    public static EDG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("valid".equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else if ("available".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if ("server_corrected_email".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("valid_nonce".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("gdpr_required".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("gdpr_s".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("tos_version".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("suggested_email".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("age_required".equals(A0s)) {
                    c40791um.A04 = c16l.A0d();
                } else if ("allow_shared_email_registration".equals(A0s)) {
                    c40791um.A05 = c16l.A0d();
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
