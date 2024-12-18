package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4D {
    public static Map A00(ShoppingDestinationMetadataIntf shoppingDestinationMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (shoppingDestinationMetadataIntf.BHL() != null) {
            ShoppingIncentiveMetadataIntf BHL = shoppingDestinationMetadataIntf.BHL();
            if (BHL != null) {
                treeUpdaterJNI = BHL.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("incentive_metadata", treeUpdaterJNI);
        }
        if (shoppingDestinationMetadataIntf.Bt6() != null) {
            ProductCollectionLinkMetadata Bt6 = shoppingDestinationMetadataIntf.Bt6();
            if (Bt6 != null) {
                treeUpdaterJNI2 = Bt6.F7o();
            }
            A1I.put("seller_product_collection_metadata", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
