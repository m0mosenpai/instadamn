package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;

/* renamed from: X.4ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103614ld {
    public static HashSet A02(int expectedSize) {
        int i;
        if (expectedSize < 3) {
            AbstractC24841Jd.A00(expectedSize, "expectedSize");
            i = expectedSize + 1;
        } else if (expectedSize < 1073741824) {
            i = (int) Math.ceil(expectedSize / 0.75d);
        } else {
            i = Integer.MAX_VALUE;
        }
        return new HashSet(i);
    }

    public static boolean A05(Object s, java.util.Set object) {
        if (object == s) {
            return true;
        }
        if (s instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) s;
            try {
                if (object.size() == set.size()) {
                    return object.containsAll(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static RSK A01(final java.util.Set set1, final java.util.Set set2) {
        C18C.A07(set1, "set1");
        C18C.A07(set2, "set2");
        return new RSK(set1, set2);
    }

    public static HashSet A03(Iterable elements) {
        if (elements instanceof Collection) {
            return new HashSet((Collection) elements);
        }
        Iterator it = elements.iterator();
        HashSet hashSet = new HashSet();
        AbstractC63071Sbt.A02(hashSet, it);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.TYr, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.TYr, java.util.Set] */
    public static java.util.Set A04(InterfaceC28041Xi interfaceC28041Xi, java.util.Set set) {
        Collection collection;
        if (set instanceof SortedSet) {
            Collection collection2 = (SortedSet) set;
            if (collection2 instanceof RQY) {
                C64891TYr c64891TYr = (C64891TYr) collection2;
                interfaceC28041Xi = S30.A00(c64891TYr.A00, interfaceC28041Xi);
                collection2 = c64891TYr.A01;
            } else {
                collection2.getClass();
                interfaceC28041Xi.getClass();
            }
            return new C64891TYr(interfaceC28041Xi, collection2);
        }
        if (set instanceof RQY) {
            C64891TYr c64891TYr2 = (C64891TYr) set;
            interfaceC28041Xi = S30.A00(c64891TYr2.A00, interfaceC28041Xi);
            collection = c64891TYr2.A01;
        } else {
            set.getClass();
            interfaceC28041Xi.getClass();
            collection = set;
        }
        return new C64891TYr(interfaceC28041Xi, collection);
    }

    public static int A00(java.util.Set s) {
        int i;
        int i2 = 0;
        for (Object obj : s) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ (-1)) ^ (-1);
        }
        return i2;
    }

    public static boolean A06(Collection set, java.util.Set collection) {
        boolean z;
        set.getClass();
        if (set instanceof InterfaceC75173Zi) {
            set = ((InterfaceC75173Zi) set).ARM();
        }
        if ((set instanceof java.util.Set) && set.size() > collection.size()) {
            Iterator it = collection.iterator();
            z = false;
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        } else {
            Iterator it2 = set.iterator();
            z = false;
            while (it2.hasNext()) {
                z |= collection.remove(it2.next());
            }
        }
        return z;
    }
}
