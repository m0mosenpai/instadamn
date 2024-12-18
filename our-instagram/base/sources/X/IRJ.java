package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IRJ {
    public static ShoppingDestinationMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShoppingIncentiveMetadata shoppingIncentiveMetadata = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("incentive_metadata".equals(A0s)) {
                    shoppingIncentiveMetadata = I4F.parseFromJson(c16l);
                } else if ("seller_product_collection_metadata".equals(A0s)) {
                    productCollectionLinkMetadataImpl = I44.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new ShoppingDestinationMetadata(productCollectionLinkMetadataImpl, shoppingIncentiveMetadata);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ShoppingDestinationMetadata shoppingDestinationMetadata) {
        anonymousClass182.A0d();
        ShoppingIncentiveMetadata shoppingIncentiveMetadata = shoppingDestinationMetadata.A01;
        if (shoppingIncentiveMetadata != null) {
            anonymousClass182.A0r("incentive_metadata");
            anonymousClass182.A0d();
            String str = shoppingIncentiveMetadata.A00;
            if (str != null) {
                anonymousClass182.A0S("incentive_id", str);
            }
            AbstractC37301Gc2.A1I(anonymousClass182, shoppingIncentiveMetadata.A01);
            anonymousClass182.A0a();
        }
        ProductCollectionLinkMetadata productCollectionLinkMetadata = shoppingDestinationMetadata.A00;
        if (productCollectionLinkMetadata != null) {
            anonymousClass182.A0r("seller_product_collection_metadata");
            ProductCollectionLinkMetadataImpl F6I = productCollectionLinkMetadata.F6I();
            anonymousClass182.A0d();
            String str2 = F6I.A01;
            if (str2 != null) {
                anonymousClass182.A0S("collection_type", str2);
            }
            AbstractC37301Gc2.A1I(anonymousClass182, F6I.A02);
            String str3 = F6I.A03;
            if (str3 != null) {
                anonymousClass182.A0S("product_collection_id", str3);
            }
            ProductCollectionReviewStatus productCollectionReviewStatus = F6I.A00;
            if (productCollectionReviewStatus != null) {
                anonymousClass182.A0S("review_status", productCollectionReviewStatus.A00);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
