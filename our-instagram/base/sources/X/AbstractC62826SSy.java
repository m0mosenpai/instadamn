package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SSy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62826SSy {
    public static final boolean A00(Map.Entry entry, Map map) {
        AbstractC167017dG.A1N(map, entry);
        Object obj = map.get(entry.getKey());
        Object value = entry.getValue();
        if (obj != null) {
            return obj.equals(value);
        }
        if (value == null && AbstractC58319PtB.A1V(entry, map)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(Map map, Map map2) {
        if (map.size() == map2.size()) {
            if (!map2.isEmpty()) {
                Iterator A15 = AbstractC166997dE.A15(map2);
                while (A15.hasNext()) {
                    if (!A00(AbstractC166987dD.A1K(A15), map)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(23));
    }
}
