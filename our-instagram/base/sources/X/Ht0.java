package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Ht0 {
    public static Map A00(InterfaceC102674k2 interfaceC102674k2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC102674k2.Abm() != null) {
            List Abm = interfaceC102674k2.Abm();
            if (Abm != null) {
                arrayList3 = AbstractC166987dD.A1E();
                Iterator it = Abm.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList3, it);
                }
            } else {
                arrayList3 = null;
            }
            A1I.put("android_links", arrayList3);
        }
        if (interfaceC102674k2.Aru() != null) {
            CornerStyle Aru = interfaceC102674k2.Aru();
            if (Aru != null) {
                str = Aru.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(4183), str);
        }
        if (interfaceC102674k2.BJY() != null) {
            List BJY = interfaceC102674k2.BJY();
            if (BJY != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it2 = BJY.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList2, it2);
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("ios_links", arrayList2);
        }
        if (interfaceC102674k2.BNi() != null) {
            List BNi = interfaceC102674k2.BNi();
            if (BNi != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it3 = BNi.iterator();
                while (it3.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList, it3);
                }
            } else {
                arrayList = null;
            }
            A1I.put("links", arrayList);
        }
        if (interfaceC102674k2.Bgl() != null) {
            ProductDetailsProductItemDictIntf Bgl = interfaceC102674k2.Bgl();
            if (Bgl != null) {
                treeUpdaterJNI = Bgl.F7o();
            }
            A1I.put("product", treeUpdaterJNI);
        }
        if (interfaceC102674k2.BhE() != null) {
            A1I.put("product_name", interfaceC102674k2.BhE());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
