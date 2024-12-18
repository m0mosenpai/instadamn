package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OUh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54997OUh {
    public final C51737MtK A01(Map map, double d) {
        List list;
        Object obj = map != null ? map.get("quality_buckets") : null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            return A00(list, d);
        }
        return AbstractC25225BEi.A0d(0, 1024, 1);
    }

    public static final C51737MtK A00(List list, double d) {
        Object obj;
        Object obj2;
        Map map;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d >= AbstractC25230BEn.A0D(((Map) obj).get("min_bandwidth_in_mbps"), "null cannot be cast to non-null type kotlin.Int") * 1000.0d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            obj2 = map2.get("bucket");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof Map) || (map = (Map) obj2) == null) {
            return null;
        }
        Object obj3 = map.get("lod");
        if (obj3 != null) {
            int A0H = AbstractC166987dD.A0H(obj3);
            Object obj4 = map.get("texture_size");
            if (obj4 != null) {
                return AbstractC25225BEi.A0d(A0H, AbstractC166987dD.A0H(obj4), 1);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
