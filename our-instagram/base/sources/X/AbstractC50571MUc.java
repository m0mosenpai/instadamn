package X;

import java.io.IOException;

/* renamed from: X.MUc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50571MUc {
    public static C51593Mql parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("takedown_timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("takedown_state".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("takedown_timestamp", c16l, "TakedownThreadMetadata");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("takedown_state", c16l, "TakedownThreadMetadata");
            } else {
                return new C51593Mql(num.intValue(), l.longValue(), 2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
