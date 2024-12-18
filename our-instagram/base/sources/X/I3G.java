package X;

import com.instagram.model.shopping.ProductContainer;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3G {
    public static ProductContainer parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductContainer productContainer = new ProductContainer();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product".equals(A0s)) {
                    productContainer.A00 = AbstractC111134zU.parseFromJson(c16l);
                } else if ("unavailable_product".equals(A0s)) {
                    productContainer.A01 = IAD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return productContainer;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
