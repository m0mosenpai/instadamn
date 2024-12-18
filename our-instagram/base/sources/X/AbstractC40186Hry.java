package X;

import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import java.io.IOException;

/* renamed from: X.Hry, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40186Hry {
    public static ProductTilePriceLabelOptionsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("show_checkout_signaling".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("show_commission_rate".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else {
                    bool3 = AbstractC37303Gc4.A0K(c16l, bool3, A0s, "show_soldout");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("show_checkout_signaling", c16l, "ProductTilePriceLabelOptionsImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_soldout", c16l, "ProductTilePriceLabelOptionsImpl");
                } else {
                    return new ProductTilePriceLabelOptionsImpl(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("show_commission_rate", c16l, "ProductTilePriceLabelOptionsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
