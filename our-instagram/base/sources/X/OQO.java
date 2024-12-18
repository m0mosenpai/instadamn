package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OQO {
    public static C52098N2y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C52098N2y c52098N2y = new C52098N2y();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("users_removed".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c52098N2y.A00 = arrayList;
                } else if ("users_with_commenting_removed".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c52098N2y.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c52098N2y, A0s);
                }
                c16l.A0z();
            }
            return c52098N2y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
