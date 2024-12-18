package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LCR {
    public static K8E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8E k8e = new K8E();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("badge_counts".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Integer A0h = AbstractC166997dE.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8e.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, k8e, A0s);
                }
                c16l.A0z();
            }
            return k8e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
