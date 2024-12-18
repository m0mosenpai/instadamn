package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I7E {
    public static C38618GyL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bottom_padding".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("has_bottom_separator".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("has_top_separator".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "top_padding");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("bottom_padding", c16l, "Spacing");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("has_top_separator", c16l, "Spacing");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("top_padding", c16l, "Spacing");
                } else {
                    return new C38618GyL(num.intValue(), num2.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_bottom_separator", c16l, "Spacing");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
