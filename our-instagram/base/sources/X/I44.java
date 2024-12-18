package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I44 {
    public static ProductCollectionLinkMetadataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductCollectionReviewStatus productCollectionReviewStatus = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("product_collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("review_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productCollectionReviewStatus = (ProductCollectionReviewStatus) ProductCollectionReviewStatus.A01.get(A1P);
                    if (productCollectionReviewStatus == null) {
                        productCollectionReviewStatus = ProductCollectionReviewStatus.A08;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("product_collection_id", c16l, "ProductCollectionLinkMetadataImpl");
                throw C00O.createAndThrow();
            }
            return new ProductCollectionLinkMetadataImpl(productCollectionReviewStatus, str2, str3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
