package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2N0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2N0 {
    public final Object A00 = new Object();
    public final Map A01 = new LinkedHashMap();

    public final C1113750b A00(C2WP c2wp) {
        C1113750b c1113750b;
        C14360o3.A0B(c2wp, 0);
        synchronized (this.A00) {
            c1113750b = (C1113750b) this.A01.remove(c2wp);
        }
        return c1113750b;
    }

    public final List A02(String str) {
        List A0a;
        C14360o3.A0B(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (C14360o3.A0K(((C2WP) entry.getKey()).A01, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                map.remove((C2WP) it.next());
            }
            A0a = AbstractC001800i.A0a(linkedHashMap.values());
        }
        return A0a;
    }

    public final C1113750b A01(C2WP c2wp) {
        C1113750b c1113750b;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(c2wp);
            if (obj == null) {
                obj = new C1113750b(c2wp);
                map.put(c2wp, obj);
            }
            c1113750b = (C1113750b) obj;
        }
        return c1113750b;
    }

    public final boolean A03(C2WP c2wp) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(c2wp);
        }
        return containsKey;
    }
}
