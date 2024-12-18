package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3R {
    public static Map A00(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (clipsShoppingInfoIntf.AoW() != null) {
            ClipsShoppingCTABarIntf AoW = clipsShoppingInfoIntf.AoW();
            if (AoW != null) {
                treeUpdaterJNI2 = AoW.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("clips_shopping_cta_bar", treeUpdaterJNI2);
        }
        if (clipsShoppingInfoIntf.Ap9() != null) {
            ProductCollection Ap9 = clipsShoppingInfoIntf.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI = Ap9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI);
        }
        if (clipsShoppingInfoIntf.BhR() != null) {
            List<ProductWrapperIntf> BhR = clipsShoppingInfoIntf.BhR();
            if (BhR != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductWrapperIntf productWrapperIntf : BhR) {
                    if (productWrapperIntf != null) {
                        arrayList.add(productWrapperIntf.F7o());
                    }
                }
            }
            A1I.put("products", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
