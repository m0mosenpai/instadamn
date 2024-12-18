package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gdn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37407Gdn {
    public static Map A00(InterfaceC87713vf interfaceC87713vf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC87713vf.AZE() != null) {
            A1I.put("ad_id", interfaceC87713vf.AZE());
        }
        if (interfaceC87713vf.Bec() != null) {
            List Bec = interfaceC87713vf.Bec();
            if (Bec != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = Bec.iterator();
                while (it.hasNext()) {
                    Double A0m = AnonymousClass010.A0m(String.valueOf(((Number) it.next()).floatValue()));
                    if (A0m != null) {
                        arrayList.add(A0m);
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("position", arrayList);
        }
        if (interfaceC87713vf.getSubtitle() != null) {
            A1I.put("subtitle", interfaceC87713vf.getSubtitle());
        }
        if (interfaceC87713vf.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC87713vf.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
