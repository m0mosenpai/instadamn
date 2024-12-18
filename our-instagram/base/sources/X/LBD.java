package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LBD {
    public static K8A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8A k8a = new K8A();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sections".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C47758L7e parseFromJson = AbstractC46659Kkc.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8a.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, k8a, A0s);
                }
                c16l.A0z();
            }
            return k8a;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
