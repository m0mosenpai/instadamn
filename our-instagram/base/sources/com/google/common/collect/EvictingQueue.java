package com.google.common.collect;

import X.AbstractC451325t;
import X.AbstractC63071Sbt;
import X.C18C;
import X.RQh;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class EvictingQueue extends AbstractC451325t implements Queue, Serializable {
    public static final long serialVersionUID = 0;
    public final Queue delegate;
    public final int maxSize;

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.delegate;
    }

    @Override // X.AbstractC451325t
    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.delegate;
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.delegate.element();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.delegate.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.delegate.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.delegate.remove();
    }

    public EvictingQueue(int maxSize) {
        C18C.A0C("maxSize (%s) must >= 0", maxSize, maxSize >= 0);
        this.delegate = new ArrayDeque(maxSize);
        this.maxSize = maxSize;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean add(Object e) {
        e.getClass();
        if (this.maxSize != 0) {
            if (size() == this.maxSize) {
                this.delegate.remove();
            }
            this.delegate.add(e);
        }
        return true;
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.maxSize) {
            clear();
            int i = size - this.maxSize;
            boolean z = false;
            if (i >= 0) {
                z = true;
            }
            C18C.A0G(z, "number to skip cannot be negative");
            Iterable rQh = new RQh(collection, i);
            if (rQh instanceof Collection) {
                return addAll((Collection) rQh);
            }
            it = rQh.iterator();
        } else {
            it = collection.iterator();
        }
        return AbstractC63071Sbt.A02(this, it);
    }

    @Override // java.util.Queue
    public final boolean offer(Object e) {
        return add(e);
    }

    public EvictingQueue() {
    }
}
