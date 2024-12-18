package X;

import java.io.IOException;

/* renamed from: X.Hqp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40122Hqp {
    public static H4P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H3X h3x = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H4D h4d = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("highlighted_creation_tool".equals(A0s)) {
                    h3x = AbstractC39963Hns.parseFromJson(c16l);
                } else if ("media_selection_destination".equals(A0s)) {
                    h4d = AbstractC40070Hpw.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (h3x == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("highlighted_creation_tool", c16l, "OpenCreationToolCommandImpl");
            } else if (h4d == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_selection_destination", c16l, "OpenCreationToolCommandImpl");
            } else {
                return new H4P(h3x, h4d);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
