package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RFo extends AbstractC63157Se6 {
    public final List A01 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();
    public final Map A02 = AbstractC166987dD.A1G();

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        List list = this.A01;
        if (!list.isEmpty()) {
            A1G.put("products", list);
        }
        List list2 = this.A00;
        if (!list2.isEmpty()) {
            A1G.put(AbstractC111324zv.A00(2931), list2);
        }
        Map map = this.A02;
        if (!map.isEmpty()) {
            A1G.put("impressions", map);
        }
        return AbstractC63157Se6.A01("productAction", null, A1G);
    }
}
