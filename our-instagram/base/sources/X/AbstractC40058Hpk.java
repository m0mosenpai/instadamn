package X;

import java.io.IOException;

/* renamed from: X.Hpk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40058Hpk {
    public static C45127Jxw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C50627MWo c50627MWo = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attributes".equals(A0s)) {
                    c50627MWo = AbstractC40056Hpi.parseFromJson(c16l);
                } else if ("display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c50627MWo == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("attributes", c16l, "MapRefinement");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_text", c16l, "MapRefinement");
            } else {
                return new C45127Jxw(c50627MWo, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
