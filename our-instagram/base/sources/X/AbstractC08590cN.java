package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0cN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08590cN {
    public static C03190Dc A01(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Collections.singleton(entry.getValue()));
        }
        return new C03190Dc(Collections.unmodifiableMap(hashMap));
    }

    public static C03190Dc A02(java.util.Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), Collections.unmodifiableSet(new HashSet(Collections.singletonList("*|all_packages|*"))));
        }
        return new C03190Dc(Collections.unmodifiableMap(hashMap));
    }

    public static Map A03(java.util.Set set, java.util.Set set2) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), Collections.unmodifiableSet(set2));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static C03190Dc A00() {
        C07750ar.A00();
        return new C03190Dc(A03(C0B8.A0i, C0CE.A03));
    }
}
