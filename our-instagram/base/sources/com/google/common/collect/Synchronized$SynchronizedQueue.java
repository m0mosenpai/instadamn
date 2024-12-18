package com.google.common.collect;

import java.util.Collection;
import java.util.Queue;

/* loaded from: classes.dex */
public class Synchronized$SynchronizedQueue<E> extends Synchronized$SynchronizedCollection<E> implements Queue<E> {
    public static final long serialVersionUID = 0;

    @Override // java.util.Queue
    public final Object element() {
        Object element;
        synchronized (this.mutex) {
            element = ((Queue) ((Collection) this.delegate)).element();
        }
        return element;
    }

    @Override // java.util.Queue
    public final boolean offer(Object e) {
        boolean offer;
        synchronized (this.mutex) {
            offer = ((Queue) ((Collection) this.delegate)).offer(e);
        }
        return offer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object peek;
        synchronized (this.mutex) {
            peek = ((Queue) ((Collection) this.delegate)).peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object poll;
        synchronized (this.mutex) {
            poll = ((Queue) ((Collection) this.delegate)).poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object remove;
        synchronized (this.mutex) {
            remove = ((Queue) ((Collection) this.delegate)).remove();
        }
        return remove;
    }
}
