package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LBB {
    public static K8G parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8G k8g = new K8G();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("pending_approval_requests".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8g.A01 = arrayList;
                } else if ("cursor".equals(A0s)) {
                    k8g.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, k8g, A0s);
                }
                c16l.A0z();
            }
            return k8g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
