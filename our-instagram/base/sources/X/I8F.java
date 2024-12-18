package X;

import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I8F {
    public static final C39341HZg A00(ProductTileMedia productTileMedia, Product product) {
        IN1 c39351HZq;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (productTileMedia != null) {
            c39351HZq = new C39348HZn(productTileMedia);
        } else {
            C14360o3.A0A(product);
            C14360o3.A0B(product, 1);
            c39351HZq = new C39351HZq(product.A07, AnonymousClass001.A0R(product.A0H, "_image_0"), product.A0I);
        }
        A1E.add(c39351HZq);
        return new C39341HZg(C41586IaZ.A04, null, "hero_carousel", A1E, false, true);
    }
}
