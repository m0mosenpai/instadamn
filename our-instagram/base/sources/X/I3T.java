package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3T {
    public static Map A00(IGTVShoppingInfoIntf iGTVShoppingInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (iGTVShoppingInfoIntf.AoW() != null) {
            ClipsShoppingCTABarIntf AoW = iGTVShoppingInfoIntf.AoW();
            if (AoW != null) {
                treeUpdaterJNI2 = AoW.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("clips_shopping_cta_bar", treeUpdaterJNI2);
        }
        if (iGTVShoppingInfoIntf.Ap9() != null) {
            ProductCollection Ap9 = iGTVShoppingInfoIntf.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI = Ap9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI);
        }
        User BSW = iGTVShoppingInfoIntf.BSW();
        if (BSW != null) {
            AbstractC37301Gc2.A1Q(BSW, A1I);
        }
        if (iGTVShoppingInfoIntf.BhR() != null) {
            List<ProductWrapperIntf> BhR = iGTVShoppingInfoIntf.BhR();
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
