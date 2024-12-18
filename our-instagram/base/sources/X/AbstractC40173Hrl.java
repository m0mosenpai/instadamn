package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hrl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40173Hrl {
    public static Map A00(JL4 jl4) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (jl4.Abm() != null) {
            List Abm = jl4.Abm();
            if (Abm != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = Abm.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put("android_links", arrayList);
        }
        if (jl4.BJY() != null) {
            List BJY = jl4.BJY();
            if (BJY != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it2 = BJY.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList2, it2);
                }
            }
            A1I.put("ios_links", arrayList2);
        }
        if (jl4.getProductId() != null) {
            A1I.put("product_id", jl4.getProductId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
