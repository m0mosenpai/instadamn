package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTP implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ TZ6 A01;

    public TTP(TZ6 tz6, int i) {
        InterfaceC65685Ts7 interfaceC65685Ts7;
        this.A01 = tz6;
        interfaceC65685Ts7 = tz6.A00;
        this.A00 = interfaceC65685Ts7.listIterator(i);
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
