package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.81e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1810281e {
    public Pair A00;
    public boolean A01;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A03 = new HashMap();
    public final LinkedHashSet A02 = new LinkedHashSet();
    public final Queue A06 = new LinkedList();
    public final Queue A07 = new LinkedList();

    public static boolean A00(C1810281e c1810281e, Object obj) {
        Object obj2;
        C88F c88f;
        c1810281e.A01 = true;
        C11T.A00();
        java.util.Set set = (java.util.Set) c1810281e.A05.get(c1810281e.A00.first);
        boolean z = false;
        if (set != null && set.contains(obj.getClass())) {
            c1810281e.A07.add(obj);
        } else {
            Map map = (Map) c1810281e.A04.get(c1810281e.A00.first);
            if (map != null && (obj2 = map.get(obj.getClass())) != null) {
                Map map2 = c1810281e.A03;
                if (map2.containsKey(obj2)) {
                    for (C85H c85h : (java.util.Set) map2.get(obj2)) {
                        if (c85h instanceof C88F) {
                            c88f = (C88F) c85h;
                        } else {
                            c88f = null;
                        }
                        if (c85h.A7D(obj2, obj)) {
                            if (c88f != null) {
                                c88f.DvM(obj2);
                            }
                        } else {
                            if (c88f != null) {
                                c88f.DvQ(obj2);
                            }
                            obj2.toString();
                            c1810281e.A01 = false;
                            return z;
                        }
                    }
                }
                Pair pair = c1810281e.A00;
                c1810281e.A00 = new Pair(obj2, obj);
                Iterator it = new ArrayList(c1810281e.A02).iterator();
                while (it.hasNext()) {
                    ((InterfaceC1810781j) it.next()).DoV(pair.first, c1810281e.A00.first, obj);
                }
                pair.first.toString();
                c1810281e.A00.first.toString();
                Queue queue = c1810281e.A07;
                LinkedList linkedList = new LinkedList(queue);
                while (!linkedList.isEmpty()) {
                    Object remove = linkedList.remove();
                    queue.remove();
                    if (A00(c1810281e, remove)) {
                        break;
                    }
                }
                z = true;
                c1810281e.A01 = false;
                return z;
            }
        }
        obj2 = c1810281e.A00.first;
        obj2.toString();
        c1810281e.A01 = false;
        return z;
    }

    public final void A01(C85H c85h, Object obj) {
        Map map = this.A03;
        if (map.containsKey(obj)) {
            ((java.util.Set) map.get(obj)).add(c85h);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c85h);
        map.put(obj, linkedHashSet);
    }

    public final void A02(InterfaceC1810781j interfaceC1810781j) {
        LinkedHashSet linkedHashSet = this.A02;
        if (!linkedHashSet.contains(interfaceC1810781j)) {
            linkedHashSet.add(interfaceC1810781j);
        }
    }

    public final void A03(Class cls, Object obj, Object obj2) {
        Map map = this.A04;
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(obj, map2);
        }
        map2.put(cls, obj2);
    }

    public void A04(final Object obj) {
        C11T.A02(new Runnable() { // from class: X.8Pt
            @Override // java.lang.Runnable
            public final void run() {
                C1810281e c1810281e = C1810281e.this;
                if (c1810281e.A01) {
                    c1810281e.A06.add(obj);
                    return;
                }
                Object obj2 = obj;
                while (true) {
                    C1810281e.A00(c1810281e, obj2);
                    Queue queue = c1810281e.A06;
                    if (queue.isEmpty()) {
                        return;
                    } else {
                        obj2 = queue.remove();
                    }
                }
            }
        });
    }

    public C1810281e(Object obj) {
        this.A00 = new Pair(obj, new Object());
    }
}
