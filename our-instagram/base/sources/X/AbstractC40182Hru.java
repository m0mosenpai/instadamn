package X;

import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import java.io.IOException;

/* renamed from: X.Hru, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40182Hru {
    public static ProductTileLabelImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductTileLabelType productTileLabelType = null;
            ProductTileLayoutContentImpl productTileLayoutContentImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("label_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileLabelType = (ProductTileLabelType) ProductTileLabelType.A01.get(A1P);
                    if (productTileLabelType == null) {
                        productTileLabelType = ProductTileLabelType.A0J;
                    }
                } else if ("layout_content".equals(A0s)) {
                    productTileLayoutContentImpl = AbstractC40183Hrv.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (productTileLabelType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("label_type", c16l, "ProductTileLabelImpl");
                throw C00O.createAndThrow();
            }
            return new ProductTileLabelImpl(productTileLabelType, productTileLayoutContentImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
