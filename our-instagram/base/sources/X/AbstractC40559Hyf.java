package X;

import java.io.IOException;

/* renamed from: X.Hyf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40559Hyf {
    public static C26159Bhk parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C26126BhC c26126BhC = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2875);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attribution_app_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("attribution_app_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    c26126BhC = AbstractC39820HlU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("attribution_app_id", c16l, "ClipsAttributionInfo");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (c26126BhC == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "ClipsAttributionInfo");
                } else {
                    return new C26159Bhk(c26126BhC, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("attribution_app_name", c16l, "ClipsAttributionInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
