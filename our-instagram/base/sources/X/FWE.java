package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FWE {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EAz, X.EgM, X.1um] */
    public static EgM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC31189DnY.A03(39, 17, 24).equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("autoconfirmation_sources".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("gdpr_required".equals(A0s)) {
                    c40791um.A05 = c16l.A0d();
                } else if ("gdpr_s".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("tos_version".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("age_required".equals(A0s)) {
                    c40791um.A04 = c16l.A0d();
                } else {
                    F9X.A00(c16l, c40791um, A0s);
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
