package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I43 {
    public static Map A00(ProductCollectionLinkMetadata productCollectionLinkMetadata) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productCollectionLinkMetadata.ApG() != null) {
            A1I.put("collection_type", productCollectionLinkMetadata.ApG());
        }
        if (productCollectionLinkMetadata.BSZ() != null) {
            A1I.put("merchant_id", productCollectionLinkMetadata.BSZ());
        }
        if (productCollectionLinkMetadata.Bgr() != null) {
            A1I.put("product_collection_id", productCollectionLinkMetadata.Bgr());
        }
        if (productCollectionLinkMetadata.BpG() != null) {
            ProductCollectionReviewStatus BpG = productCollectionLinkMetadata.BpG();
            if (BpG != null) {
                str = BpG.A00;
            } else {
                str = null;
            }
            A1I.put("review_status", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
