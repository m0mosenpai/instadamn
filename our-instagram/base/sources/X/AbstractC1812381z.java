package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.81z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1812381z {
    public static final Map A00(Map map, java.util.Set set, boolean z) {
        HashSet hashSet;
        if (map == null) {
            map = new HashMap();
        }
        for (Object obj : set) {
            if (!map.containsKey(obj)) {
                if (z) {
                    hashSet = new HashSet();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it = ((java.util.Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            if (obj == it.next()) {
                                hashSet.add(key);
                            }
                        }
                    }
                } else {
                    hashSet = new HashSet(set);
                }
                map.put(obj, hashSet);
            }
        }
        return map;
    }
}
