package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

/* renamed from: X.I7a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40824I7a {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.IMp, java.lang.Object] */
    public static C41224IMp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductTile productTile = null;
            UnavailableProductImpl unavailableProductImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_tile".equals(A0s)) {
                    productTile = AbstractC40741I3v.parseFromJson(c16l);
                } else if ("unavailable_product".equals(A0s)) {
                    unavailableProductImpl = IAD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (productDetailsProductItemDict != null) {
                obj.A01 = productDetailsProductItemDict;
            }
            if (productTile != null) {
                obj.A00 = productTile;
            }
            if (unavailableProductImpl != null) {
                obj.A02 = unavailableProductImpl;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
