package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LCO {
    public static K8J parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8J k8j = new K8J();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("thread_details".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C47405Kwu parseFromJson = AbstractC46913Kou.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8j.A01 = arrayList;
                } else if ("missing_ig_thread_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    k8j.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, k8j, A0s);
                }
                c16l.A0z();
            }
            return k8j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
