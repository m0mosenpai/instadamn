package X;

import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileTextStyleType;
import java.io.IOException;

/* renamed from: X.Hrt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40181Hrt {
    public static ProductTileFeaturedProductPermissionInfoLabelOptionsImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProductTileTextStyleType productTileTextStyleType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("status_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("style_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileTextStyleType = (ProductTileTextStyleType) ProductTileTextStyleType.A01.get(A1P);
                    if (productTileTextStyleType == null) {
                        productTileTextStyleType = ProductTileTextStyleType.A07;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("status_text", c16l, "ProductTileFeaturedProductPermissionInfoLabelOptionsImpl");
            } else if (productTileTextStyleType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("style_type", c16l, "ProductTileFeaturedProductPermissionInfoLabelOptionsImpl");
            } else {
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl(productTileTextStyleType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
