package X;

import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hrx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40185Hrx {
    public static ProductTileMetadataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = null;
            ProductTileMetadataDestination productTileMetadataDestination = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("decorations".equals(A0s)) {
                    productTileMetadataDecorationsImpl = AbstractC40184Hrw.parseFromJson(c16l);
                } else if ("destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productTileMetadataDestination = (ProductTileMetadataDestination) ProductTileMetadataDestination.A01.get(A1P);
                    if (productTileMetadataDestination == null) {
                        productTileMetadataDestination = ProductTileMetadataDestination.A06;
                    }
                } else if ("labels".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductTileLabelImpl parseFromJson = AbstractC40182Hru.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("labels", c16l, "ProductTileMetadataImpl");
                throw C00O.createAndThrow();
            }
            return new ProductTileMetadataImpl(productTileMetadataDecorationsImpl, productTileMetadataDestination, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
