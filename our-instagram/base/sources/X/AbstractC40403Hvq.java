package X;

import java.io.IOException;

/* renamed from: X.Hvq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40403Hvq {
    public static C38795H6k parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38794H6j c38794H6j = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("entity".equals(A0s)) {
                    c38794H6j = AbstractC40404Hvr.parseFromJson(c16l);
                } else if ("length".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "offset");
                }
                c16l.A0z();
            }
            if (c38794H6j == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("entity", c16l, "TextEntityRange");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("offset", c16l, "TextEntityRange");
            } else {
                return new C38795H6k(c38794H6j, num2, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
