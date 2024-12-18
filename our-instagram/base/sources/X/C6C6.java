package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.6C6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6C6 implements ListIterator, InterfaceC15590qF {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        C6C5 c6c5 = (C6C5) this;
        if (c6c5.hasNext()) {
            Object[] objArr = c6c5.A00;
            int i = ((C6C6) c6c5).A00;
            ((C6C6) c6c5).A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A01) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.A00 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }
}
