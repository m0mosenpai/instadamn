package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTU implements ListIterator, C0s1 {
    public int A00;
    public final List A01;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.A01.add(this.A00, obj);
        this.A00++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01.size());
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AbstractC167007dF.A1O(this.A00);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        List list = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A01.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.A00 - 1;
        this.A00 = i;
        this.A01.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.A01.set(this.A00, obj);
    }

    public TTU(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }
}
