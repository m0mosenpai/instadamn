package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I42 {
    public static Map A00(ProductCollectionLinkIntf productCollectionLinkIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productCollectionLinkIntf.Aj7() != null) {
            A1I.put("button_text", productCollectionLinkIntf.Aj7());
        }
        if (productCollectionLinkIntf.Ax2() != null) {
            A1I.put("destination_id", productCollectionLinkIntf.Ax2());
        }
        if (productCollectionLinkIntf.Ax3() != null) {
            ShoppingDestinationMetadataIntf Ax3 = productCollectionLinkIntf.Ax3();
            if (Ax3 != null) {
                treeUpdaterJNI = Ax3.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("destination_metadata", treeUpdaterJNI);
        }
        if (productCollectionLinkIntf.Ax4() != null) {
            A1I.put("destination_subtitle", productCollectionLinkIntf.Ax4());
        }
        if (productCollectionLinkIntf.Ax5() != null) {
            A1I.put("destination_title", productCollectionLinkIntf.Ax5());
        }
        if (productCollectionLinkIntf.Ax6() != null) {
            MultiProductComponentDestinationType Ax6 = productCollectionLinkIntf.Ax6();
            C14360o3.A0B(Ax6, 0);
            A1I.put("destination_type", Ax6.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
