package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9wY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225099wY {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static Object A00(Object obj) {
        Object hashMap;
        if (obj instanceof List) {
            List list = (List) obj;
            hashMap = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.add(A00(it.next()));
            }
        } else if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            hashMap = new HashSet(set.size());
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                hashMap.add(A00(it2.next()));
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            hashMap = new HashMap(map.size());
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                hashMap.put(A00(A1K.getKey()), A00(A1K.getValue()));
            }
        } else {
            return obj;
        }
        return hashMap;
    }
}
