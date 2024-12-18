package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class RNU extends TT1 implements ListIterator {
    public final /* synthetic */ RNW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNU(RNW rnw, int i) {
        super(rnw, ((List) ((AbstractC64892TYs) rnw).A00).listIterator(i));
        this.A00 = rnw;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        RNW rnw = this.A00;
        boolean isEmpty = rnw.isEmpty();
        A00();
        ((ListIterator) this.A01).add(obj);
        rnw.A00.A00++;
        if (isEmpty) {
            rnw.A00();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        A00();
        return ((ListIterator) this.A01).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        A00();
        return ((ListIterator) this.A01).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        A00();
        return ((ListIterator) this.A01).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        A00();
        return ((ListIterator) this.A01).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        A00();
        ((ListIterator) this.A01).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNU(RNW rnw) {
        super(rnw);
        this.A00 = rnw;
    }
}
