package X;

import java.io.IOException;

/* renamed from: X.Huh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40337Huh {
    public static H6B parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "start");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("end", c16l, "StoryTextAttributionBoldRange");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("start", c16l, "StoryTextAttributionBoldRange");
            } else {
                return new H6B(num.intValue(), num2.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
