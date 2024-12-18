package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public abstract class RNs extends AbstractC64760TSu implements ListIterator {
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
    public final void add(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
