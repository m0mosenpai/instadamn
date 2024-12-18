package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTO implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ TZ4 A01;

    public TTO(TZ4 tz4, int i) {
        this.A01 = tz4;
        this.A00 = tz4.A00.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
