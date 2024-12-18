package X;

import java.util.NoSuchElementException;

/* renamed from: X.1L9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1L9 extends C1LA {
    public int A00;
    public final int A01;

    public abstract Object A00(int index);

    @Override // java.util.Iterator, java.util.ListIterator
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

    public C1L9(int size, int position) {
        C18C.A02(position, size);
        this.A01 = size;
        this.A00 = position;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return A00(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return A00(i);
        }
        throw new NoSuchElementException();
    }
}
