package X;

import java.io.IOException;

/* renamed from: X.I7d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40827I7d {
    public static C38685GzQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40833I7j c40833I7j = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C40839I7p c40839I7p = null;
            C51757Mtg c51757Mtg = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("link_out".equals(A0s)) {
                    c40833I7j = AbstractC40834I7k.parseFromJson(c16l);
                } else if ("shopping_cart".equals(A0s)) {
                    c40839I7p = AbstractC40840I7q.parseFromJson(c16l);
                } else if ("view_in_cart".equals(A0s)) {
                    c51757Mtg = AbstractC40829I7f.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38685GzQ(2, c51757Mtg, c40833I7j, c40839I7p);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
