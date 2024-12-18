package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Hno, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39959Hno {
    public static H3V parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("photo".equals(A0s)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("product_image_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("merchant_id", c16l, "GuideProductImageContent");
            } else if (productImageContainerImpl != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_id", c16l, "GuideProductImageContent");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_image_id", c16l, "GuideProductImageContent");
                } else {
                    return new H3V(productImageContainerImpl, productDetailsProductItemDict, str, str2, str3);
                }
            } else {
                AbstractC166997dE.A1V("photo", c16l, "GuideProductImageContent");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
