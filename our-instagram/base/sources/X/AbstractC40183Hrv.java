package X;

import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import java.io.IOException;

/* renamed from: X.Hrv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40183Hrv {
    public static ProductTileLayoutContentImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductTileFeaturedProductPermissionInfoLabelOptionsImpl productTileFeaturedProductPermissionInfoLabelOptionsImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl = null;
            ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("featured_product_permission_info".equals(A0s)) {
                    productTileFeaturedProductPermissionInfoLabelOptionsImpl = AbstractC40181Hrt.parseFromJson(c16l);
                } else if ("price".equals(A0s)) {
                    productTilePriceLabelOptionsImpl = AbstractC40186Hry.parseFromJson(c16l);
                } else if ("product_name".equals(A0s)) {
                    productTileProductNameLabelOptionsImpl = Hs0.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ProductTileLayoutContentImpl(productTileFeaturedProductPermissionInfoLabelOptionsImpl, productTilePriceLabelOptionsImpl, productTileProductNameLabelOptionsImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
