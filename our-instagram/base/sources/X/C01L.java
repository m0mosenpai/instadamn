package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.01L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01L<E> extends C04D<E> implements List<E>, RandomAccess, Serializable, InterfaceC019807s {
    public static final C01L A03;
    public int A00;
    public boolean A01;
    public Object[] A02 = new Object[10];

    /* JADX WARN: Type inference failed for: r1v0, types: [X.04D, X.01L] */
    static {
        ?? c04d = new C04D();
        c04d.A02 = new Object[0];
        c04d.A01 = true;
        A03 = c04d;
    }

    public static final int A00(Collection collection, C01L c01l, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(c01l.A02[i5]) == z) {
                Object[] objArr = c01l.A02;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = c01l.A02;
        AbstractC06960Yn.A0W(objArr2, objArr2, i + i4, i2 + i, c01l.A00);
        Object[] objArr3 = c01l.A02;
        int i7 = c01l.A00;
        AbstractC11600jJ.A01(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) c01l).modCount++;
        }
        c01l.A00 -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A06(this);
        int size = collection.size();
        A05(collection, this, this.A00, size);
        if (size <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.A00; i++) {
            if (C14360o3.A0K(this.A02[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A06(this);
        if (A00(collection, this, 0, this.A00, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        A06(this);
        if (A00(collection, this, 0, this.A00, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C0eC.A04(i, i2, this.A00);
        return new C01Q(null, this, this.A02, i, i2 - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        int i = this.A00;
        Object[] objArr2 = this.A02;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            C14360o3.A07(copyOfRange);
            return copyOfRange;
        }
        AbstractC06960Yn.A0W(objArr2, objArr, 0, 0, i);
        int i2 = this.A00;
        if (i2 >= length) {
            return objArr;
        }
        objArr[i2] = null;
        return objArr;
    }

    public static final Object A02(C01L c01l, int i) {
        ((AbstractList) c01l).modCount++;
        Object[] objArr = c01l.A02;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, c01l.A00 - i2);
        Object[] objArr2 = c01l.A02;
        int i3 = c01l.A00 - 1;
        C14360o3.A0B(objArr2, 0);
        objArr2[i3] = null;
        c01l.A00--;
        return obj;
    }

    private final void A03(int i, int i2) {
        int i3 = this.A00 + i2;
        if (i3 >= 0) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (i3 > length) {
                objArr = Arrays.copyOf(objArr, C0eC.A00(length, i3));
                C14360o3.A07(objArr);
                this.A02 = objArr;
            }
            AbstractC06960Yn.A0W(objArr, objArr, i + i2, i, this.A00);
            this.A00 += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public static final void A04(Object obj, C01L c01l, int i) {
        ((AbstractList) c01l).modCount++;
        c01l.A03(i, 1);
        c01l.A02[i] = obj;
    }

    public static final void A05(Collection collection, C01L c01l, int i, int i2) {
        ((AbstractList) c01l).modCount++;
        c01l.A03(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            c01l.A02[i + i3] = it.next();
        }
    }

    public static final void A06(C01L c01l) {
        if (!c01l.A01) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static final void A07(C01L c01l, int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) c01l).modCount++;
        }
        Object[] objArr = c01l.A02;
        AbstractC06960Yn.A0W(objArr, objArr, i, i + i2, c01l.A00);
        Object[] objArr2 = c01l.A02;
        int i3 = c01l.A00;
        AbstractC11600jJ.A01(objArr2, i3 - i2, i3);
        c01l.A00 -= i2;
    }

    @Override // X.C04D
    public final int A0M() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A02;
                int i = this.A00;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!C14360o3.A0K(objArr[i2], list.get(i2))) {
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
        C0eC.A02(i, this.A00);
        return this.A02[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.A02;
        int i2 = this.A00;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.A00;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C14360o3.A0K(this.A02[i], obj));
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C0eC.A03(i, this.A00);
        return new C020808e(this, i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC11600jJ.A00(this, this.A02, 0, this.A00);
    }

    @Override // X.C04D
    public final Object A0N(int i) {
        A06(this);
        C0eC.A02(i, this.A00);
        return A02(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A06(this);
        A04(obj, this, this.A00);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A06(this);
        A07(this, 0, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        A06(this);
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        A06(this);
        C0eC.A02(i, this.A00);
        Object[] objArr = this.A02;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // X.C04D, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        A06(this);
        C0eC.A03(i, this.A00);
        A04(obj, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C14360o3.A0B(collection, 1);
        A06(this);
        C0eC.A03(i, this.A00);
        int size = collection.size();
        A05(collection, this, i, size);
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
        return AbstractC06960Yn.A0a(this.A02, 0, this.A00);
    }
}
