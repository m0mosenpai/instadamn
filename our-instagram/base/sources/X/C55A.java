package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.55A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55A implements Iterator, Iterable {
    public int A00 = 0;
    public final Object[] A01;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A01.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i < objArr.length) {
            this.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C55A(Object[] objArr) {
        this.A01 = objArr;
    }
}
