package X;

import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HnC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39922HnC {
    public static Map A00(InterfaceC111164zd interfaceC111164zd) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC111164zd.CIr() != null) {
            List<ProductTagDictIntf> CIr = interfaceC111164zd.CIr();
            ArrayList arrayList = null;
            if (CIr != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductTagDictIntf productTagDictIntf : CIr) {
                    if (productTagDictIntf != null) {
                        arrayList.add(productTagDictIntf.F7o());
                    }
                }
            }
            A1I.put("in", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
