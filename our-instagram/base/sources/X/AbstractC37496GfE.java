package X;

import java.io.IOException;

/* renamed from: X.GfE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37496GfE {
    public static BIC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("pending_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("pending_count", c16l, "BrandedContentInfo");
                throw C00O.createAndThrow();
            }
            return new BIC(num.intValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
