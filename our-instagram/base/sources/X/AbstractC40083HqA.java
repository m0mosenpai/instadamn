package X;

import java.io.IOException;

/* renamed from: X.HqA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40083HqA {
    public static C26134BhL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C26135BhM c26135BhM = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("label_str".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("target".equals(A0s)) {
                    c26135BhM = AbstractC33717Ev5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("label_str", c16l, "MidCardCtaInfo");
            } else if (c26135BhM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("target", c16l, "MidCardCtaInfo");
            } else {
                return new C26134BhL(c26135BhM, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
