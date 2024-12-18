package X;

import java.util.ListIterator;

/* renamed from: X.5IP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5IP extends C5IQ implements ListIterator {
    @Override // java.util.ListIterator
    public final void add(Object element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.A00).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.A00).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return A00(((ListIterator) this.A00).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.A00).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object element) {
        throw new UnsupportedOperationException();
    }
}
