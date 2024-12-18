package X;

import java.util.ListIterator;

/* renamed from: X.0sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16840sc implements ListIterator, InterfaceC15590qF {
    public final ListIterator A00;
    public final /* synthetic */ AnonymousClass093 A01;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C16840sc(AnonymousClass093 anonymousClass093, int i) {
        this.A01 = anonymousClass093;
        this.A00 = anonymousClass093.A00.listIterator(AbstractC003400z.A12(anonymousClass093, i));
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
        AnonymousClass093 anonymousClass093 = this.A01;
        return (anonymousClass093.size() - 1) - this.A00.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        AnonymousClass093 anonymousClass093 = this.A01;
        return (anonymousClass093.size() - 1) - this.A00.nextIndex();
    }
}
