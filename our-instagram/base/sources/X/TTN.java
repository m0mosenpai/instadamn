package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTN<T> implements List<T>, InterfaceC019807s {
    public int A00;
    public int A01;
    public final int A02;
    public final C6MK A03;

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    private final void A00() {
        if (this.A03.A01() == this.A01) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            A00();
            C6MK c6mk = this.A03;
            int i3 = this.A02;
            return new TTN(c6mk, i + i3, i2 + i3);
        }
        SQP.A00(AbstractC111324zv.A00(4484));
        throw C00O.createAndThrow();
    }

    public TTN(C6MK c6mk, int i, int i2) {
        this.A03 = c6mk;
        this.A02 = i;
        this.A01 = c6mk.A01();
        this.A00 = i2 - i;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        A00();
        C6MK c6mk = this.A03;
        c6mk.add(this.A02 + i, obj);
        this.A00 = size() + 1;
        this.A01 = c6mk.A01();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        A00();
        C6MK c6mk = this.A03;
        boolean addAll = c6mk.addAll(i + this.A02, collection);
        if (addAll) {
            this.A00 = AbstractC58318PtA.A09(collection, size());
            this.A01 = c6mk.A01();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        String A00;
        int i;
        C6MN c6mn;
        Snapshot A002;
        boolean z;
        if (size() > 0) {
            A00();
            C6MK c6mk = this.A03;
            int i2 = this.A02;
            int size = size() + i2;
            do {
                Object obj = ST3.A00;
                synchronized (obj) {
                    AbstractC75003Yq abstractC75003Yq = c6mk.A00;
                    A00 = AbstractC111324zv.A00(2776);
                    C14360o3.A0C(abstractC75003Yq, A00);
                    C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                    i = c6mp.A00;
                    c6mn = c6mp.A02;
                }
                C14360o3.A0A(c6mn);
                C64937TaD AF0 = c6mn.AF0();
                AF0.subList(i2, size).clear();
                C6MN A0P = AF0.A0P();
                if (C14360o3.A0K(A0P, c6mn)) {
                    break;
                }
                AbstractC75003Yq abstractC75003Yq2 = c6mk.A00;
                C14360o3.A0C(abstractC75003Yq2, A00);
                synchronized (AbstractC75013Yr.A07) {
                    A002 = AbstractC75013Yr.A00();
                    C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A002, c6mk, abstractC75003Yq2);
                    synchronized (obj) {
                        int i3 = c6mp2.A00;
                        z = true;
                        if (i3 == i) {
                            c6mp2.A02 = A0P;
                            c6mp2.A00 = i3 + 1;
                            c6mp2.A01++;
                        } else {
                            z = false;
                        }
                    }
                }
                AbstractC75013Yr.A0H(A002, c6mk);
            } while (!z);
            this.A00 = 0;
            this.A01 = c6mk.A01();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return MSY.A1R(indexOf(obj));
    }

    @Override // java.util.List
    public final Object get(int i) {
        A00();
        ST3.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator<T> it = C17s.A0C(i, size() + i).iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            if (C14360o3.A0K(obj, this.A03.get(A00))) {
                return A00 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(size());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!C14360o3.A0K(obj, this.A03.get(size)));
        return size - i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pQ, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        A00();
        ?? obj = new Object();
        obj.A00 = i - 1;
        return new TTV(this, obj);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        A00();
        C6MK c6mk = this.A03;
        Object remove = c6mk.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = c6mk.A01();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        String A00;
        int i;
        C6MN c6mn;
        Snapshot A002;
        boolean z;
        A00();
        C6MK c6mk = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = c6mk.size();
        do {
            Object obj = ST3.A00;
            synchronized (obj) {
                AbstractC75003Yq abstractC75003Yq = c6mk.A00;
                A00 = AbstractC111324zv.A00(2776);
                C14360o3.A0C(abstractC75003Yq, A00);
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C64937TaD AF0 = c6mn.AF0();
            AF0.subList(i2, size).retainAll(collection);
            C6MN A0P = AF0.A0P();
            if (C14360o3.A0K(A0P, c6mn)) {
                break;
            }
            AbstractC75003Yq abstractC75003Yq2 = c6mk.A00;
            C14360o3.A0C(abstractC75003Yq2, A00);
            synchronized (AbstractC75013Yr.A07) {
                A002 = AbstractC75013Yr.A00();
                C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A002, c6mk, abstractC75003Yq2);
                synchronized (obj) {
                    int i3 = c6mp2.A00;
                    z = true;
                    if (i3 == i) {
                        c6mp2.A02 = A0P;
                        c6mp2.A00 = i3 + 1;
                        c6mp2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AbstractC75013Yr.A0H(A002, c6mk);
        } while (!z);
        int size3 = size2 - c6mk.size();
        if (size3 > 0) {
            this.A01 = c6mk.A01();
            this.A00 = size() - size3;
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ST3.A00(i, size());
        A00();
        C6MK c6mk = this.A03;
        Object obj2 = c6mk.set(i + this.A02, obj);
        this.A01 = c6mk.A01();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        A00();
        C6MK c6mk = this.A03;
        c6mk.add(this.A02 + size(), obj);
        this.A00 = size() + 1;
        this.A01 = c6mk.A01();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }
}
