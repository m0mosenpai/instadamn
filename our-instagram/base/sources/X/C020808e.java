package X;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.08e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C020808e implements ListIterator, C0s1 {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final C01L A03;

    private final void A00() {
        int i;
        i = ((AbstractList) this.A03).modCount;
        if (i == this.A00) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.A01;
        C01L c01l = this.A03;
        C01L c01l2 = C01L.A03;
        if (i >= c01l.A00) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.A01 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01 - 1;
    }

    public C020808e(C01L c01l, int i) {
        int i2;
        this.A03 = c01l;
        this.A01 = i;
        i2 = ((AbstractList) c01l).modCount;
        this.A00 = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        A00();
        C01L c01l = this.A03;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        c01l.add(i2, obj);
        this.A02 = -1;
        i = ((AbstractList) c01l).modCount;
        this.A00 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        A00();
        int i = this.A01;
        C01L c01l = this.A03;
        C01L c01l2 = C01L.A03;
        if (i < c01l.A00) {
            this.A01 = i + 1;
            this.A02 = i;
            return c01l.A02[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        A00();
        int i = this.A01;
        if (i > 0) {
            int i2 = i - 1;
            this.A01 = i2;
            this.A02 = i2;
            C01L c01l = this.A03;
            C01L c01l2 = C01L.A03;
            return c01l.A02[i2];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        A00();
        int i2 = this.A02;
        if (i2 != -1) {
            C01L c01l = this.A03;
            c01l.remove(i2);
            this.A01 = this.A02;
            this.A02 = -1;
            i = ((AbstractList) c01l).modCount;
            this.A00 = i;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        A00();
        int i = this.A02;
        if (i != -1) {
            this.A03.set(i, obj);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
    }
}