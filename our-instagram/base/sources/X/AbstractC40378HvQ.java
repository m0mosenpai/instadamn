package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

/* renamed from: X.HvQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40378HvQ {
    public static H6Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            Long l3 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("photo".equals(A0s)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("product_id".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else {
                    l3 = AbstractC37303Gc4.A0O(c16l, l3, A0s, "product_image_id");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("merchant_id", c16l, "TaggedProductImageContentImpl");
            } else if (productImageContainerImpl != null || !(c16l instanceof C07950bF)) {
                if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_id", c16l, "TaggedProductImageContentImpl");
                } else if (l3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_image_id", c16l, "TaggedProductImageContentImpl");
                } else {
                    return new H6Z(productImageContainerImpl, l.longValue(), l2.longValue(), l3.longValue());
                }
            } else {
                AbstractC166997dE.A1V("photo", c16l, "TaggedProductImageContentImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
