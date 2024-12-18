package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I05 {
    public static Map A00(JMF jmf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (jmf.BGq() != null) {
            List<InterfaceC87713vf> BGq = jmf.BGq();
            if (BGq != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC87713vf interfaceC87713vf : BGq) {
                    if (interfaceC87713vf != null) {
                        arrayList.add(interfaceC87713vf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("image_tags", arrayList);
        }
        if (jmf.getMediaId() != null) {
            AbstractC37300Gc1.A18(jmf.getMediaId(), A1I);
        }
        List BhB = jmf.BhB();
        if (BhB != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BhB);
            Iterator it = BhB.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("product_items", A0q);
        }
        if (jmf.BhH() != null) {
            List<JL4> BhH = jmf.BhH();
            if (BhH != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (JL4 jl4 : BhH) {
                    if (jl4 != null) {
                        arrayList2.add(jl4.F7o());
                    }
                }
            }
            A1I.put("product_picker_page_info", arrayList2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
