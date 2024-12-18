package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119075aP<T> implements List<T>, InterfaceC019807s {
    public final C57S A00;

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new TTU(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.A00.A09(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C57S c57s = this.A00;
        return c57s.A08(c57s.A00, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00.A01();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C57S c57s = this.A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c57s.A0A(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        C57S c57s = this.A00;
        int i = c57s.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = c57s.A02;
            while (!C14360o3.A0K(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.A00.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C57S c57s = this.A00;
        int i = c57s.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c57s.A02;
            while (!C14360o3.A0K(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new TTU(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C57S c57s = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = c57s.A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c57s.A0B(it.next());
        }
        if (i == c57s.A00) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C57S c57s = this.A00;
        int i = c57s.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(c57s.A02[i2])) {
                c57s.A00(i2);
            }
        }
        if (i != c57s.A00) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public C119075aP(C57S c57s) {
        this.A00 = c57s;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC119085aQ.A00(this, i);
        return this.A00.A02[i];
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        AbstractC119085aQ.A00(this, i);
        return this.A00.A00(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC119085aQ.A00(this, i);
        Object[] objArr = this.A00.A02;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        AbstractC119085aQ.A01(this, i, i2);
        return new TTM(this, i, i2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.A00.A04(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.A00.A08(i, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new TTU(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A0B(obj);
    }
}
