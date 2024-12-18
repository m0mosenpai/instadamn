package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.TYr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64891TYr<E> extends AbstractCollection<E> {
    public final InterfaceC28041Xi A00;
    public final Collection A01;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object element) {
        C18C.A0E(this.A00.apply(element));
        return this.A01.add(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.A01;
        InterfaceC28041Xi interfaceC28041Xi = this.A00;
        if ((collection instanceof RandomAccess) && (collection instanceof List)) {
            List list = (List) collection;
            interfaceC28041Xi.getClass();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                Object obj = list.get(i);
                if (!interfaceC28041Xi.apply(obj)) {
                    if (i > i2) {
                        try {
                            list.set(i2, obj);
                        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                            int size = list.size();
                            while (true) {
                                size--;
                                if (size <= i) {
                                    break;
                                } else if (interfaceC28041Xi.apply(list.get(size))) {
                                    list.remove(size);
                                }
                            }
                            while (true) {
                                i--;
                                if (i >= i2) {
                                    list.remove(i);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    i2++;
                }
                i++;
            }
            list.subList(i2, list.size()).clear();
            return;
        }
        AbstractC63071Sbt.A01(interfaceC28041Xi, collection.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object element) {
        Collection collection = this.A01;
        collection.getClass();
        try {
            if (collection.contains(element)) {
                return this.A00.apply(element);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r2 == (-1)) goto L9;
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEmpty() {
        /*
            r4 = this;
            java.util.Collection r0 = r4.A01
            X.1Xi r3 = r4.A00
            java.util.Iterator r1 = r0.iterator()
            java.lang.String r0 = "predicate"
            X.C18C.A07(r3, r0)
            r2 = 0
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.apply(r0)
            if (r0 == 0) goto L26
            r1 = -1
            r0 = 1
            if (r2 != r1) goto L23
        L22:
            r0 = 0
        L23:
            r0 = r0 ^ 1
            return r0
        L26:
            int r2 = r2 + 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64891TYr.isEmpty():boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator<E> it = this.A01.iterator();
        InterfaceC28041Xi interfaceC28041Xi = this.A00;
        it.getClass();
        interfaceC28041Xi.getClass();
        return new RQ4(interfaceC28041Xi, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(final Collection collection) {
        Iterator<E> it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.A00.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(final Collection collection) {
        Iterator<E> it = this.A01.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.A00.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.A00.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    public C64891TYr(InterfaceC28041Xi unfiltered, Collection predicate) {
        this.A01 = predicate;
        this.A00 = unfiltered;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            C18C.A0E(this.A00.apply(it.next()));
        }
        return this.A01.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object element) {
        if (contains(element) && this.A01.remove(element)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        return AbstractC63071Sbt.A00(this).toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC63071Sbt.A00(this).toArray();
    }
}
