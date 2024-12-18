package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FYL {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDS, X.1um, X.1ul] */
    public static EDS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("national_number".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("country_code".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if (AbstractC31186DnV.A01(9, 12, 42).equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("phone_number_source".equals(A0s)) {
                        c40791um.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("email".equals(A0s)) {
                        c40791um.A00 = AbstractC167017dG.A0m(c16l);
                    } else if ("email_source".equals(A0s)) {
                        c40791um.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("omnistring".equals(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("omnistring_source".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC31186DnV.A00().equals(A0s)) {
                        c40791um.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("username_source".equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                }
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
