package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7iB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169967iB {
    public Map A00 = new HashMap();
    public Map A01 = new HashMap();

    public static C169967iB A00(C169967iB c169967iB) {
        C169967iB c169967iB2 = new C169967iB();
        Map map = c169967iB.A00;
        if (!map.isEmpty()) {
            for (Object obj : map.keySet()) {
                c169967iB2.A00.put(obj, new ArrayList((Collection) map.get(obj)));
            }
            Map map2 = c169967iB.A01;
            for (Object obj2 : map2.keySet()) {
                c169967iB2.A01.put(obj2, new ArrayList((Collection) map2.get(obj2)));
            }
        }
        return c169967iB2;
    }

    public static void A01(Map map, Map map2, String str) {
        Collection<?> collection = (Collection) map2.get(str);
        List list = (List) map.remove(str);
        if (collection != null) {
            if (list != null) {
                list.removeAll(collection);
            } else {
                return;
            }
        } else if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            map.put(str, list);
        }
    }
}
