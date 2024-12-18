package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VM9 {
    public static HashMap A00(Map map) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object value = entry.getValue();
            Object key = entry.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z) {
                    valueOf = key.toString();
                } else {
                    valueOf = String.valueOf(key);
                }
                hashMap.put(valueOf, null);
            } else {
                if (z) {
                    valueOf2 = key.toString();
                } else {
                    valueOf2 = String.valueOf(key);
                }
                Object value2 = entry.getValue();
                if (value2 instanceof Number) {
                    valueOf3 = value2.toString();
                } else {
                    valueOf3 = String.valueOf(value2);
                }
                hashMap.put(valueOf2, valueOf3);
            }
        }
        return hashMap;
    }
}
