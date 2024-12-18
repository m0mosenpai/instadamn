package X;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.81u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811881u {
    public static final C1811881u A03 = new C1811881u(new LinkedHashMap(), new HashMap());
    public final LinkedHashMap A00;
    public final java.util.Set A01 = new HashSet();
    public final Map A02;

    public final LinkedHashSet A01(C81W c81w) {
        C14360o3.A0B(c81w, 0);
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.A00.get(c81w);
        if (linkedHashSet != null) {
            return linkedHashSet;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("camera tool not available: ");
        sb.append(c81w);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean A03(C81W c81w) {
        for (Object obj : this.A00.values()) {
            C14360o3.A07(obj);
            Iterator it = ((AbstractCollection) obj).iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                if (next == c81w) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04(C81W c81w, C81W c81w2) {
        C14360o3.A0B(c81w, 0);
        C14360o3.A0B(c81w2, 1);
        Map map = this.A02;
        java.util.Set set = (java.util.Set) map.get(c81w);
        java.util.Set set2 = (java.util.Set) map.get(c81w2);
        if (set == null || set2 == null || !set.contains(c81w2) || !set2.contains(c81w)) {
            return true;
        }
        return false;
    }

    public final LinkedHashSet A00() {
        return new LinkedHashSet(this.A00.keySet());
    }

    public final void A02(java.util.Set set) {
        java.util.Set entrySet = this.A00.entrySet();
        C14360o3.A07(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!set.contains(entry.getKey())) {
                it.remove();
            } else {
                Iterator it2 = ((AbstractCollection) entry.getValue()).iterator();
                C14360o3.A07(it2);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C14360o3.A07(next);
                    if (!set.contains(next)) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public C1811881u(LinkedHashMap linkedHashMap, Map map) {
        this.A00 = linkedHashMap;
        this.A02 = map;
    }
}
