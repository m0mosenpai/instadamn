package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.45C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45C implements Serializable {
    public final ArrayList A01(AbstractC910944l abstractC910944l, C45T c45t, RBL rbl) {
        Class A04;
        C44W A00 = c45t.A00();
        if (abstractC910944l != null) {
            A04 = abstractC910944l.A00;
        } else {
            A04 = rbl.A04();
        }
        HashMap hashMap = new HashMap();
        List<TI3> A0j = A00.A0j(rbl);
        if (A0j != null) {
            for (TI3 ti3 : A0j) {
                A04(A00, c45t, C63390Sj8.A01(c45t, c45t, ti3.A01), ti3, hashMap);
            }
        }
        A04(A00, c45t, C63390Sj8.A01(c45t, c45t, A04), new TI3(A04, null), hashMap);
        return new ArrayList(hashMap.values());
    }

    public final ArrayList A02(AbstractC910944l abstractC910944l, C45T c45t, RBL rbl) {
        C44W A00 = c45t.A00();
        Class cls = abstractC910944l.A00;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A05(c45t, C63390Sj8.A01(c45t, c45t, cls), new TI3(cls, null), linkedHashMap, hashSet);
        List<TI3> A0j = A00.A0j(rbl);
        if (A0j != null) {
            for (TI3 ti3 : A0j) {
                A05(c45t, C63390Sj8.A01(c45t, c45t, ti3.A01), ti3, linkedHashMap, hashSet);
            }
        }
        return A00(cls, linkedHashMap, hashSet);
    }

    public final ArrayList A03(C45T c45t, AnonymousClass454 anonymousClass454) {
        Class cls = anonymousClass454.A05;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A05(c45t, anonymousClass454, new TI3(cls, null), linkedHashMap, hashSet);
        return A00(cls, linkedHashMap, hashSet);
    }

    public final void A04(C44W c44w, C45T c45t, AnonymousClass454 anonymousClass454, TI3 ti3, HashMap hashMap) {
        String A0h;
        if (ti3.A00 == null && (A0h = c44w.A0h(anonymousClass454)) != null) {
            ti3 = new TI3(ti3.A01, A0h);
        }
        TI3 ti32 = new TI3(ti3.A01, null);
        if (hashMap.containsKey(ti32)) {
            if (ti3.A00 != null && ((TI3) hashMap.get(ti32)).A00 == null) {
                hashMap.put(ti32, ti3);
                return;
            }
            return;
        }
        hashMap.put(ti32, ti3);
        List<TI3> A0j = c44w.A0j(anonymousClass454);
        if (A0j == null || A0j.isEmpty()) {
            return;
        }
        for (TI3 ti33 : A0j) {
            A04(c44w, c45t, C63390Sj8.A01(c45t, c45t, ti33.A01), ti33, hashMap);
        }
    }

    public static final ArrayList A00(Class cls, Map map, java.util.Set set) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(((TI3) it.next()).A01);
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new TI3(cls2, null));
            }
        }
        return arrayList;
    }

    public final void A05(C45T c45t, AnonymousClass454 anonymousClass454, TI3 ti3, Map map, java.util.Set set) {
        List<TI3> A0j;
        String A0h;
        C44W A00 = c45t.A00();
        if (ti3.A00 == null && (A0h = A00.A0h(anonymousClass454)) != null) {
            ti3 = new TI3(ti3.A01, A0h);
        }
        String str = ti3.A00;
        if (str != null) {
            map.put(str, ti3);
        }
        if (set.add(ti3.A01) && (A0j = A00.A0j(anonymousClass454)) != null && !A0j.isEmpty()) {
            for (TI3 ti32 : A0j) {
                A05(c45t, C63390Sj8.A01(c45t, c45t, ti32.A01), ti32, map, set);
            }
        }
    }

    public C45C(int i) {
    }

    public C45C() {
    }
}
