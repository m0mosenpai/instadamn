package X;

import java.util.ListIterator;

/* renamed from: X.09N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09N implements ListIterator, C0s1 {
    public final ListIterator A00;
    public final /* synthetic */ C01R A01;

    public C09N(C01R c01r, int i) {
        this.A01 = c01r;
        this.A00 = c01r.A00.listIterator(AbstractC003400z.A12(c01r, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.A00;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        C01R c01r = this.A01;
        return (c01r.size() - 1) - this.A00.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        C01R c01r = this.A01;
        return (c01r.size() - 1) - this.A00.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.A00.set(obj);
    }
}
