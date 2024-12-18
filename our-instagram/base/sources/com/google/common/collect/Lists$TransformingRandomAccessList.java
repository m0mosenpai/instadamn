package com.google.common.collect;

import X.C2n2;
import X.C5IO;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final C2n2 function;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int index) {
        return this.function.apply(this.fromList.get(index));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int index) {
        return new C5IO(this, this.fromList.listIterator(index));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int index) {
        return this.function.apply(this.fromList.remove(index));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int fromIndex, int toIndex) {
        this.fromList.subList(fromIndex, toIndex).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingRandomAccessList(C2n2 fromList, List function) {
        function.getClass();
        this.fromList = function;
        this.function = fromList;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }
}
