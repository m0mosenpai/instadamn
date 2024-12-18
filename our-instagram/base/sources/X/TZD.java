package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class TZD<E> extends AbstractList<E> implements RandomAccess {
    public final ArrayList A00;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ArrayList arrayList = this.A00;
        if (obj != null) {
            arrayList.add(i, obj);
            return;
        }
        throw AbstractC166987dD.A15("Element must be non-null");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return this.A00.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return this.A00.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.A00.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return this.A00.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ArrayList arrayList = this.A00;
        if (obj != null) {
            return arrayList.set(i, obj);
        }
        throw AbstractC166987dD.A15("Element must be non-null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        return this.A00.toArray(objArr);
    }

    public TZD(ArrayList arrayList) {
        arrayList.getClass();
        this.A00 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.A00.toArray();
    }
}
