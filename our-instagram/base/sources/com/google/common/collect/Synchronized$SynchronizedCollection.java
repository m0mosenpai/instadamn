package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class Synchronized$SynchronizedCollection<E> extends Synchronized$SynchronizedObject implements Collection<E> {
    public static final long serialVersionUID = 0;

    @Override // java.util.Collection
    public final boolean add(Object e) {
        boolean add;
        synchronized (this.mutex) {
            add = ((Queue) ((Collection) this.delegate)).add(e);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection c) {
        boolean addAll;
        synchronized (this.mutex) {
            addAll = ((Queue) ((Collection) this.delegate)).addAll(c);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.mutex) {
            ((Queue) ((Collection) this.delegate)).clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object o) {
        boolean contains;
        synchronized (this.mutex) {
            contains = ((Queue) ((Collection) this.delegate)).contains(o);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection c) {
        boolean containsAll;
        synchronized (this.mutex) {
            containsAll = ((Queue) ((Collection) this.delegate)).containsAll(c);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.mutex) {
            isEmpty = ((Queue) ((Collection) this.delegate)).isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((Collection) this.delegate).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object o) {
        boolean remove;
        synchronized (this.mutex) {
            remove = ((Queue) ((Collection) this.delegate)).remove(o);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection c) {
        boolean removeAll;
        synchronized (this.mutex) {
            removeAll = ((Queue) ((Collection) this.delegate)).removeAll(c);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection c) {
        boolean retainAll;
        synchronized (this.mutex) {
            retainAll = ((Queue) ((Collection) this.delegate)).retainAll(c);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.mutex) {
            size = ((Queue) ((Collection) this.delegate)).size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] a) {
        Object[] array;
        synchronized (this.mutex) {
            array = ((Queue) ((Collection) this.delegate)).toArray(a);
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.mutex) {
            array = ((Queue) ((Collection) this.delegate)).toArray();
        }
        return array;
    }
}
