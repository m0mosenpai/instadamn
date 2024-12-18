package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.01Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01Q<E> extends C04D<E> implements List<E>, RandomAccess, Serializable, InterfaceC019807s {
    public int A00;
    public Object[] A01;
    public final int A02;
    public final C01L A03;
    public final C01Q A04;

    public C01Q(C01Q c01q, C01L c01l, Object[] objArr, int i, int i2) {
        int i3;
        C14360o3.A0B(objArr, 1);
        C14360o3.A0B(c01l, 5);
        this.A01 = objArr;
        this.A02 = i;
        this.A00 = i2;
        this.A04 = c01q;
        this.A03 = c01l;
        i3 = ((AbstractList) c01l).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A04();
        A03();
        int size = collection.size();
        A07(this.A02 + this.A00, collection, size);
        if (size <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A04();
        A03();
        if (A00(collection, this.A02, this.A00, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A04();
        A03();
        if (A00(collection, this.A02, this.A00, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C0eC.A04(i, i2, this.A00);
        return new C01Q(this, this.A03, this.A01, this.A02 + i, i2 - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        A03();
        int length = objArr.length;
        int i = this.A00;
        Object[] objArr2 = this.A01;
        if (length < i) {
            int i2 = this.A02;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            C14360o3.A07(copyOfRange);
            return copyOfRange;
        }
        int i3 = this.A02;
        AbstractC06960Yn.A0W(objArr2, objArr, 0, i3, i + i3);
        int i4 = this.A00;
        if (i4 >= length) {
            return objArr;
        }
        objArr[i4] = null;
        return objArr;
    }

    private final int A00(Collection collection, int i, int i2, boolean z) {
        int A00;
        C01Q c01q = this.A04;
        if (c01q != null) {
            A00 = c01q.A00(collection, i, i2, z);
        } else {
            A00 = C01L.A00(collection, this.A03, i, i2, z);
        }
        if (A00 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.A00 -= A00;
        return A00;
    }

    private final Object A02(int i) {
        Object A02;
        ((AbstractList) this).modCount++;
        C01Q c01q = this.A04;
        if (c01q != null) {
            A02 = c01q.A02(i);
        } else {
            A02 = C01L.A02(this.A03, i);
        }
        this.A00--;
        return A02;
    }

    private final void A03() {
        int i;
        i = ((AbstractList) this.A03).modCount;
        if (i == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void A04() {
        C01L c01l = this.A03;
        C01L c01l2 = C01L.A03;
        if (!c01l.A01) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void A05(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C01Q c01q = this.A04;
        if (c01q != null) {
            c01q.A05(i, i2);
        } else {
            C01L.A07(this.A03, i, i2);
        }
        this.A00 -= i2;
    }

    private final void A06(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C01Q c01q = this.A04;
        if (c01q != null) {
            c01q.A06(i, obj);
        } else {
            C01L.A04(obj, this.A03, i);
        }
        C01L c01l = this.A03;
        C01L c01l2 = C01L.A03;
        this.A01 = c01l.A02;
        this.A00++;
    }

    private final void A07(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C01Q c01q = this.A04;
        if (c01q != null) {
            c01q.A07(i, collection, i2);
        } else {
            C01L.A05(collection, this.A03, i, i2);
        }
        C01L c01l = this.A03;
        C01L c01l2 = C01L.A03;
        this.A01 = c01l.A02;
        this.A00 += i2;
    }

    @Override // X.C04D
    public final int A0M() {
        A03();
        return this.A00;
    }

    @Override // X.C04D
    public final Object A0N(int i) {
        A04();
        A03();
        C0eC.A02(i, this.A00);
        return A02(this.A02 + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A04();
        A03();
        A06(this.A02 + this.A00, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A04();
        A03();
        A05(this.A02, this.A00);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        A03();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A01;
                int i = this.A02;
                int i2 = this.A00;
                if (i2 == list.size()) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (!C14360o3.A0K(objArr[i + i3], list.get(i3))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        A03();
        C0eC.A02(i, this.A00);
        return this.A01[this.A02 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        A03();
        Object[] objArr = this.A01;
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i2 + i5];
            int i6 = i4 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i4 = i6 + i;
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        A03();
        for (int i = 0; i < this.A00; i++) {
            if (C14360o3.A0K(this.A01[this.A02 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        A03();
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        A03();
        int i = this.A00;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C14360o3.A0K(this.A01[this.A02 + i], obj));
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        A03();
        C0eC.A03(i, this.A00);
        return new C022508z(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        A04();
        A03();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        A04();
        A03();
        C0eC.A02(i, this.A00);
        Object[] objArr = this.A01;
        int i2 = this.A02 + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        A03();
        return AbstractC11600jJ.A00(this, this.A01, this.A02, this.A00);
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        A04();
        A03();
        C0eC.A03(i, this.A00);
        A06(this.A02 + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C14360o3.A0B(collection, 1);
        A04();
        A03();
        C0eC.A03(i, this.A00);
        int size = collection.size();
        A07(this.A02 + i, collection, size);
        if (size <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        A03();
        Object[] objArr = this.A01;
        int i = this.A02;
        return AbstractC06960Yn.A0a(objArr, i, this.A00 + i);
    }
}
