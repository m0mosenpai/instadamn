package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34780FUf {
    public static C32191ECm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32191ECm c32191ECm = new C32191ECm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("mutual_follows".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32191ECm.A02 = arrayList;
                } else if ("follows".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32191ECm.A01 = arrayList;
                } else if ("creators".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32191ECm.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32191ECm, A0s);
                }
                c16l.A0z();
            }
            return c32191ECm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
