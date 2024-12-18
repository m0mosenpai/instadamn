package X;

import java.io.IOException;

/* renamed from: X.I7l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40835I7l {
    public static C38685GzQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38685GzQ c38685GzQ = new C38685GzQ(4);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_item".equals(A0s)) {
                    c38685GzQ.A02 = AbstractC40741I3v.parseFromJson(c16l);
                } else if ("media_item".equals(A0s)) {
                    c38685GzQ.A00 = C38321qM.A00(c16l);
                } else if ("storefront_item".equals(A0s)) {
                    c38685GzQ.A01 = AbstractC31171DnF.A0S(c16l, false);
                }
                c16l.A0z();
            }
            return c38685GzQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
