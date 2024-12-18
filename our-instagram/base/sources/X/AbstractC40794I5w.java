package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I5w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40794I5w {
    public static IK0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IK0 ik0 = new IK0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("sections".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C130455uq parseFromJson = AbstractC130445up.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ik0.A05 = arrayList;
                } else if (AbstractC37300Gc1.A1S(A0s)) {
                    ik0.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("has_more".equals(A0s)) {
                    ik0.A06 = c16l.A0d();
                } else if (AbstractC111324zv.A00(45).equals(A0s)) {
                    c16l.A0d();
                } else if ("rank_token".equals(A0s)) {
                    ik0.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("grid_post_click_experience".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("reels_max_id".equals(A0s)) {
                    ik0.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("reels_page_index".equals(A0s)) {
                    ik0.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("has_more_reels".equals(A0s)) {
                    ik0.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return ik0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
