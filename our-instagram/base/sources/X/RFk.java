package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RFk extends AbstractC63157Se6 {
    public Map A00 = new HashMap(4);

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String valueOf = String.valueOf(A1K.getKey());
            A1G.put(MSZ.A0u("metric", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 6)), A1K.getValue());
        }
        return AbstractC63157Se6.A00(0, A1G);
    }
}
