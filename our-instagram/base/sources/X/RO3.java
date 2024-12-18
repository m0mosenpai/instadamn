package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public abstract class RO3 extends AbstractC64898TYy implements List, RandomAccess {
    public static final RO5 A00 = new RO4(RO2.A02, 0);

    public static RO3 A01(Object obj) {
        Object[] objArr = {obj};
        AbstractC62219S2o.A00(objArr, 1);
        return A03(objArr, 1);
    }

    @Override // X.AbstractC64898TYy
    @Deprecated
    public final RO3 A09() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (AbstractC62224S2u.A00(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || !AbstractC62224S2u.A00(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (AbstractC58319PtB.A1U(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!AbstractC58319PtB.A1U(obj, this, size));
            return size;
        }
        return -1;
    }

    public static RO3 A00() {
        return RO2.A02;
    }

    public static RO3 A02(Collection collection) {
        Object[] array;
        int length;
        if (collection instanceof AbstractC64898TYy) {
            RO3 A09 = ((AbstractC64898TYy) collection).A09();
            if (A09.A07()) {
                array = A09.toArray();
                length = array.length;
            } else {
                return A09;
            }
        } else {
            array = collection.toArray();
            length = array.length;
            AbstractC62219S2o.A00(array, length);
        }
        return A03(array, length);
    }

    public static RO3 A03(Object[] objArr, int i) {
        if (i == 0) {
            return RO2.A02;
        }
        return new RO2(objArr, i);
    }

    @Override // X.AbstractC64898TYy
    public int A08(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public RO3 subList(int i, int i2) {
        AbstractC63313ShL.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return RO2.A02;
        }
        return new C60718RNy(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final RO5 listIterator(int i) {
        AbstractC63313ShL.A02(i, size());
        if (isEmpty()) {
            return A00;
        }
        return new RO4(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw AbstractC43592JPx.A11();
    }

    @Override // X.AbstractC64898TYy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return MSY.A1R(indexOf(obj));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AbstractC166987dD.A0I(get(i2), i * 31);
        }
        return i;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
