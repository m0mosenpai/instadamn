package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.TTn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64779TTn<T> implements java.util.Set<T>, InterfaceC019007k {
    public final java.util.Set A00;

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        return this.A00.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        return this.A00.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        return this.A00.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC13370mN.A01(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public C64779TTn(java.util.Set set) {
        this.A00 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        while (size() >= 500) {
            remove(AbstractC001800i.A09(this));
        }
        return this.A00.add(obj);
    }
}
