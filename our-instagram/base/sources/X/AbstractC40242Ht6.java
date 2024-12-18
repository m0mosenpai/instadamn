package X;

import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Ht6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40242Ht6 {
    public static H5A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShoppingBrandWithProductsImpl shoppingBrandWithProductsImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            C38746H4m c38746H4m = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("brand_tile".equals(A0s)) {
                    shoppingBrandWithProductsImpl = AbstractC40237Ht1.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_tile".equals(A0s)) {
                    c38746H4m = Hs5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H5A(c38746H4m, shoppingBrandWithProductsImpl, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
