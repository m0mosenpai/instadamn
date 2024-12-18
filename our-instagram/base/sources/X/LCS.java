package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class LCS {
    public static K8F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8F k8f = new K8F();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_succeeded".equals(A0s)) {
                    k8f.A00 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, k8f, A0s);
                }
                c16l.A0z();
            }
            return k8f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
