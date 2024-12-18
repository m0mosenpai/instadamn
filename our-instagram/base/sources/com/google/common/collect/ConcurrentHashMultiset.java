package com.google.common.collect;

import X.AbstractC24841Jd;
import X.AbstractC38301qK;
import X.AbstractC62759SPq;
import X.AbstractC75163Zh;
import X.AbstractC92144Au;
import X.C18C;
import X.C64759TSt;
import X.S7U;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ConcurrentHashMultiset<E> extends AbstractC75163Zh<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient ConcurrentMap A00;

    @Override // X.InterfaceC75173Zi
    public final boolean ESE(Object element, int expectedOldCount, int newCount) {
        Object obj;
        int i;
        element.getClass();
        AbstractC24841Jd.A00(expectedOldCount, "oldCount");
        ConcurrentMap concurrentMap = this.A00;
        concurrentMap.getClass();
        try {
            obj = concurrentMap.get(element);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (atomicInteger == null || (i = atomicInteger.get()) != expectedOldCount || !atomicInteger.compareAndSet(i, 0)) {
            return false;
        }
        concurrentMap.remove(element, atomicInteger);
        return true;
    }

    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        Object obj;
        ConcurrentMap concurrentMap = this.A00;
        concurrentMap.getClass();
        try {
            obj = concurrentMap.get(element);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // X.AbstractC75163Zh, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // X.AbstractC75163Zh, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        long j = 0;
        while (this.A00.values().iterator().hasNext()) {
            j += ((AtomicInteger) r4.next()).get();
        }
        return AbstractC38301qK.A02(j);
    }

    public ConcurrentHashMultiset(ConcurrentMap countMap) {
        C18C.A0A(countMap, "the backing map (%s) must be empty", countMap.isEmpty());
        this.A00 = countMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList A00() {
        ArrayList arrayList = new ArrayList(AbstractC92144Au.computeArrayListCapacity(size()));
        for (AbstractC62759SPq abstractC62759SPq : entrySet()) {
            Object A01 = abstractC62759SPq.A01();
            for (int A00 = abstractC62759SPq.A00(); A00 > 0; A00--) {
                arrayList.add(A01);
            }
        }
        return arrayList;
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        readObject.getClass();
        S7U.A00.A00(this, readObject);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeObject(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C64759TSt(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        return A00().toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return A00().toArray();
    }
}
