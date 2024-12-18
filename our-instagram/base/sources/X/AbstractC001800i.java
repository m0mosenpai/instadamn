package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.00i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC001800i extends AbstractC002900t {
    public static final double A00(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                AbstractC16960so.A1T();
                throw C00O.createAndThrow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final int A01(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC16960so.A1T();
                throw C00O.createAndThrow();
            }
        }
        return i;
    }

    public static final int A02(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static final Comparable A04(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Comparable A06(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Float A07(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final Float A08(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final Object A09(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            return A0I((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A0A(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final Object A0B(Iterable iterable) {
        Object next;
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            return A0K((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object A0C(Iterable iterable) {
        Object next;
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object A0D(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            return A0M((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A0E(Iterable iterable, int i) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        int i2 = 0;
        if (i >= 0) {
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return obj;
                }
                i2 = i3;
            }
        }
        Integer.valueOf(i).intValue();
        throw new IndexOutOfBoundsException(AnonymousClass001.A0I("Collection doesn't contain element at index ", '.', i));
    }

    public static final Object A0G(Collection collection, AbstractC50712Us abstractC50712Us) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(abstractC50712Us, 1);
        if (!collection.isEmpty()) {
            return A0E(collection, abstractC50712Us.A05(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A0H(Collection collection, AbstractC50712Us abstractC50712Us) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(abstractC50712Us, 1);
        if (collection.isEmpty()) {
            return null;
        }
        return A0E(collection, abstractC50712Us.A05(collection.size()));
    }

    public static final Object A0I(List list) {
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0J(List list) {
        C14360o3.A0B(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object A0K(List list) {
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0L(List list) {
        C14360o3.A0B(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Object A0M(List list) {
        C14360o3.A0B(list, 0);
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0N(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final Object A0O(List list, int i) {
        C14360o3.A0B(list, 0);
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final String A0P(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(charSequence, 1);
        C14360o3.A0B(charSequence2, 2);
        StringBuilder sb = new StringBuilder();
        A0q(sb, charSequence, charSequence2, charSequence3, iterable, interfaceC16660sJ);
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final ArrayList A0Q(Iterable iterable, int i) {
        ArrayList arrayList;
        C14360o3.A0B(iterable, 0);
        AbstractC10160gW.A01(i, i);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i2 = size / i;
            int i3 = 1;
            if (size % i == 0) {
                i3 = 0;
            }
            arrayList = new ArrayList(i2 + i3);
            int i4 = 0;
            while (i4 < size) {
                int i5 = size - i4;
                int i6 = i;
                if (i > i5) {
                    i6 = i5;
                }
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList2.add(list.get(i7 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator A00 = AbstractC10160gW.A00(iterable.iterator(), i, i, false);
            while (A00.hasNext()) {
                arrayList.add(A00.next());
            }
        }
        return arrayList;
    }

    public static final ArrayList A0R(Iterable iterable, Iterable iterable2) {
        C14360o3.A0B(iterable2, 1);
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC06950Ym.A1E(iterable, 10), AbstractC06950Ym.A1E(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C09530e4(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final ArrayList A0S(Iterable iterable, Collection collection) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(iterable, 1);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        AnonymousClass016.A16(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList A0T(Object obj, Collection collection) {
        C14360o3.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList A0U(Collection collection) {
        C14360o3.A0B(collection, 0);
        return new ArrayList(collection);
    }

    public static final HashSet A0V(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        HashSet hashSet = new HashSet(AbstractC16850sd.A0L(AbstractC06950Ym.A1E(iterable, 12)));
        A0r(iterable, hashSet);
        return hashSet;
    }

    public static final List A0W(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        return A0a(A0j(iterable));
    }

    public static final List A0X(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List A0Y(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0a(iterable);
        }
        List A0b = A0b(iterable);
        AbstractC002900t.A10(A0b);
        return A0b;
    }

    public static final List A0Z(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0a(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C14360o3.A0B(array, 0);
            if (array.length > 1) {
                Arrays.sort(array);
            }
            List asList = Arrays.asList(array);
            C14360o3.A07(asList);
            return asList;
        }
        List A0b = A0b(iterable);
        C01T.A1C(A0b);
        return A0b;
    }

    public static final List A0a(Iterable iterable) {
        Object next;
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                List singletonList = Collections.singletonList(next);
                C14360o3.A07(singletonList);
                return singletonList;
            }
            return C16930sl.A00;
        }
        return AbstractC16960so.A1P(A0b(iterable));
    }

    public static final List A0c(Iterable iterable, int i) {
        ArrayList arrayList;
        C14360o3.A0B(iterable, 0);
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return A0a(iterable);
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C16930sl.A00;
                }
                if (size == 1) {
                    List singletonList = Collections.singletonList(A0B(iterable));
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return AbstractC16960so.A1P(arrayList);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested element count ", " is less than zero.", i));
    }

    public static final List A0d(Iterable iterable, int i) {
        C14360o3.A0B(iterable, 0);
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return C16930sl.A00;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return A0a(iterable);
                }
                if (i == 1) {
                    List singletonList = Collections.singletonList(A09(iterable));
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return AbstractC16960so.A1P(arrayList);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested element count ", " is less than zero.", i));
    }

    public static final List A0e(Iterable iterable, Iterable iterable2) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(iterable2, 1);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0a(iterable2);
        }
        Collection collection = (Collection) iterable2;
        if (collection.isEmpty()) {
            return A0a(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collection.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List A0f(Iterable iterable, Object obj) {
        C14360o3.A0B(iterable, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            if (!z && C14360o3.A0K(obj2, obj)) {
                z = true;
            } else {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List A0g(Iterable iterable, Comparator comparator) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(comparator, 1);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0a(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C14360o3.A0B(array, 0);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            C14360o3.A07(asList);
            return asList;
        }
        List A0b = A0b(iterable);
        C01T.A1D(A0b, comparator);
        return A0b;
    }

    public static final List A0h(List list, int i) {
        C14360o3.A0B(list, 0);
        if (i >= 0) {
            if (i == 0) {
                return C16930sl.A00;
            }
            int size = list.size();
            if (i >= size) {
                return A0a(list);
            }
            if (i == 1) {
                List singletonList = Collections.singletonList(A0K(list));
                C14360o3.A07(singletonList);
                return singletonList;
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
                return arrayList;
            }
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
            return arrayList;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested element count ", " is less than zero.", i));
    }

    public static final List A0i(List list, C17u c17u) {
        C14360o3.A0B(list, 0);
        if (c17u.isEmpty()) {
            return C16930sl.A00;
        }
        return A0a(list.subList(c17u.A00, c17u.A01 + 1));
    }

    public static final java.util.Set A0j(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A0r(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final java.util.Set A0k(Iterable iterable) {
        Iterator it;
        Object next;
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(collection.size()));
                    A0r(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    it = iterable.iterator();
                    next = it.next();
                }
            }
            return C16910sj.A00;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        A0r(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            it = linkedHashSet2.iterator();
            next = it.next();
        }
        return C16910sj.A00;
        java.util.Set singleton = Collections.singleton(next);
        C14360o3.A07(singleton);
        return singleton;
    }

    public static final java.util.Set A0l(Iterable iterable, Iterable iterable2) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(iterable2, 1);
        java.util.Set A0j = A0j(iterable);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0a(iterable2);
        }
        A0j.retainAll((Collection) iterable2);
        return A0j;
    }

    public static final java.util.Set A0m(Iterable iterable, Iterable iterable2) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(iterable2, 1);
        java.util.Set A0j = A0j(iterable);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0a(iterable2);
        }
        A0j.removeAll((Collection) iterable2);
        return A0j;
    }

    public static final java.util.Set A0n(Iterable iterable, Iterable iterable2) {
        C14360o3.A0B(iterable, 0);
        C14360o3.A0B(iterable2, 1);
        java.util.Set A0j = A0j(iterable);
        AnonymousClass016.A16(iterable2, A0j);
        return A0j;
    }

    public static final C0eN A0o(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        return new C0eN(iterable);
    }

    public static final C16900si A0p(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        return new C16900si(new C023109f(iterable));
    }

    public static final void A0q(Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(iterable, 0);
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            AbstractC18310vI.A0r(appendable, obj, interfaceC16660sJ);
        }
        appendable.append(charSequence3);
    }

    public static final void A0r(Iterable iterable, Collection collection) {
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void A0s(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C14360o3.A0B(iterable, 0);
        AbstractC10160gW.A01(i, i);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i2 = size / i;
            int i3 = 1;
            if (size % i == 0) {
                i3 = 0;
            }
            ArrayList arrayList = new ArrayList(i2 + i3);
            C022909d c022909d = new C022909d(list);
            int i4 = 0;
            while (i4 < size) {
                int i5 = size - i4;
                int i6 = i;
                if (i > i5) {
                    i6 = i5;
                }
                int i7 = i6 + i4;
                C0eC.A04(i4, i7, c022909d.A02.size());
                c022909d.A01 = i4;
                c022909d.A00 = i7 - i4;
                arrayList.add(interfaceC16660sJ.invoke(c022909d));
                i4 += i;
                if (i4 < 0) {
                    return;
                }
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator A00 = AbstractC10160gW.A00(iterable.iterator(), i, i, true);
        while (A00.hasNext()) {
            arrayList2.add(interfaceC16660sJ.invoke(A00.next()));
        }
    }

    public static final boolean A0t(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    public static final boolean A0u(Iterable iterable, Object obj) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (A03(iterable, obj) < 0) {
            return false;
        }
        return true;
    }

    public static final float[] A0w(Collection collection) {
        C14360o3.A0B(collection, 0);
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static final int[] A0x(Collection collection) {
        C14360o3.A0B(collection, 0);
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final int A03(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (C14360o3.A0K(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final Object A0F(Iterable iterable, int i) {
        if (iterable instanceof List) {
            return A0O((List) iterable, i);
        }
        if (i >= 0) {
            int i2 = 0;
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return obj;
                }
                i2 = i3;
            }
        }
        return null;
    }

    public static final List A0b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return A0U((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A0r(iterable, arrayList);
        return arrayList;
    }

    public static final Comparable A05(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        throw new NoSuchElementException();
    }

    public static final byte[] A0v(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final long[] A0y(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
