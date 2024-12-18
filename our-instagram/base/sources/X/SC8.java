package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SC8 {
    public final Map A00 = AbstractC166987dD.A1G();

    public SC8(java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A00.put(S90.class, ((SC7) it.next()).A00);
        }
    }
}
