package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTM<T> implements List<T>, InterfaceC019807s {
    public int A00;
    public final int A01;
    public final List A02;

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

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.A02.add(i + this.A01, obj);
        this.A00++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.A02.addAll(i + this.A01, collection);
        this.A00 = AbstractC58318PtA.A09(collection, this.A00);
        return AbstractC167007dF.A1O(collection.size());
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 <= i) {
            while (true) {
                this.A02.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            if (C14360o3.A0K(this.A02.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.A01;
        int i2 = this.A00;
        while (i < i2) {
            if (C14360o3.A0K(this.A02.get(i), obj)) {
                return i - i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC167007dF.A1P(this.A00, this.A01);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 <= i) {
            while (!C14360o3.A0K(this.A02.get(i), obj)) {
                if (i != i2) {
                    i--;
                } else {
                    return -1;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new TTU(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            List list = this.A02;
            if (C14360o3.A0K(list.get(i2), obj)) {
                list.remove(i2);
                this.A00--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return MSY.A1S(i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.A00;
        int i2 = i - 1;
        int i3 = this.A01;
        if (i3 <= i2) {
            while (true) {
                List list = this.A02;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.A00--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return MSY.A1S(i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public TTM(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC119085aQ.A00(this, i);
        return this.A02.get(i + this.A01);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC119085aQ.A00(this, i);
        return this.A02.set(i + this.A01, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        AbstractC119085aQ.A01(this, i, i2);
        return new TTM(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        List list = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        list.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.A02.addAll(this.A00, collection);
        this.A00 = AbstractC58318PtA.A09(collection, this.A00);
        return AbstractC167007dF.A1O(collection.size());
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new TTU(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        AbstractC119085aQ.A00(this, i);
        this.A00--;
        return this.A02.remove(i + this.A01);
    }
}
