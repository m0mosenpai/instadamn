package X;

import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hs0 {
    public static ProductTileProductNameLabelOptionsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("num_lines".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "show_checkout_signaling");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("num_lines", c16l, "ProductTileProductNameLabelOptionsImpl");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("show_checkout_signaling", c16l, "ProductTileProductNameLabelOptionsImpl");
            } else {
                return new ProductTileProductNameLabelOptionsImpl(num.intValue(), bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
