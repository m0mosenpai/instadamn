package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SF6 {
    public final Map A00;
    public final java.util.Set A01;

    public SF6(java.util.Set set) {
        C14360o3.A0B(set, 1);
        this.A01 = set;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A18.put(it.next(), EnumC61134Rfo.A05);
        }
        this.A00 = AbstractC06930Yk.A03(A18);
    }
}
