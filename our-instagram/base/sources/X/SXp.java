package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SXp {
    public static final SXp A01 = new SXp();
    public final Map A00 = AbstractC166987dD.A1G();

    public final synchronized void A00(Map values) {
        Iterator A15 = AbstractC166997dE.A15(values);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            AbstractC61590RqE abstractC61590RqE = (AbstractC61590RqE) A1K.getValue();
            Map map = this.A00;
            if (map.containsKey(A17)) {
                if (!((AbstractC61590RqE) map.get(A17)).equals(abstractC61590RqE)) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Parameters object with name ");
                    A1C.append(A17);
                    A1C.append(" already exists (");
                    A1C.append(map.get(A17));
                    throw AbstractC58320PtC.A19(abstractC61590RqE, "), cannot insert ", A1C);
                }
            } else {
                map.put(A17, abstractC61590RqE);
            }
        }
    }
}
