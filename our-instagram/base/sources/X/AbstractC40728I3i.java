package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40728I3i {
    public static Map A00(ProductCollectionCover productCollectionCover) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCollectionCover.BGV() != null) {
            ProductImageContainer BGV = productCollectionCover.BGV();
            if (BGV != null) {
                treeUpdaterJNI = BGV.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("image", treeUpdaterJNI);
        }
        if (productCollectionCover.Bx7() != null) {
            IgShowreelNativeAnimationIntf Bx7 = productCollectionCover.Bx7();
            if (Bx7 != null) {
                treeUpdaterJNI2 = Bx7.F7o();
            }
            A1I.put("showreel_native_animation", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
