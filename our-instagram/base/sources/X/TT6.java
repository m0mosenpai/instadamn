package X;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TT6 implements Iterator, ListIterator {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;

    public TT6(TZ2 tz2, int i) {
        this.A02 = tz2;
        this.A00 = tz2.A00.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object o) {
        int i = this.A01;
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return ((ListIterator) this.A00).hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.A00).hasPrevious();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object next() {
        return ((ListIterator) this.A00).next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.A00).nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return ((ListIterator) this.A00).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.A00).previousIndex();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final void remove() {
        int i = this.A01;
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object o) {
        int i = this.A01;
        throw AbstractC43592JPx.A11();
    }

    public TT6(TZB tzb, int i) {
        this.A02 = tzb;
        this.A00 = tzb.A00.listIterator(i);
    }

    public TT6(final TZ7 this$0, final int val$index) {
        this.A02 = this$0;
        this.A00 = this$0.A00.listIterator(val$index);
    }

    public TT6(TZ9 tz9, int i) {
        this.A02 = tz9;
        this.A00 = tz9.A00.listIterator(i);
    }
}
