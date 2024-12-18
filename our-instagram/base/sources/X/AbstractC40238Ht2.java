package X;

import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import java.io.IOException;

/* renamed from: X.Ht2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40238Ht2 {
    public static ShoppingBrandWithProductsSubtitle parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("should_show_checkout_signaling".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("should_show_checkout_signaling", c16l, "ShoppingBrandWithProductsSubtitle");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "ShoppingBrandWithProductsSubtitle");
            } else {
                return new ShoppingBrandWithProductsSubtitle(bool.booleanValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
