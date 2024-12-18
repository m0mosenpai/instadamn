package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3L {
    public static Map A00(ProductTagDictIntf productTagDictIntf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productTagDictIntf.Awz() != null) {
            A1I.put("destination", productTagDictIntf.Awz());
        }
        if (productTagDictIntf.BDq() != null) {
            A1I.put("hide_tag", productTagDictIntf.BDq());
        }
        if (productTagDictIntf.Cbq() != null) {
            A1I.put(AbstractC111324zv.A00(4777), productTagDictIntf.Cbq());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (productTagDictIntf.Bec() != null) {
            List Bec = productTagDictIntf.Bec();
            if (Bec != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = Bec.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1X(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put("position", arrayList);
        }
        if (productTagDictIntf.Bgl() != null) {
            ProductDetailsProductItemDictIntf Bgl = productTagDictIntf.Bgl();
            if (Bgl != null) {
                treeUpdaterJNI = Bgl.F7o();
            }
            A1I.put("product", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
