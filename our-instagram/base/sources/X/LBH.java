package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class LBH {
    public static K8H parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            K8H k8h = new K8H();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_valid".equals(A0s)) {
                    k8h.A01 = c16l.A0d();
                } else if (AbstractC111324zv.A00(2587).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    k8h.A00 = A1P;
                } else {
                    C55702hA.A01(c16l, k8h, A0s);
                }
                c16l.A0z();
            }
            return k8h;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
