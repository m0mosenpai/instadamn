package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductWrapper;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IT2 {
    public static ProductWrapper parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("product_details".equals(AbstractC166997dE.A0s(c16l))) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ProductWrapper(productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductWrapper productWrapper) {
        anonymousClass182.A0d();
        ProductDetailsProductItemDict productDetailsProductItemDict = productWrapper.A00;
        if (productDetailsProductItemDict != null) {
            anonymousClass182.A0r("product_details");
            AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
        }
        anonymousClass182.A0a();
    }
}
