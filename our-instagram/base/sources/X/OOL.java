package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OOL {
    public static N33 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            N33 n33 = new N33();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("comments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38891rO parseFromJson = AbstractC38841rG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    n33.A01 = arrayList;
                } else if ("comment_count".equals(A0s)) {
                    c16l.A1D();
                } else if ("has_more_headload_comments".equals(A0s)) {
                    n33.A02 = c16l.A0d();
                } else if ("next_min_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    n33.A00 = A0m;
                } else {
                    C55702hA.A01(c16l, n33, A0s);
                }
                c16l.A0z();
            }
            return n33;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
