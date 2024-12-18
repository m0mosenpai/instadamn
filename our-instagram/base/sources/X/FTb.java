package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FTb {
    public static C32204ECz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32204ECz c32204ECz = new C32204ECz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("members".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32204ECz.A02 = arrayList;
                } else if ("suggested_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32204ECz.A03 = arrayList;
                } else if ("suggested_users_max_id".equals(A0s)) {
                    c32204ECz.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("fb_close_friends_count".equals(A0s)) {
                    c32204ECz.A00 = c16l.A1D();
                } else {
                    C55702hA.A01(c16l, c32204ECz, A0s);
                }
                c16l.A0z();
            }
            return c32204ECz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
