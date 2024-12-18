package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06930Yk extends AbstractC16850sd {
    public static final Object A01(Object obj, Map map) {
        C14360o3.A0B(map, 0);
        return AbstractC09990gB.A0I(obj, map);
    }

    public static final HashMap A02(C09530e4... c09530e4Arr) {
        C14360o3.A0B(c09530e4Arr, 0);
        HashMap hashMap = new HashMap(AbstractC16850sd.A0L(c09530e4Arr.length));
        A0H(hashMap, c09530e4Arr);
        return hashMap;
    }

    public static final LinkedHashMap A03(Map map) {
        C14360o3.A0B(map, 0);
        return new LinkedHashMap(map);
    }

    public static final LinkedHashMap A04(Map map, Map map2) {
        C14360o3.A0B(map, 0);
        C14360o3.A0B(map2, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final LinkedHashMap A05(C09530e4... c09530e4Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(c09530e4Arr.length));
        A0H(linkedHashMap, c09530e4Arr);
        return linkedHashMap;
    }

    public static final LinkedHashMap A06(C09530e4... c09530e4Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(c09530e4Arr.length));
        A0H(linkedHashMap, c09530e4Arr);
        return linkedHashMap;
    }

    public static final LinkedHashMap A07(C09530e4... c09530e4Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(c09530e4Arr.length));
        A0H(linkedHashMap, c09530e4Arr);
        return linkedHashMap;
    }

    public static final Map A08(Iterable iterable) {
        Object next;
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(collection.size()));
                    A0F(iterable, linkedHashMap);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return AbstractC16850sd.A0M((C09530e4) next);
            }
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return c16920sk;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        A0F(iterable, linkedHashMap2);
        return A0A(linkedHashMap2);
    }

    public static final Map A09(Object obj, Map map) {
        C14360o3.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return A0A(linkedHashMap);
    }

    public static final Map A0B(Map map) {
        C14360o3.A0B(map, 0);
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            C14360o3.A07(singletonMap);
            return singletonMap;
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    public static final Map A0C(Map map, C09530e4 c09530e4) {
        C14360o3.A0B(map, 0);
        if (map.isEmpty()) {
            return AbstractC16850sd.A0M(c09530e4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c09530e4.A00, c09530e4.A01);
        return linkedHashMap;
    }

    public static final Map A0D(C09530e4[] c09530e4Arr) {
        C14360o3.A0B(c09530e4Arr, 0);
        int length = c09530e4Arr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(length));
                A0H(linkedHashMap, c09530e4Arr);
                return linkedHashMap;
            }
            return AbstractC16850sd.A0M(c09530e4Arr[0]);
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    public static final void A0F(Iterable iterable, Map map) {
        C14360o3.A0B(iterable, 1);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            map.put(c09530e4.A00, c09530e4.A01);
        }
    }

    public static final void A0H(Map map, C09530e4[] c09530e4Arr) {
        for (C09530e4 c09530e4 : c09530e4Arr) {
            map.put(c09530e4.A00, c09530e4.A01);
        }
    }

    public static final C16920sk A0E() {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    public static final Map A0A(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                C14360o3.A07(singletonMap);
                return singletonMap;
            }
            return map;
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    public static final void A0G(Map map, InterfaceC224417g interfaceC224417g) {
        Iterator it = interfaceC224417g.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            map.put(c09530e4.A00, c09530e4.A01);
        }
    }
}
