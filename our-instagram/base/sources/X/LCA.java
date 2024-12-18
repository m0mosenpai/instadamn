package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LCA {
    public static K8M parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8M k8m = new K8M();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("poll_question_id".equals(A0s)) {
                    k8m.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("poll_question_text".equals(A0s)) {
                    k8m.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("accessibility_label".equals(A0s)) {
                    k8m.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("has_viewer_voted".equals(A0s)) {
                    c16l.A0d();
                } else if ("options".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            L4Y parseFromJson = AbstractC46841Kna.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8m.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, k8m, A0s);
                }
                c16l.A0z();
            }
            return k8m;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
