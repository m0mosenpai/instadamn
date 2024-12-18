package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SKA {
    public RO3 A00;

    public final void A00(List list) {
        if (list != null && !list.isEmpty()) {
            HashSet A1H = AbstractC166987dD.A1H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((SD7) it.next()).A01;
                if (!"play_pass_subs".equals(str)) {
                    A1H.add(str);
                }
            }
            if (A1H.size() <= 1) {
                this.A00 = RO3.A02(list);
                return;
            }
            throw AbstractC166987dD.A12("All products should be of the same product type.");
        }
        throw AbstractC166987dD.A12("Product list cannot be empty.");
    }
}
