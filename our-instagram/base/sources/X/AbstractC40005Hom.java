package X;

import java.io.IOException;

/* renamed from: X.Hom, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40005Hom {
    public static C38726H3o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38727H3p c38727H3p = null;
            Boolean bool = null;
            String str = null;
            H3q h3q = null;
            C38728H3r c38728H3r = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("coordinates".equals(A0s)) {
                    c38727H3p = AbstractC40004Hol.parseFromJson(c16l);
                } else if ("invalidate_truncated_text".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text_styling".equals(A0s)) {
                    h3q = AbstractC40007Hoo.parseFromJson(c16l);
                } else if ("time_stamp".equals(A0s)) {
                    c38728H3r = AbstractC40009Hoq.parseFromJson(c16l);
                } else if ("truncation_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38726H3o(c38727H3p, h3q, c38728H3r, bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
