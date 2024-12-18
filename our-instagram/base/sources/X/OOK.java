package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OOK {
    public static N3G parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            N3G n3g = new N3G();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("parent_comment".equals(A0s)) {
                    n3g.A02 = AbstractC38841rG.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("child_comments".equals(A0s)) {
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
                        n3g.A05 = arrayList;
                    } else if ("next_min_child_cursor".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        n3g.A04 = A0m;
                    } else if ("next_max_child_cursor".equals(A0s)) {
                        String A0m2 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m2, 0);
                        n3g.A03 = A0m2;
                    } else if ("has_more_tail_child_comments".equals(A0s)) {
                        n3g.A07 = c16l.A0d();
                    } else if ("has_more_head_child_comments".equals(A0s)) {
                        n3g.A06 = c16l.A0d();
                    } else if ("is_ranked_replies".equals(A0s)) {
                        c16l.A0d();
                    } else if ("num_head_child_comments".equals(A0s)) {
                        n3g.A00 = c16l.A1D();
                    } else if ("num_tail_child_comments".equals(A0s)) {
                        n3g.A01 = c16l.A1D();
                    } else {
                        C55702hA.A01(c16l, n3g, A0s);
                    }
                }
                c16l.A0z();
            }
            return n3g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
