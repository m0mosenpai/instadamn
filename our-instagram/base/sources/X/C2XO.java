package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2XO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XO {
    public static final C75813am A0A = new Object();
    public C2XJ A00;
    public Map A01;
    public Map A02;
    public final HashSet A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;

    private final void A00(Map map) {
        Map map2;
        boolean isEmpty;
        Object obj;
        Map map3;
        Object obj2;
        synchronized (this) {
            map2 = this.A07;
            isEmpty = map2.isEmpty();
        }
        if (!isEmpty) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                synchronized (this) {
                    obj = map2.get(key);
                    map3 = this.A05;
                    obj2 = map3.get(key);
                }
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 != null) {
                    if (list2.size() == list.size()) {
                        synchronized (this) {
                            map2.remove(key);
                            map3.remove(key);
                        }
                    } else {
                        list2.removeAll(list);
                        if (list3 != null) {
                            list3.removeAll(list);
                        }
                    }
                }
            }
        }
    }

    public final synchronized HashSet A02() {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.A04.keySet());
        hashSet.addAll(this.A01.keySet());
        return hashSet;
    }

    public final synchronized HashSet A03() {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.A04.keySet());
        hashSet.addAll(this.A07.keySet());
        hashSet.addAll(this.A09.keySet());
        hashSet.addAll(this.A01.keySet());
        return hashSet;
    }

    public final synchronized Map A04() {
        return this.A06;
    }

    public final void A05() {
        synchronized (this) {
            Map map = this.A04;
            A00(map);
            C75813am.A01(this);
            Map map2 = this.A01;
            A01(map2);
            map.clear();
            map2.clear();
        }
    }

    public final void A06(C2XO c2xo) {
        Map map;
        Map map2;
        C14360o3.A0B(c2xo, 0);
        synchronized (c2xo) {
            map = c2xo.A04;
        }
        A00(map);
        C75813am.A01(c2xo);
        synchronized (c2xo) {
            map2 = c2xo.A08;
        }
        synchronized (this) {
            Map map3 = this.A08;
            map3.clear();
            map3.putAll(map2);
        }
        Map A04 = c2xo.A04();
        if (!A04.isEmpty()) {
            synchronized (this) {
                this.A06.putAll(A04);
            }
        }
        A01(c2xo.A01);
    }

    public final synchronized boolean A07() {
        boolean z;
        z = true;
        if (!(!this.A07.isEmpty()) && !(!this.A09.isEmpty())) {
            if (!(!this.A01.isEmpty())) {
                z = false;
            }
        }
        return z;
    }

    public C2XO(C2XO c2xo) {
        C2XJ c2xj;
        Map map;
        Map map2;
        Map map3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Map map4;
        if (c2xo != null) {
            c2xj = c2xo.A00;
        } else {
            c2xj = new C2XJ();
        }
        this.A07 = new HashMap(4);
        this.A05 = new HashMap(4);
        this.A06 = new HashMap();
        this.A04 = new HashMap(4);
        this.A08 = new HashMap();
        this.A03 = new HashSet();
        this.A09 = new HashMap();
        this.A01 = new HashMap();
        this.A00 = c2xj;
        if (c2xo != null) {
            synchronized (c2xo) {
                map = c2xo.A07;
            }
            Map map5 = c2xo.A09;
            synchronized (c2xo) {
                map2 = c2xo.A05;
            }
            synchronized (c2xo) {
                map3 = c2xo.A04;
            }
            Map map6 = c2xo.A01;
            if (!map.isEmpty() || !map3.isEmpty() || !map5.isEmpty() || !map6.isEmpty()) {
                synchronized (this) {
                    for (String str : map.keySet()) {
                        Map map7 = this.A07;
                        List list = (List) map.get(str);
                        if (list != null) {
                            i5 = list.size();
                        } else {
                            i5 = 4;
                        }
                        ArrayList arrayList = new ArrayList(i5);
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        map7.put(str, arrayList);
                    }
                    for (Map.Entry entry : map3.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list2 = (List) entry.getValue();
                        Map map8 = this.A04;
                        if (list2 != null) {
                            i4 = list2.size();
                        } else {
                            i4 = 4;
                        }
                        ArrayList arrayList2 = new ArrayList(i4);
                        if (list2 != null) {
                            arrayList2.addAll(list2);
                        }
                        map8.put(str2, arrayList2);
                    }
                    for (Map.Entry entry2 : map5.entrySet()) {
                        String str3 = (String) entry2.getKey();
                        List list3 = (List) entry2.getValue();
                        Map map9 = this.A09;
                        if (list3 != null) {
                            i3 = list3.size();
                        } else {
                            i3 = 4;
                        }
                        ArrayList arrayList3 = new ArrayList(i3);
                        if (list3 != null) {
                            arrayList3.addAll(list3);
                        }
                        map9.put(str3, arrayList3);
                    }
                    for (Map.Entry entry3 : map6.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        List list4 = (List) entry3.getValue();
                        Map map10 = this.A01;
                        if (list4 != null) {
                            i2 = list4.size();
                        } else {
                            i2 = 4;
                        }
                        ArrayList arrayList4 = new ArrayList(i2);
                        if (list4 != null) {
                            arrayList4.addAll(list4);
                        }
                        map10.put(str4, arrayList4);
                    }
                    if (!map2.isEmpty()) {
                        for (Map.Entry entry4 : map2.entrySet()) {
                            Object key = entry4.getKey();
                            List list5 = (List) entry4.getValue();
                            Map map11 = this.A05;
                            if (list5 != null) {
                                i = list5.size();
                            } else {
                                i = 4;
                            }
                            ArrayList arrayList5 = new ArrayList(i);
                            if (list5 != null) {
                                arrayList5.addAll(list5);
                            }
                            map11.put(key, arrayList5);
                        }
                    }
                }
            }
            synchronized (c2xo) {
                map4 = c2xo.A08;
            }
            synchronized (this) {
                Map map12 = this.A08;
                map12.clear();
                map12.putAll(map4);
            }
            Map A04 = c2xo.A04();
            if (!A04.isEmpty()) {
                synchronized (this) {
                    this.A06.putAll(A04);
                }
            }
            Map map13 = c2xo.A02;
            if (map13 != null) {
                this.A02 = new HashMap(map13);
            }
        }
    }

    private final void A01(Map map) {
        if (!map.isEmpty()) {
            Map map2 = this.A09;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Collection<?> collection = (Collection) entry.getValue();
                    synchronized (this) {
                        Object obj = map2.get(key);
                        Collection collection2 = (Collection) obj;
                        if (collection2 != null && !collection2.isEmpty()) {
                            List list = (List) obj;
                            list.removeAll(collection);
                            if (list.isEmpty()) {
                                map2.remove(key);
                            }
                        }
                    }
                }
            }
        }
    }
}
