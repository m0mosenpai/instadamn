package X;

import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileContextMetadataImpl;
import com.instagram.api.schemas.ProductTileContextVariant;
import java.io.IOException;

/* renamed from: X.Hrr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40179Hrr {
    public static ProductTileContextImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProductTileContextVariant productTileContextVariant = null;
            ProductTileContextMetadataImpl productTileContextMetadataImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("metadata".equals(A0s)) {
                    productTileContextMetadataImpl = AbstractC40180Hrs.parseFromJson(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("variant".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileContextVariant = (ProductTileContextVariant) ProductTileContextVariant.A01.get(A1P);
                    if (productTileContextVariant == null) {
                        productTileContextVariant = ProductTileContextVariant.A05;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "ProductTileContextImpl");
            } else if (productTileContextVariant == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("variant", c16l, "ProductTileContextImpl");
            } else {
                return new ProductTileContextImpl(productTileContextMetadataImpl, productTileContextVariant, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
