package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IA9 {
    public static Map A00(ProductCollection productCollection) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productCollection.Ap3() != null) {
            A1I.put("collection_id", productCollection.Ap3());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCollection.ApC() != null) {
            ProductCollectionReviewStatus ApC = productCollection.ApC();
            if (ApC != null) {
                str2 = ApC.A00;
            } else {
                str2 = null;
            }
            A1I.put(AbstractC111324zv.A00(189), str2);
        }
        if (productCollection.ApF() != null) {
            ProductCollectionV2Type ApF = productCollection.ApF();
            if (ApF != null) {
                str = ApF.A00;
            } else {
                str = null;
            }
            A1I.put("collection_type", str);
        }
        if (productCollection.AsD() != null) {
            ProductCollectionCover AsD = productCollection.AsD();
            if (AsD != null) {
                treeUpdaterJNI = AsD.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("cover", treeUpdaterJNI);
        }
        if (productCollection.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, productCollection.getDescription());
        }
        if (productCollection.Azb() != null) {
            ProductCollectionDropsMetadata Azb = productCollection.Azb();
            if (Azb != null) {
                treeUpdaterJNI2 = Azb.F7o();
            }
            A1I.put("drops_collection_metadata", treeUpdaterJNI2);
        }
        if (productCollection.BSZ() != null) {
            A1I.put("merchant_id", productCollection.BSZ());
        }
        if (productCollection.getSubtitle() != null) {
            A1I.put("subtitle", productCollection.getSubtitle());
        }
        if (productCollection.getTitle() != null) {
            AbstractC37300Gc1.A17(productCollection.getTitle(), A1I);
        }
        List CEC = productCollection.CEC();
        if (CEC != null) {
            ArrayList A0q = AbstractC167017dG.A0q(CEC);
            Iterator it = CEC.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("users", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
