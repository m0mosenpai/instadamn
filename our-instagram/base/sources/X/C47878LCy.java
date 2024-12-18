package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LCy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47878LCy {
    public static K8Q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8Q k8q = new K8Q();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("data".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AA7 parseFromJson = A14.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8q.A01 = arrayList;
                } else if ("meta".equals(A0s)) {
                    k8q.A00 = AbstractC47108Ks3.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, k8q, A0s);
                }
                c16l.A0z();
            }
            return k8q;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
