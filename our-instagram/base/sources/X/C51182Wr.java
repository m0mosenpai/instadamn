package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51182Wr {
    public Map A00;

    public final void A00() {
        C2XV.A00();
        Map map = this.A00;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((C2Wo) it.next()).detach();
            }
        }
        this.A00 = null;
    }

    public final void A01(List list) {
        LinkedHashMap linkedHashMap;
        C2XV.A00();
        Map map = this.A00;
        if (map == null) {
            if (list == null) {
                return;
            }
        } else if (list == null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((C2Wo) it.next()).detach();
            }
            linkedHashMap = null;
            this.A00 = linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            linkedHashMap.put(((C2Wo) obj).CCd(), obj);
        }
        Map map2 = this.A00;
        if (map2 != null && !map2.isEmpty()) {
            Map map3 = this.A00;
            if (map3 == null) {
                return;
            }
            for (Map.Entry entry : map3.entrySet()) {
                Object key = entry.getKey();
                C2Wo c2Wo = (C2Wo) entry.getValue();
                if (!linkedHashMap.containsKey(key)) {
                    c2Wo.detach();
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                C2Wo c2Wo2 = (C2Wo) entry2.getValue();
                C2Wo c2Wo3 = (C2Wo) map3.get(key2);
                if (c2Wo3 != null) {
                    if (c2Wo3.Ek0(c2Wo2)) {
                        c2Wo3.detach();
                    } else if (!c2Wo3.FDM()) {
                        entry2.setValue(c2Wo3);
                    }
                }
                c2Wo2.ACu();
            }
        } else {
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((C2Wo) it2.next()).ACu();
            }
        }
        this.A00 = linkedHashMap;
    }
}
