package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LBQ {
    public static K8L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8L k8l = new K8L();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_next_page".equals(A0s)) {
                    k8l.A00 = AbstractC166997dE.A0d(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("next_item_cursor".equals(A0s)) {
                        k8l.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("show_search".equals(A0s)) {
                        c16l.A0d();
                    } else if ("stickers".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C148286ly parseFromJson = AbstractC201088uq.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        k8l.A02 = arrayList;
                    } else {
                        C55702hA.A01(c16l, k8l, A0s);
                    }
                }
                c16l.A0z();
            }
            return k8l;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
