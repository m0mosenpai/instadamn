package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

/* renamed from: X.I3t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40739I3t {
    public static ProductFeedItem parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MultiProductComponent multiProductComponent = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            UnavailableProductImpl unavailableProductImpl = null;
            ProductTile productTile = null;
            C38321qM c38321qM = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_collection".equals(A0s)) {
                    multiProductComponent = AbstractC40735I3p.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("unavailable_product".equals(A0s)) {
                    unavailableProductImpl = IAD.parseFromJson(c16l);
                } else if ("product_tile".equals(A0s)) {
                    productTile = AbstractC40741I3v.parseFromJson(c16l);
                } else if ("media_feed_item".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            ProductFeedItem productFeedItem = new ProductFeedItem();
            if (multiProductComponent != null) {
                productFeedItem.A01 = multiProductComponent;
            }
            if (productDetailsProductItemDict != null) {
                productFeedItem.A04 = productDetailsProductItemDict;
            }
            if (unavailableProductImpl != null) {
                productFeedItem.A05 = unavailableProductImpl;
            }
            if (productTile != null) {
                productFeedItem.A02 = productTile;
            }
            if (c38321qM != null) {
                productFeedItem.A00 = c38321qM;
            }
            productFeedItem.A04();
            return productFeedItem;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
