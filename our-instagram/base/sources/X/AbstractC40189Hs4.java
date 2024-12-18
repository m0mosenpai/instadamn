package X;

import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Hs4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40189Hs4 {
    public static ProductWithMediaImageImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "micro_product")) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (productDetailsProductItemDict == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("micro_product", c16l, "ProductWithMediaImageImpl");
                throw C00O.createAndThrow();
            }
            return new ProductWithMediaImageImpl(productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
