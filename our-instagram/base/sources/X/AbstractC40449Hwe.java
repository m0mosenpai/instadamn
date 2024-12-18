package X;

import java.io.IOException;

/* renamed from: X.Hwe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40449Hwe {
    public static H72 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("created_at".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("created_at", c16l, "ViewerReaction");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("emoji", c16l, "ViewerReaction");
            } else {
                return new H72(l.longValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
